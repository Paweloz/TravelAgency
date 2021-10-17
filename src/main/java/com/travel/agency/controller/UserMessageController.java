package com.travel.agency.controller;

import com.travel.agency.domain.dto.UserMessageDto;
import com.travel.agency.service.UserMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping("/v1/message")
@RequiredArgsConstructor
public class UserMessageController {

    private final UserMessageService userMessageService;

    @PostMapping
    public void createMessage(@RequestBody UserMessageDto userMessageDto) {
        userMessageService.saveMessage(userMessageDto);
    }
}
