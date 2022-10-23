package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Ingredient;
import com.eksos.models.MRP;
import com.eksos.models.MrpAtomProduct;
import com.eksos.models.MrpProduct;
import com.eksos.models.Product;
import com.eksos.models.Store;
import dev.morphia.Datastore;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Allecan
 */
public class MrpController {

    private final Datastore ds = MongoDS.getDatastore();
    private final ProductController productController = new ProductController();
    private final StoreController storeController = new StoreController();

    public boolean createMRP(Date startDate, String SKU, List<String> demand) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(startDate);
        int currentWeekOfYear = cal.get(Calendar.WEEK_OF_YEAR);
        DateFormat defaultLocalFormat = DateFormat.getDateInstance();
        String strStartDate = defaultLocalFormat.format(startDate);

        MRP mrp = new MRP();
        mrp.setStartDate(strStartDate);

        Product productPF = new Product();
        productPF = productController.getProductBySKU(SKU);

//        int totalMrpProductsPF = productPF.getTotalAmountOfIngredients();
        List<MrpProduct> mrpProducts = new ArrayList<>();

        // -------------------------- Producto Final -------------------------- 
        Store storeProductPF = new Store();
        storeProductPF = storeController.getStoreProductBySKU(SKU);
        MrpProduct mrpProductPF = new MrpProduct();
        mrpProductPF.setSKU(SKU);
        mrpProductPF.setName(productPF.getName());
        List<MrpAtomProduct> weeksPF = new ArrayList<>();
        int cantWeeksPF = demand.size() + (storeProductPF.getDeliveryTime() - 1);
        for (int i = 0; i < cantWeeksPF; i++) {
            MrpAtomProduct productWeek = new MrpAtomProduct();
            weeksPF.add(productWeek);
        }

