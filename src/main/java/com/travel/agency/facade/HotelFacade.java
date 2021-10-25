package com.travel.agency.facade;

import com.travel.agency.domain.dto.HotelDto;
import com.travel.agency.service.HotelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class HotelFacade {

    private final HotelService hotelService;

    public String findHotel(String location) {
        return hotelService.findHotelByLocation(location);
    }

    public HotelDto getPricing(String hotelId, String checkIn, String checkOut) {
        return hotelService.getHotelDetails(hotelId, checkIn, checkOut);
    }
}
