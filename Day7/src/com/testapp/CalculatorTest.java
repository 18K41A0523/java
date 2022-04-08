package com.testapp;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;

import org.junit.jupiter.api.Test;

class CalculatorTest {
	@BeforeEach
	public void callBefore() {
		System.out.println("calling before");
	}
	@AfterEach
	public void callAfter() {
		System.out.println("calling after");
	@BeforeAll	
	public static void callOnceBefore() {
		System.out.println("called before once");
	}
	}


	@Test
	void testAdd() {
		
		assertEquals(24,new Calculator().add(12,13));
	}

}
