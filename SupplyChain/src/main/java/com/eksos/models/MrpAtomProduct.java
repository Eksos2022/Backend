package com.eksos.models;

import lombok.Data;

/**
 *
 * @author Allecan
 */
@Data
public class MrpAtomProduct {

    private Integer week;
//    private Integer productAmount;
    private Integer requirement;
    private Integer projectedInventory;
    private Integer netRequirement;
    private Integer receiveProduct;
    private Integer orderProduct;
}
