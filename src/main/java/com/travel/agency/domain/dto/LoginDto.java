package com.travel.agency.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginDto {
    private LocalDateTime date;
    private String eventType;
    private Long userId;
}
