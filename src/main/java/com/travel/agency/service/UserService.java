package com.travel.agency.service;

import com.travel.agency.domain.User;
import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.mapper.UserMapper;
import com.travel.agency.repository.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final UserDao userDao;
    private final UserMapper userMapper;

    public User saveUser(UserDto userDto) {
        return userDao.save(userMapper.mapUserDtoToDomain(userDto));
    }

    public boolean checkExistsByUsername(String name) {
        return userDao.existsByName(name);
    }

    @Override
    public UserDto loadUserByUsername(String username) throws UsernameNotFoundException {
        return userMapper.mapUserToDto(userDao.findUserByName(username));
    }

    public UserDto getUserById(Long userId) {
        return userMapper.mapUserToDto(userDao.findUserById(userId));
    }

    public List<UserDto> getAllUsers() {
        return userMapper.mapUsersToUserDtoList(userDao.findAll());
    }

    public void removeUserById(Long userId) {
        userDao.deleteById(userId);
    }
}
