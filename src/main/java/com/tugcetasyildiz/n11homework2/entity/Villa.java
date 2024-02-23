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
@Table(name = "VILLA")
public class Villa extends BaseEntity {

    @SequenceGenerator(name = "villa_id", sequenceName = "VILLA_ID_SEQ")
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Id
    private Long id;

    public Villa() {
    }

    public Villa(BigDecimal price, int roomCount, int livingRoomCount, double area, BaseEntityAdditionalFields baseEntityAdditionalFields, Long id) {
        super(price, roomCount, livingRoomCount, area, baseEntityAdditionalFields);
        this.id = id;
    }
}