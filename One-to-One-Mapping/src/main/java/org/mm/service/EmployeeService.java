package org.mm.service;

import org.mm.dao.EmployeeRepository;
import org.mm.dto.EmployeeDto;
import org.mm.entities.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public EmployeeDto saveEmployee(EmployeeDto employeeDto)
	{
		Employee employee = employeeRepository.save(convertToEntity(employeeDto));
		return convertToDto(employee);
	}
	
	private Employee convertToEntity(EmployeeDto employeeDto)
	{
		return modelMapper.map(employeeDto, Employee.class);
	}
	
	private EmployeeDto convertToDto(Employee employee)
	{
		return modelMapper.map(employee, EmployeeDto.class);
	}
}

