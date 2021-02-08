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
        return userRepository.save(user)
                .map(User::get_id);
    }

    @Override
    public Mono<UserDto> findById(UUID uuid) {
        return userRepository.findById(uuid).map(this::mapEntityToDto);
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

    private UserDto mapEntityToDto(User user) {
        UserDto userDto = new UserDto();
        userDto.setAge(user.getAge());
        userDto.setEmail(user.getEmail());
        userDto.setFirstName(user.getFirstName());
        userDto.setLastName(user.getLastName());
        userDto.setUserName(user.getUserName());
        userDto.setPhoneNumber(user.getPhoneNumber());
        return userDto;
    }
}
