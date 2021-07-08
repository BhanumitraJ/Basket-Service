package com.wayfair.basket.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Value;

@Data
@Builder
@Value
@JsonInclude(JsonInclude.Include.NON_NULL)
public class BasketItemsStatus {

    @JsonProperty("sku-id")
    private String skuId;

    @JsonProperty("status")
    private StatusType status;
}
