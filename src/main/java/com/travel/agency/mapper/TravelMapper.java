package com.travel.agency.mapper;

import com.travel.agency.domain.dto.TravelDto;
import com.travel.agency.domain.dto.skyscanner.AvaliableRoutesDto;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Component
public class TravelMapper {

//    public TravelDto mapFetchedTripsToTravelDto(AvaliableRoutesDto avaliableRoutesDto) {
//        return new TravelDto(
//                avaliableRoutesDto.getPlaces().get(1).getCityName(),
//                avaliableRoutesDto.getPlaces().get(0).getCityName(),
//                avaliableRoutesDto.getQuotes().get(0).getOutboundLeg().getDepartureDate(),
//                avaliableRoutesDto.getQuotes().get(0).getInboundLeg().getDepartureDate(),
//                new BigDecimal(avaliableRoutesDto.getQuotes().get(0).getMinPrice().toString())
//        );
//    }

    public List<TravelDto> mapFetchedTripsToTravelDto(AvaliableRoutesDto avaliableRoutesDto) {
        List<TravelDto> travelDtos = new ArrayList<>();
        int quantity = avaliableRoutesDto.getQuotes().size();
        for(int i=0; i < quantity; i++) {
            travelDtos.add(new TravelDto(
                    avaliableRoutesDto.getPlaces().get(1).getCityName(),
                    avaliableRoutesDto.getPlaces().get(0).getCityName(),
                    avaliableRoutesDto.getQuotes().get(i).getOutboundLeg().getDepartureDate().substring(0,10),
                    avaliableRoutesDto.getQuotes().get(i).getInboundLeg().getDepartureDate().substring(0,10),
                    new BigDecimal(avaliableRoutesDto.getQuotes().get(i).getMinPrice().toString())));
        }
        return travelDtos;
    }
}
