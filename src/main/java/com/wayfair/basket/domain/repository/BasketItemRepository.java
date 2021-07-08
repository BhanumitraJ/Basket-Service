package com.wayfair.basket.domain.repository;

import com.wayfair.basket.domain.entity.BasketItemEntity;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;
import java.util.UUID;

public interface BasketItemRepository extends CrudRepository<BasketItemEntity, UUID> {

    Optional<BasketItemEntity> findBySkuId(String skuId);
}
