package org.mm.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "department")
public class Department 
{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	private String title;
	
	@OneToOne
	@JoinColumn(name = "department_manager")
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

	public Department(Long id, String title, Employee manager) {
		super();
		this.id = id;
		this.title = title;
		this.manager = manager;
	}

	public Department() {
		super();
	}

	public Department(String title, Employee manager) {
		super();
		this.title = title;
		this.manager = manager;
	}

	public Department(String title) {
		super();
		this.title = title;
	}
	
}
