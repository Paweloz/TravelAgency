package com.travel.agency.service;

import com.travel.agency.client.SkyscannerClient;
import lombok.Data;
import org.springframework.stereotype.Service;

@Service
@Data
public class TravelService {
    private SkyscannerClient skyscannerClient;
}
