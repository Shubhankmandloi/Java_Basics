package com.rays.Exception;

public class ArrayIndexOutOfBond {
	public static void main(String[] args) {
		int[] a = new int [5];
		try {
		System.out.println(a[5]);
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
