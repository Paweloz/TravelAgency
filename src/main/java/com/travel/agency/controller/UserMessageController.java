package com.travel.agency.controller;

import com.travel.agency.domain.dto.UserMessageDto;
import com.travel.agency.facade.UserMessageFacade;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/message")
@RequiredArgsConstructor
public class UserMessageController {

    private final UserMessageFacade userMessageFacade;;

    @PostMapping
    public void createMessage(@RequestBody UserMessageDto userMessageDto) {
        userMessageFacade.createMessage(userMessageDto);
    }
}
