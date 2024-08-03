package com.example.Sending_mails;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendSimpleEmail(List<String> to, String subject, String text) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(to.toArray(new String[0])); // Convert List to Array
        message.setSubject(subject);
        message.setText(text);
        mailSender.send(message);
    }
}
