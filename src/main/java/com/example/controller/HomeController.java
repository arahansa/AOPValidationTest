package com.example.controller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.annointerface.Auth;
import com.example.annointerface.PreAuth;
import com.example.domain.User;
import com.example.service.HomeService;

@RestController
public class HomeController {
	
	@Autowired HomeService homeService;
	
	@RequestMapping("/home")
	public String homeTest(@Valid User user, BindingResult result){
		if(result.hasErrors()){
			return "errors "+result;
		}
		String msg = homeService.checkString("test");
		return "hello world : "+user +" ,  msg :"+msg;
	}
	
}
