package com.travel.agency.controller;

import com.travel.agency.domain.dto.BookingDto;
import com.travel.agency.facade.BookingFacade;
import com.travel.agency.service.BookingService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/booking")
@RequiredArgsConstructor
public class BookingController {

    private final BookingFacade bookingFacade;

    @PostMapping()
    public void createBooking(@RequestBody BookingDto bookingDto) {
        bookingFacade.createBooking(bookingDto);
    }

    @GetMapping("/userId")
    public List<BookingDto> getBookingsForUser(@RequestParam Long userId) {
        return bookingFacade.getBookingsForUser(userId);
    }

    @DeleteMapping
    public void deleteBookingById(@RequestParam Long bookingId) {
        bookingFacade.deleteBooking(bookingId);
    }
}
