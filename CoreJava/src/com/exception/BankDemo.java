package com.exception;

import java.util.Scanner;

public class BankDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		CheckingAccount c=new CheckingAccount(101, 1000);
		
		while(true) {
			System.out.println("**********************");
			System.out.println("1. Deposit");
			System.out.println("2. Withdraw");
			System.out.println("3. Check Balance");
			System.out.println("4. Exit");
			System.out.println("**********************");
			System.out.print("Enter Your Choice : ");
			int choice=sc.nextInt();
			System.out.println("**********************");
			if(choice==1)
			{
				System.out.print("Enter Deposit Amount :" );
				double amount=sc.nextDouble();
				System.out.println("**********************");
				c.deposit(amount);
			}
			else if(choice==2)
			{
				try {
					System.out.print("Enter Withdraw Amount : ");
					double amount=sc.nextDouble();
					System.out.println("**********************");
					c.withdraw(amount);
				} catch (InSuficientFunds e) {
					System.out.println("Sorry You Need Another "+e.getAmount()+" Rs.");
					System.out.println("**********************");
				}
			}
			else if(choice==3)
			{
				c.checkBalance();
				System.out.println("**********************");
			}
			else 
			{
				break;
			}
		}
	}
}
