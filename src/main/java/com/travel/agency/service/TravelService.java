package com.travel.agency.service;

import com.travel.agency.client.FlightRadarClient;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class TravelService {
    private FlightRadarClient flightRadarClient;
}
