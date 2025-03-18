package com.portfolio.portfolio.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "Message")
public class MessageModel {

    @Id
    private String id;

    @Field("full_name")
    private String fullName;

    private long number;
    private String email;
    private String subject;
    private String message;

}
