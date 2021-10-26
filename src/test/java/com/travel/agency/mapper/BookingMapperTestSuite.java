package com.travel.agency.mapper;

import com.travel.agency.repository.BookingDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookingMapperTestSuite {
    @Autowired
    private BookingDao bookingDao;

    @Test
    void mapBookingDtoToBooking() {
    }

    @Test
    void mapBookingToBookingDto() {
    }

    @Test
    void mapBookingsToBookingsDtoList() {
    }
}