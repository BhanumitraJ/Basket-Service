package com.wayfair.basket.mapper;

import com.wayfair.basket.domain.entity.BasketEntity;
import com.wayfair.basket.dto.BasketResponseDTO;
import org.mapstruct.InjectionStrategy;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring", injectionStrategy = InjectionStrategy.CONSTRUCTOR)
public interface BasketResponseMapper {

    @Mapping(source = "status", target = "status")
    BasketResponseDTO mapBasketResponse (BasketEntity basketEntity);

}
