package com.example.domain;

import org.hibernate.validator.constraints.NotBlank;

import lombok.Data;

@Data
public class User {
	
	@NotBlank
	private String name;
	
	@NotBlank
	private String phone;
	
	
	
	

}
