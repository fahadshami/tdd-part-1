package com.sibisoft.tdd.training;

public class Dollar extends Money{
	
	public Dollar(int amount){
		super(amount);
	}
	public Money times(int multiplier){
		return new Dollar(amount * multiplier);
	}
	
}
