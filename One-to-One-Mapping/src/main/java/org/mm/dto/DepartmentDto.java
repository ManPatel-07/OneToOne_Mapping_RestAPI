package org.mm.dto;

import org.mm.entities.Employee;

import lombok.Data;

@Data
public class DepartmentDto
{

	private Long id;

	private String title;

	private Employee manager;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Employee getManager() {
		return manager;
	}

	public void setManager(Employee manager) {
		this.manager = manager;
	}

	public DepartmentDto(Long id, String title, Employee manager) {
		super();
		this.id = id;
		this.title = title;
		this.manager = manager;
	}

	public DepartmentDto() {
		super();
	}

	public DepartmentDto(String title, Employee manager) {
		super();
		this.title = title;
		this.manager = manager;
	}

	public DepartmentDto(String title) {
		super();
		this.title = title;
	}
	
}
