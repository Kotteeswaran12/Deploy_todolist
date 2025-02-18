package com.example.todolist_api.todolist_api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.todolist_api.todolist_api.Model.Todolist;

@Repository
public interface TodolistRepo extends JpaRepository<Todolist, Integer>{

    


    
} 
