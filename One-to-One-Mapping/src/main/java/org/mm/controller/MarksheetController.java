package org.mm.controller;

import org.mm.entities.Marksheet;
import org.mm.service.MarksheetService;
import org.springframework.beans.factory.annotation.Autowired;
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
	public Marksheet save(@RequestBody Marksheet m)
	{
		return marksheetService.save(m);
	}
}
