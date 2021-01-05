package com.parkvita.mailsystem.service.mail;

import com.parkvita.mailsystem.web.dto.MailDto;
import lombok.AllArgsConstructor;
import org.springframework.mail.SimpleMailMessage;

import org.springframework.mail.javamail.JavaMailSender;

import org.springframework.stereotype.Service;


@AllArgsConstructor
@Service
public class MailService {


    private JavaMailSender mailSender;
    private static final String FROM_ADDRESS = "shyeon15@gmail.com";

    public void mailSend(MailDto mailDto) {

        SimpleMailMessage message = new SimpleMailMessage();

        message.setTo(mailDto.getAddress());
        message.setFrom(MailService.FROM_ADDRESS);
        message.setSubject(mailDto.getTitle());
        message.setText(mailDto.getContent());

        mailSender.send(message);
    }


}


