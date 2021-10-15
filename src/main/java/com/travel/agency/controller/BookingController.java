package com.travel.agency.controller;

import com.travel.agency.domain.Booking;
import com.travel.agency.domain.dto.BookingDto;
import com.travel.agency.mapper.BookingMapper;
import com.travel.agency.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/booking")
@RequiredArgsConstructor
public class BookingController {
    private final BookingService bookingService;
    private final BookingMapper bookingMapper;

    @PostMapping()
    public void createBooking(@RequestBody BookingDto bookingDto) {
        bookingService.saveBooking(bookingMapper.mapBookingDtoToBooking(bookingDto));
    }

    @GetMapping("/userId")
    public List<BookingDto> getBookingsForUser(@RequestParam Long userId) {
        List<Booking> bookingsFromDb = bookingService.getBookingsById(userId);
        return bookingMapper.mapBookingsToBookingsDtoList(bookingsFromDb);
    }
}
