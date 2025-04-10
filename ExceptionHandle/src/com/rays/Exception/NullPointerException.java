package com.rays.Exception;

public class NullPointerException {
	public static void main(String[] args) {
		String name = null;
		
		System.out.println(name);
		
		try {
			System.out.println(name.charAt(2));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
