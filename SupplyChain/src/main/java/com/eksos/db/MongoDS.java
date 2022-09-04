/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.db;

/**
 *
 * @author allec
 */
import dev.morphia.Datastore;

public final class MongoDS {

    private static MongoDS instance;
    private final Datastore datastore;

    private MongoDS(Datastore ds) {
        this.datastore = ds;
    }

    public static void create(Datastore ds) throws Exception {
        instance = new MongoDS(ds);
    }
    
    public static Datastore getDatastore() {
        if (instance == null) {
            throw new NullPointerException("Use MongoDS.create() method");
        }
        return instance.datastore;

    }
}
