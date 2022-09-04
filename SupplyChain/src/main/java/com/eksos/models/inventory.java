/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;
import org.bson.types.ObjectId;

/**
 *
 * @author erick
 */
@Data
@Entity(value = "inventory", useDiscriminator = false)
public class Inventory {

    @Id
    private ObjectId _id;
    private String productName;
}
