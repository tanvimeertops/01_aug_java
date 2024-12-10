package com.oops;

import java.util.Scanner;

class Bank123{
	int cust_id;
	String cust_name;
	
	public void setCustData() {
		cust_id=123;
		cust_name="hetal";
	}
	double balance=1000;
	public void deposit(double amount) {
		balance+=amount;
		System.out.println("cust id :"+cust_id);
		System.out.println("cust name :"+cust_name);
		System.out.println("Amount deposited "+amount+
				" your balance is :"+balance);
	}

}

class Interest123 extends Bank123 {
	double interest=5,total_interst;
	
	public void calcInterest() {
		total_interst=balance*(interest/100);
		System.out.println("your interest amt is :"+total_interst);
		balance=balance+total_interst;
		System.out.println("Your balance is :"+balance);
		
	}
	
	
}

class SimpleInterest extends Bank123{
	
	double rate_of_interest=15, year=5,si;
	
	public void calcSI() {
		System.out.println(balance);
		si=(balance*rate_of_interest*year)/100;
		System.out.println("simple interest is :"+si);
		System.out.println("after maturity u will get :"+(balance+si));
	}
	
}
public class HierarchicalDemo2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	double amount;
	Interest123 in;
	in=new Interest123();
	SimpleInterest simpleInterest=new SimpleInterest();
	in.setCustData();
	System.out.println("Enter amount to be deposited: ");
	amount=sc.nextDouble();
	in.deposit(amount);
	in.calcInterest();
	System.out.println("Enter amount for FD: ");
	amount=sc.nextDouble();
	simpleInterest.deposit(amount);
	simpleInterest.calcSI();
	
}
}
