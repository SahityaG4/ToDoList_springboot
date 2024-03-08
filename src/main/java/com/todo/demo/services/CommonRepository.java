package com.todo.demo.services;

import java.util.HashSet;

import com.todo.demo.model.ToDo;

public interface CommonRepository {
	public HashSet<ToDo> findall();
	public HashSet<ToDo> save(ToDo task);
	public void delete();
	public ToDo findById(String id);
	public void update(String id);
}
