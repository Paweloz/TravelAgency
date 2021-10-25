package com.travel.agency.facade;

import com.travel.agency.domain.dto.LoginDto;
import com.travel.agency.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class LoginFacade {

    private final LoginService loginService;

    public Boolean loginCustomer(LoginDto loginDto) {
        return loginService.saveLoginEvent(loginDto);
    }
}
