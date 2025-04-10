package basic;

import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		
		
	}
	
	public static int getSumOfDigits(int num) {
		int sum =0;
		while(num>0) {
			int n = num%10;
			sum = sum+n;
			num = num/10;
		}
		return sum;
	}
	
	     
	   }
	
	
		

