package com.donate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.donate.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}