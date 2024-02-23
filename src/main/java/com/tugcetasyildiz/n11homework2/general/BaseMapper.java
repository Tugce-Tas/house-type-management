package com.tugcetasyildiz.n11homework2.general;


import com.tugcetasyildiz.n11homework2.general.baseEntity.BaseEntity;

import java.util.List;

public interface BaseMapper<E extends BaseEntity,
        DTO extends BaseDTO,
        R extends BaseRequest> {

    E convertToEntity(DTO dto);

    E convertToEntity(R request);

    DTO convertToDTO(E entity);

    List<DTO> convertToDTOs(List<E> entity);

}
