package com.example.todolist_api.todolist_api.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.todolist_api.todolist_api.Model.Todolist;
import com.example.todolist_api.todolist_api.repository.TodolistRepo;

@Service
public class TodolistService {
    @Autowired
    TodolistRepo repo;

    public List<Todolist> getAllList() {
        // TODO Auto-generated method stub
        return repo.findAll();
    }

    public Todolist addList(Todolist todolist) {
        // TODO Auto-generated method stub
        return repo.save(todolist);
    }

    public Todolist updateList(String id, Todolist todolist) {
        // TODO Auto-generated method stub
       return repo.save(todolist);
    }

    public void deleteById(int id) {
        // TODO Auto-generated method stub
         repo.deleteById(id);
    }
    
}
