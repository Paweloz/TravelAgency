package com.travel.agency.domain.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Data
public class TravelDto {
    private Long id;
    private String origin;
    private String destination;
    private String description;
    private String startDate;
    private String finishDate;
    private BigDecimal flightPrice;
    private List<Long> customersID;

    public TravelDto(String origin, String destination, String startDate, String finishDate, BigDecimal flightPrice) {
        this.origin = origin;
        this.destination = destination;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.flightPrice = flightPrice;
    }
}
