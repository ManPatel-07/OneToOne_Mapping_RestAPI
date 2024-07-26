package org.mm.service;

import org.mm.dao.DepartmentRepository;
import org.mm.dto.DepartmentDto;
import org.mm.entities.Department;
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
	
	public DepartmentDto saveDepartment(DepartmentDto departmentDto)
	{
		Department department = departmentRepository.save(convertToEntity(departmentDto));
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
