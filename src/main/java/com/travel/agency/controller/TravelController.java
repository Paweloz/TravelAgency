package com.travel.agency.controller;

import com.travel.agency.domain.dto.TravelDto;
import com.travel.agency.mapper.TravelMapper;
import com.travel.agency.service.TravelService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/travel")
@RequiredArgsConstructor
public class TravelController {

    private final TravelService travelService;

    @GetMapping
    public List<TravelDto> getTripsByDestination() {
        return null;
    }

    @PostMapping
    public List<TravelDto> createBasicOffer() {  // not sure yet
        return null;
    }

    @GetMapping("/getTrips")
    public List<TravelDto> getTripsByDestination(@RequestParam String origin, String destination) {
        return travelService.findTripsByDestination(origin, destination);
    }



}
