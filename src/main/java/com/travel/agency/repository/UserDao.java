package com.travel.agency.repository;

import com.travel.agency.domain.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends CrudRepository<User, Long> {

    User findUserByName(String name);
    boolean existsByName(String name);
    User findUserById(Long id);
}
