package com.wayfair.basket.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "basket", schema = "digital_cart")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder(toBuilder = true)
public class BasketEntity extends BaseEntity {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false)
    private Long id;

    @Column(name = "customer_id", unique = true, nullable = false)
    private String customerId;

    @Column(name = "site_id", unique = true, nullable = false)
    private String siteId;

    @Column(name = "basket_total", nullable = false)
    private BigDecimal basketTotal;

    @Column(name = "currency", nullable = false)
    private String currency;

    @Column(name = "delivery_type", nullable = false)
    private String deliveryType;

    @Column(name = "delivery_destination", nullable = false)
    private String deliveryDestination;

    @Column(name = "locale", nullable = false)
    private String locale;

    @Column(name = "uuid", nullable = false)
    private UUID uuid;

    @Column(name = "status")
    private String status;

    @OneToMany(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "basket_id", referencedColumnName = "id")
    private Set<BasketItemEntity> items;
}
