package com.tugcetasyildiz.n11homework2.general.baseEntity;

import jakarta.persistence.Embeddable;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

@Embeddable
@Getter
@Setter
public class BaseEntityAdditionalFields {
    private LocalDateTime createDate;
    private LocalDateTime updateDate;
    private Long creatorId;
    private Long updaterId;
}
