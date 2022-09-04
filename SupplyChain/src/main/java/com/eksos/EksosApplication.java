/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.eksos;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import com.eksos.db.MongoDS;
import com.eksos.models.Inventory;
import dev.morphia.query.experimental.filters.Filters;
import org.bson.types.ObjectId;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import org.slf4j.LoggerFactory;

/**
 *
 * @author erick
 */
public class EksosApplication {

    private final static String DATABASE = "Eksos-DB";
    private static EksosMenu eksosMenu;

    public static void main(String[] args) throws Exception {
        ((LoggerContext) LoggerFactory.getILoggerFactory()).
                getLogger("org.mongodb.driver").setLevel(Level.ERROR);
        String uri = "mongodb+srv://Test1:0iEylN65JkkSHrCv@clustersupply.nfdjlvo.mongodb.net";
        final Datastore datastore = Morphia.createDatastore(MongoClients.create(uri), DATABASE);
        datastore.getMapper().mapPackage("com.eksos.models");
        datastore.ensureIndexes();
        MongoDS.create(datastore);
        eksosMenu = new EksosMenu();
        menuVisible();
    }

    public static void menuVisible() {
        eksosMenu.setVisible(true);
    }
}
