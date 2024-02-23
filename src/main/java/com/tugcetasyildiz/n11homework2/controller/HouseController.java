package com.tugcetasyildiz.n11homework2.controller;

import com.tugcetasyildiz.n11homework2.dao.HouseRepository;
import com.tugcetasyildiz.n11homework2.dto.HouseDTO;
import com.tugcetasyildiz.n11homework2.entity.House;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import com.tugcetasyildiz.n11homework2.general.baseController.BaseController;
import com.tugcetasyildiz.n11homework2.mapper.HouseMapper;
import com.tugcetasyildiz.n11homework2.service.HouseService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/houses")
public class HouseController extends BaseController<House,
        HouseDTO,
        HouseRepository,
        BaseRequest,
        HouseService,
        HouseMapper> {

    private final HouseService houseService;

    public HouseController(HouseService houseService) {
        this.houseService = houseService;
    }

    @Override
    protected HouseService getService() {
        return houseService;
    }
}
