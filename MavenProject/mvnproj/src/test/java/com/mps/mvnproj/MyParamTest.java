package com.mps.mvnproj;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.*;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class MyParamTest {
	private int x,y,result;
	Calculate calc;
	
	public MyParamTest(int x, int y, int result) {
		super();
		this.x = x;
		this.y = y;
		this.result = result;
	}
	
	@Before
	public void setUp() {
		System.out.println("@Before Called");
		calc = new Calculate();
	}
	
	@After
	public void tearDown() {
		calc = null;
		System.out.println("@After Called");
//		calc = new Calculate();
	}
	
	@Parameters
	public static Collection data() {
//		return Arrays.asList(new Object[][] {{10,10,20},{30,30,60},{120,100,220}});
		return Arrays.asList(new Object[][] {{10,10,100},{30,30,900},{20,11,220}});
	}
	
	@Test
	public void testSum() {
		System.out.println("Add Test");
//		assertEquals(result, calc.add(x,y));
		assertEquals(result,calc.mul(x,y));
	}
	
}
