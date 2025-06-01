package com.jsp.spring.backbencher.ems.service;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jsp.spring.backbencher.ems.entity.User;
import com.jsp.spring.backbencher.ems.repository.UserRepository;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    public boolean emailExists(String email) {
        return userRepository.findByEmail(email).isPresent();
    }

    public boolean usernameExists(String username) {
        return userRepository.findAll().stream().anyMatch(u -> u.getUsername().equals(username));
    }

    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole("STUDENT");
        user.setCreatedAt(LocalDateTime.now());
        return userRepository.save(user);
    }
}