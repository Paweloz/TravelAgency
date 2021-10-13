package com.travel.agency.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@AllArgsConstructor
@Data
public class HotelDto {
    private Long id;
    private String hotelId;
    private String name;
    private String location;
    private String starRating;
    private BigDecimal pricePerNight;

    public HotelDto(String hotelId, String name, String starRating, BigDecimal pricePerNight) {
        this.hotelId = hotelId;
        this.name = name;
        this.starRating = starRating;
        this.pricePerNight = pricePerNight;
    }
}
