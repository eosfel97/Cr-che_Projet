package com.Creche.Creche.repository;

import com.Creche.Creche.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}