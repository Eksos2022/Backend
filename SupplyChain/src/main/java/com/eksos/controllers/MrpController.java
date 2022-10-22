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

        // -------------------------- Producto Final -------------------------- 
        MrpProduct mrpProductPF = new MrpProduct();
        mrpProductPF.setSKU(SKU);
        List<MrpAtomProduct> weeks = new ArrayList<>();
        int cantWeeksPF = demand.size() + (storeProductPF.getDeliveryTime() - 1);
        for (int i = 0; i < cantWeeksPF; i++) {
            MrpAtomProduct productWeek = new MrpAtomProduct();
            weeks.add(productWeek);
        }

        for (int i = 0; i < cantWeeksPF; i++) {
            if (i == 0) {

                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setWeek(currentWeekOfYear);
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setRequirement(Integer.valueOf(demand.get(i)));
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setProjectedInventory(storeProductPF.getTotalInventory()
                        - storeProductPF.getStock());
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setNetRequirement(0);
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setReceiveProduct(0);
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setOrderProduct(0);

            } else if (i > demand.size() - 1) {

            } else {
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setWeek(currentWeekOfYear + i);
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setRequirement(Integer.valueOf(demand.get(i)));
                MrpAtomProduct tempProductWeek = weeks.get(i);
                int projectedInventory = (tempProductWeek.getProjectedInventory()
                        + tempProductWeek.getReceiveProduct()) - tempProductWeek.getRequirement();
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setProjectedInventory(projectedInventory);
                int netRequirement = weeks.get((storeProductPF.getDeliveryTime() - 1) + i).getRequirement()
                        - weeks.get((storeProductPF.getDeliveryTime() - 1) + i).getProjectedInventory();
                if (netRequirement < 0) {
                    weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setNetRequirement(0);
                }
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setNetRequirement(netRequirement);
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
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setReceiveProduct(order);
                weeks.get(i - (storeProductPF.getDeliveryTime() - 1)).setOrderProduct(order);
                weeks.get(i - (storeProductPF.getDeliveryTime() - 1))
                        .setWeek(weeks.get((storeProductPF.getDeliveryTime() - 1) + i).getWeek() - storeProductPF.getDeliveryTime());
                weeks.get((storeProductPF.getDeliveryTime() - 1) + i).setOrderProduct(0);
            }

        }
        mrpProductPF.setWeeks(weeks);
        mrpProducts.add(mrpProductPF);
        // -------------------------- Producto Final --------------------------
        
        return true;
    }
}
