package com.basic.oop.practice;

public class Account {
	private String number;
	private String accountType;
	private double balance;
	
	
	public void setNumber(String num) {
		number = num;
	}
	
	public String getNumber() {
		return number;
	}
	
	public void setAccountType(String type) {
		accountType = type;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	public void deposite(double amt) {
		balance = balance+amt;
		
	}
	
	public double withdrawal(int amt) {
		if(amt<=balance) {
			balance = balance - amt;
		}
		else
			System.out.println("Invalid Balance....");
		return balance;
	}
	
	public double getBalance() {
		return balance;	
	}
	
	public void fundTransfer(double amt) {
		if(amt<=balance) {
			balance = balance-amt;
			System.out.println("After Transfer Amount is : "+balance);
		}else
			System.out.println("Insufficient Fund");
		
	}
	public void payBill(double amt) {
		if(amt<= balance) {
			balance = balance-amt;
			System.out.println("After Bill Payment Amount is : "+balance);
		}
		else
			System.out.println("Insufficent Fund .. ");
	}
	
	

}
