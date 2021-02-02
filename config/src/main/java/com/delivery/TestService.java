package com.delivery;

import com.delivery.repositories.UserRepository;
import com.delivery.repositories.nested.UserRepositoryNested;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private UserRepositoryNested userRepositoryNested;
}
