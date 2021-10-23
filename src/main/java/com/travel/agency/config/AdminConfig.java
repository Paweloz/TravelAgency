package com.travel.agency.config;

import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.service.UserService;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Configuration
@Getter
public class AdminConfig {

    @Value("${admin.name")
    private String adminName;
    @Value("${admin.mail}")
    private String adminMail;

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminConfig.class);

    public AdminConfig(UserService userService) {
        UserDto userDto = new UserDto("ADMIN","ADMIN","ADMIN@MAIL.COM",
                "123456789", "ADMIN", "ADMIN");
        if(!userService.checkExistsByUsername(userDto.getUsername())){
            userService.saveUser(userDto);
            LOGGER.info("Create Admin account in the database");
        } else {
            LOGGER.info("Found Admin account in the database");
        }
    }
}
