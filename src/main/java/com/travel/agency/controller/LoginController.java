package com.travel.agency.controller;

import com.travel.agency.domain.dto.LoginDto;
import com.travel.agency.facade.LoginFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginFacade loginFacade;

    @PostMapping()
    public Boolean loginCustomer(@RequestBody LoginDto loginDto) {
        return loginFacade.loginCustomer(loginDto);
    }
}
