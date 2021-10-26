package com.travel.agency.facade;

import com.travel.agency.domain.Login;
import com.travel.agency.service.LoginService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoginFacadeTestSuite {
    @InjectMocks
    private LoginFacade loginFacade;
    @Mock
    private LoginService loginService;

    @Test
    void loginCustomer() {
    }
}