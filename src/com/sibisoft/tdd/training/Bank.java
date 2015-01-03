package com.sibisoft.tdd.training;


public class Bank {

	public Money reduce(Expression source, String to){
		return source.reduce(to);
	}
}
