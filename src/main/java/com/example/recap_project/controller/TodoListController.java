package com.example.recap_project.controller;

import com.example.recap_project.model.Todo;
import com.example.recap_project.service.TodoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/todo")
@RequiredArgsConstructor


public class TodoListController {
    private final TodoListService service;


  @GetMapping
    public List<Todo> allTodoList() {
        return service.getTodoList();
    }


}
