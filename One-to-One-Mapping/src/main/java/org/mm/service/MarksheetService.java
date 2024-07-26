package org.mm.service;

import java.util.List;
import java.util.stream.Collectors;

import org.mm.dao.MarksheetRepository;
import org.mm.dto.MarksheetDto;
import org.mm.entities.Marksheet;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksheetService 
{
	@Autowired
	private MarksheetRepository marksheetRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	public MarksheetDto save(MarksheetDto marksheetDto)
	{
		Marksheet marksheet = marksheetRepository.save(convertToEntity(marksheetDto));
		return convertToDto(marksheet);
	}
	
	public List<MarksheetDto> findAllMarksheet()
	{
		List<Marksheet> marksheetData = marksheetRepository.findAll();
		return marksheetData.stream().map(this::convertToDto).collect(Collectors.toList());
	}
	
	private Marksheet convertToEntity(MarksheetDto marksheetDto)
	{
		return modelMapper.map(marksheetDto, Marksheet.class);
	}
	
	private MarksheetDto convertToDto(Marksheet marksheet)
	{
		return modelMapper.map(marksheet, MarksheetDto.class);
	}
	
}
