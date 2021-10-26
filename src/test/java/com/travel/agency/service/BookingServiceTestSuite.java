package com.travel.agency.service;

import com.travel.agency.mapper.BookingMapper;
import com.travel.agency.repository.BookingDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookingServiceTestSuite {
    @Autowired
    private BookingDao bookingDao;
    @Autowired
    private BookingMapper bookingMapper;

    @Test
    void saveBooking() {
    }

    @Test
    void getBookingsById() {
    }

    @Test
    void removeBooking() {
    }
}