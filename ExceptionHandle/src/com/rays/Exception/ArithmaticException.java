package com.rays.Exception;

public class ArithmaticException 
{
	public static void main(String[] args) {
		int a = 10;
		int b = 0;
		
		try {
			double c = a/b;
		} catch (Exception e) {
			System.out.print("Dont Divide by Zero");
			System.out.println(e.getMessage());
		}
		
	}

}
