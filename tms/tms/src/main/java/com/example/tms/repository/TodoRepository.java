package com.example.tms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.tms.entity.Todo;

public interface TodoRepository extends JpaRepository<Todo, Long> {

}
