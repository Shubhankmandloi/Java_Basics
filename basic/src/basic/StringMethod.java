package basic;

import java.util.Scanner;

public class StringMethod {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your name :");
		String name = sc.nextLine();
		System.out.println("Length of : "+name+" is : "+name.length());
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		System.out.println(name.startsWith("Sh"));
		System.out.println(name.endsWith("oi"));
	}

}
