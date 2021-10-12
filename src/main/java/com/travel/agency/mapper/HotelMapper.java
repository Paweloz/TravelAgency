package com.travel.agency.mapper;

import com.travel.agency.domain.Hotel;
import com.travel.agency.domain.dto.RoomDto;
import com.travel.agency.domain.dto.hotels.Entities;
import com.travel.agency.domain.dto.hotels.FetchedHotelsDto;
import com.travel.agency.domain.dto.hotels.HotelDetailsDto;
import com.travel.agency.domain.dto.hotels.Room;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

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
//
//    public RoomDto mapFetchedHotelRoomToDto( Room room) {
//        return new RoomDto(
//                room.getName(),
//                room.getRatePlans().get(0).getPrice().getCost()
//        );
//    }


//    public List<RoomDto> mapHotelRoomsToListDto( HotelDetailsDto hotelDetailsDto) {
//        return hotelDetailsDto.getData().getBody().getRoomsAndRates().getRoomsList().stream()
//                .map(this::mapFetchedHotelRoomToDto)
//                .collect(Collectors.toList());
//    }

    public RoomDto mapHotelDetalisToRoomDto(HotelDetailsDto hotelDetailsDto) {
        return new RoomDto(
                hotelDetailsDto.getData().getBody().getPropertyDescription().getName(),
                hotelDetailsDto.getData().getBody().getPropertyDescription().getStarRating()
        );
    }
}
