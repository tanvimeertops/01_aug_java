package com.oops;

import java.util.Scanner;

import com.basic.*;
/*
 * Encapsulation : wrapping of data
 * private : only accessible with the class
 * protected :only accessible with the child class
 * default: only accessible within package
 * public: accessible everywhere
 */
class Customer{
	protected int cust_id;
	 String cust_name;
	
	public void setCustData() {
		cust_id=123;
		cust_name="hetal";
	}
	
}

class Bank extends Customer{
	double balance=1000;
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("cust id :"+cust_id);
		System.out.println("cust name :"+cust_name);
		System.out.println("Amount deposited "+amount+
				" your balance is :"+balance);
	}

}
class Interest extends Bank {
	double interest=5,total_interst;
	
	public void calcInterest() {
		total_interst=balance*(interest/100);
		System.out.println("your interest amt is :"+total_interst);
		balance=balance+total_interst;
		System.out.println("Your balance is :"+balance);
	}
	
	
}
public class SingleInheritance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double amount;
	Interest in;
	in=new Interest();
	in.setCustData();
	System.out.println("Enter amount to be deposited: ");
	amount=sc.nextDouble();
	in.deposit(amount);
	in.calcInterest();
	CalcDemo c=new CalcDemo();
}
}
