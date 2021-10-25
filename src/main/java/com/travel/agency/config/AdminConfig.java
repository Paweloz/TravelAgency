package com.travel.agency.config;

import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.service.UserService;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Slf4j
@Getter
@Configuration
public class AdminConfig {

    @Value("${admin.name")
    private String adminName;
    @Value("${admin.mail}")
    private String adminMail;


    public AdminConfig(UserService userService) {
        UserDto userDto = new UserDto("ADMIN","ADMIN","ADMIN@MAIL.COM",
                "123456789", "ADMIN", "ADMIN");
        if(!userService.checkExistsByUsername(userDto.getUsername())){
            userService.saveUser(userDto);
            log.info("Create Admin account in the database");
        } else {
            log.info("Found Admin account in the database");
        }
    }
}
