package com.comapny.codewal22;

public class DriverKrane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "this" + " is from" + " Kodewala Academy Bangalore";
		System.out.println(s1);
		String s2 = "Sahwaj";
		String s3 = " Ansari";
		String s4 = s2 + s3;
		System.out.println(s4);
		String s5 = "Sahwaj Ansari";
		System.out.println(s4==s5.intern()); // heap to scp 
		System.out.println(s4.equals(s5));

	}

}
