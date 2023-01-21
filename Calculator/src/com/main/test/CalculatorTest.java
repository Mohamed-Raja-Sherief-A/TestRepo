package com.main.test;

import static org.junit.jupiter.api.Assertions.assertEquals;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.main.service.ServiceHandler;



public class CalculatorTest {
	
	
	private ServiceHandler service;
	
	
	@BeforeEach
	public void beforeAll() {
		service = new ServiceHandler();
		System.out.println("Befor all");
	}
	
	@Test
	@DisplayName("Add Test")
	public void addTest() {
		int a=5;
		int b=5;
		int result = service.add(a, b);
		System.out.println(result);
		int expected =10;
		assertEquals(5, 5);
	}
	
}
