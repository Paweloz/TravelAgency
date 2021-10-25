package com.travel.agency.facade;

import com.travel.agency.domain.dto.UserMessageDto;
import com.travel.agency.service.UserMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserMessageFacade {

    private final UserMessageService userMessageService;

    public void createMessage(UserMessageDto userMessageDto) {
        userMessageService.saveMessage(userMessageDto);
    }
}
