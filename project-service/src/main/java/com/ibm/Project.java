package com.ibm;

import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

public class Project {
	@Id
	private String id;
	@NotNull
	private String name;
	@NotNull
	private String type;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
