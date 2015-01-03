package com.sibisoft.tdd.training;

import static org.junit.Assert.*;
import com.sibisoft.tdd.training.Bank;
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
	@Test
	public void testSimpleAddition(){
		Money five = Money.Dollar(5);
		Expression sum = five.plus(five);
		Bank bank = new Bank();
		Money reduced = bank.reduce(sum,"USD");
		assertEquals(Money.Dollar(10), reduced);
	}
	@Test
	public void testPlusReturnSum(){
		Money five = Money.Dollar(5);
		Expression result = five.plus(five);
		Sum sum = (Sum) result;
		assertEquals(five, sum.augend);
		assertEquals(five, sum.addend);
	}
	@Test
	public void testReduceSum(){
		Expression sum = new Sum(Money.Dollar(3),Money.Dollar(4));
		Bank bank = new Bank();
		Money result = bank.reduce(sum, "USD");
		assertEquals(Money.Dollar(7), result);
	}
	@Test 
	public void testReduceMoney(){
		Bank bank = new Bank();
		Money result = bank.reduce(Money.Dollar(1), "USD");
		assertEquals(Money.Dollar(1), result);
	}
	
	
	
}
