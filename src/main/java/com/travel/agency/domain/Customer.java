package com.travel.agency.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Customer {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    private boolean isLoggedIn;
    private String generatedKey;
    @ManyToMany(
            targetEntity = Travel.class,
            mappedBy = "customerList",
            fetch = FetchType.LAZY
    )
    @JoinTable(
            name = "Customer_has_Travel",
            joinColumns = @JoinColumn(name = "CustomerID", referencedColumnName = "id"),
            inverseJoinColumns = @JoinColumn(name = "TravelID", referencedColumnName = "id")
    )
    private List<Travel> travelList;
    @OneToMany(
            targetEntity = Login.class,
            mappedBy = "customer",
            fetch = FetchType.LAZY)
    private List<Login> logins;
    @OneToMany(
            targetEntity = Payment.class,
            mappedBy = "customer",
            fetch = FetchType.LAZY
    )
    private List<Payment> customerPayments;
}
