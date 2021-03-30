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
	@NotNull
	private String managerId;
	@NotNull
	private String testerId;
	@NotNull
	private String developerId;

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

	public String getTesterId() {
		return testerId;
	}

	public void setTesterId(String testerId) {
		this.testerId = testerId;
	}

	public String getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}

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
