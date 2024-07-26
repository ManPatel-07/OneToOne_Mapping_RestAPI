package org.mm.service;

import org.mm.dao.MarksheetRepository;
import org.mm.entities.Marksheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MarksheetService 
{
	@Autowired
	private MarksheetRepository marksheetRepository;
	
	private Marksheet save(Marksheet m)
	{
		return marksheetRepository.save(m);
	}
}
