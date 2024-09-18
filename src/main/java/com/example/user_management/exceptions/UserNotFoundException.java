package com.example.user_management.exceptions;

import org.springframework.context.annotation.Configuration;

@Configuration
public class UserNotFoundException extends RuntimeException{
    public UserNotFoundException(String message) {
        super(message);
    }
}
