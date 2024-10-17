package com.example.tms.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="todos")
public class Todo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	@Column(name="Your_todo",nullable = false)
	private String yourtodo;
	
	
	public Todo(long id, String yourtodo) {
		super();
		this.id = id;
		this.yourtodo = yourtodo;
	}
	public Todo() {
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getYourtodo() {
		return yourtodo;
	}
	public void setYourtodo(String yourtodo) {
		this.yourtodo = yourtodo;
	}
	

}
