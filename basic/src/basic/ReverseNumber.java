package basic;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
		int num = sc.nextInt();
		System.out.println("Given number is : "+num);
		int a = num;
		int sum = 0;
		while(num>0) {
			int b = num%10;
			sum =sum*10+b;
			num = num/10;
		}
		System.out.println("After Reverse number is : "+sum);
	}

}
