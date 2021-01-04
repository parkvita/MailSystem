package com.parkvita.mailsystem.web;

import com.parkvita.mailsystem.service.mail.MailService;
import com.parkvita.mailsystem.web.dto.MailDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class MailController {
    private final MailService mailService;

    @GetMapping("/mail")
    public String dispMail(){
        return "mail";
    }

    @PostMapping("/mail")
    public void execMail(MailDto mailDto){
        mailService.mailSend(mailDto);
    }

}
