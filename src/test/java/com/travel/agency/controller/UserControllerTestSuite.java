package com.travel.agency.controller;

import com.travel.agency.facade.UserFacade;
import com.travel.agency.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitWebConfig
@WebMvcTest(UserController.class)
class UserControllerTestSuite {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserFacade userFacade;
    @MockBean
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