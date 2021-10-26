package com.travel.agency.controller;

import com.travel.agency.facade.LoginFacade;
import com.travel.agency.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitWebConfig
@WebMvcTest(LoginController.class)
class LoginControllerTestSuite {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private LoginFacade loginFacade;
    @MockBean
    private UserService userService;

    @Test
    void loginCustomer() {
    }
}