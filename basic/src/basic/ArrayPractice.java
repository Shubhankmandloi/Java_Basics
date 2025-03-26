package basic;

import java.util.Scanner;

public class ArrayPractice {
	public static void main(String[] args) {
		/*int [] a = {10,20,30,40,50};
		 * int arr [] = new int[length];
		System.out.println(a.length);
		// For Each loop 
		for(int i : a) {
			System.out.print(i+" ");*/
		
		System.out.println("Enter an number  : ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int arr[] =  new int[num];
		
		
		for(int i=0;i<num;i++) {
			System.out.println("Enter "+i+" element : ");
			arr[i] = sc.nextInt();
		
		}
		for(int x :arr) {
			System.out.print(x+" ");
		}
		
		// Descending order
		int temp = arr[0];
		for(int i=0;i<num;i++) {
			if(temp<arr[i]) {
				temp = arr[i];
				
			}
		}
		
		
		
		
		
		
		
		
		
		}
		
	}


