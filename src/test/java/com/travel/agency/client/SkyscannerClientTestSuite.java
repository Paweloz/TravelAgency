package com.travel.agency.client;

import com.travel.agency.config.SkyscannerConfig;
import com.travel.agency.service.AppProblemService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class SkyscannerClientTestSuite {
    @Autowired
    private RestTemplate restTemplate;
    @Autowired
    private SkyscannerConfig skyscannerConfig;
    @Autowired
    private AppProblemService appProblemService;
    private final static String PROBLEM = "Failed to process request to Skyscanner API ";


    @Test
    void getAvaliableRoutes() {
    }
}