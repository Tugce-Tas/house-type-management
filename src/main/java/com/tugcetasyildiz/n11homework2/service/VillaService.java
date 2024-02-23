package com.tugcetasyildiz.n11homework2.service;

import com.tugcetasyildiz.n11homework2.dao.VillaRepository;
import com.tugcetasyildiz.n11homework2.dto.VillaDTO;
import com.tugcetasyildiz.n11homework2.entity.Villa;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import com.tugcetasyildiz.n11homework2.general.BaseService;
import com.tugcetasyildiz.n11homework2.mapper.VillaMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class VillaService extends BaseService<Villa, VillaRepository, VillaDTO, BaseRequest, VillaMapper> {

    private final VillaRepository villaRepository;
    private final VillaMapper villaMapper;

    @Override
    protected VillaRepository getRepository() {
        return villaRepository;
    }

    @Override
    protected VillaMapper getMapper() {
        return villaMapper;
    }
}