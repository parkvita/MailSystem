package com.parkvita.mailsystem.web;

import com.parkvita.mailsystem.service.mail.MailService;
import com.parkvita.mailsystem.web.dto.MailDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController
@RequiredArgsConstructor
public class MailController {
    private final MailService mailService;



    @PostMapping("/mail")
    public void execMail(@RequestBody MailDto mailDto){
        System.out.println(mailDto.getAddress());
        mailService.mailSend(mailDto);
    }

}
