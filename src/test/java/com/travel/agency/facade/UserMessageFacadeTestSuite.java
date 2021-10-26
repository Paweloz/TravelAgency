package com.travel.agency.facade;

import com.travel.agency.service.UserMessageService;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserMessageFacadeTestSuite {
    @InjectMocks
    private UserMessageFacade userMessageFacade;
    @Mock
    private UserMessageService userMessageService;

    @Test
    void createMessage() {
    }
}