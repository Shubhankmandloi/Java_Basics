package com.basic.oop.Inheritance;

public class TestShapes {
	public static void main(String[] args) {
		Shapes s = new Shapes();
		s = new Rectangle();
		s = (Rectangle)s;
		s.setColor("Blue");
		
		s.setBorderWidth(5);
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColor());
		System.out.println(s.area());
		Rectangle r = (Rectangle)new Shapes();
		System.out.println(r.area());
		
		
	}

}
