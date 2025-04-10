package com.basic.oop.practice;

import java.util.Scanner;

public class Employee {
	private int empid;
	private String ename;
	private double esal;

	public Employee(int id, String name, double sal) {
		empid = id;
		ename = name;
		esal = sal;
	}

	public static Employee getEmployeeObject() {

		Scanner sc = new Scanner(System.in);

		Employee e = null;

		for (int i = 0; i < 6; i++) {

			System.out.println("Enter" + i + "th Employee Details : ");
			System.out.println("Enter name : ");
			String name = sc.nextLine();

			System.out.println("Enter emp Id :");
			int id = sc.nextInt();
			System.out.println("Enter employee Salary : ");
			double esal = sc.nextDouble();

			sc.nextLine();

			e = new Employee(id, name, esal);
			// return e;

		}

		sc.close();

		return e;

	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", esal=" + esal + "]";
	}

}
