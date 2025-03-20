package basic;

import java.util.Scanner;

public class SwapTwoVariablesUsingThird {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("Before Swapping A is :"+a+" \n B is :"+b);
		int c = a;
		a = b;
		b = c;
		System.out.println("After Swapping A is :"+a+" \n B is :"+b);
	}

}
