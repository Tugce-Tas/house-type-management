package com.tugcetasyildiz.n11homework2.mapper;

import com.tugcetasyildiz.n11homework2.dto.HouseDTO;
import com.tugcetasyildiz.n11homework2.entity.House;
import com.tugcetasyildiz.n11homework2.general.BaseMapper;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;


@Mapper(unmappedTargetPolicy = ReportingPolicy.IGNORE, componentModel = "spring")
public interface HouseMapper extends BaseMapper<House, HouseDTO, BaseRequest> {
}
