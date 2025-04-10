package com.basic.oop.Inheritance;

public class Rectangle extends Shapes {
	private int length;
	private int width;
	
	public void setLength(int length) {
		this.length = length;
	}
	public void setWidth(int width) {
		this.width = width;
		
	}
	public int getLength() {
		return this.length;
	}
	public int getWidth() {
		return this.width;
	}
	
	public double area() {
		return (length*width)/2;
	}

}
