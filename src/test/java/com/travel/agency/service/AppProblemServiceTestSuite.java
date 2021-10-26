package com.travel.agency.service;

import com.travel.agency.mapper.AppProblemMapper;
import com.travel.agency.repository.AppProblemDao;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class AppProblemServiceTestSuite {
    @Autowired
    private AppProblemDao appProblemDao;
    @Autowired
    private AppProblemMapper appProblemMapper;

    @Test
    void saveProblem() {
    }

    @Test
    void testSaveProblem() {
    }

    @Test
    void getProblems() {
    }

    @Test
    void removeProblem() {
    }
}