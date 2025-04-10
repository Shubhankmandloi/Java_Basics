package com.basic.oop.Inheritance;

public class Shapes {
	protected String color;
	protected int borderWidth;
	
	public Shapes(){
		System.out.println("Default Constructor : ");
	}
	
	public Shapes(String color) {
		this.color = color;
		System.out.println("String Argument Constructor : "+color);
	}
	public Shapes(String color,int width) {
		this.color = color;
		borderWidth = width;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void setBorderWidth(int width) {
		borderWidth = width;
	}
	
	public String getColor() {
		return color;
	}
	
	public int getBorderWidth() {
		return borderWidth;
	}
	
	public double area() {
		return 0.0;
	}

}
