package com.eksos.models;

//import dev.morphia.annotations.Entity;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Allecan
 */
@Data
//@Entity(value = "", useDiscriminator = false)
public class MrpProduct {

    private String SKU;
    private String name;
    private List<MrpAtomProduct> weeks;
//    private List<MrpAtomProduct> requirements;
//    private List<MrpAtomProduct> projectedInventory;
//    private List<MrpAtomProduct> netRequirements;
//    private List<MrpAtomProduct> receiveProducts;
//    private List<MrpAtomProduct> orderProducts;
}
