package com.wayfair.basket.web;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.wayfair.basket.WayfairBasketServiceApplication;
import com.wayfair.basket.dto.BasketTestFixtures;
import com.wayfair.basket.service.BasketService;
import com.wayfair.basket.web.controller.BasketController;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.verify;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@WebMvcTest(BasketController.class)
@ContextConfiguration(classes = {WayfairBasketServiceApplication.class})
public class BasketControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @MockBean
    private BasketService basketService;

    @Test
    void respondWith200StatusOK() throws Exception {
        mockMvc.perform(post("/api/v1/basket")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(BasketTestFixtures.buildBasketRequest())))
                .andExpect(status().isOk());

    }

    @Test
    void respondWith400WhenBasketDataAreNull() throws Exception {
        mockMvc.perform(post("/api/v1/basket")
                .contentType(MediaType.APPLICATION_JSON)
                .content(objectMapper.writeValueAsString(null)))
                .andExpect(status().isBadRequest());
    }
}
