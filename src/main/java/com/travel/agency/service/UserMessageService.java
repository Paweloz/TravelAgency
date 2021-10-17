package com.travel.agency.service;

import com.travel.agency.domain.dto.UserMessageDto;
import com.travel.agency.mapper.UserMessageMapper;
import com.travel.agency.repository.UserMessageDao;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserMessageService {

    private final UserMessageDao userMessageDao;
    private final UserMessageMapper userMessageMapper;


    public void saveMessage(UserMessageDto userMessageDto) {
        userMessageDao.save(userMessageMapper.mapMessageDtoToMessage(userMessageDto));
    }
}
