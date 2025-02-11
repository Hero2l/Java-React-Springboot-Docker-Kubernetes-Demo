package com.email_writer.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailRequest {
    private String emailContent;
    private String tone;
}
