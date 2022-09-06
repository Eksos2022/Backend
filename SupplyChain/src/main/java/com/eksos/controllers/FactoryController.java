/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.FactoryModel;
import dev.morphia.Datastore;
import dev.morphia.query.FindOptions;
import dev.morphia.query.Sort;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author erick
 */
public class FactoryController {
    private final Datastore db = MongoDS.getDatastore();
    private FactoryModel factory = new FactoryModel();
    
    public Boolean AddOrder(FactoryModel newOrder) throws Exception{
        return db.save(newOrder)!= null;
    }
    
    public DefaultTableModel getOrders(){  
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Producto");
        model.addColumn("Descripción");
        model.addColumn("Cantidad");
        List<FactoryModel> orders = db.find(FactoryModel.class)
                .iterator().toList();
        String[] datos = new String[3];
        for(int i = 0; i < orders.size(); i++){
            datos[0] = orders.get(i).getProduct_name();
            datos[1] = orders.get(i).getDescription();
            datos[2] = orders.get(i).getAmount();
            model.addRow(datos);
        }
        return model;
    }
    
}
