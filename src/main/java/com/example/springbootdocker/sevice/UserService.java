package com.example.springbootdocker.sevice;

import com.example.springbootdocker.entity.User;

import org.springframework.stereotype.Service;

@Service
public interface UserService {
    User findByUsername(String username);
}
