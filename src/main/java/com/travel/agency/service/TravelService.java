package com.travel.agency.service;

import com.travel.agency.client.SkyscannerClient;
import lombok.Data;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
@Data
public class TravelService {
    private SkyscannerClient skyscannerClient;

   // @PostConstruct for initialize trips db
}
