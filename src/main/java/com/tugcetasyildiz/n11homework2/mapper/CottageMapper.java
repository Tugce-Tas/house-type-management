package com.tugcetasyildiz.n11homework2.mapper;

import com.tugcetasyildiz.n11homework2.dto.CottageDTO;
import com.tugcetasyildiz.n11homework2.entity.Cottage;
import com.tugcetasyildiz.n11homework2.general.BaseMapper;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface CottageMapper extends BaseMapper<Cottage, CottageDTO, BaseRequest> {

}