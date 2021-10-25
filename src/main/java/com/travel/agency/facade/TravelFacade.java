package com.travel.agency.facade;

import com.travel.agency.domain.dto.TravelDto;
import com.travel.agency.service.TravelService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class TravelFacade {

    private final TravelService travelService;

    public List<TravelDto> getTripsByDestination(String origin, String destination) {
        return travelService.findTripsByDestination(origin, destination);
    }
}
