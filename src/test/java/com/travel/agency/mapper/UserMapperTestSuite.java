package com.travel.agency.mapper;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.password.PasswordEncoder;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMapperTestSuite {
    @Autowired
    private PasswordEncoder passwordEncoder;
    private static final String USER_ROLE = "USER";

    @Test
    void mapUserToDto() {
    }

    @Test
    void mapUserDtoToDomain() {
    }

    @Test
    void mapUsersToUserDtoList() {
    }
}