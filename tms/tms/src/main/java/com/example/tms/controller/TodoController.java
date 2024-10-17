package com.example.tms.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.tms.entity.Todo;
import com.example.tms.service.TodoService;

@Controller
public class TodoController {
	
	private TodoService todoService;

	public TodoController(TodoService todoService) {
		super();
		this.todoService = todoService;
	}
	@GetMapping("todos")
	public String listTodos(Model model){
		model.addAttribute("todos",todoService.getAllTodos());
		return "todos";
	}
	@GetMapping("/todos/new")
	public String createTodoForm(Model model)
	{
		//create student object to hold student form data
		Todo todo=new Todo();
		model.addAttribute("todo",todo);
		return "create_todo";
		
	}
	@PostMapping("/todos")
	public String saveTodo(@ModelAttribute("todo") Todo todo) {
		todoService.saveTodo(todo);
		return "redirect:/todos";
	}
	
	@GetMapping("/todos/edit/{id}")
	public String ediTodoForm(@PathVariable Long id, Model model) {
		model.addAttribute("todo", todoService.getTodoById(id));
		return "edit_todo";
	}

	@PostMapping("/todos/{id}")
	public String updateTodo(@PathVariable Long id,@ModelAttribute("todo") Todo todo,Model model) {
		
		// get student from database by id
		Todo existingTodo = todoService.getTodoById(id);
		existingTodo.setId(id);
		existingTodo.setYourtodo(todo.getYourtodo());
		
		
		// save updated student object
		todoService.updateTodo(existingTodo);
		return "redirect:/todos";		
	}
	
	// handler method to handle delete student request
	
	@GetMapping("/todos/{id}")
	public String deleteTodo(@PathVariable Long id) {
		todoService.deleteTodoById(id);
		return "redirect:/todos";
	}
	

}
