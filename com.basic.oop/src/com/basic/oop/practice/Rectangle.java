package com.basic.oop.practice;

public class Rectangle extends ShapeInheritance {
	private int length;
	private int width;
	
	
	public Rectangle() {
		System.out.println("Default Constructor ... ");
	}
	
	public Rectangle(int l) {
		length = l;
	}
	
	public Rectangle(int l,int w) {
		length = l;
		width = w;
	}
	
	public int area(int l,int w) {
		return l*w;
	}
	
	public void setLength(int l) {
		length = l;
	}
	
	public int getLength() {
		return length;
	}

}
