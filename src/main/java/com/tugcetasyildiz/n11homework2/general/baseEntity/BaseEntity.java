package com.tugcetasyildiz.n11homework2.general.baseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.MappedSuperclass;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@MappedSuperclass
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public abstract class BaseEntity implements BaseEntityModel {

    @Column(name = "PRICE")
    private BigDecimal price;

    @Column(name = "ROOM_COUNT")
    private int roomCount;

    @Column(name = "LIVING_ROOM_COUNT")
    private int livingRoomCount;

    @Column(name = "AREA")
    private double area;

    @Embedded
    private BaseEntityAdditionalFields baseEntityAdditionalFields;

}
