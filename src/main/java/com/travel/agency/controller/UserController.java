package com.travel.agency.controller;

import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/user")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;


    @PostMapping()
    public Boolean createUser(@RequestBody UserDto userDto) {
        return userService.saveUser(userDto) != null;
    }

    @PutMapping("/edit")
    public void editUser(@RequestBody UserDto userDto) {
          userService.saveUser(userDto);
    }

    @DeleteMapping()
    public void removeUser(@RequestParam Long userId) {
        userService.removeUserById(userId);
    }

    @GetMapping("/all")
    public List<UserDto> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping()
    public UserDto getUserByName(@RequestParam String name) {
        return userService.loadUserByUsername(name);
    }

    @GetMapping("/exist")
    public boolean checkIfExistInDb(@RequestParam String name) {
        return userService.checkExistsByUsername(name);
    }

    @GetMapping("/getDetails")
    public UserDto getUserDetails(@RequestParam Long userId) {
        return  userService.getUserById(userId);
    }

}
