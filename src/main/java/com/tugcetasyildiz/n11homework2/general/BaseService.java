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
        var entity = getRepository().findById(id).orElse(null);

        if (Objects.isNull(entity))
            return null;

        entity.setRoomCount(request.getRoomCount());
        entity.setLivingRoomCount(request.getLivingRoomCount());
        entity.setArea(request.getArea());
        entity.setPrice(request.getPrice());
        getRepository().save(entity);

        return getMapper().convertToDTO(entity);
    }

    public void delete(Long id) {
        var entity = getRepository().findById(id).orElse(null);
        if (Objects.nonNull(entity)) {
            getRepository().delete(entity);
        }
    }

    public double calculateAverageArea(List<E> entityList) {
        double totalArea = 0.0;

        if (CollectionUtils.isEmpty(entityList)) {
            return totalArea;
        }
        for (E entity : entityList) {
            totalArea += entity.getArea();
        }

        return totalArea / entityList.size();
    }

    public BigDecimal calculateTotalPrice(List<E> entityList) {
        BigDecimal totalPrice = BigDecimal.ZERO;

        if (CollectionUtils.isEmpty(entityList)) {
            return BigDecimal.ZERO;
        }
        for (E entity : entityList) {
            totalPrice = totalPrice.add(entity.getPrice());
        }
        return totalPrice;
    }

    public BigDecimal calculateAveragePrice(List<E> entityList) {
        if (entityList.isEmpty()) {
            return BigDecimal.ZERO;
        }
        BigDecimal totalPrice = calculateTotalPrice(entityList);
        return totalPrice.divide(BigDecimal.valueOf(entityList.size()), 2, RoundingMode.HALF_UP);
    }

    public List<E> filterHousesByRoomAndLivingRoom(List<E> entityList, int roomCount, int livingRoomCount) {

        return entityList.stream()
                .filter(house -> house.getLivingRoomCount() == livingRoomCount)
                .filter(house -> house.getRoomCount() == roomCount)
                .toList();
    }
}
