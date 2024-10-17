package com.example.tms.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.tms.entity.Todo;
import com.example.tms.repository.TodoRepository;
import com.example.tms.service.TodoService;

@Service
public class TodoServiceImpl implements TodoService {
	
	private TodoRepository todoRepository;
	
	

	public TodoServiceImpl(TodoRepository todoRepository) {
		super();
		this.todoRepository = todoRepository;
	}

	@Override
	public List<Todo> getAllTodos() {
		// TODO Auto-generated method stub
		return todoRepository.findAll();
	}

	@Override
	public Todo saveTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepository.save(todo);
	}

	@Override
	public Todo getTodoById(Long id) {
		// TODO Auto-generated method stub
		return todoRepository.findById(id).get();
	}



	@Override
	public Todo updateTodo(Todo todo) {
		// TODO Auto-generated method stub
		return todoRepository.save(todo);

	}

	@Override
	public void deleteTodoById(Long id) {
		// TODO Auto-generated method stub
		todoRepository.deleteById(id);
	}
	

}
