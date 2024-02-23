package com.tugcetasyildiz.n11homework2.generator;

import com.tugcetasyildiz.n11homework2.entity.Cottage;
import com.tugcetasyildiz.n11homework2.entity.House;
import com.tugcetasyildiz.n11homework2.entity.Villa;
import com.tugcetasyildiz.n11homework2.general.baseEntity.BaseEntityAdditionalFields;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Data
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class Property {
    public static final List<House> HOUSE_LIST = new ArrayList<>();

    public static final List<Cottage> COTTAGE_LIST = new ArrayList<>();
    public static final List<Villa> VILLA_LIST = new ArrayList<>();


    static {
        HOUSE_LIST.add(new House(new BigDecimal(3200000), 2, 1, 75, new BaseEntityAdditionalFields(), 1L));
        HOUSE_LIST.add(new House(new BigDecimal(5100000), 3, 1, 80, new BaseEntityAdditionalFields(), 2L));
        HOUSE_LIST.add(new House(new BigDecimal(2300000), 2, 1, 55, new BaseEntityAdditionalFields(), 3L));
        HOUSE_LIST.add(new House(new BigDecimal(3900000), 2, 2, 75, new BaseEntityAdditionalFields(), 4L));
        HOUSE_LIST.add(new House(new BigDecimal(5000000), 3, 1, 80, new BaseEntityAdditionalFields(), 5L));
    }

    static {
        COTTAGE_LIST.add(new Cottage(new BigDecimal(4250000), 2, 2, 220, new BaseEntityAdditionalFields(), 1L));
        COTTAGE_LIST.add(new Cottage(new BigDecimal(5100000), 3, 1, 200, new BaseEntityAdditionalFields(), 2L));
        COTTAGE_LIST.add(new Cottage(new BigDecimal(4300000), 2, 2, 160, new BaseEntityAdditionalFields(), 3L));
        COTTAGE_LIST.add(new Cottage(new BigDecimal(5900000), 2, 2, 125, new BaseEntityAdditionalFields(), 4L));
        COTTAGE_LIST.add(new Cottage(new BigDecimal(6300000), 3, 2, 180, new BaseEntityAdditionalFields(), 5L));
    }

    static {

        VILLA_LIST.add(new Villa(new BigDecimal(4250000), 3, 2, 120, new BaseEntityAdditionalFields(), 1L));
        VILLA_LIST.add(new Villa(new BigDecimal(5100000), 4, 1, 100, new BaseEntityAdditionalFields(), 2L));
        VILLA_LIST.add(new Villa(new BigDecimal(7900000), 3, 2, 150, new BaseEntityAdditionalFields(), 3L));
        VILLA_LIST.add(new Villa(new BigDecimal(5800000), 4, 2, 125, new BaseEntityAdditionalFields(), 4L));
        VILLA_LIST.add(new Villa(new BigDecimal(7400000), 3, 2, 180, new BaseEntityAdditionalFields(), 5L));
    }
}
