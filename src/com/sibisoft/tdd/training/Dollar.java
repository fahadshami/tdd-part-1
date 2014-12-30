package com.sibisoft.tdd.training;

public class Dollar {
	
	private int amount;
	
	public Dollar(int amount){
		this.setAmount(amount);
	}
	public void times(int multiplier){
		amount *= multiplier;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}

}
