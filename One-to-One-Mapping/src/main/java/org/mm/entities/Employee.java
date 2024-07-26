package org.mm.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Data;

@Entity
@Data
@Builder
@Table(name = "employee")
public class Employee 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String name;
	
	@OneToOne(mappedBy = "manager")
	@JsonIgnore
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

	public Employee(Long id, String name, Department managedDepartment) {
		super();
		this.id = id;
		this.name = name;
		this.managedDepartment = managedDepartment;
	}

	public Employee(String name, Department managedDepartment) {
		super();
		this.name = name;
		this.managedDepartment = managedDepartment;
	}

	public Employee(String name) {
		super();
		this.name = name;
	}

	public Employee() {
		super();
	}

}
