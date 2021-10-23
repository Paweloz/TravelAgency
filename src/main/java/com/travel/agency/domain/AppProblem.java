package com.travel.agency.domain;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
public class AppProblem {

    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private String problemType;
    private LocalDateTime localDateTime;

    public AppProblem(String problemType, LocalDateTime localDateTime) {
        this.problemType = problemType;
        this.localDateTime = localDateTime;
    }
}
