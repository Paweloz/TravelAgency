package com.travel.agency.client;

import com.travel.agency.config.HotelsConfig;
import com.travel.agency.domain.dto.hotels.FetchedHotelsDto;
import com.travel.agency.domain.dto.hotels.HotelDetailsDto;
import com.travel.agency.service.AppProblemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Slf4j
@Component
@RequiredArgsConstructor
public class HotelsClient {
    private final HotelsConfig hotelsConfig;
    private final RestTemplate restTemplate;
    private final AppProblemService appProblemService;
    private final static String PROBLEM = "Failed to process request to hotels.com API ";


    public HotelDetailsDto getPricingForHotel(String hotelId, String checkIn, String checkOut) {
        try {
            ResponseEntity<HotelDetailsDto> response =
                    restTemplate.exchange(
                            buildGetPricingURL(hotelId, checkIn, checkOut),
                            HttpMethod.GET,
                            setHeaders(),
                            new ParameterizedTypeReference<HotelDetailsDto>() {}
                    );
            return response.getBody();
        } catch ( RestClientException e ) {
            log.warn(PROBLEM + e.getMessage());
            appProblemService.saveProblem(PROBLEM + e.getMessage());
        }
        return new HotelDetailsDto();
    }

    public FetchedHotelsDto findHotelInLocation(String location) {
        try {
            ResponseEntity<FetchedHotelsDto> response =
                    restTemplate.exchange(
                            buildLocationSearchURL(location),
                            HttpMethod.GET,
                            setHeaders(),
                            new ParameterizedTypeReference<FetchedHotelsDto>() {}
                    );
            return response.getBody();
        } catch ( RestClientException e ) {
            log.warn(PROBLEM + e.getMessage());
            appProblemService.saveProblem(PROBLEM + e.getMessage());
        }
        return new FetchedHotelsDto();
    }

    private URI buildLocationSearchURL(String location) {
         return  UriComponentsBuilder.fromHttpUrl(hotelsConfig.getHotelsApi() + "/locations/search")
                .queryParam("query", location)
                .queryParam("locale", "pl_PL")
                .build()
                .encode()
                .toUri();
    }

    private URI buildGetPricingURL(String hotelId, String checkIn, String checkOut) {
        return   UriComponentsBuilder.fromHttpUrl(hotelsConfig.getHotelsApi() +"/properties/get-details")
                .queryParam("id", hotelId)
                .queryParam("checkIn", checkIn)
                .queryParam("checkOut", checkOut)
                .queryParam("adults1", "1")
                .queryParam("currency", "PLN")
                .queryParam("locale", "pl_PL")
                .build()
                .encode()
                .toUri();
    }

    private HttpEntity setHeaders() {
        HttpHeaders headers = new HttpHeaders();
        headers.set(hotelsConfig.getHostHeaderName(), hotelsConfig.getHostHeaderValue());
        headers.set(hotelsConfig.getKeyHeaderName(), hotelsConfig.getKeyHeaderValue());
        return new HttpEntity(headers);
    }
}
