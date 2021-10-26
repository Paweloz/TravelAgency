package com.travel.agency.service;

import com.travel.agency.mapper.LoginMapper;
import com.travel.agency.repository.LoginDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoginServiceTestSuite {
    @Autowired
    private LoginDao loginDao;
    @Autowired
    private LoginMapper loginMapper;

    @Test
    void saveLoginEvent() {
    }
}