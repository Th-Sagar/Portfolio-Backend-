package com.portfolio.portfolio.service;

import com.portfolio.portfolio.model.MessageModel;
import com.portfolio.portfolio.repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MessageService {

    @Autowired
    private MessageRepository messageRepository;

    public MessageModel saveMessage(MessageModel message){

       MessageModel savedMessage = messageRepository.save(message);
       return savedMessage;

    }

    public List<MessageModel> findAll(){
       return messageRepository.findAll();
    }
}
