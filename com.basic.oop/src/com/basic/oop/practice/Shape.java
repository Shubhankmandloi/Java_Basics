package com.basic.oop.practice;
import java.util.*;

public class Shape {
	Scanner sc = new Scanner(System.in);
	
	private String color;
	private int borderWidth;
	public static final float PI = 3.14f;
	
	
	public Shape() {
		System.out.println("Enter Color : ");
		color = sc.next();
		System.out.println("Enter Border Width : ");
		borderWidth = sc.nextInt();
		
	}
	public Shape(int border) {
		System.out.println("Enter Color : ");
		color = sc.next();
		borderWidth = border;
		
	}
	
	public Shape(String color) {
		System.out.println("Enter BorderWidth : ");
		this.borderWidth = sc.nextInt();
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setBorderWidth(int width) {
		borderWidth = width;
	}
	
	public int getBorderWidth() {
		return this.borderWidth;
	}
	

}
