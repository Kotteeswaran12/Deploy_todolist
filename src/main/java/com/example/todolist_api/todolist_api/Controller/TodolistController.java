package com.example.todolist_api.todolist_api.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.todolist_api.todolist_api.Model.Todolist;
import com.example.todolist_api.todolist_api.Service.TodolistService;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;




@RestController
@CrossOrigin
public class TodolistController {
    @Autowired
    TodolistService service;

    @GetMapping("/")
    public List<Todolist> getAllList() {
        return service.getAllList();
    }
    @PostMapping("/add")
    public Todolist addList(@RequestBody Todolist todolist) {
        //TODO: process POST request
        
        return service.addList(todolist);
    }
    @PutMapping("/{id}")
    public Todolist updateList(@PathVariable String id, @RequestBody Todolist Todolist) {
        //TODO: process PUT request
        
        return service.updateList(id , Todolist);
    }
    @DeleteMapping("/{id}")
    public void deleteById (@PathVariable int id){
         service.deleteById(id);
    }
    
}
