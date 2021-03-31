package com.ibm;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import org.springframework.data.annotation.Id;

public class Bug {
	@Id
	private String id;
	@NotNull
	@NotBlank
	private String name;
	@NotNull
	private TYPE type;
	@NotNull
	private SEVERITY severity;
	@NotNull
	@NotBlank
	private String projectId;
	@NotNull
	private PRIORITY priority;
	@NotNull
	private STATUS status;
	@NotNull
	@NotBlank
	private String module;
	@NotNull
	@NotBlank
	@Size(min = 5, max = 50, message = "synopsis must be between 5 and 50 characters")
	private String synopsis;
	@NotNull
	@NotBlank
	@Size(min = 10, max = 200, message = "description must be between 10 and 200 characters")
	private String description;
	@NotNull
	private String product;
<<<<<<< HEAD

=======
>>>>>>> 6f1a54ac97e9dda5ceed4ed2fb5d66650f761ee8
	private String location;
	private String buildVersion;
	private String developerId;
	private String testerId;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name.trim();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getProjectId() {
		return projectId;
	}

	public void setProjectId(String projectId) {
		this.projectId = projectId;
	}

	public String getModule() {
		return module;
	}

	public void setModule(String module) {
		this.module = module.trim();
	}

	public String getSynopsis() {
		return synopsis;
	}

	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis.trim();
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description.trim();
	}

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public TYPE getType() {
		return type;
	}

	public void setType(TYPE type) {
		this.type = type;
	}

	public SEVERITY getSeverity() {
		return severity;
	}

	public void setSeverity(SEVERITY severity) {
		this.severity = severity;
	}

	public PRIORITY getPriority() {
		return priority;
	}

	public void setPriority(PRIORITY priority) {
		this.priority = priority;
	}

	public STATUS getStatus() {
		return status;
	}

	public void setStatus(STATUS status) {
		this.status = status;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getBuildVersion() {
		return buildVersion;
	}

	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}

	public String getDeveloperId() {
		return developerId;
	}

	public void setDeveloperId(String developerId) {
		this.developerId = developerId;
	}

	public String getTesterId() {
		return testerId;
	}

	public void setTesterId(String testerId) {
		this.testerId = testerId;
	}

}
