package com.classical.guitar.domain.user;

public class Permission {
	
	private Long id;
	
	private String name;
	
	private TypePermissionEnum type;

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

	public TypePermissionEnum getType() {
		return type;
	}

	public void setType(TypePermissionEnum type) {
		this.type = type;
	}

}
