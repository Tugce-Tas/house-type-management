package com.tugcetasyildiz.n11homework2.dto;


import com.tugcetasyildiz.n11homework2.general.BaseDTO;

import java.math.BigDecimal;


public class CottageDTO extends BaseDTO {
    public CottageDTO(double area, int roomCount, int livingRoomCount, BigDecimal price) {
        super(area, roomCount, livingRoomCount, price);
    }
}
