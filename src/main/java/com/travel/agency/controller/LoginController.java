package com.travel.agency.controller;

import com.travel.agency.domain.dto.LoginDto;
import com.travel.agency.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1/login")
@RequiredArgsConstructor
public class LoginController {

    private final LoginService loginService;

    @PostMapping()
    public Boolean loginCustomer(@RequestBody LoginDto loginDto) {
        return loginService.saveLoginEvent(loginDto);
    }
}
