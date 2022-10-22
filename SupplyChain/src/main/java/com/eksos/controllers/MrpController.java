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
        Store storeProductPF = new Store();
        storeProductPF = storeController.getStoreProductBySKU(SKU);

        int totalMrpProductsPF = productPF.getTotalAmountOfIngredients();
        List<MrpProduct> mrpProducts = new ArrayList<>();

        MrpProduct mrpProductPF = new MrpProduct();
        mrpProductPF.setSKU(SKU);
        List<MrpAtomProduct> weeks = new ArrayList<>();
        int cantWeeksPF = demand.size() + (storeProductPF.getDeliveryTime() - 1);
        for (int i = 0; i < cantWeeksPF; i++) {
            MrpAtomProduct productWeek = new MrpAtomProduct();
            if (i == 0) {
                productWeek.setWeek(currentWeekOfYear);
                productWeek.setRequirement(Integer.valueOf(demand.get(i)));
                productWeek.setProjectedInventory(storeProductPF.getTotalInventory()
                        - storeProductPF.getStock());
                productWeek.setNetRequirement(0);
                productWeek.setReceiveProduct(0);
                productWeek.setOrderProduct(0);
                weeks.add(productWeek);
            } else if (i > demand.size()-1) {
                weeks.add(productWeek);
            } else {
                productWeek.setWeek(currentWeekOfYear + i);
                productWeek.setRequirement(Integer.valueOf(demand.get(i)));
                MrpAtomProduct tempProductWeek = weeks.get(i - 1);
                int projectedInventory = (tempProductWeek.getProjectedInventory()
                        + tempProductWeek.getReceiveProduct()) - tempProductWeek.getRequirement();
                productWeek.setProjectedInventory(projectedInventory);
                int netRequirement = productWeek.getRequirement()
                        - productWeek.getProjectedInventory();
                if (netRequirement < 0) {
                    productWeek.setNetRequirement(0);
                }
                productWeek.setNetRequirement(netRequirement);
                boolean bandera = true;
                int order = storeProductPF.getBatch();
                int multiplicativo = 1;
                while (bandera == true) {
                    if (order >= netRequirement) {
                        bandera = false;
                    } else {
                        multiplicativo += 1;
                        order = order * multiplicativo;
                    }
                }
                productWeek.setReceiveProduct(order);

                productWeek.setOrderProduct(0);
                weeks.add(productWeek);
            }

        }
        mrpProductPF.setWeeks(weeks);
        mrpProducts.add(mrpProductPF);

//        boolean flag = true;
//        int amntMrpPds = 0;
////        while (flag = true) {
////            amntMrpPds = 
////            System.out.println("S");
////        }
//
//        MrpProduct mrpProduct = new MrpProduct();
//        mrpProduct.setName(storeProduct.getName());
//        mrpProduct.setSKU(storeProduct.getSKU());
//        List<MrpAtomProduct> weeks = new ArrayList<>();
//
//        if (storeProduct.getSKU().substring(0, 2).equals("PF")) {
//            System.out.println("A");
//        } else {
//
//        }
//        // primera pasada
//        MrpAtomProduct mrpAtomProduct1 = new MrpAtomProduct();
//        mrpAtomProduct1.setWeek(currentWeekOfYear);
//        mrpAtomProduct1.setRequirement(Integer.valueOf(demand.get(0)));
//        mrpAtomProduct1.setProjectedInventory(storeProduct.getTotalInventory()
//                - storeProduct.getStock());
//        mrpAtomProduct1.setNetRequirement(0);
//        mrpAtomProduct1.setReceiveProduct(0);
//        mrpAtomProduct1.setOrderProduct(0);
//        weeks.add(mrpAtomProduct1);
//
//        // Segunda pasada
//        MrpAtomProduct mrpAtomProduct2 = new MrpAtomProduct();
//        mrpAtomProduct2.setWeek(currentWeekOfYear + 1);
//        mrpAtomProduct2.setRequirement(Integer.valueOf(demand.get(0)));
//        mrpAtomProduct2.setProjectedInventory(storeProduct.getTotalInventory()
//                - storeProduct.getStock());
//        mrpAtomProduct2.setNetRequirement(0);
//        mrpAtomProduct2.setReceiveProduct(0);
//        mrpAtomProduct2.setOrderProduct(0);
//        weeks.add(mrpAtomProduct2);
        return true;
    }
}
