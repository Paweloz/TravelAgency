package com.travel.agency.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class SkyscannerConfig {
    @Value("${skyscanner.api}")
    private String skyscannerApi;
    @Value("${host.header.name}")
    private String hostHeaderName;
    @Value("${host.header.value}")
    private String hostHeaderValue;
    @Value("${key.header.name}")
    private String keyHeaderName;
    @Value("${key.header.value}")
    private String keyHeaderValue;
}
