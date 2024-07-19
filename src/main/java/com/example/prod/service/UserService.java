package com.example.prod.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.prod.model.User;
import com.example.prod.repository.UserRepository;

import jakarta.transaction.Transactional;

@Service
@Transactional
public class UserService {
    @Autowired
    UserRepository UserRepository;

    public User post(User user) {
        return UserRepository.save(user);
    }

    public User get(Integer id) {
        return UserRepository.findById(id).orElse(null);
    }
}
