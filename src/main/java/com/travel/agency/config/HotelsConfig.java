package com.travel.agency.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class HotelsConfig {
    @Value("${hotels.api}")
    private String hotelsApi;
    @Value("${host.header.name}")
    private String hostHeaderName;
    @Value("${hotels.host.header.value}")
    private String hostHeaderValue;
    @Value("${key.header.name}")
    private String keyHeaderName;
    @Value("${key.header.value}")
    private String keyHeaderValue;
}
