package com.oops;

import java.util.Scanner;

class Customer{
	int cust_id;
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
public class SingleInheritance {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double amount;
	Bank b=new Bank();
	b.setCustData();
	System.out.println("Enter amount to be deposited: ");
	amount=sc.nextDouble();
	b.deposit(amount);
}
}
