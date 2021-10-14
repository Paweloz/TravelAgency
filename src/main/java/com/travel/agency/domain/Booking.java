package com.travel.agency.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@RequiredArgsConstructor
@AllArgsConstructor
public class Booking {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private String origin;
    private String destination;
    private LocalDate startDate;
    private LocalDate finishDate;
    private BigDecimal totalPrice;
    @OneToOne
    private User user;

    public Booking(String origin, String destination, LocalDate startDate, LocalDate finishDate, BigDecimal totalPrice, User user) {
        this.origin = origin;
        this.destination = destination;
        this.startDate = startDate;
        this.finishDate = finishDate;
        this.totalPrice = totalPrice;
        this.user = user;
    }
}
