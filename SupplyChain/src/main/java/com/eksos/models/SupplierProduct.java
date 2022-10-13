/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.eksos.models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;
import org.bson.types.ObjectId;

/**
 *
 * @author Allecan
 */
@Data
@Entity(value = "supplier_products", useDiscriminator = false)
public class SupplierProduct {

    @Id
    private ObjectId _id;
    private String name;
    private String dimensional;
    private Double price;
}
