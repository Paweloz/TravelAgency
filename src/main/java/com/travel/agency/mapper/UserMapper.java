package com.travel.agency.mapper;

import com.travel.agency.domain.User;
import com.travel.agency.domain.dto.UserDto;
import lombok.AllArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class UserMapper {

    private final PasswordEncoder passwordEncoder;
    private static final String USER_ROLE = "USER";

    public UserDto mapUserToDto(User user) {
        return new UserDto(
                user.getId(),
                user.getName(),
                user.getLastname(),
                user.getEmail(),
                user.getPhone(),
                user.getPassword(),
                user.getRole());
    }

    public User mapUserDtoToDomain(UserDto userDto) {
        return  new User(
                userDto.getId(),
                userDto.getUsername(),
                userDto.getLastname(),
                userDto.getEmail(),
                userDto.getPhone(),
                passwordEncoder.encode(userDto.getPassword()),
                userDto.getRole() != null ? userDto.getRole() : USER_ROLE);
    }
}
