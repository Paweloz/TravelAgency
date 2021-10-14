package com.travel.agency.domain.dto;

import com.travel.agency.domain.User;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class BookingDto {

    private Long id;
    private String origin;
    private String destination;
    private LocalDate startDate;
    private LocalDate finishDate;
    private BigDecimal totalPrice;
    private Long userId;

    public BookingDto(String origin, String destination, LocalDate startDate, LocalDate finishDate, BigDecimal totalPrice, Long userId) {
        this.origin = origin;
        this.destination = destination;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.totalPrice = totalPrice;
        this.userId = userId;
    }
}
