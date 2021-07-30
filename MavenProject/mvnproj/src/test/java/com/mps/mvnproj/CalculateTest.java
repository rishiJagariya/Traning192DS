package com.mps.mvnproj;

import static org.junit.Assert.assertNotEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculateTest {

	Calculate calc;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception{
		System.out.println("@Before Class Called");
	}
	
	@AfterClass
	public static void tearDownAfterClass() throws Exception{
		System.out.println("@After Class Called");
	}
	
	@Before
	public void setUp() throws java.lang.Exception
	{
		System.out.println("@Before Called");
		calc = new Calculate();
	}
	@After
	public void tearDown() throws java.lang.Exception
	{
		calc=null;
		System.out.println("@After Called");
	}
	
	@Test
	public void testAdd()
	{
		System.out.println("Add Test");
		assertNotEquals(60, calc.add(10,20,30));	
	}
	
	@Test
	public void testMultiply()
	{
		System.out.println("Multiply Test");
		assertNotEquals(200, calc.mul(10,20));	
	}
}
