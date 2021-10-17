package com.travel.agency.domain;

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
public class User implements UserDetails {
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
    @Transient
    private com.travel.agency.domain.GrantedAuthority[] authorities;
    @Transient
    private boolean enabled;
    @Transient
    private boolean accountNonExpired;
    @Transient
    private boolean credentialsNonExpired;
    @Transient
    private boolean accountNonLocked;

    @OneToMany(
            targetEntity = UserMessage.class,
            mappedBy = "user",
            fetch = FetchType.LAZY
    )
    private List<UserMessage> messages;

    @OneToMany(
            targetEntity = Booking.class,
            mappedBy = "user",
            fetch = FetchType.LAZY
    )
    private List<Booking> bookings;
    @OneToMany(
            targetEntity = Login.class,
            mappedBy = "user",
            fetch = FetchType.LAZY)
    private List<Login> logins;
    @OneToMany(
            targetEntity = Payment.class,
            mappedBy = "user",
            fetch = FetchType.LAZY
    )
    private List<Payment> customerPayments;


    public User(String name, String lastname, String email, String phone, String password, String role) {
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
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return Objects.equals(getId(), user.getId()) && Objects.equals(getName(),
                user.getName()) && Objects.equals(getLastname(),
                user.getLastname()) && Objects.equals(getEmail(),
                user.getEmail()) && Objects.equals(getPhone(),
                user.getPhone()) && Objects.equals(getRole(),
                user.getRole()) && Objects.equals(getPassword(), user.getPassword());
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

    public User(Long id, String name, String lastname, String email, String phone, String password, String role) {
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.password = password;
        this.role = role;
    }
}
