package com.basic.oop.practice;

public class ShoppingCart {
	double totalPrice;
	
	public void addItem(double price) {
		totalPrice = price;
		
	}
	public double applyDiscount(double percent) {
		double prz = totalPrice;
		double dis = (prz/100)*percent;
		totalPrice = totalPrice-dis;
		System.out.println("You save "+dis );
		
		return 0.0;
		
	}

}
/* Create a class representing a ShoppingCart with methods to apply discounts and calculate the final price.
Create a class with name ShoppingCartprivate double totalPrice;
Methods: AddItem(double price),  ApplyDiscount(double discountPercentage) calculate discount percentage with total price,  ApplyDiscount(double discountPercentage) return total price.
Display in the Main Method with instance of class.*/

