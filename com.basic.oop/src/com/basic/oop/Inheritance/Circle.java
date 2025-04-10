package com.basic.oop.Inheritance;

public class Circle extends Shapes{
	private int radius;
	
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return this.radius;
	}
	public double area() {
		return Math.PI*radius*radius;
		
	}

}
