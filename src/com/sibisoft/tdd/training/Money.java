package com.sibisoft.tdd.training;

public abstract class Money {
	protected int amount;
	protected String currency;
	
	abstract Money times(int multiplier);
	Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	static Money Dollar(int amount)
	{
		return new Dollar(amount,"USD");
	}
	static Money Franc(int amount){
		return new Franc(amount,"CHD");
	}
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return (money.amount == amount && getClass().equals(money.getClass()));
	}
	public String getCurrency()
	{
		return currency ;
	}
}
