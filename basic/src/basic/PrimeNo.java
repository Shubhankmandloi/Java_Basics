package basic;

import java.util.Scanner;

public class PrimeNo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
		int num = sc.nextInt();
		int count =0;
		for(int i =2;i<num;i++) {
			if(num%i==0) {
				count = count+1;
			}
			
		}
		if(count == 0) {
			System.out.println(num+" is prime no .");
		}
		else {
			System.out.println(num+" is not prime no ");
		}
		
	}

}
