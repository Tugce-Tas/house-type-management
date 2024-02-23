package com.tugcetasyildiz.n11homework2.entity;


import com.tugcetasyildiz.n11homework2.general.baseEntity.BaseEntity;
import com.tugcetasyildiz.n11homework2.general.baseEntity.BaseEntityAdditionalFields;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@Table(name = "COTTAGE")
public class Cottage extends BaseEntity {

    @SequenceGenerator(name = "cottage_id", sequenceName = "COTTAGE_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;

    public Cottage() {
    }

    public Cottage(BigDecimal price, int roomCount, int livingRoomCount, double area, BaseEntityAdditionalFields baseEntityAdditionalFields, Long id) {
        super(price, roomCount, livingRoomCount, area, baseEntityAdditionalFields);
        this.id = id;
    }
}
