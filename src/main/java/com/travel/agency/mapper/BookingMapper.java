package com.travel.agency.mapper;

import com.travel.agency.domain.Booking;
import com.travel.agency.domain.dto.BookingDto;
import com.travel.agency.repository.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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
                userDao.findUserById(bookingDto.getUserId())
        );
    }

    public BookingDto mapBookingToBookingDto(Booking booking) {
        return new BookingDto(
                booking.getId(),
                booking.getOrigin(),
                booking.getDestination(),
                booking.getStartDate(),
                booking.getFinishDate(),
                booking.getTotalPrice(),
                booking.getUser().getId()
        );
    }

    public List<BookingDto> mapBookingsToBookingsDtoList(List<Booking> bookingsFromDb) {
        return bookingsFromDb.stream()
                .map(this::mapBookingToBookingDto)
                .collect(Collectors.toList());
    }
}
