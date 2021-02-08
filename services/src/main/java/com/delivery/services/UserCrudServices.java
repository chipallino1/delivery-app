package com.delivery.services;

import com.delivery.dto.UserDto;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

public interface UserCrudServices {
    Mono<UUID> createUser(UserDto userDto);
    Mono<UserDto> findById(UUID uuid);
    Flux<UserDto> findAll();
}
