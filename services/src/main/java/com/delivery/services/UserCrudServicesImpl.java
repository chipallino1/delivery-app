package com.delivery.services;

import com.delivery.data.User;
import com.delivery.dto.UserDto;
import com.delivery.repositories.UserRepository;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class UserCrudServicesImpl implements UserCrudServices {
    private final UserRepository userRepository;

    public UserCrudServicesImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public Mono<UUID> createUser(UserDto userDto) {
        User user = mapDtoToEntity(userDto);
        return userRepository.save(user)
                .map(User::getId);
    }

    @Override
    public Mono<UserDto> findById(UUID uuid) {
        return userRepository.findById(uuid).map(this::mapEntityToDto);
    }

    @Override
    public Flux<UserDto> findAll() {
        return userRepository.findAll().map(this::mapEntityToDto);
    }

    private User mapDtoToEntity(UserDto userDto) {
        User user = new User();
        new ModelMapper().map(userDto, user);
        return user;
    }

    private UserDto mapEntityToDto(User user) {
        UserDto userDto = new UserDto();
        new ModelMapper().map(user, userDto);
        return userDto;
    }
}
