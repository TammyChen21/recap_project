package com.example.recap_project.service;

import com.example.recap_project.model.Todo;
import com.example.recap_project.model.TodoRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class TodoListService {
    private final TodoRepo TodoRepo;

    public List<Todo> getTodoList() {
        return TodoRepo.findAll();
    }
}
