package com.java.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Araylist {
	public static void main(String[] args) {
		Collection c = new ArrayList();
		
		c.add("Aman");
		c.add("Mp");
		c.add(70.14);
		c.add(10);
		c.add(false);
		System.out.println(c.size());
		System.out.println(c);
		
		c.remove("Mp");
		System.out.println(c.size());
		System.out.println(c);
		
		Collection c1 = new ArrayList();
		c1.add(null);
		c1.add(34);
		System.out.println(c1.size());
		System.out.println(c1);
		
		c.addAll(c1);
		System.out.println(c);
	
	}

}
