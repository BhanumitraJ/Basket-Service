package com.wayfair.basket.service;

import com.wayfair.basket.domain.entity.BasketEntity;
import com.wayfair.basket.domain.entity.BasketItemEntity;
import com.wayfair.basket.dto.BasketRequestDTO;
import com.wayfair.basket.dto.BasketResponseDTO;
import com.wayfair.basket.mapper.BasketResponseMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import static com.wayfair.basket.dto.StatusType.ADDED;

@Service
@RequiredArgsConstructor
@Slf4j
public class BasketService {

    private BasketResponseMapper basketResponseMapper;

    public BasketResponseDTO createBasket (BasketRequestDTO requestDTO) {
        requestDTO.getItems().forEach(e ->
                BasketItemEntity.builder()
                .skuId(e.getSkuId())
                .quantity(e.getQuantity())
                .status(ADDED.name())
                .build());
        //Need to populate the request into entity
        //Need to create UUID
        //Save the Entity
        //Mapping of the entity with the response
        return basketResponseMapper.mapBasketResponse();
    }
}
