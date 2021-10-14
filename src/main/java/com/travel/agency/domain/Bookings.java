package com.travel.agency.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@RequiredArgsConstructor
public class Bookings {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private String origin;
    private String destination;
    private String description;
    private LocalDate startDate;
    private LocalDate finishDate;
    private BigDecimal totalPrice;
    @ManyToMany(
            targetEntity = User.class,
            mappedBy = "bookingsList",
            fetch = FetchType.LAZY
    )
    private List<User> userList;

}
