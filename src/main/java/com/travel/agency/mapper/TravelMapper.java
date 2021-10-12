package com.travel.agency.mapper;

import com.travel.agency.domain.dto.TravelDto;
import com.travel.agency.domain.dto.skyscanner.AvaliableRoutesDto;
import com.travel.agency.domain.dto.skyscanner.Places;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@Component
public class TravelMapper {

    public List<TravelDto> mapFetchedTripsToTravelDto(AvaliableRoutesDto avaliableRoutesDto, String origin, String destination) {
        List<TravelDto> travelDtos = new ArrayList<>();
        int quantity = avaliableRoutesDto.getQuotes().size();
        for(int i=0; i < quantity; i++) {
            travelDtos.add(new TravelDto(
                    collectRightPlaceFromResponse(avaliableRoutesDto, origin).getCityName(),
                    collectRightPlaceFromResponse(avaliableRoutesDto, destination).getCityName(),
                    avaliableRoutesDto.getQuotes().get(i).getOutboundLeg().getDepartureDate().substring(0,10),
                    avaliableRoutesDto.getQuotes().get(i).getInboundLeg().getDepartureDate().substring(0,10),
                    new BigDecimal(avaliableRoutesDto.getQuotes().get(i).getFlightPrice().toString())));
        }
        return travelDtos;
    }

    public Places collectRightPlaceFromResponse(AvaliableRoutesDto avaliableRoutesDto, String placeFromRequest ) {
        List<Places> placesFromResponse = avaliableRoutesDto.getPlaces();
        for (Places places : placesFromResponse) {
            if (places.getSkyscannerCode().equals(placeFromRequest)) {
                return places;
            }
        }
        return new Places();
    }
}
