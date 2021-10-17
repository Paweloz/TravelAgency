package com.travel.agency.service;

import com.travel.agency.domain.Booking;
import com.travel.agency.domain.dto.BookingDto;
import com.travel.agency.mapper.BookingMapper;
import com.travel.agency.repository.BookingDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookingService {
    private final BookingDao bookingDao;
    private final BookingMapper bookingMapper;

    public void saveBooking(BookingDto bookingDto) {
        bookingDao.save(bookingMapper.mapBookingDtoToBooking(bookingDto));
    }

    public List<BookingDto> getBookingsById(Long userId) {
       return bookingMapper.mapBookingsToBookingsDtoList(bookingDao.findAllByUser_Id(userId));
    }

    public void removeBooking(Long bookingId) {
        bookingDao.deleteById(bookingId);
    }
}
