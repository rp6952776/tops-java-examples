package com.exception;

public class CheckingAccount {

	int acno;
	double balance;
	public CheckingAccount(int acno, double balance) {
		this.acno = acno;
		this.balance = balance;
		System.out.println("Hello "+this.acno+", Your Account Is Opened With "+this.balance+" Rs.");
	}
	
	public void deposit(double amount) {
		this.balance=this.balance+amount;
	}
	public void withdraw(double amount) throws InSuficientFunds{
		if(amount<=this.balance) {
			this.balance=this.balance-amount;
		}else {
			double needs=amount-this.balance;
			throw new InSuficientFunds(needs);
		}
	}
	public void checkBalance() {
		System.out.println("Current Balance : "+this.balance);
	}
	
}
