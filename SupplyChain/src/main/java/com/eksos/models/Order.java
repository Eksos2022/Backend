/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.models;

import dev.morphia.annotations.*;
import lombok.Data;
import org.bson.types.ObjectId;

/**
 *
 * @author Allecan
 */
@Data
@Entity(value = "orders", useDiscriminator = false)
public class Order {

    public enum OrderStatus {
        UNDER_REVIEW,
        ACCEPTED,
        SENT,
        ARRIVED,
        CANCELLED
    }
    @Id
    private ObjectId _id;
    private String numberOfOrder;
    @Reference
    private Supplier supplier;
    private long dateOfOrder;
    private long dateOfArrival;
    private Double totalPrice;
    private Integer amount;
    private OrderStatus status;
//    @Property("date_of_order")
    @Reference
    private SupplierProduct mp;
}
