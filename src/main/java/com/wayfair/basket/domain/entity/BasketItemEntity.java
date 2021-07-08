package com.wayfair.basket.domain.entity;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
@Table(name = "basket_item", schema = "digital_cart")
public class BasketItemEntity {

    @Id
    @Column(name = "basket_id",nullable = false)
    @GeneratedValue
    private UUID id;

    @Column(name = "skuId", nullable = false)
    private String skuId;

    @Column(name = "item_price", nullable = false)
    private BigDecimal itemPrice;

    @Column(name = "item_total", nullable = false)
    private BigDecimal itemTotal;

    @Column(name = "quantity", nullable = false)
    private int quantity;

    @Column(name = "status", nullable = false)
    private String status;


}
