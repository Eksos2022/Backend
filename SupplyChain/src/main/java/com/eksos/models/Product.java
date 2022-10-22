package com.eksos.models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import dev.morphia.annotations.Property;
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
    private String SKU;
    private String name;
    private List<Ingredient> ingredients;
    @Property("ingredientsAmount")
    private Integer totalAmountOfIngredients;
}
