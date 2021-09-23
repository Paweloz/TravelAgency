package com.travel.agency.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private LocalDate loggedInTime;
    private LocalDate loggedOutTime;
    @ManyToOne
    @JoinColumn(name = "Customer")
    private Customer customer;
}
