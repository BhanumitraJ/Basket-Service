package com.wayfair.basket.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.springframework.validation.annotation.Validated;

import java.util.List;

@Data
@Builder
@Value
@Validated
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonDeserialize(builder = BasketRequestDTO.BasketRequestDTOBuilder.class)
public class BasketRequestDTO {

    @JsonProperty("status")
    private String status;

    @JsonProperty("site-id")
    private String siteId;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("items")
    private List<BasketItemsDTO> items;

}
