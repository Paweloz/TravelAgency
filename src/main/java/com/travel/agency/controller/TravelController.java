package com.travel.agency.controller;

import com.travel.agency.domain.dto.TravelDto;
import com.travel.agency.mapper.TravelMapper;
import com.travel.agency.service.TravelService;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("v1/travel")
@RequiredArgsConstructor
public class TravelController {

    private final TravelService travelService;
    private final TravelMapper travelMapper;

    @GetMapping
    public List<TravelDto> getTripsByDestination() {
        return null;
    }

    @GetMapping()

    @PostMapping
    public List<TravelDto> createBasicOffer() {  // not sure yet
        return null;
    }




}
