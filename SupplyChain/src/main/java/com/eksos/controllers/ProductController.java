package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Ingredient;
import com.eksos.models.Product;
import com.eksos.models.Store;
import dev.morphia.Datastore;
import dev.morphia.query.experimental.filters.Filters;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Allecan
 */
public class ProductController {

    private final Datastore ds = MongoDS.getDatastore();
    private final StoreController storeController = new StoreController();

    public boolean createProduct(Product newProduct, Integer DT,
            Integer batch) {

        Store storeProduct = new Store();
        storeProduct.setSKU(newProduct.getSKU());
        storeProduct.setName(newProduct.getName());
        storeProduct.setTotalInventory(0);
        storeProduct.setStock(0);
        storeProduct.setDeliveryTime(DT);
        storeProduct.setBatch(batch);
        storeController.createStoreProduct(storeProduct);
        int ingredientsAmount = 0;
        for (Ingredient ingredient : newProduct.getIngredients()) {
            if (ingredient.getStoreProduct().getSKU().substring(0, 2).equals("SP")) {
                Product ingredientProduct = getProductBySKU(ingredient.getStoreProduct().getSKU());
                ingredientsAmount += ingredientProduct.getIngredients().size();
            }
            ingredientsAmount += 1;
        }
        newProduct.setTotalAmountOfIngredients(ingredientsAmount);
        return ds.save(newProduct) != null;
    }

    public Product getProductBySKU(String SKU) {
        Product storeProduct = ds.find(Product.class).filter(Filters.eq("SKU", SKU)).first();
        return storeProduct;
    }

    public List<Product> getAllFinalProducts() {
        List<Product> tempProducts = ds.find(Product.class).iterator().toList();
        List<Product> finalProducts = new ArrayList<>();
        for (Product tempProduct : tempProducts) {
            if (tempProduct.getSKU().subSequence(0, 2).equals("PF")) {
                finalProducts.add(tempProduct);
            }
        }
        return finalProducts;
    }
}
