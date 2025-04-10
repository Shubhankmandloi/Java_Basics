package com.basic.oop.encapsulation;

public class Account {
	private String number;
	private String accType;
	private double balance;
	
	
	
	public void setNumber(String numb) {
		number = numb;
	}
	public void setAccType(String type) {
		accType = type;
	}
	public void setBalance(double bal) {
		balance = bal;
	}
	
	public String getNumber() {
		return number;
	}
	
	public String getAccType() {
		return accType;
	}
	
	public double getBalance() {
		return balance;
	}
	
	public void deposite(double amt) {
		balance = balance+amt;
	}
	
	public void withDrawal(double amt) {
		if(amt<balance) {
			balance = balance - amt;
		}
		else {
			System.err.println("Insufficient Funds ...");
		}
	}
	
	

}
