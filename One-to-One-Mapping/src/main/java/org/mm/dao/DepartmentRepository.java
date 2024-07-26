package org.mm.dao;

import org.mm.entities.Department;
import org.mm.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DepartmentRepository extends JpaRepository<Department, Long>
{

	public Department findByManager(Employee employee);

}
