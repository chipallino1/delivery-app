package com.delivery.services;

import com.delivery.data.User;
import com.delivery.dto.UserDto;
import com.delivery.repositories.UserRepository;
import org.springframework.stereotype.Service;
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
        return userRepository.save(user).map(User::getId);
    }

    private User mapDtoToEntity(UserDto userDto) {
        User user = new User();
        user.setAge(userDto.getAge());
        user.setEmail(userDto.getEmail());
        user.setFirstName(userDto.getFirstName());
        user.setLastName(userDto.getLastName());
        user.setUserName(userDto.getUserName());
        user.setPhoneNumber(user.getPhoneNumber());
        return user;
    }
}
