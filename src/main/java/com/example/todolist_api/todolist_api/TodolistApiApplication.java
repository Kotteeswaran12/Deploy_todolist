package com.example.todolist_api.todolist_api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;


@SpringBootApplication
public class TodolistApiApplication {

	  public static void main(String[] args) {
        // Load .env file
        Dotenv dotenv = Dotenv.configure().load();
        dotenv.entries().forEach(entry -> System.setProperty(entry.getKey(), entry.getValue()));

        // Start Spring Boot application
        SpringApplication.run(TodolistApiApplication.class, args);
    }

}
