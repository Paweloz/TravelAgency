package com.travel.agency.controller;

import com.travel.agency.domain.dto.HotelDto;
import com.travel.agency.facade.HotelFacade;
import com.travel.agency.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/hotel")
@RequiredArgsConstructor
public class HotelController {
    private final HotelFacade hotelFacade;

    @GetMapping("/getId")
    public String findHotel(@RequestParam String location) {
        return hotelFacade.findHotel(location);
    }

    @GetMapping()
    public HotelDto getPricing(@RequestParam String hotelId, String checkIn, String checkOut) {
        return hotelFacade.getPricing(hotelId, checkIn, checkOut);
    }
}
