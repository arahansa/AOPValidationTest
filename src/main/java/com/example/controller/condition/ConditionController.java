package com.example.controller.condition;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.domain.TestCondition;

import junit.framework.Test;

@RestController
public class ConditionController {

	@Autowired
	TestCondition testConditon;
	
	@RequestMapping("/conditionTest")
	public String test(){
		return testConditon.toString();
	}
	
}
