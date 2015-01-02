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
	public void testDollarMultiplication(){
		Money money = Money.Dollar(5);
		assertEquals(Money.Dollar(10), money.times(2));
		assertEquals(Money.Dollar(15),money.times(3));
	}
	@Test 
	public void testFrancMultiplication(){
		Money money = Money.Franc(5);
		assertEquals(Money.Franc(10), money.times(2));
		assertEquals(Money.Franc(15), money.times(3));
	}
	@Test
	public void testEquality(){
		assertTrue(Money.Dollar(5).equals(Money.Dollar(5)));
		assertFalse(Money.Dollar(4).equals(Money.Dollar(6)));
		assertFalse(Money.Dollar(4).equals(Money.Franc(5)));
	}
	@Test
	public void testCurrency(){
		assertEquals("USD",Money.Dollar(5).getCurrency());
		assertEquals("CHD",Money.Franc(5).getCurrency());
		assertNotEquals("USD", Money.Franc(4).getCurrency());
	}
	
	public void testSimpleAddition(){
		Money sum = Money.Dollar(5).plus(Money.Dollar(5));
		assertEquals(10, sum.amount);
	}
	
	
	
}
