package basic;

import java.util.Scanner;
// Palindrome number - 626,11,373,545 etc.

public class PalindromeNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
		int num = sc.nextInt();
		System.out.println("Given number is : "+num);
		int sum =0;
		int a = num;
		while(a>0) {
			int b = a%10;
			sum = sum*10+b;
			a = a/10;
		}
		if(num==sum) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not Palindrome number");
		}
	}

}
