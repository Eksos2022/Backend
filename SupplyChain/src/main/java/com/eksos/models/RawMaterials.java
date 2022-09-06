/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eksos.models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import lombok.Data;
import org.bson.types.ObjectId;

/**
 *
 * @author ljrp3
 */

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import lombok.Data;
import org.bson.types.ObjectId;


    

/**
 *
 * @author Allecan
 */
@Data
@Entity(value = "raw_materials", useDiscriminator = false)
public class RawMaterials {

    @Id
    private ObjectId _id;
    private String name;
    private Integer totalInventory;
    private Integer stock;
}

    
