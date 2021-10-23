package com.travel.agency.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
public class AppProblemDto {
    private Long id;
    private String problemType;
    private LocalDateTime localDateTime;

    public AppProblemDto(String problemType, LocalDateTime localDateTime) {
        this.problemType = problemType;
        this.localDateTime = localDateTime;
    }
}
