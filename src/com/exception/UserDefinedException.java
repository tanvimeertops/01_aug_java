package com.exception;

import java.util.Scanner;

/*
 * Throw
 * 1.must be used in user defined exception
 * 2.throw is written inside method
 * 3.throw followed by new keyword and constructor
 * 4.must inherit Exception class to make a class user defined
 * exception
 * 
 * Throws: 
 * 1.written after method declaration
 * 2.use can not only throws user defined exception
 * but also system defined exception
 * 3.multiple exception separated by ,
 */

class TanviException extends Exception{
	double amount;
	public TanviException(double amount) {
		this.amount=amount;
		
	}
}

class ATM{
	
	double balance=1000;
	
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("amount deposited :"+amount+ " rs"
				+ " your current balance is: "+balance);
	}
	
	public void withdraw(double amount) throws TanviException,ArithmeticException {
		if(amount<=balance) {
			balance-=amount;
			System.out.println("amount withdrawn :"+amount+ " rs"
					+ " your current balance is: "+balance);
		}else {
			double needs=amount-balance;
			throw new TanviException(needs);
			
		}
		
	} 
}
public class UserDefinedException {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	ATM atm=new ATM();
	
	double amount;
	System.out.println("Enter the amount to be deposited: ");
	amount=sc.nextDouble();
	atm.deposit(amount);
	
	System.out.println("Enter the amount to be withdraw: ");
	amount=sc.nextDouble();
	try {
		atm.withdraw(amount);
	} catch ( TanviException e) {
		// TODO Auto-generated catch block
		System.out.println("If you deposit "+e.amount+ " rs more"
				+ "you can withdraw "+amount);
	}catch (ArithmeticException e) {
		// TODO: handle exception
	}
}
}
