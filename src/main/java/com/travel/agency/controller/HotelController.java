package com.travel.agency.controller;

import com.travel.agency.domain.dto.RoomDto;
import com.travel.agency.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/hotel")
@RequiredArgsConstructor
public class HotelController {
    private final HotelService hotelService;

    @GetMapping("/getId")
    public String findHotel(@RequestParam String location) {
        return hotelService.findHotelByLocation(location);
    }

    @GetMapping
    public List<RoomDto> getPricing(@RequestParam String hotelId, String checkIn, String checkOut) {
        return hotelService.getPricingForRooms(hotelId, checkIn, checkOut);
    }
}
