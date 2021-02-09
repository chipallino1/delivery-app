package com.delivery.dto;

import lombok.Data;

import java.util.Date;
import java.util.UUID;

@Data
public class UserDto {
    private UUID id;
    private String userName;
    private Date birthDate;
    private String firstName;
    private String lastName;
    private String email;
    private String phoneNumber;

    public UserDto() {
        id = UUID.randomUUID();
    }
}
