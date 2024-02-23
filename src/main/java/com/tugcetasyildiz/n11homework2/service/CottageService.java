package com.tugcetasyildiz.n11homework2.service;

import com.tugcetasyildiz.n11homework2.dao.CottageRepository;
import com.tugcetasyildiz.n11homework2.dto.CottageDTO;
import com.tugcetasyildiz.n11homework2.entity.Cottage;
import com.tugcetasyildiz.n11homework2.general.BaseRequest;
import com.tugcetasyildiz.n11homework2.general.BaseService;
import com.tugcetasyildiz.n11homework2.mapper.CottageMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class CottageService extends BaseService<Cottage, CottageRepository, CottageDTO, BaseRequest, CottageMapper> {

    private final CottageRepository cottageRepository;
    private final CottageMapper cottageMapper;

    @Override
    protected CottageRepository getRepository() {
        return cottageRepository;
    }

    @Override
    protected CottageMapper getMapper() {
        return cottageMapper;
    }
}

