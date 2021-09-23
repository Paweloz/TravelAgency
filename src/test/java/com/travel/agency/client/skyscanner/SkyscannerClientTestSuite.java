package com.travel.agency.client.skyscanner;

import com.travel.agency.client.SkyscannerClient;
import com.travel.agency.domain.dto.skyscanner.AvaliableRoutesDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class SkyscannerClientTestSuite {
    @Autowired
    private SkyscannerClient skyscannerClient;

    @Test
    void testGetAvaliableRoutes() {
       AvaliableRoutesDto avaliableRoutesDtos =
               skyscannerClient.getAvaliableRoutes("WAW-sky", "AGP-sky", "2021-09-25");
        System.out.println(avaliableRoutesDtos.toString());
    }
}
