/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.FactoryModel;
import com.eksos.models.MaterialsReceived;
import dev.morphia.Datastore;

/**
 *
 * @author erick
 */
public class MaterialReceivedController {
    private final Datastore db = MongoDS.getDatastore();
    private FactoryModel factory = new FactoryModel();
    
    public Boolean ConfirmOrder(MaterialsReceived confirm) throws Exception{
        return db.save(confirm)!= null;
    }
    
}
