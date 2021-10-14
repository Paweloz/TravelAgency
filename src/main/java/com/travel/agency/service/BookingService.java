package com.travel.agency.service;

import com.travel.agency.domain.Booking;
import com.travel.agency.repository.BookingDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingDao bookingDao;

    public void saveBooking(Booking booking) {
        bookingDao.save(booking);
    }
}
