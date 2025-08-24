package com.joineynguyen.todo_app_backend.service;

import com.joineynguyen.todo_app_backend.repository.TodoRepository;
import com.joineynguyen.todo_app_backend.model.Todo;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

@Service
public class TodoService {

    private final TodoRepository todoRepository;

    public TodoService(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    public Todo createTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public List<Todo> getAllTodos() {
        return todoRepository.findAll();
    }

    public Optional<Todo> getTodoById(Long id) {
        return todoRepository.findById(id);
    }

    public Optional<Todo> updateTodo(Long id, Todo todoDetails) {
        return todoRepository.findById(id).map(todo -> {
            todo.setTitle(todoDetails.getTitle());
            todo.setCompleted(todoDetails.getCompleted());
            return todoRepository.save(todo);
        });

        // if(optionalTodo.isPresent()) {
        // Todo todo = optionalTodo.get();
        // todo.setTitle(todoDetails.getTitle());
        // todo.setCompleted(todoDetails.isCompleted());
        // todoRepository.save(todo);
        // return Optional.of(todo);
        // } else {
        // return Optional.empty();
        // }
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}
