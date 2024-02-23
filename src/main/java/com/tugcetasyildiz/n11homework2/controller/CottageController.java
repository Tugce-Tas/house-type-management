package com.tugcetasyildiz.n11homework2.controller;

import com.tugcetasyildiz.n11homework2.dao.CottageRepository;
import com.tugcetasyildiz.n11homework2.dto.CottageDTO;
import com.tugcetasyildiz.n11homework2.entity.Cottage;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import com.tugcetasyildiz.n11homework2.general.baseController.BaseController;
import com.tugcetasyildiz.n11homework2.mapper.CottageMapper;
import com.tugcetasyildiz.n11homework2.service.CottageService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/cottages")
public class CottageController extends BaseController<Cottage,
        CottageDTO,
        CottageRepository,
        BaseRequest,
        CottageService,
        CottageMapper> {

    private final CottageService cottageService;

    public CottageController(CottageService cottageService) {
        this.cottageService = cottageService;
    }

    @Override
    protected CottageService getService() {
        return cottageService;
    }
}
