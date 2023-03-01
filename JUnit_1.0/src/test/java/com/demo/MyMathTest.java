package com.demo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class MyMathTest {
	// Calling MyMath and check
	MyMath myMath = new MyMath();	
	
	@BeforeEach
	public void before() {
		System.out.println("Before");
	}
	@AfterEach
	public void after() {
		System.out.println("After");
	}
	
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before class");
	}
	
	@AfterAll
	public static void afterAll() {
		System.out.println("After class");
	}

	@Test
	void sum_with3Numbers() {
		System.out.println("Test1");
		assertEquals(6, myMath.sum(new int[] {1,2,3}));
	}
	
	@Test
	void sum_with1Number() {
		System.out.println("Test2");
		assertEquals(3, myMath.sum(new int[] {3}));
	}

}
