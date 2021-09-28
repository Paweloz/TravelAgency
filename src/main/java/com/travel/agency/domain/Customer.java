package com.travel.agency.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

@Entity
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Customer implements UserDetails {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    private String role;
    @ManyToMany
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


    public Customer(String name, String lastname, String email, String phone, String password, String role) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer customer = (Customer) o;
        return Objects.equals(getId(), customer.getId()) && Objects.equals(getName(),
                customer.getName()) && Objects.equals(getLastname(),
                customer.getLastname()) && Objects.equals(getEmail(),
                customer.getEmail()) && Objects.equals(getPhone(),
                customer.getPhone()) && Objects.equals(getRole(),
                customer.getRole()) && Objects.equals(getPassword(), customer.getPassword());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getName(), getLastname(), getEmail(), getPhone(), getRole(), getPassword());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return Collections.singleton(new SimpleGrantedAuthority(role));
    }

    @Override
    public String getUsername() {
        return name;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    public Customer(Long id, String name, String lastname, String email, String phone, String password, String role) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }
}
