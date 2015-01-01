package com.sibisoft.tdd.training;

public class Money {
	protected int amount;
	
	public Money(int amount){
		this.amount = amount;
	}
	
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return money.amount == this.amount;
	}
}
