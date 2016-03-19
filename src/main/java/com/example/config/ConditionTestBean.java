package com.example.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.example.domain.TestCondition;

@Configuration
public class ConditionTestBean {
	
	
	@Bean
	@ConditionalOnProperty(name="testConfig.slack", havingValue="false")
	public TestCondition testfalse(){
		TestCondition testCondition = new TestCondition();
		testCondition.setName("slack False");
		return testCondition;
	}
	
	
	@Bean
	@ConditionalOnProperty(name={"testConfig.slack", "testConfig.db"}, havingValue="true")
	public TestCondition test(){
		TestCondition testCondition = new TestCondition();
		testCondition.setName("slack");
		return testCondition;
	}

}
