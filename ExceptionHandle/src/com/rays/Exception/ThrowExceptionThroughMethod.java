package com.rays.Exception;

public class ThrowExceptionThroughMethod {
	
	public static void main(String[] args) {
		
		try {
			number(5);
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	
	public static void number(int a){
		if(a%2 == 0) {
			System.out.println("Even number.");
		}
		else {
			throw new RuntimeException();
		}
	}

}
