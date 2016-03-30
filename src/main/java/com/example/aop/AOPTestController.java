package com.example.aop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.annointerface.PreAuth;

@RestController
public class AOPTestController {
	
	@PreAuth
	@RequestMapping("/testaop")
	public String testAop(){
		System.out.println("테스트 2 ");
		return "test";
	}

}
