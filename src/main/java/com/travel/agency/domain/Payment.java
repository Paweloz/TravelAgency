package com.travel.agency.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private BigDecimal totalDue;
    private LocalDate paymentDateDeadline;
    private boolean isPaid;
    @ManyToOne
    @JoinColumn(name = "Customer")
    private Customer customer;
}
