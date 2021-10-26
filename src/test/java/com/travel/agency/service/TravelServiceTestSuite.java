package com.travel.agency.service;

import com.travel.agency.client.SkyscannerClient;
import com.travel.agency.mapper.TravelMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TravelServiceTestSuite {
    @Autowired
    private SkyscannerClient skyscannerClient;
    @Autowired
    private TravelMapper travelMapper;

    @Test
    void findTripsByDestination() {
    }
}