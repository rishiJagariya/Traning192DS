package com.mps.mvnproj;

import static org.junit.Assert.*;

import org.junit.Test;

public class AssertMethodTest {

	@Test
	public void testAllAssertMethods() {
		String str1 = new String("Rishi");
		String str2 = new String("Rishi");
		String str3 = null;
		String str4 = "Rishi";
		String str5 = "Rishi";
		
		int val1=4;
		int val2=5;
		
		String[] arr1= {"one","two","three"};
		String[] arr2= {"one","two","three"};
		
		assertEquals(str1,str2);
		assertNotNull(str1);
		assertNull(str3);
		assertSame(str4, str5);
		//assertSame(str1,str2);             //both are different objects
		assertTrue(val1<val2);
		assertFalse(val1>val2);
		assertArrayEquals(arr1,arr2);
		//fail("this is error msgg");           //test will be failed manually
		
		
	}
}
