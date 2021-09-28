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

@Component
@RequiredArgsConstructor
public class SkyscannerClient {

    private final RestTemplate restTemplate;
    private final SkyscannerConfig skyscannerConfig;

    public AvaliableRoutesDto getAvaliableRoutes(String origin, String destination, String date) {
        HttpHeaders headers = new HttpHeaders();
        headers.set(skyscannerConfig.getHostHeaderName(), skyscannerConfig.getHostHeaderValue());
        headers.set(skyscannerConfig.getKeyHeaderName(), skyscannerConfig.getKeyHeaderValue());

        HttpEntity entity = new HttpEntity(headers);

        ResponseEntity<AvaliableRoutesDto> response =
                restTemplate.exchange(
                        buildGetFlightUrl(origin, destination, date),
                        HttpMethod.GET, entity, new ParameterizedTypeReference<AvaliableRoutesDto>() {}
                        );
        return response.getBody();
    }

    private URI buildGetFlightUrl(String origin, String destination, String date) {
        return UriComponentsBuilder.fromHttpUrl(skyscannerConfig.getSkyscannerApi() + "/browseroutes/v1.0")
                .pathSegment("US")
                .pathSegment("PLN")
                .pathSegment("en-US")
                .pathSegment(origin)
                .pathSegment(destination)
                .pathSegment(date)
                .build()
                .encode()
                .toUri();
    }

}
