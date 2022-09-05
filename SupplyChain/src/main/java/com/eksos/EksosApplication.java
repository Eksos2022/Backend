/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.eksos;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.LoggerContext;
import com.eksos.db.MongoDS;
import com.formdev.flatlaf.FlatDarculaLaf;
import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatIntelliJLaf;
import com.formdev.flatlaf.FlatLaf;
import com.formdev.flatlaf.FlatLightLaf;
import com.mongodb.client.MongoClients;
import dev.morphia.Datastore;
import dev.morphia.Morphia;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.slf4j.LoggerFactory;

/**
 *
 * @author Allecan
 */
public class EksosApplication {

    private final static String DATABASE = "Eksos-DB";
    private static EksosMenu eksosMenu;

    public static void main(String[] args) throws Exception {
        ((LoggerContext) LoggerFactory.getILoggerFactory()).
                getLogger("org.mongodb.driver").setLevel(Level.ERROR);
        String uri = "mongodb+srv://Test1:0iEylN65JkkSHrCv@clustersupply.nfdjlvo.mongodb.net";
        final Datastore datastore = Morphia.createDatastore(MongoClients.create(uri), DATABASE);
        MongoDS.create(datastore);
        datastore.getMapper().mapPackage("com.eksos.models");
        datastore.ensureIndexes();
        try {
            UIManager.setLookAndFeel(new FlatDarculaLaf());
        } catch (UnsupportedLookAndFeelException ex) {
            ex.getCause();
        }
        eksosMenu = new EksosMenu();
        menuVisible();
    }

    public static void menuVisible() {
        eksosMenu.setVisible(true);
    }
}
