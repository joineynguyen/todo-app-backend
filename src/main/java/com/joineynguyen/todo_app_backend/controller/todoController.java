package com.joineynguyen.todo_app_backend.controller;

import model.Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;


@Controller
@RequestMapping("/api/todos")
public class todoController {

    @Autowired
    private TodoService todoService;

    @PostMapping
    public String postMethodName(@RequestBody Todo todo) {
        return todoService.createTodo(todo);
    }
    

    @GetMapping
    public List<Todo> getAllTodos() {
        return todoService.getAllTodos();
    }
    


}
