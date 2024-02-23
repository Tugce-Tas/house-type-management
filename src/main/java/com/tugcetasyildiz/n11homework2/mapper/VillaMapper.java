package com.tugcetasyildiz.n11homework2.mapper;

import com.tugcetasyildiz.n11homework2.dto.VillaDTO;
import com.tugcetasyildiz.n11homework2.entity.Villa;
import com.tugcetasyildiz.n11homework2.general.BaseMapper;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface VillaMapper extends BaseMapper<Villa, VillaDTO, BaseRequest> {

}