package com.todo.demo.model;

public class ToDo {
	
	String id;
	Boolean completed;
	String Description;
	String created;
	
	public ToDo(String id, Boolean completed, String description, String created) {
		super();
		this.id = id;
		this.completed = completed;
		Description = description;
		this.created = created;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Boolean getCompleted() {
		return completed;
	}

	public void setCompleted(Boolean completed) {
		this.completed = completed;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		Description = description;
	}

	public String getCreated() {
		return created;
	}

	public void setCreated(String created) {
		this.created = created;
	}

	public ToDo() {
		super();
	}

}
