package com.delivery;

import com.delivery.services.UserCrudServices;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/users")
public class Controller {
    private final UserCrudServices userCrudServices;

    public Controller(UserCrudServices userCrudServices) {
        this.userCrudServices = userCrudServices;
    }
}
