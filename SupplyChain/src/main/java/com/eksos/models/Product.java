/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Reference;
import java.util.List;
import lombok.Data;
import org.bson.types.ObjectId;

/**
 *
 * @author Allecan
 */
@Data
@Entity(value = "product", useDiscriminator = false)
public class Product {

    @Id
    private ObjectId _id;
    // Talvez referenciar solo el producto Store
    private String SKU;
    private String name;
//    @Reference
    private List<Ingredient> ingredients;
}