        for (int i = 0; i < cantWeeksPF; i++) {
            if (i == 0) {

                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setWeek(currentWeekOfYear);
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setRequirement(Integer.valueOf(demand.get(i)));
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setProjectedInventory(storeProductPF.getTotalInventory()
                        - storeProductPF.getStock());
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setNetRequirement(0);
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setReceiveProduct(0);
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setOrderProduct(0);

            } else if (i > demand.size() - 1) {

            } else {
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setWeek(currentWeekOfYear + i);
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setRequirement(Integer.valueOf(demand.get(i)));
                MrpAtomProduct tempProductWeek = weeksPF.get(i);
                int projectedInventory = (tempProductWeek.getProjectedInventory()
                        + tempProductWeek.getReceiveProduct()) - tempProductWeek.getRequirement();
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setProjectedInventory(projectedInventory);
                int netRequirement = weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).getRequirement()
                        - weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).getProjectedInventory();
                if (netRequirement < 0) {
                    weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setNetRequirement(0);
                }
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setNetRequirement(netRequirement);
                boolean bandera = true;
                int order = storeProductPF.getBatch();
                int multiplicativo = 1;
                while (bandera == true) {
                    if (order >= netRequirement) {
                        bandera = false;
                    } else {
                        multiplicativo += 1;
                        order = storeProductPF.getBatch() * multiplicativo;
                    }
                }
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setReceiveProduct(order);
                weeksPF.get(i - (storeProductPF.getDeliveryTime() - 1)).setOrderProduct(order);
                weeksPF.get(i - (storeProductPF.getDeliveryTime() - 1))
                        .setWeek(weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).getWeek() - storeProductPF.getDeliveryTime());
                weeksPF.get((storeProductPF.getDeliveryTime() - 1) + i).setOrderProduct(0);
            }

        }
        mrpProductPF.setWeeks(weeksPF);
        mrpProducts.add(mrpProductPF);
        // -------------------------- Producto Final --------------------------
        
        List<MrpProduct> subProducts = new ArrayList<>();
        for (Ingredient ingredient : productPF.getIngredients()) {
            MrpProduct mrpIngredientProduct = new MrpProduct();
            mrpIngredientProduct = mrpIngredients(ingredient, demand.size(), mrpProductPF);
            if (mrpIngredientProduct.getSKU().substring(0, 2).equals("SP")) {
                subProducts.add(mrpIngredientProduct);
            }
            mrpProducts.add(mrpIngredientProduct);
        }
        for (MrpProduct mrpSubProduct : subProducts) {
            Product subProduct = new Product();
            subProduct = productController.getProductBySKU(mrpSubProduct.getSKU());
            for (Ingredient ingredient : subProduct.getIngredients()) {
                mrpProducts.add(mrpIngredients(ingredient, demand.size(), mrpSubProduct));
            }
        }
        mrp.setMrpProducts(mrpProducts);
        return ds.save(mrp) != null;
    }

    private MrpProduct mrpIngredients(Ingredient ingredient, int demand, MrpProduct mrpProductPF) {

        MrpProduct mrpProduct = new MrpProduct();
        mrpProduct.setSKU(ingredient.getStoreProduct().getSKU());
        mrpProduct.setName(ingredient.getStoreProduct().getName());
        List<MrpAtomProduct> weeks = new ArrayList<>();
        int cantWeeks = demand + (ingredient.getStoreProduct().getDeliveryTime() - 1);
        for (int i = 0; i < cantWeeks; i++) {
            MrpAtomProduct productWeek = new MrpAtomProduct();
            weeks.add(productWeek);
        }
        int deliveryTime = ingredient.getStoreProduct().getDeliveryTime();
        int batch = ingredient.getStoreProduct().getBatch();
        int fOrderPFWeek = mrpProductPF.getWeeks().get(0).getWeek();
        boolean bandera = true;
        int order = ingredient.getStoreProduct().getBatch();
        int multiplicativo = 1;
        mrpProduct.setWeeks(weeks);
        for (int i = 0; i < cantWeeks; i++) {
            if (i == 0) {

                weeks.get(deliveryTime).setWeek(fOrderPFWeek);
                int requirement = ingredient.getAmount() * mrpProductPF.getWeeks().get(0).getOrderProduct();
                weeks.get(deliveryTime).setRequirement(requirement);
                weeks.get(deliveryTime).setProjectedInventory(ingredient.getStoreProduct().getTotalInventory()
                        - ingredient.getStoreProduct().getStock());

                int netRequirement = weeks.get(deliveryTime).getRequirement()
                        - weeks.get(deliveryTime).getProjectedInventory();
                weeks.get(deliveryTime).setNetRequirement(0);
                if (netRequirement > 0) {
                    weeks.get(deliveryTime).setNetRequirement(netRequirement);
                }

                while (bandera == true) {
                    if (weeks.get(deliveryTime).getNetRequirement() == 0) {
                        order = 0;
                        bandera = false;
                    } else if (order >= netRequirement) {
                        bandera = false;
                    } else {
                        multiplicativo += 1;
                        order = batch * multiplicativo;
                    }
                }
                weeks.get(deliveryTime).setReceiveProduct(order);
                weeks.get(0).setOrderProduct(order);
                weeks.get(0).setWeek(fOrderPFWeek - deliveryTime);
                weeks.get(deliveryTime).setOrderProduct(0);
            } else if (deliveryTime + i > weeks.size() - 1) {

            } else {
                weeks.get(deliveryTime + i).setWeek(fOrderPFWeek + i);
                int requirement = ingredient.getAmount() * mrpProductPF.getWeeks().get(i).getOrderProduct();
                weeks.get(deliveryTime + i).setRequirement(requirement);
                MrpAtomProduct tempProductWeek2 = new MrpAtomProduct();
                tempProductWeek2 = weeks.get((deliveryTime + i) - 1);
                int projectedInventory = (tempProductWeek2.getProjectedInventory()
                        + tempProductWeek2.getReceiveProduct()) - tempProductWeek2.getRequirement();
                weeks.get(deliveryTime + i).setProjectedInventory(projectedInventory);

                int netRequirement = weeks.get(deliveryTime + i).getRequirement()
                        - weeks.get(deliveryTime + i).getProjectedInventory();
                weeks.get(deliveryTime + i).setNetRequirement(0);
                if (netRequirement > 0) {
                    weeks.get(deliveryTime + i).setNetRequirement(netRequirement);
                }

                order = ingredient.getStoreProduct().getBatch();
                bandera = true;
                multiplicativo = 1;
                while (bandera == true) {
                    if (weeks.get(deliveryTime + i).getNetRequirement() == 0) {
                        order = 0;
                        bandera = false;
                    } else if (order >= netRequirement) {
                        bandera = false;
                    } else {
                        multiplicativo += 1;
                        order = batch * multiplicativo;
                    }
                }
                weeks.get(deliveryTime + i).setReceiveProduct(order);
                weeks.get(i).setOrderProduct(order);
                weeks.get(i).setWeek((fOrderPFWeek + i) - deliveryTime);
                weeks.get(deliveryTime + i).setOrderProduct(0);
            }

        }

        return mrpProduct;
    }
}
