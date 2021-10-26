package com.travel.agency.facade;

import com.travel.agency.service.HotelService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HotelFacadeTestSuite {
    @InjectMocks
    private HotelFacade hotelFacade;
    @Mock
    private HotelService hotelService;


    @Test
    void findHotel() {
    }

    @Test
    void getPricing() {
    }
}