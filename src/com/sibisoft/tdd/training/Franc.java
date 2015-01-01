package com.sibisoft.tdd.training;

public class Franc {
	
	int amount;
	
	public Franc(int amount)
	{
		this.amount = amount;
	}
	Franc times(int multiplier){
		return new Franc(amount * multiplier);
	}
	@Override
	public boolean equals(Object obj) {
		Franc fran = (Franc)obj;
		return fran.amount==this.amount;
	}
}
