package com.sibisoft.tdd.training;

public abstract class Money {
	protected int amount;
	
	public Money(int amount){
		this.amount = amount;
	}
	abstract Money times(int multiplier);
	static Money Dollar(int amount)
	{
		return new Dollar(amount);
	}
	static Money Franc(int amount){
		return new Franc(amount);
	}
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return (money.amount == amount && getClass().equals(money.getClass()));
	}
}
