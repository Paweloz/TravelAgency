package com.travel.agency.service;

import com.travel.agency.client.SkyscannerClient;
import com.travel.agency.domain.dto.TravelDto;
import com.travel.agency.domain.dto.skyscanner.AvaliableRoutesDto;
import com.travel.agency.mapper.TravelMapper;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TravelService {
    private final SkyscannerClient skyscannerClient;
    private final TravelMapper travelMapper;


    public List<TravelDto> findTripsByDestination(String origin, String destination) {
        AvaliableRoutesDto avaliableRoutesDto = skyscannerClient.getAvaliableRoutes(origin,destination);
        return travelMapper.mapFetchedTripsToTravelDto(avaliableRoutesDto, origin, destination);
    }
}
