package com.travel.agency.domain.dto;

import lombok.Data;

@Data
public class CustomerDto {
    private Long id;
    private String name;
    private String lastname;
    private String email;
    private String phone;
    private String password;
    private boolean isLoggedIn;
    private String generatedKey;
}
