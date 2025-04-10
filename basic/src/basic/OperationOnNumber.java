package basic;

import java.util.Scanner;

public class OperationOnNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
		int num = sc.nextInt();
		System.out.println("Select Operation : \n1. P Prime\n2.F Factor\n3.T Factorial\n4.S Square");
		String ch = sc.next();
		//System.out.println("p = " + ch);
		switch (ch) {
		case "p":
			int count = 0;
			for (int i = 2; i < num; i++) {
				if (num % i == 0) {
					count++;
				}
			}
			if (count == 0) {
				System.out.println(num+" Prime Number");
			}
			else {
				System.out.println(num+" Not prime no");
			}
			break;
		case "f":
			for(int i=1;i<=num;i++) {
				if(num%i==0) {
					System.out.print(i+ " ");
				}
			}
			break;
		case "t":
			int fact = 1;
			int n = num;
			while(n>0) {
				fact = fact*n;
				n--;
				
			}
			System.out.println("Factorial of "+num+" is "+fact);
			break;
		case "s":
			System.out.println("Square of "+num+" is "+(num*num));
			break;
		}
	}
}