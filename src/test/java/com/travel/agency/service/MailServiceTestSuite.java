package com.travel.agency.service;

import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.javamail.JavaMailSender;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MailServiceTestSuite {
    @Mock
    private JavaMailSender javaMailSender;
    @Autowired
    private  AppProblemService appProblemService;
    private final static String PROBLEM = "Failed to process email sending ";

    @Test
    void send() {
    }
}