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
    private LocalDate startDate;
    private LocalDate finishDate;
    private BigDecimal totalPrice;
    private List<Long> customersID;
}
