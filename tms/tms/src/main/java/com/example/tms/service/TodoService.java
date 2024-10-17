package com.example.tms.service;

import java.util.List;

import com.example.tms.entity.Todo;

public interface TodoService {
	
	List<Todo> getAllTodos();

	Todo saveTodo(Todo student);
	
	Todo getTodoById(Long id);
	
	Todo updateTodo(Todo todo);
	
	void deleteTodoById(Long id);

}
