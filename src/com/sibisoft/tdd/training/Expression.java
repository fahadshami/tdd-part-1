package com.sibisoft.tdd.training;

public interface Expression {
	public Money reduce(Bank bank,String to);
	Expression plus(Expression addend);
	public Expression times(int multiplier);
}
