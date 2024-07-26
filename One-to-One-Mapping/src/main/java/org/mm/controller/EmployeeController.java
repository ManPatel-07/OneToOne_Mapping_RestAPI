package org.mm.controller;

import org.mm.dto.EmployeeDto;
import org.mm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController
{
	@Autowired
	private EmployeeService employeeService;

	@PostMapping(value = "/save")
	public EmployeeDto saveEmployee(@RequestBody EmployeeDto employeeDto)
	{
		return employeeService.saveEmployee(employeeDto);
	}
}
