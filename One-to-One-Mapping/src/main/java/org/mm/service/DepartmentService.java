package org.mm.service;

import java.util.Optional;

import org.mm.dao.DepartmentRepository;
import org.mm.dao.EmployeeRepository;
import org.mm.dto.DepartmentDto;
import org.mm.entities.Department;
import org.mm.entities.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentService 
{
	@Autowired
	private ModelMapper modelMapper;
	
	@Autowired
	private DepartmentRepository departmentRepository;
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	public DepartmentDto saveDepartment(DepartmentDto departmentDto)
	{
		Department department = departmentRepository.save(convertToEntity(departmentDto));
		return convertToDto(department);
	}
	
	public DepartmentDto assignManagerToDepartment(Long departmentId, Long employeeId)
	{
		Optional<Department> departmentEntity = departmentRepository.findById(departmentId);
		Optional<Employee> employeeEntity = employeeRepository.findById(employeeId);
		
		return departmentEntity.flatMap(department -> 
					employeeEntity.map(employee -> {
						department.setManager(employee);
						return convertToDto(departmentRepository.save(department));
					})).orElse(null);
	}
	
	public DepartmentDto getAssignDepartmentOfManager(Long employeeId)
	{
		Optional<Employee> employee = employeeRepository.findById(employeeId);
		Department department = departmentRepository.findByManager(employee.get());
		return convertToDto(department);
	}
	
	private Department convertToEntity(DepartmentDto departmentDto)
	{
		return modelMapper.map(departmentDto, Department.class);
	}
	
	private DepartmentDto convertToDto(Department department)
	{
		return modelMapper.map(department, DepartmentDto.class);
	}
}
