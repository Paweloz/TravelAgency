package com.travel.agency.domain;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.jmx.export.annotation.ManagedAttribute;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@RequiredArgsConstructor
public class Travel {
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
            targetEntity = Customer.class,
            mappedBy = "travelList",
            fetch = FetchType.LAZY
    )
    private List<Customer> customerList;

}
