package com.portfolio.portfolio.controller;

import com.portfolio.portfolio.model.MessageModel;
import com.portfolio.portfolio.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class MessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/add")
    public ResponseEntity<MessageModel> saveMsg(@RequestBody MessageModel message){
        return new ResponseEntity<>(messageService.saveMessage(message), HttpStatus.CREATED);
    }

}
