package com.travel.agency.mapper;

import com.travel.agency.domain.Booking;
import com.travel.agency.domain.dto.BookingDto;
import com.travel.agency.repository.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;

@Component
@RequiredArgsConstructor
public class BookingMapper {
    private final UserDao userDao;

    public Booking mapBookingDtoToBooking(BookingDto bookingDto) {
        return new Booking(
                bookingDto.getOrigin(),
                bookingDto.getDestination(),
                bookingDto.getStartDate(),
                bookingDto.getFinishDate(),
                bookingDto.getTotalPrice(),
                userDao.findUserById(bookingDto.getId())
        );
    }
}
