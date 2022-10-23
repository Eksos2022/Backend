package com.eksos.models;

//import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Entity;
import java.util.List;
import lombok.Data;

/**
 *
 * @author Allecan
 */
@Data
@Entity(value = "", useDiscriminator = false)
public class MrpProduct {

    private String SKU;
    private String name;
    private List<MrpAtomProduct> weeks;
}
