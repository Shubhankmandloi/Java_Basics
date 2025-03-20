package basic;

import java.util.Scanner;

public class CountDigits {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number");
		int a = sc.nextInt();
		int b = a;
		int count = 0;
		while(a>0) {
			count = count+1;
			a = a/10;
		}
		System.out.println(b+" : Has "+count+" Digits");
	}

}
