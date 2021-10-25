package com.travel.agency.facade;

import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class UserFacade {

    private final UserService userService;

    public Boolean createUser(UserDto userDto) {
        return userService.saveUser(userDto) != null;
    }

    public void editUser(UserDto userDto) {
        userService.saveUser(userDto);
    }

    public void removeUser(Long userId) {
        userService.removeUserById(userId);
    }

    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    public UserDto getUserByName(String name) {
        return userService.loadUserByUsername(name);
    }

    public boolean checkIfExistInDb(String name) {
        return userService.checkExistsByUsername(name);
    }

    public UserDto getUserDetails(Long userId) {
        return  userService.getUserById(userId);
    }
}
