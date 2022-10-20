package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Store;
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
    
    private final StoreController storeController = new StoreController();
    private final Datastore ds = MongoDS.getDatastore();
    
    public boolean createNewSupplier(Supplier newSupplier) {
        return ds.save(newSupplier) != null;
    }
    
    public boolean creatNewSupplierProduct(SupplierProduct newSupplierProduct) {
        Store storeProduct = new Store();
        storeProduct.setSKU(newSupplierProduct.getSKU());
        storeProduct.setName(newSupplierProduct.getName());
        storeProduct.setTotalInventory(0);
        storeProduct.setStock(0);
        storeProduct.setDeliveryTime(newSupplierProduct.getDeliveryTime());
        storeProduct.setBatch(newSupplierProduct.getBatch());
        storeController.createStoreProduct(storeProduct);
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

    // esto se tiene que convertir a objects
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
    
    public Supplier getSupplier(String supplierName) {
        Supplier supplier = ds.find(Supplier.class)
                .filter(Filters.eq("supplierName", supplierName))
                .first();
        return supplier;
    }
    
    public SupplierProduct getMPbyName(String mpName) {
        SupplierProduct mp = ds.find(SupplierProduct.class)
                .filter(Filters.eq("name", mpName))
                .first();
        return mp;
    }
}
