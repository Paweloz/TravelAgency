package com.travel.agency.controller;

import com.travel.agency.facade.AppProblemFacade;
import com.travel.agency.service.AppProblemService;
import com.travel.agency.service.UserService;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.web.SpringJUnitWebConfig;
import org.springframework.test.web.servlet.MockMvc;

@SpringJUnitWebConfig
@WebMvcTest(AppProblemController.class)
class AppProblemControllerTestSuite {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private AppProblemFacade appProblemFacade;

    @MockBean
    private UserService userService;


    @Test
    void createProblem() {
    }

    @Test
    void deleteProblem() {
    }

    @Test
    void getProblems() {
    }
}