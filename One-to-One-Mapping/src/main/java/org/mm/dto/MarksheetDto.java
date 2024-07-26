package org.mm.dto;

public class MarksheetDto
{
	private Long id;

	private String name;

	private Integer maths;

	private Integer science;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getMaths() {
		return maths;
	}

	public void setMaths(Integer maths) {
		this.maths = maths;
	}

	public Integer getScience() {
		return science;
	}

	public void setScience(Integer science) {
		this.science = science;
	}

	public MarksheetDto(Long id, String name, Integer maths, Integer science) {
		super();
		this.id = id;
		this.name = name;
		this.maths = maths;
		this.science = science;
	}

	public MarksheetDto(String name, Integer maths, Integer science) {
		super();
		this.name = name;
		this.maths = maths;
		this.science = science;
	}

	public MarksheetDto() {
		super();
	}
	
	
}
