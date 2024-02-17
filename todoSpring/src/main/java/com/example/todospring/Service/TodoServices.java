package com.example.todospring.Service;

import com.example.todospring.Entity.Todo;
import com.example.todospring.Repo.todoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TodoServices {

    @Autowired
    private todoRepo repo;

    public void saveorupdate(Todo todos) {
        repo.save(todos);
    }

    public Iterable<Todo> listAll() {
        return this.repo.findAll();
    }

    public void deleteTodo(String id) {
        repo.deleteById(id);
    }

    public Todo getTodoById(String id) {
        return repo.findById(id).get();
    }
}
