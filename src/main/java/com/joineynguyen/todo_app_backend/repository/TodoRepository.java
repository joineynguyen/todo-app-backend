package com.joineynguyen.todo_app_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joineynguyen.todo_app_backend.model.Todo;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

}
