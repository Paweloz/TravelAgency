package com.travel.agency.mapper;

import com.travel.agency.domain.UserMessage;
import com.travel.agency.domain.dto.UserMessageDto;
import com.travel.agency.repository.UserDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMessageMapper {

    private final UserDao userDao;

    public UserMessage mapMessageDtoToMessage(UserMessageDto userMessageDto) {
        return new UserMessage(
                userMessageDto.getDate(),
                userMessageDto.getMessage(),
                userDao.findUserById(userMessageDto.getUserId())
        );
    }
}
