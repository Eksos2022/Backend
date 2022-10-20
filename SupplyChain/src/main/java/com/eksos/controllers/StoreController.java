package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Store;
import dev.morphia.Datastore;

/**
 *
 * @author Allecan
 */
public class StoreController {

    private final Datastore ds = MongoDS.getDatastore();

    public boolean createStoreProduct(Store newStoreProduct) {
        return ds.save(newStoreProduct) != null;
    }
}
