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

        Product product = new Product();
        product = productController.getProductBySKU(SKU);
        Store storeProduct = new Store();
        storeProduct = storeController.getStoreProductBySKU(SKU);

        int ingredientsAmount = 0;
        for (Ingredient ingredient : product.getIngredients()) {
            if (ingredient.getStoreProduct().getSKU().substring(0, 2).equals("SP")) {
                Product ingredientProduct = productController
                        .getProductBySKU(ingredient.getStoreProduct().getSKU());
                ingredientsAmount += ingredientProduct.getIngredients().size();
            }
            ingredientsAmount += 1;
        }
        
        System.out.println(ingredientsAmount);
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
