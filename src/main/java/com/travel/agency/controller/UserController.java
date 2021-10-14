package com.travel.agency.controller;

import com.travel.agency.domain.User;
import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.mapper.UserMapper;
import com.travel.agency.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("v1/user")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;
    private final UserMapper userMapper;

    @PostMapping()
    public Boolean createUser(@RequestBody UserDto userDto) {
        User userToSave = userMapper.mapUserDtoToDomain(userDto);
        return userService.saveUser(userToSave) != null;
    }

    @PutMapping("/edit")
    public void editUser(@RequestBody UserDto userDto) {

    }

    @DeleteMapping("/delete")
    public void removeUser(@RequestParam Long customerId) {

    }

    @GetMapping()
    public UserDto getUserByName(@RequestParam String name) {
        return userMapper.mapUserToDto(userService.loadUserByUsername(name));
    }

    @GetMapping("/exist")
    public boolean checkIfExistInDb(@RequestParam String name) {
        return userService.checkExistsByUsername(name);
    }

    @GetMapping("/tmp")
    public void getUserDetails() {
        System.out.println("Działa");
    }

}
