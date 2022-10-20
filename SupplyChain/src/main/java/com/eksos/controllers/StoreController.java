package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Store;
import dev.morphia.Datastore;
import dev.morphia.query.FindOptions;
import dev.morphia.query.Sort;
import dev.morphia.query.experimental.filters.Filters;
import java.util.List;

/**
 *
 * @author Allecan
 */
public class StoreController {

    private final Datastore ds = MongoDS.getDatastore();

    public boolean createStoreProduct(Store newStoreProduct) {
        return ds.save(newStoreProduct) != null;
    }

    public List<Store> getAllStoreProducts() {
        List<Store> storeProducts = ds.find(Store.class)
                .iterator(new FindOptions().sort(Sort.ascending("SKU")))
                .toList();
        return storeProducts;
    }

    public Store getStoreProductBySKU(String SKU) {
        Store storeProduct = ds.find(Store.class).filter(Filters.eq("SKU", SKU)).first();
        return storeProduct;
    }
}
