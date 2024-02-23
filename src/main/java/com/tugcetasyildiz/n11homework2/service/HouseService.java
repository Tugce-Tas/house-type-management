package com.tugcetasyildiz.n11homework2.service;

import com.tugcetasyildiz.n11homework2.dao.HouseRepository;
import com.tugcetasyildiz.n11homework2.dto.HouseDTO;
import com.tugcetasyildiz.n11homework2.entity.House;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import com.tugcetasyildiz.n11homework2.general.BaseService;
import com.tugcetasyildiz.n11homework2.mapper.HouseMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class HouseService extends BaseService<House, HouseRepository, HouseDTO, BaseRequest, HouseMapper> {

    private final HouseRepository houseRepository;
    private final HouseMapper houseMapper;

    @Override
    protected HouseRepository getRepository() {
        return houseRepository;
    }

    @Override
    protected HouseMapper getMapper() {
        return houseMapper;
    }
}
