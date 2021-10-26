package com.travel.agency.facade;

import com.travel.agency.service.AppProblemService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppProblemFacadeTestSuite {
    @InjectMocks
    private AppProblemFacade appProblemFacade;

    @Mock
    private AppProblemService appProblemService;

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