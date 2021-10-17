package com.travel.agency.domain.dto;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
public class UserMessageDto {
    private Long id;
    private LocalDate date;
    private String message;
    private Long userId;
}
