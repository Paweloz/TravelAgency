package com.travel.agency.service;

import com.travel.agency.domain.Login;
import com.travel.agency.domain.dto.LoginDto;
import com.travel.agency.mapper.LoginMapper;
import com.travel.agency.repository.LoginDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final LoginDao loginDao;
    private final LoginMapper loginMapper;

    public Boolean saveLoginEvent(LoginDto loginDto) {
        Login savedLogin = loginDao.save(loginMapper.mapLoginDtoToLogin(loginDto));
        return savedLogin != null;
    }
}
