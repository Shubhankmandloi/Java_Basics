package com.basic.oop.practice;

import java.util.Date;

public class Person {
	
	
	private String name;
	private Date dob;
	private String address;
	
	public String getName()
	{
			return name;
			
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public void setDOB(Date d) {
		this.dob = d;
	}
	public Date getDate() {
		return this.dob;
	}
	public void setAddress(String add) {
		this.address = add;
	}
	public String getAddress() {
		return this.address;
	}
	public static int getAge(Date d) {
		 int a = d.getYear();
		 System.out.println(a);
		 return 0;
	}
	

}
