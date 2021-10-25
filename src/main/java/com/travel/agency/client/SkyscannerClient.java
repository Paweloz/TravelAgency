package com.travel.agency.client;

import com.travel.agency.config.SkyscannerConfig;
import com.travel.agency.domain.dto.skyscanner.AvaliableRoutesDto;
import com.travel.agency.service.AppProblemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Component
@RequiredArgsConstructor
public class SkyscannerClient {

    private final RestTemplate restTemplate;
    private final SkyscannerConfig skyscannerConfig;
    private final AppProblemService appProblemService;
    private final static String PROBLEM = "Failed to process request to Skyscanner API ";

    public AvaliableRoutesDto getAvaliableRoutes(String origin, String destination) {
        try {
            ResponseEntity<AvaliableRoutesDto> response =
                    restTemplate.exchange(
                            buildGetFlightUrl(origin, destination),
                            HttpMethod.GET, setHeaders(), new ParameterizedTypeReference<AvaliableRoutesDto>() {}
                    );
            return response.getBody();
        } catch ( RestClientException e) {
            log.warn(PROBLEM + e.getMessage());
            appProblemService.saveProblem(PROBLEM + e.getMessage());
        }
        return new AvaliableRoutesDto();
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

    private HttpEntity setHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(skyscannerConfig.getHostHeaderName(), skyscannerConfig.getHostHeaderValue());
        headers.set(skyscannerConfig.getKeyHeaderName(), skyscannerConfig.getKeyHeaderValue());
        return new HttpEntity(headers);
    }
}
