package com.travel.agency.controller;

import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.facade.UserFacade;
import com.travel.agency.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("v1/user")
@CrossOrigin(origins = "*")
@RequiredArgsConstructor
public class UserController {

    private final UserFacade userFacade;

    @PostMapping()
    public Boolean createUser(@RequestBody UserDto userDto) {
        return userFacade.createUser(userDto);
    }

    @PutMapping("/edit")
    public void editUser(@RequestBody UserDto userDto) {
          userFacade.editUser(userDto);
    }

    @DeleteMapping()
    public void removeUser(@RequestParam Long userId) {
        userFacade.removeUser(userId);
    }

    @GetMapping("/all")
    public List<UserDto> getAllUsers() {
        return userFacade.getAllUsers();
    }

    @GetMapping()
    public UserDto getUserByName(@RequestParam String name) {
        return userFacade.getUserByName(name);
    }

    @GetMapping("/exist")
    public boolean checkIfExistInDb(@RequestParam String name) {
        return userFacade.checkIfExistInDb(name);
    }

    @GetMapping("/getDetails")
    public UserDto getUserDetails(@RequestParam Long userId) {
        return  userFacade.getUserDetails(userId);
    }

}
