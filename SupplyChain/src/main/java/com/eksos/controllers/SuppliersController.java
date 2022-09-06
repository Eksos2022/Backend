/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Supplier;
import com.eksos.models.SupplierProduct;
import dev.morphia.Datastore;
import dev.morphia.query.experimental.filters.Filters;
import java.util.ArrayList;
import java.util.List;

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

    public List<String> getAllSuppliersNames() {
        List<Supplier> suppliers = ds.find(Supplier.class).iterator().toList();
        List<String> suppliersNames = new ArrayList<>();
        for (Supplier supplier : suppliers) {
            suppliersNames.add(supplier.getSupplierName());
        }
        return suppliersNames;
    }

    public List<String> getSupplierProducts(String supplierName) {
        Supplier supplier = ds.find(Supplier.class)
                .filter(Filters.eq("supplierName", supplierName))
                .first();

        List<SupplierProduct> suppliersProducts = supplier.getSupplierProducts();
        List<String> mpNames = new ArrayList<>();
        for (SupplierProduct supplierProduct : suppliersProducts) {
            mpNames.add(supplierProduct.getName());
        }
        return mpNames;
    }
}
