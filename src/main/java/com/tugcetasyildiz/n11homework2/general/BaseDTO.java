package com.tugcetasyildiz.n11homework2.general;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public abstract class BaseDTO {
    private final double area;
    private final int roomCount;
    private final int livingRoomCount;
    private final BigDecimal price;
}
