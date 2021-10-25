package com.travel.agency.facade;

import com.travel.agency.domain.dto.BookingDto;
import com.travel.agency.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class BookingFacade {

    private final BookingService bookingService;

    public void createBooking(BookingDto bookingDto) {
        bookingService.saveBooking(bookingDto);
    }

    public List<BookingDto> getBookingsForUser(Long userId) {
        return bookingService.getBookingsById(userId);
    }

    public void deleteBooking(Long bookingId) {
        bookingService.removeBooking(bookingId);
    }

}
