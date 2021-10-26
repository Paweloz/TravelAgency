package com.travel.agency.controller;

import com.travel.agency.facade.UserMessageFacade;
import com.travel.agency.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;
@SpringJUnitWebConfig
@WebMvcTest(UserMessageController.class)
class UserMessageControllerTestSuite {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private UserMessageFacade userMessageFacade;
    @MockBean
    private UserService userService;

    @Test
    void createMessage() {
    }
}