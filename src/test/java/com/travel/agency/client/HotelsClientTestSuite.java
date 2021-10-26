package com.travel.agency.client;

import com.travel.agency.config.HotelsConfig;
import com.travel.agency.service.AppProblemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HotelsClientTestSuite {
    @Autowired
    private HotelsConfig hotelsConfig;
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private AppProblemService appProblemService;
    private final static String PROBLEM = "Failed to process request to hotels.com API ";

    @Test
    void getPricingForHotel() {
    }

    @Test
    void findHotelInLocation() {
    }
}