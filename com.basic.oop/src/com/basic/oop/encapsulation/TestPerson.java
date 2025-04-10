package com.basic.oop.encapsulation;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestPerson {
	public static void main(String[] args) throws ParseException {
		Date d = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Person p = new Person();
		p.setName("Aman");
		p.setDob(sdf.parse("21-07-2000"));
		p.setAddress("Bhopal");
		System.out.println(p.getName());
		System.out.println(p.getAddress());
		System.out.println(sdf.format(p.getDob()));
				
	}

}
