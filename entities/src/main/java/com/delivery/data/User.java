package com.delivery.data;

import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.UUID;

@Data
@Document
public class User {
    private UUID id;
    private String userName;
    private Integer age;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;
}
