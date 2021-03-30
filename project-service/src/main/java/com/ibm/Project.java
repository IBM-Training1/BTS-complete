package com.ibm;

import java.util.ArrayList;


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
    private ArrayList<String> developerId;
    @NotNull
    private ArrayList<String> testerId;
    @NotNull
    private String managerId;
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

	public ArrayList<String> getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(ArrayList<String> developerId) {
		this.developerId = developerId;
	}

	public ArrayList<String> getTesterId() {
		return testerId;
	}

	public void setTesterId(ArrayList<String> testerId) {
		this.testerId = testerId;
	}

	public String getManagerId() {
		return managerId;
	}

	public void setManagerId(String managerId) {
		this.managerId = managerId;
	}

}
