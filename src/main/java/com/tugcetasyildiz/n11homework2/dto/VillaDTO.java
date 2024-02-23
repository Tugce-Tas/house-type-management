package com.tugcetasyildiz.n11homework2.dto;


import com.tugcetasyildiz.n11homework2.general.BaseDTO;

import java.math.BigDecimal;


public class VillaDTO extends BaseDTO {

    public VillaDTO(double area, int roomCount, int livingRoomCount, BigDecimal price) {
        super(area, roomCount, livingRoomCount, price);
    }
}
