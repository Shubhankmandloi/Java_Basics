package com.rays.Exception;

public class StringContainVovel {
	
	public static void main(String[] args) {
		
		try {
			checkVovel("Shubhank");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void checkVovel(String s) throws Exception {
		String b = s.toLowerCase();
		int a = s.length();
		for(int i=0;i<a;i++) {
			if(b.charAt(i)=='a'||b.charAt(i)=='e'||b.charAt(i)=='i'||b.charAt(i)=='o'||b.charAt(i)=='u') {
				System.out.println("Contain vovel");
			}
			else {
				throw new Exception();
			}
		}
	}

}
