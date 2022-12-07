package com.exception;

public class InSuficientFunds extends Exception{

	double amount;
	public InSuficientFunds(double amount) {
		this.amount=amount;
	}
	
	public double getAmount() {
		return this.amount;
	}
}
