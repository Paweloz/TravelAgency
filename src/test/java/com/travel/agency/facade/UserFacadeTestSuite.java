package com.travel.agency.facade;

import com.travel.agency.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserFacadeTestSuite {
    @InjectMocks
    private UserFacade userFacade;
    @Mock
    private UserService userService;

    @Test
    void createUser() {
    }

    @Test
    void editUser() {
    }

    @Test
    void removeUser() {
    }

    @Test
    void getAllUsers() {
    }

    @Test
    void getUserByName() {
    }

    @Test
    void checkIfExistInDb() {
    }

    @Test
    void getUserDetails() {
    }
}