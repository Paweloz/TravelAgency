package com.travel.agency.service;

import com.travel.agency.mapper.UserMessageMapper;
import com.travel.agency.repository.UserMessageDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMessageServiceTestSuite {
    @Autowired
    private UserMessageDao userMessageDao;
    @Autowired
    private UserMessageMapper userMessageMapper;

    @Test
    void saveMessage() {
    }
}