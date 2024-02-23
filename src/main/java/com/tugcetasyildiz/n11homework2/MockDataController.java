package com.tugcetasyildiz.n11homework2;

import com.tugcetasyildiz.n11homework2.generator.Property;
import com.tugcetasyildiz.n11homework2.service.CottageService;
import com.tugcetasyildiz.n11homework2.service.HouseService;
import com.tugcetasyildiz.n11homework2.service.VillaService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;

enum HouseType {HOUSE, VILLA, COTTAGE}

@RestController
@RequestMapping("mock/api/v1")
@RequiredArgsConstructor
public class MockDataController {
    private final HouseService houseService;
    private final CottageService cottageService;
    private final VillaService villaService;

    @GetMapping("price/average")
    public BigDecimal calculateAveragePrice(HouseType houseType) {
        if (houseType.equals(HouseType.HOUSE))
            return houseService.calculateAveragePrice(Property.HOUSE_LIST);

        if (houseType.equals(HouseType.VILLA))
            return villaService.calculateAveragePrice(Property.VILLA_LIST);

        if (houseType.equals(HouseType.COTTAGE))
            return cottageService.calculateAveragePrice(Property.COTTAGE_LIST);

        return BigDecimal.ZERO;
    }

    @GetMapping("price/total")
    public BigDecimal calculateTotalPrice(HouseType houseType) {
        if (houseType.equals(HouseType.HOUSE))
            return houseService.calculateTotalPrice(Property.HOUSE_LIST);

        if (houseType.equals(HouseType.VILLA))
            return villaService.calculateTotalPrice(Property.VILLA_LIST);

        if (houseType.equals(HouseType.COTTAGE))
            return cottageService.calculateTotalPrice(Property.COTTAGE_LIST);

        return BigDecimal.ZERO;
    }

    @GetMapping("area/average")
    public double calculateAverageArea(HouseType houseType) {
        if (houseType.equals(HouseType.HOUSE))
            return houseService.calculateAverageArea(Property.HOUSE_LIST);

        if (houseType.equals(HouseType.VILLA))
            return villaService.calculateAverageArea(Property.VILLA_LIST);

        if (houseType.equals(HouseType.COTTAGE))
            return cottageService.calculateAverageArea(Property.COTTAGE_LIST);

        return 0.0;
    }

}
