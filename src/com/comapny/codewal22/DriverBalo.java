package com.comapny.codewal22;

public class DriverBalo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = new String("Sahwaj");
		String s2 = new String("Sahwaj");
		System.out.println(s1==s2.intern());
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));

	}

}
