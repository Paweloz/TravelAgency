package com.travel.agency.controller;

import com.travel.agency.facade.TravelFacade;
import com.travel.agency.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.*;

@SpringJUnitWebConfig
@WebMvcTest(TravelController.class)
class TravelControllerTestSuite {
    @Autowired
    private MockMvc mockMvc;
    @MockBean
    private TravelFacade travelFacade;
    @MockBean
    private UserService userService;

    @Test
    void getTripsByDestination() {
    }
}