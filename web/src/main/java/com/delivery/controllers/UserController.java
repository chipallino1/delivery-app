package com.delivery.controllers;


import com.delivery.data.User;
import com.delivery.dto.UserDto;
import com.delivery.services.UserCrudServices;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/api/users")
public class UserController {
    private final UserCrudServices userCrudServices;

    public UserController(UserCrudServices userCrudServices) {
        this.userCrudServices = userCrudServices;
    }

    @GetMapping("/age")
    public Mono<Integer> getUserAge() {
        return Mono.justOrEmpty(22);
    }

    @PostMapping("/create")
    public Mono<UUID> createUser(@RequestBody UserDto userDto) {
        return userCrudServices.createUser(userDto);
    }

    @GetMapping("/{id}")
    public Mono<UserDto> findById(@PathVariable("id") UUID uuid) {
        return userCrudServices.findById(uuid);
    }

    @GetMapping("/")
    public Flux<UserDto> findAll() {
        return userCrudServices.findAll();
    }
}
