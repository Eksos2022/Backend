/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.controllers;

import com.eksos.db.MongoDS;
import com.eksos.models.Order;
import com.eksos.models.Supplier;
import dev.morphia.Datastore;
import java.sql.Timestamp;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    public List<Order> getAllOrders() {
        List<Order> orders = ds.find(Order.class).iterator().toList();
        return orders;
    }

    public static String convertTime(long time) {
        if (time != 0) {
            Date date = new Date(time);
            Format format = new SimpleDateFormat("dd MMMM yy HH:mm");
            return format.format(date);
        }
        return "Sin Fecha";
    }
}
