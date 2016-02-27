package com.example.controller;

import javax.validation.Valid;

import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.User;

@RestController
public class HomeController {
	
	@RequestMapping("/home")
	public String homeTest(@Valid User user, BindingResult result){
		if(result.hasErrors()){
			return "errors "+result;
		}
		return "hello world : "+user;
	}

}
