package com.sibisoft.tdd.training;

import static org.junit.Assert.*;

import org.junit.Test;

public class DollarTest {

//	@Test
//	public void testMultiplication() {
//		Dollar five = new Dollar(5);
//		five.times(2);
//		assertEquals(10, five.getAmount());
//	}
	
	@Test
	public void testMultiplication(){
		Dollar five = new Dollar(5);
		assertEquals(new Dollar(10), five.times(2));
		assertEquals(new Dollar(15),five.times(3));
	}
	@Test
	public void testEquality(){
		assertTrue(new Dollar(5).equals(new Dollar(5)));
		assertFalse(new Dollar(4).equals(new Dollar(5)));// introducing triangulation
	}
}
