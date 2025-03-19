package com.portfolio.portfolio.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class EmailService {

    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String subject, String body){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("sagarthapa98122@gmail.com");
        message.setTo("sagarthapa98122@gmail.com");
        message.setSubject(subject);
        message.setText(body);
        mailSender.send(message);
    }
}
