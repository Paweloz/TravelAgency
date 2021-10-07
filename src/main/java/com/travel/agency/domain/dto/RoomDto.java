package com.travel.agency.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
public class RoomDto {
    private String name;
    private BigDecimal price;
}
