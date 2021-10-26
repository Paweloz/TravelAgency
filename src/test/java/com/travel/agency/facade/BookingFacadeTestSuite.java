package com.travel.agency.facade;

import com.travel.agency.service.BookingService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class BookingFacadeTestSuite {
    @InjectMocks
    private BookingFacade bookingFacade;
    @Mock
    private BookingService bookingService;

    @Test
    void createBooking() {
    }

    @Test
    void getBookingsForUser() {
    }

    @Test
    void deleteBooking() {
    }
}