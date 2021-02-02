package com.delivery.services;

import com.delivery.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServicesImpl implements UserServices {
    @Autowired
    private UserRepository userRepository;
}
