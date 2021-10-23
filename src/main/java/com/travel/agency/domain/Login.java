package com.travel.agency.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Login {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private LocalDateTime date;
    private String eventType;
    @ManyToOne
    @JoinColumn(name = "User")
    private User user;

    public Login(LocalDateTime date, String eventType, User user) {
        this.date = date;
        this.eventType = eventType;
        this.user = user;
    }
}
