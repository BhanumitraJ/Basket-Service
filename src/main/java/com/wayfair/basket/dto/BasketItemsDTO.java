package com.wayfair.basket.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;

@Data
@Builder
@Value
@Validated
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasketItemsDTO {

    @JsonProperty("sku-id")
    private String skuId;

    @JsonProperty("quantity")
    private int quantity;

    @JsonProperty("created-date")
    private LocalDateTime createdDate;

    @JsonProperty("updated-date")
    private LocalDateTime updatedDate;


}
