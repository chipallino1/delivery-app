package com.delivery;

import com.delivery.services.UserServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Controller {
    private final UserServices userServices;

    public Controller(UserServices userServices) {
        this.userServices = userServices;
    }
}
