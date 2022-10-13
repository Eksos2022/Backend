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
@Entity(value="materials_received", useDiscriminator=false)
public class MaterialsReceived {
    @Id
    private ObjectId _id;
    private String product_name;
    private String description;
    private String amount;
}
