package com.wayfair.basket.service;

import com.wayfair.basket.domain.entity.BasketEntity;
import com.wayfair.basket.dto.BasketRequestDTO;
import com.wayfair.basket.dto.BasketResponseDTO;
import com.wayfair.basket.mapper.BasketResponseMapper;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class BasketService {

    private BasketResponseMapper basketResponseMapper;

    public BasketResponseDTO createBasket (BasketRequestDTO requestDTO) {


        
        return basketResponseMapper.mapBasketResponse();
    }
}
