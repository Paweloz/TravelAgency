package com.travel.agency.service;

import com.travel.agency.domain.User;
import com.travel.agency.domain.dto.UserDto;
import com.travel.agency.repository.UserDao;
import lombok.AllArgsConstructor;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UserService implements UserDetailsService {

    private final UserDao userDao;

    public User saveUser(User user) {
        return userDao.save(user);
    }

    public boolean checkExistsByUsername(String name) {
        return userDao.existsByName(name);
    }

    @Override
    public User loadUserByUsername(String username) throws UsernameNotFoundException {
        return userDao.findUserByName(username);
    }

    public User getUserById(Long userId) {
        return userDao.findUserById(userId);
    }
}
