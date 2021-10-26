package com.travel.agency.client;

import com.travel.agency.client.SkyscannerClient;
import com.travel.agency.domain.dto.skyscanner.AvaliableRoutesDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class SkyscannerClientTestSuite {
    @Autowired
    private SkyscannerClient skyscannerClient;

    @Test
    void testGetAvaliableRoutes() {
        AvaliableRoutesDto avaliableRoutesDtos = skyscannerClient.getAvaliableRoutes("KRK", "CFU");
        System.out.println(avaliableRoutesDtos.toString());
    }
}
