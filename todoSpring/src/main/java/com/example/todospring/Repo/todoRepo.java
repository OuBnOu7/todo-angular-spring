package com.example.todospring.Repo;

import com.example.todospring.Entity.Todo;
import org.springframework.data.mongodb.repository.MongoRepository;


public interface todoRepo extends MongoRepository<Todo,String> {

}
