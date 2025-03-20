package basic;

import java.util.Scanner;

public class FibonacciSeries {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an number : ");
		int a = sc.nextInt();
		int b =0;
		int c = 1;
		System.out.println(b);
		System.out.println(c);
		while((a-2)>0) {
			int d = b+c;
			b = c;
			c = d;
			System.out.println(d);
			a--;
	}

	}
}
