package com.travel.agency.repository;

import com.travel.agency.domain.UserMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface UserMessageDao extends CrudRepository<UserMessage, Long> {
}
