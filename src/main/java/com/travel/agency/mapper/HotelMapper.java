package com.travel.agency.mapper;

import com.travel.agency.domain.Hotel;
import com.travel.agency.domain.dto.RoomDto;
import com.travel.agency.domain.dto.hotels.Entities;
import com.travel.agency.domain.dto.hotels.FetchedHotelsDto;
import com.travel.agency.domain.dto.hotels.HotelDetailsDto;
import org.springframework.stereotype.Component;


@Component
public class HotelMapper {

    public Hotel mapFetchedHotelToDomain(FetchedHotelsDto fetchedHotelsDto) {
        Entities entities = fetchedHotelsDto.getSuggestions().get(1).getEntities().get(0);
        return new Hotel(
                entities.getHoteId(),
                entities.getHotelName(),
                fetchedHotelsDto.getLocation()
        );
    }

    public RoomDto mapHotelDetalisToRoomDto(HotelDetailsDto hotelDetailsDto) {
        return new RoomDto(
                hotelDetailsDto.getData().getBody().getPropertyDescription().getName(),
                hotelDetailsDto.getData().getBody().getPropertyDescription().getStarRating(),
                hotelDetailsDto.getData().getBody().getPropertyDescription().getFeaturedPrice()
                        .getCurrentPrice().getPlainPrice()
        );
    }
}
