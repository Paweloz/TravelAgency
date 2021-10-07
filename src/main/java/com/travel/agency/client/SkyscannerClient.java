package com.travel.agency.client;

import com.travel.agency.config.SkyscannerConfig;
import com.travel.agency.domain.dto.skyscanner.AvaliableRoutesDto;
import lombok.RequiredArgsConstructor;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@Component
@RequiredArgsConstructor
public class SkyscannerClient {

    private final RestTemplate restTemplate;
    private final SkyscannerConfig skyscannerConfig;

    public AvaliableRoutesDto getAvaliableRoutes(String origin, String destination) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(skyscannerConfig.getHostHeaderName(), skyscannerConfig.getHostHeaderValue());
        headers.set(skyscannerConfig.getKeyHeaderName(), skyscannerConfig.getKeyHeaderValue());

        HttpEntity entity = new HttpEntity(headers);
        ResponseEntity<AvaliableRoutesDto> response =
                restTemplate.exchange(
                        buildGetFlightUrl(origin, destination),
                        HttpMethod.GET, entity, new ParameterizedTypeReference<AvaliableRoutesDto>() {}
                        );
        return response.getBody();
    }

    private URI buildGetFlightUrl(String origin, String destination) {
        return UriComponentsBuilder.fromHttpUrl(skyscannerConfig.getSkyscannerApi() + "/browsequotes/v1.0")
                .pathSegment("PL")
                .pathSegment("PLN")
                .pathSegment("en-GB")
                .pathSegment(origin)
                .pathSegment(destination)
                .pathSegment("anytime")
                .pathSegment("anytime")
                .build()
                .encode()
                .toUri();
    }

}
