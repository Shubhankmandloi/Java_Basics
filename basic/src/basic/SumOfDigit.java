package basic;

import java.util.Scanner;

public class SumOfDigit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Number :");
		int num = sc.nextInt();
		int a = num;
		System.out.println("Given number is :"+num);
		int sum =0;
		while(num>0) {
			int b = num%10;
			sum = sum+b;
			num = num/10;
		}
		System.out.println("Sum Of "+a+" is :"+sum);
		
	}

}
