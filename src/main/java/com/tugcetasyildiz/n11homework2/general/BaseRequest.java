package com.tugcetasyildiz.n11homework2.general;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class BaseRequest {
    private BigDecimal price;
    private double area;
    private int roomCount;
    private int livingRoomCount;
}
