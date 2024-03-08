package com.todo.demo.services;

import java.util.HashSet;

import org.springframework.stereotype.Service;

import com.todo.demo.model.ToDo;

@Service
public class ToDoRepository implements CommonRepository {
	
	HashSet<ToDo> ToDoList = new HashSet<>();

	@Override
	public HashSet<ToDo> findall() {
		// TODO Auto-generated method stub
		if(ToDoList.isEmpty()) {
			return null;
		}
		return ToDoList;
	}

	@Override
	public HashSet<ToDo> save(ToDo task) {
		// TODO Auto-generated method stub
		ToDoList.add(task);
		return ToDoList;
	}

	@Override
	public void delete() {
		// TODO Auto-generated method stub
		ToDoList.clear();
		
	}

	@Override
	public ToDo findById(String id) {
		// TODO Auto-generated method stub
		ToDo task = ToDoList.stream().filter((t) -> t.getId().equals(id)).findAny().orElse(null);
		return task;
	}

	@Override
	public void update(String id) {
		// TODO Auto-generated method stub
		ToDo task = ToDoList.stream().filter((t) -> t.getId().equals(id)).findAny().orElse(null);
		if(task!= null && !task.getCompleted()) {
			task.setCompleted(true);
		}
	}

}
