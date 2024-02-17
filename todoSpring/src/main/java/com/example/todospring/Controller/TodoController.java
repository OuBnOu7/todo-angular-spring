package com.example.todospring.Controller;

import com.example.todospring.Entity.Todo;
import com.example.todospring.Service.TodoServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("api/v1/todo")
public class TodoController {

    @Autowired
    private TodoServices todoservices;

    @PostMapping(value = "/save")
    private String saveTodo(@RequestBody Todo todos){

        todoservices.saveorupdate(todos);
        return todos.get_id();
    }

    @GetMapping(value = "/getAll")
    private Iterable<Todo> getTodos(){
        return todoservices.listAll();
    }


    @PutMapping(value = "/edit/{id}")
    private Todo update(@RequestBody Todo todo,@PathVariable(name = "id") String _id){
        todo.set_id(_id);
        todoservices.saveorupdate(todo);
        return todo;
    }

    @DeleteMapping(value = "/delete/{id}")
    private void deleteTodo(@PathVariable(name="id") String _id){
        todoservices.deleteTodo(_id);
    }

    @RequestMapping("/todo/{id}")
    private void getTodo(@PathVariable(name="id") String _id){
        todoservices.getTodoById(_id);
    }


}
