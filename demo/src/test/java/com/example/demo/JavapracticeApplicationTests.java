package com.example.demo;

import static org.junit.jupiter.api.Assertions.assertTrue;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.service.BusinessLogicService;

@SpringBootTest
class JavapracticeApplicationTests {
	@Autowired
	private BusinessLogicService service;

	
	@Test
	void contextLoads() {
	}
	
	
	@Test
	void testBusinessLogic() {
		String input="Hello World";
		assertTrue(input.equals(service.getReverse("dlroW olleH")));
	}
	
	@Test
	//String with leading space
	void testBusinessLogic_1() {
		String input="      h";
		assertTrue(input.equals(service.getReverse("h      ")));
	}
	
	@Test
	//String with space
	void testBusinessLogic_2() {
		String input="      x   ";
		assertTrue(input.equals(service.getReverse("   x      ")));
	}
	
	
	
}
