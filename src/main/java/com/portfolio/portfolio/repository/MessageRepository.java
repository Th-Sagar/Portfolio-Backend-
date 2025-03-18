package com.portfolio.portfolio.repository;

import com.portfolio.portfolio.model.MessageModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MessageRepository extends MongoRepository<MessageModel,String> {
}
