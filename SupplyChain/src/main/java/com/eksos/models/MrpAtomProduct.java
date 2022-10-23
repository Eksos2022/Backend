package com.eksos.models;

import dev.morphia.annotations.Entity;
import lombok.Data;

/**
 *
 * @author Allecan
 */
@Data
@Entity(value = "", useDiscriminator = false)
public class MrpAtomProduct {

    private Integer week;
    private Integer requirement;
    private Integer projectedInventory;
    private Integer netRequirement;
    private Integer receiveProduct;
    private Integer orderProduct;
}
