package com.delivery.dto;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.util.UUID;

@Data
public class UserDto implements Serializable {
    private static final long serialVersionUID = 6727229656276658113L;
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
