package com.travel.agency.service;

import com.travel.agency.client.HotelsClient;
import com.travel.agency.domain.Hotel;
import com.travel.agency.domain.dto.RoomDto;
import com.travel.agency.domain.dto.hotels.FetchedHotelsDto;
import com.travel.agency.domain.dto.hotels.HotelDetailsDto;
import com.travel.agency.mapper.HotelMapper;
import com.travel.agency.repository.HotelDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@AllArgsConstructor
public class HotelService {
    private final HotelDao hotelDao;
    private final HotelsClient hotelsClient;
    private final HotelMapper hotelMapper;

    public RoomDto getPricingForRooms(String hotelId, String checkIn, String checkOut) {
        HotelDetailsDto hotelDetailsDto = hotelsClient.getPricingForHotel(hotelId, checkIn, checkOut);
        //List<RoomDto> list = hotelMapper.mapHotelRoomsToListDto(hotelDetailsDto);

        return hotelMapper.mapHotelDetalisToRoomDto(hotelDetailsDto);
    }

    
    public String findHotelByLocation(String location) {
        if (hotelDao.existsByLocation(location)) {
            Hotel hotelFromDb = hotelDao.findByLocation(location);
            return hotelFromDb.getHotelId();
        }
        FetchedHotelsDto fetchedHotels = hotelsClient.findHotelInLocation(location);
        Hotel hotelToSave= hotelMapper.mapFetchedHotelToDomain(fetchedHotels);
        saveHotelInDb(hotelToSave);
        return hotelToSave.getHotelId();
    }

    public void saveHotelInDb(Hotel hotel) {
        hotelDao.save(hotel);
    }
}
