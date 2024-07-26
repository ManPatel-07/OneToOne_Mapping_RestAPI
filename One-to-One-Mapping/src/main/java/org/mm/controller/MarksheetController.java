package org.mm.controller;

import java.util.List;

import org.apache.catalina.connector.Response;
import org.mm.dto.MarksheetDto;
import org.mm.service.MarksheetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/emp")
public class MarksheetController
{
	@Autowired
	private MarksheetService marksheetService;
	
	@PostMapping(value = "/save")
	public MarksheetDto save(@RequestBody MarksheetDto marksheetDto)
	{
		return marksheetService.save(marksheetDto);
	}
	
	@GetMapping(value = "/findAll")
	public ResponseEntity<List<MarksheetDto>> findAll()
	{
		return new ResponseEntity<List<MarksheetDto>>(marksheetService.findAllMarksheet(), HttpStatus.OK);
	}
	
}
