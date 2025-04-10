package com.rays.Exception;

public class CheckedException extends RuntimeException{
	
	public static void main(String[] args) {
		
		try {
			throw new CheckedException();
		} catch (RuntimeException e) {
			System.out.println(e.getMessage());
		}
	}

}
