package com.wayfair.basket.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Data;
import lombok.Value;
import org.springframework.validation.annotation.Validated;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
@Value
@Validated
public class BasketResponseDTO {

    @JsonProperty("created-date")
    private LocalDateTime createdDate;

    @JsonProperty("updated-date")
    private LocalDateTime updatedDate;

    @JsonProperty("uuid")
    private String uuid;

    @JsonProperty("locale")
    private String locale;

    @JsonProperty("currency")
    private String currency;

    @JsonProperty("status")
    private String status;

    @JsonProperty("items")
    private List<BasketItemsDTO> items;

    @JsonProperty("item-status")
    private List<BasketItemsStatus> basketItemStatus;
}
