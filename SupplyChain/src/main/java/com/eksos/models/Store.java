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
@Entity(value = "store", useDiscriminator = false)
public class Store {

    @Id
    private ObjectId _id;
    private String SKU;
    private String name;
    private Integer totalInventory;
    private Integer stock;
    private Integer deliveryTime;
    private Integer batch;
}
