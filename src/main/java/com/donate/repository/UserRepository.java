package com.donate.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.donate.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByEmail(String email);

    User findByEmailAndPassword(String email, String password);

    boolean existsByEmail(String email);
}