package com.tugcetasyildiz.n11homework2.controller;

import com.tugcetasyildiz.n11homework2.dao.VillaRepository;
import com.tugcetasyildiz.n11homework2.dto.VillaDTO;
import com.tugcetasyildiz.n11homework2.entity.Villa;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import com.tugcetasyildiz.n11homework2.general.baseController.BaseController;
import com.tugcetasyildiz.n11homework2.mapper.VillaMapper;
import com.tugcetasyildiz.n11homework2.service.VillaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/villas")
@RequiredArgsConstructor
public class VillaController extends BaseController<Villa,
        VillaDTO,
        VillaRepository,
        BaseRequest,
        VillaService,
        VillaMapper> {

    private final VillaService villaService;
    
    @Override
    protected VillaService getService() {
        return villaService;
    }
}