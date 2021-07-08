package com.wayfair.basket.domain.entity;

import lombok.Builder;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import java.time.LocalDateTime;

@Data
@Builder(toBuilder = true)
@MappedSuperclass
public class BaseEntity {

    @Column(name = "created_date")
    @CreationTimestamp
    private LocalDateTime createdDate;

    @Column(name = "updated_date")
    @CreationTimestamp
    private LocalDateTime updatedDate;

}
