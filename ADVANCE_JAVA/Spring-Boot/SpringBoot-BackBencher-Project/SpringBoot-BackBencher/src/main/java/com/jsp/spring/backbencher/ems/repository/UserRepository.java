package com.jsp.spring.backbencher.ems.repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import com.jsp.spring.backbencher.ems.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findById(Long userId);

    Optional<User> findByEmail(String email);
}