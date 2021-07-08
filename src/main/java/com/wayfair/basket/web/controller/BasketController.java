package com.wayfair.basket.web.controller;

import com.wayfair.basket.dto.BasketRequestDTO;
import com.wayfair.basket.dto.BasketResponseDTO;
import com.wayfair.basket.service.BasketService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

@RestController
@RequestMapping("/api/v1/basket")
@RequiredArgsConstructor
@Validated
@Slf4j
public class BasketController {

    private BasketService basketService;


    @PutMapping(consumes = APPLICATION_JSON_VALUE, produces =APPLICATION_JSON_VALUE)
    public ResponseEntity<BasketResponseDTO> updateBasket(@RequestBody BasketRequestDTO basketRequestDTO) {

        return null;//new ResponseEntity<?>();
    }

    @PostMapping(consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
    public ResponseEntity<BasketResponseDTO> createBasket(@RequestBody BasketRequestDTO basketRequestDTO) {

        return new ResponseEntity<>(basketService.createBasket(basketRequestDTO), OK);
    }
}
