package com.tugcetasyildiz.n11homework2.general;

import com.tugcetasyildiz.n11homework2.general.baseEntity.BaseEntity;
import lombok.RequiredArgsConstructor;
import org.apache.commons.collections4.CollectionUtils;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;
import java.util.Objects;

@RequiredArgsConstructor
public abstract class BaseService<E extends BaseEntity,
        Repo extends BaseRepository<E>,
        DTO extends BaseDTO,
        R extends BaseRequest,
        Mapper extends BaseMapper<E, DTO, R>> {

    protected abstract Repo getRepository();

    protected abstract Mapper getMapper();

    public List<DTO> getAll() {
        return getMapper().convertToDTOs(getRepository().findAll());
    }

    public DTO getById(Long id) {
        return getMapper().convertToDTO(getRepository().findById(id).orElse(null));
    }

    public E save(R request) {
        return getRepository().save(getMapper().convertToEntity(request));
    }

    public DTO update(Long id, R request) {
        var realEstate = getRepository().findById(id).orElse(null);

        if (Objects.isNull(realEstate))
            return null;

        realEstate.setRoomCount(request.getRoomCount());
        realEstate.setLivingRoomCount(request.getLivingRoomCount());
        realEstate.setArea(request.getArea());
        realEstate.setPrice(request.getPrice());
        getRepository().save(realEstate);

        return getMapper().convertToDTO(realEstate);
    }

    public void delete(Long id) {
        var realEstate = getRepository().findById(id).orElse(null);
        if (Objects.nonNull(realEstate)) {
            getRepository().delete(realEstate);
        }
    }

    public double calculateAverageArea(List<E> realEstateList) {
        double totalArea = 0.0;

        if (CollectionUtils.isEmpty(realEstateList)) {
            return totalArea;
        }
        for (E entity : realEstateList) {
            totalArea += entity.getArea();
        }

        return totalArea / realEstateList.size();
    }

    public BigDecimal calculateTotalPrice(List<E> realEstateList) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        if (CollectionUtils.isEmpty(realEstateList)) {
            return BigDecimal.ZERO;
        }
        for (E entity : realEstateList) {
            totalPrice = totalPrice.add(entity.getPrice());
        }
        return totalPrice;
    }

    public BigDecimal calculateAveragePrice(List<E> realEstateList) {
        if (realEstateList.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal totalPrice = calculateTotalPrice(realEstateList);
        return totalPrice.divide(BigDecimal.valueOf(realEstateList.size()), 2, RoundingMode.HALF_UP);
    }

    public List<E> filterHousesByRoomAndLivingRoom(List<E> entityList, int roomCount, int livingRoomCount) {

        return entityList.stream()
                .filter(house -> house.getLivingRoomCount() == livingRoomCount)
                .filter(house -> house.getRoomCount() == roomCount)
                .toList();
    }
}
