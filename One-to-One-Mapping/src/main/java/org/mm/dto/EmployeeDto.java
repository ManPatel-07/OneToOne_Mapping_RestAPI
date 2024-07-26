package org.mm.dto;

import org.mm.entities.Department;

public class EmployeeDto 
{

	private Long id;

	private String name;

	private Department managedDepartment;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Department getManagedDepartment() {
		return managedDepartment;
	}

	public void setManagedDepartment(Department managedDepartment) {
		this.managedDepartment = managedDepartment;
	}

	public EmployeeDto(Long id, String name, Department managedDepartment) {
		super();
		this.id = id;
		this.name = name;
		this.managedDepartment = managedDepartment;
	}

	public EmployeeDto(String name, Department managedDepartment) {
		super();
		this.name = name;
		this.managedDepartment = managedDepartment;
	}

	public EmployeeDto(String name) {
		super();
		this.name = name;
	}

	public EmployeeDto() {
		super();
	}


}
