package basic;

import java.util.Scanner;

public class FactorialNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
		int num = sc.nextInt();
		int a = num;
		int fact = 1;
		while(num>0) {
			fact = fact*num;
			num--;
		}
		System.out.println(" Factorial of "+a+" is : "+fact);
	}

}
