package com.delivery.repositories.nested;

import com.delivery.data.User;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepositoryNested extends ReactiveCrudRepository<User, UUID> {
}
