package com.travel.agency.service;

import com.travel.agency.client.HotelsClient;
import com.travel.agency.mapper.HotelMapper;
import com.travel.agency.repository.HotelDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class HotelServiceTestSuite {
    @Autowired
    private HotelDao hotelDao;
    @Autowired
    private HotelsClient hotelsClient;
    @Autowired
    private HotelMapper hotelMapper;

    @Test
    void getHotelDetails() {
    }

    @Test
    void findHotelByLocation() {
    }

    @Test
    void updateHotelDetailsInDb() {
    }

    @Test
    void checkHotelDetailsInDb() {
    }
}