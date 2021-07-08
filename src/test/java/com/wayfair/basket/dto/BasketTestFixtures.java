
package com.wayfair.basket.dto;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import static com.wayfair.basket.dto.StatusType.ACTIVE;
import static com.wayfair.basket.dto.StatusType.ADDED;
import static com.wayfair.basket.dto.StatusType.UPDATED;

public class BasketTestFixtures {

    public static BasketRequestDTO.BasketRequestDTOBuilder buildBasketRequest() {
        return BasketRequestDTO.builder()
                .locale("")
                .status(ACTIVE)
                .currency("euro")
                .items(buildBasketItems());
    }

    public static List<BasketItemsDTO> buildBasketItems() {
        return List.of(BasketItemsDTO.builder()
                        .skuId("sku123")
                        .build(),
                BasketItemsDTO.builder()
                        .quantity(1)
                        .skuId("sku134")
                        .createdDate(LocalDateTime.of(2021,07,07,12,12,12))
                        .build());
    }

    public static List<BasketItemsStatus> buildItemStatus () {
        List.of(BasketItemsStatus.builder()
                        .status(ADDED)
                        .skuId("sku123")
                        .build(),
                List.of(BasketItemsStatus.builder()
                        .status(UPDATED)
                        .skuId("sku456")
                        .build()));
    }

    public static BasketResponseDTO.BasketResponseDTOBuilder buildBasketResponse() {
        return BasketResponseDTO.builder()
                .basketItemStatus()
                .currency("euro")
                .uuid(UUID.randomUUID().toString())
                .locale("")
                .items(buildBasketItems());
    }

}

