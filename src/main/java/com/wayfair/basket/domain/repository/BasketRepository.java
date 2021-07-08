package com.wayfair.basket.domain.repository;


import com.wayfair.basket.domain.entity.BasketEntity;
import org.springframework.data.repository.CrudRepository;

public interface BasketRepository extends CrudRepository<BasketEntity, Long> {

}
