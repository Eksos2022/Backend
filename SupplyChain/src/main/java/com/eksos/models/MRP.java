package com.eksos.models;

import dev.morphia.annotations.Entity;
import dev.morphia.annotations.Id;
import java.util.List;
import lombok.Data;
import org.bson.types.ObjectId;

/**
 *
 * @author Allecan
 */
@Data
@Entity(value = "mrp", useDiscriminator = false)
public class MRP {

    @Id
    private ObjectId _id;
    private String startDate;
    private List<MrpProduct> mrpProducts;
    private Integer maxWeek;
    private Integer minWeek;
}
