package com.donate.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.donate.model.User;
import com.donate.repository.UserRepository;

@Configuration
public class DataInitializer {

    @Bean
    CommandLineRunner initUsers(UserRepository repo) {
        return args -> {

            // Admin user
            if (!repo.existsByEmail("admin@hopedrop.com")) {
                User admin = new User();
                admin.setName("Admin");
                admin.setEmail("admin@hopedrop.com");
                admin.setPassword("admin123");
                admin.setRole("ADMIN");
                repo.save(admin);
            }

            // Logistics user
            if (!repo.existsByEmail("logistics@hopedrop.com")) {
                User logistics = new User();
                logistics.setName("Logistics Manager");
                logistics.setEmail("logistics@hopedrop.com");
                logistics.setPassword("logistics123");
                logistics.setRole("LOGISTICS");
                repo.save(logistics);
            }
        };
    }
}