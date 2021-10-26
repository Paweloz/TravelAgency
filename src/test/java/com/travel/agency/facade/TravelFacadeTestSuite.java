package com.travel.agency.facade;

import com.travel.agency.service.TravelService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class TravelFacadeTestSuite {
    @InjectMocks
    private TravelFacade travelFacade;
    @Mock
    private TravelService travelService;

    @Test
    void getTripsByDestination() {
    }
}