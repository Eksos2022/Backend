/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Order;
import dev.morphia.Datastore;
import java.sql.Timestamp;
import java.util.Date;

/**
 *
 * @author Allecan
 */
public class OrderController {

    private final Datastore ds = MongoDS.getDatastore();

    public boolean createNewOrder(Order newOrder) {
        long doo = new Timestamp(new Date().getTime()).getTime();
        newOrder.setDateOfOrder(doo);
        newOrder.setDateOfArrival(0);
        return ds.save(newOrder) != null;
    }
}
