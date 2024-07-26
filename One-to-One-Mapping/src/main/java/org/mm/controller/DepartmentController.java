package org.mm.controller;

import org.mm.dto.DepartmentDto;
import org.mm.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
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
}
