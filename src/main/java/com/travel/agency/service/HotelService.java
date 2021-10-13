package com.travel.agency.service;

import com.travel.agency.client.HotelsClient;
import com.travel.agency.domain.Hotel;
import com.travel.agency.domain.dto.HotelDto;
import com.travel.agency.domain.dto.hotels.FetchedHotelsDto;
import com.travel.agency.domain.dto.hotels.HotelDetailsDto;
import com.travel.agency.mapper.HotelMapper;
import com.travel.agency.repository.HotelDao;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;

@Service
@AllArgsConstructor
public class HotelService {
    private final HotelDao hotelDao;
    private final HotelsClient hotelsClient;
    private final HotelMapper hotelMapper;

    public HotelDto getHotelDetails(String hotelId, String checkIn, String checkOut) {
        if (checkHotelDetailsInDb(hotelId)) {
            Hotel hotelFromDb = hotelDao.findByHotelId(hotelId);
            return hotelMapper.mapHotelToHotelDto(hotelFromDb);
        }
        HotelDetailsDto hotelDetailsDto = hotelsClient.getPricingForHotel(hotelId, checkIn, checkOut);
        updateHotelDetailsInDb(hotelId, hotelDetailsDto);
        return hotelMapper.mapHotelDetalisToHotelDto(hotelDetailsDto, hotelId);
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

    public void updateHotelDetailsInDb(String hotelId, HotelDetailsDto hotelDetailsDto) {
        Hotel hotelFromDb = hotelDao.findByHotelId(hotelId);
        BigDecimal pricePerNight = hotelDetailsDto.getData().getBody().
                getPropertyDescription().getFeaturedPrice().
                getCurrentPrice().getPlainPrice();
        String starRating = hotelDetailsDto.getData().getBody().getPropertyDescription().getStarRating();
        hotelFromDb.setStarRating(starRating);
        hotelFromDb.setPricePerNight(pricePerNight);
        saveHotelInDb(hotelFromDb);
    }

    public Boolean checkHotelDetailsInDb(String hotelId) {
        Hotel hotelFromDb = hotelDao.findByHotelId(hotelId);
        return hotelFromDb.getStarRating() != null && hotelFromDb.getPricePerNight() != null;
    }


    public void saveHotelInDb(Hotel hotel) {
        hotelDao.save(hotel);
    }
}
