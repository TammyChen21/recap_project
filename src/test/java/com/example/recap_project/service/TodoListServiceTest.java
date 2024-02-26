package com.example.recap_project.service;

import com.example.recap_project.model.Todo;
import com.example.recap_project.model.TodoRepo;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class TodoListServiceTest {

    private final TodoRepo todoRepo=mock(TodoRepo.class);
    private final TodoListService service = new TodoListService(todoRepo);
    @Test
    void getAllTodos() {
        //GIVEN
    Todo t1=new Todo("1","Shopping");
    Todo t2=new Todo("2","Cleaning");
    List<Todo> expected = List.of(t1,t2);
        //WHEN
        when(todoRepo.findAll()).thenReturn(expected);

        List<Todo> actual = service.getTodoList();
        //THEN
        verify(todoRepo).findAll();
        assertEquals(expected, actual);
    }

}