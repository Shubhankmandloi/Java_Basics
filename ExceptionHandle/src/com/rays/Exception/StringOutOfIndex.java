package com.rays.Exception;

public class StringOutOfIndex {
	public static void main(String[] args) {
		String name = "Aman";
		
		try {
			System.out.println(name.charAt(4));
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
