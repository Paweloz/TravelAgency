package com.travel.agency.controller;

import com.travel.agency.domain.dto.HotelDto;
import com.travel.agency.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/hotel")
@RequiredArgsConstructor
public class HotelController {
    private final HotelService hotelService;

    @GetMapping("/getId")
    public String findHotel(@RequestParam String location) {
        return hotelService.findHotelByLocation(location);
    }

    @GetMapping()
    public HotelDto getPricing(@RequestParam String hotelId, String checkIn, String checkOut) {
        return hotelService.getHotelDetails(hotelId, checkIn, checkOut);
    }
}
