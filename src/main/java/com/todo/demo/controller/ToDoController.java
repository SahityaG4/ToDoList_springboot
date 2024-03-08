package com.todo.demo.controller;

import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.todo.demo.model.ToDo;
import com.todo.demo.services.ToDoRepository;

@RestController
public class ToDoController {
	@Autowired
	ToDoRepository todoRep;
	
	@GetMapping("/findall")
	public HashSet<ToDo> findall(){
		return todoRep.findall();
	}

	@PostMapping("/save")
	public HashSet<ToDo> SaveTask(@RequestBody ToDo task){
		return todoRep.save(task);
	} 
	
	@DeleteMapping("/delete")
	public void remove() {
		todoRep.delete();
	}
	
	@GetMapping("/find/{id}")
	public ToDo findById(@PathVariable String id) {
		return todoRep.findById(id);
	}
	
	@PutMapping("/update/{id}")
	public void update(@PathVariable String id) {
		todoRep.update(id);
	}
}
