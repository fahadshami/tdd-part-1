package com.sibisoft.tdd.training;

public class Money implements Expression{
	protected int amount;
	protected String currency;

	Money(int amount, String currency){
		this.amount = amount;
		this.currency = currency;
	}
	public Money times(int multiplier){
		return new Money(amount * multiplier,currency);
	}
	static Money Dollar(int amount)
	{
		return new Money(amount,"USD");
	}
	static Money Franc(int amount){
		return new Money(amount,"CHD");
	}
	@Override
	public boolean equals(Object obj) {
		Money money = (Money) obj;
		return (money.amount == amount && money.getCurrency().equals(getCurrency()));
	}
	public String getCurrency()
	{
		return currency ;
	}
	@Override
	public String toString() {
		return amount+""+currency;
	}
	public Expression plus(Money money){
		return new Sum(this,money);
	}
	public Money reduce(String to){
		return this;
	}
}
