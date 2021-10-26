package com.travel.agency.service;

import com.travel.agency.mapper.UserMapper;
import com.travel.agency.repository.UserDao;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserServiceTestSuite {
    @Autowired
    private UserDao userDao;
    @Autowired
    private UserMapper userMapper;

    @Test
    void saveUser() {
    }

    @Test
    void checkExistsByUsername() {
    }

    @Test
    void loadUserByUsername() {
    }

    @Test
    void getUserById() {
    }

    @Test
    void getAllUsers() {
    }

    @Test
    void removeUserById() {
    }
}