package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.MessageModel;
import com.portfolio.portfolio.service.EmailService;
import com.portfolio.portfolio.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private EmailService emailService;

    @PostMapping("/add")
    public ResponseEntity<MessageModel> saveMsg(@RequestBody MessageModel message){

        MessageModel savedMessage = messageService.saveMessage(message);

        String subject = message.getSubject();
        String body = "You have received a new message:\n\n"
                + "Name: " + message.getFullName() + "\n"
                + "Number: " + message.getNumber() + "\n"
                + "Email: " + message.getEmail() + "\n"
                + "Message: " + message.getMessage();
        emailService.sendMail(subject, body);

        return new ResponseEntity<>(savedMessage, HttpStatus.CREATED);
         }

    @GetMapping
    public ResponseEntity<List<MessageModel>> findAll(){
        return new ResponseEntity<>(messageService.findAll(),HttpStatus.OK);
    }

}
