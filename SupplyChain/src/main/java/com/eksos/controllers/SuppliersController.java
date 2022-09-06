/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Supplier;
import com.eksos.models.SupplierProduct;
import dev.morphia.Datastore;

/**
 *
 * @author allec
 */
public class SuppliersController {

    private final Datastore ds = MongoDS.getDatastore();

    public boolean createNewSupplier(Supplier newSupplier) {
        return ds.save(newSupplier) != null;
    }

    public boolean creatNewSupplierProduct(SupplierProduct newSupplierProduct) {
        return ds.save(newSupplierProduct) != null;
    }
}
