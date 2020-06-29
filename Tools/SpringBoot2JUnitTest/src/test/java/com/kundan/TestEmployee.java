package com.kundan;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(OrderAnnotation.class)
@DisplayName("TESTING EMPLOYEE TASK")
public class TestEmployee {
	
	@BeforeAll
//	@DisplayName("TESTING SETUPONCE METHOD")
	public static void setupOnce() {
		System.out.println("ONE TIME SETUP");
	}
	
	@BeforeEach
//	@DisplayName("TESTING SETUP METHOD")
	public void setup() {
		System.out.println("SET UP");
	}

	@Test
	@Order(1)
	@DisplayName("TESTING SAVE METHOD")
	public void testSave() {
		System.out.println("TEST-SAVE");
	}
	
	@Test
	@Order(2)
	@DisplayName("TESTING UPDATE METHOD")
	public void testUpdate() {
		System.out.println("TEST-UPDATE");
	}
	
	@Test
	@Order(3)
	@DisplayName("TESTING DELETE METHOD")
	@Disabled
	public void testDelete() {
		System.out.println("TEST-DELETE");
	}
	
	@AfterEach
//	@DisplayName("TESTING CLEAR METHOD")
	public void clear() {
		System.out.println("CLEAR DATA");
	}
	
	@AfterAll
//	@DisplayName("TESTING CLOSEALL METHOD")
	public static void cloaseAll() {
		System.out.println("AT ONE TIME END");
	}
}	
