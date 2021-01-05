package com.parkvita.mailsystem.web.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
public class MailDto {
    private String address;
    private String title;
    private String content;

    @Builder
    public MailDto(String address, String title, String content){
        this.address = address;
        this.title = title;
        this.content = content;
    }


}
