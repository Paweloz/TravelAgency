package com.travel.agency.mapper;

import com.travel.agency.domain.Login;
import com.travel.agency.domain.dto.LoginDto;
import com.travel.agency.repository.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginMapper {

    private final UserDao userDao;

    public Login mapLoginDtoToLogin(LoginDto loginDto) {
        return new Login(
                loginDto.getDate(),
                loginDto.getEventType(),
                userDao.findUserById(loginDto.getUserId())
        );
    }
}
