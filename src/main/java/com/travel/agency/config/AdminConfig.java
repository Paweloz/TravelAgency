package com.travel.agency.config;

import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.mapper.UserMapper;
import com.travel.agency.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AdminConfig {

    private static final Logger LOGGER = LoggerFactory.getLogger(AdminConfig.class);

    public AdminConfig(UserService userService, UserMapper userMapper) {
        UserDto userDto = new UserDto("ADMIN","ADMIN","ADMIN@MAIL.COM",
                "123456789", "ADMIN", "ADMIN");
        if(!userService.checkExistsByUsername(userDto.getUsername())){
            userService.saveUser(userMapper.mapUserDtoToDomain(userDto));
            LOGGER.info("Create Admin account in the database");
        } else {
            LOGGER.info("Found Admin account in the database");
        }
    }
}
