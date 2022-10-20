package com.eksos.models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Reference;
import lombok.Data;

/**
 *
 * @author Allecan
 */
@Data
@Entity(value = "", useDiscriminator = false)
public class Ingredient {

    private Integer amount;
    @Reference
    private Store storeProduct;
}
