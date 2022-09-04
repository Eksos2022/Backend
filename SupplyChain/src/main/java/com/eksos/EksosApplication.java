/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.eksos;

import com.eksos.db.MongoDS;
import com.eksos.models.Inventory;
import com.mongodb.client.MongoClients;
import dev.morphia.Morphia;
import dev.morphia.Datastore;
import dev.morphia.query.experimental.filters.Filters;

/**
 *
 * @author erick
 */
public class EksosApplication {

    private final static String DATABASE = "Eksos-DB";

    public static void main(String[] args) throws Exception {
        String uri = "mongodb+srv://Test1:0iEylN65JkkSHrCv@clustersupply.nfdjlvo.mongodb.net";
        final Datastore datastore = Morphia.createDatastore(MongoClients.create(uri), DATABASE);
        datastore.getMapper().mapPackage("com.eksos.models");
        datastore.ensureIndexes();
        MongoDS.create(datastore);
        Inventory producto1 = new Inventory();
        producto1.setProductName("Leche");
        System.out.println();
        System.out.println("");

        System.out.println(datastore.find(Inventory.class)
                .filter(Filters.eq("_id", datastore.save(producto1).get_id())).first());
    }
}
