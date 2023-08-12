package com.example.provaspringioc.services;

import org.springframework.stereotype.Service;

@Service
public class GreetingService {

    public String greet(){
        return "Hello, Spring Boot!";
    }
}
