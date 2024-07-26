package org.mm.controller;

import org.mm.dto.DepartmentDto;
import org.mm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/department")
public class DepartmentController 
{
	@Autowired
	private DepartmentService departmentService;
	
	@PostMapping(value = "/save")
	public DepartmentDto saveDepartment(@RequestBody DepartmentDto departmentDto)
	{
		return departmentService.saveDepartment(departmentDto);
	}
	
	@PutMapping(value = "/{departmentId}/manager/{employeeId}")
	public DepartmentDto assignManagerToDepartment(@PathVariable Long departmentId,
													@PathVariable Long employeeId)
	{
		return departmentService.assignManagerToDepartment(departmentId, employeeId);
	}
	
	@GetMapping(value = "/assign/{employeeId}")
	public DepartmentDto getAssignDepartmentOfManager(@PathVariable Long employeeId)
	{
		return departmentService.getAssignDepartmentOfManager(employeeId);
	}
}
