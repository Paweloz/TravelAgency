package com.travel.agency.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserMessage {
    @Id
    @GeneratedValue
    @NotNull
    private Long id;
    private LocalDate date;
    private String message;
    @ManyToOne
    @JoinColumn(name = "USER_ID")
    private User user;

    public UserMessage(LocalDate date, String message, User user) {
        this.date = date;
        this.message = message;
        this.user = user;
    }
}
