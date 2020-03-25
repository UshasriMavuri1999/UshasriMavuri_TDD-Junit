package com.epam.task8;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
public class JunitTest {
	@Test
	public void test() 
	{
		ResultString test = new ResultString();
		String output = test.removeA("ABCD");
		assertEquals("BCD",output);
		output = test.removeA("AACD");
		assertEquals("CD",output);
		output = test.removeA("BACD");
		assertEquals("BCD",output);
		output = test.removeA("BBAA");
		assertEquals("BBAA",output);
		output = test.removeA("AABAA");
		assertEquals("BAA",output);
		output = test.removeA("AACD");
		assertEquals("CD",output);
		
		
	}
}
