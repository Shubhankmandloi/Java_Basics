package basic;

import java.util.Scanner;

public class SwapThreeVariable {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1st number");
		int a = sc.nextInt();
		System.out.println("Enter 2nd number");
		int b = sc.nextInt();
		System.out.println("Enter 3rd number");
		int c = sc.nextInt();
		System.out.println("Before Swapping A :"+a+"\n B :"+b+"\n C :"+c);
		a = a+b+c;
		b = a-b-c;
		c = a-b-c;
		a=a-b-c;
		System.out.println("After Swapping A :"+a+"\n B :"+b+"\n C :"+c);


	}

}
