package com.comapny.codewal21;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "Sahwaj"; // SCP ---> 1234(Address);
		String s1 = new String("Kodewala");
		// 1234dff == r543fgg --> false
		String s2 = new String("Kodewala");
		String s3 = new String("kodewala");
		System.out.println(s == s1);
		System.out.println(s2 == s3);
		// is diff. object
		System.out.println(s1.equals(s2));
		// .= means compare content that'swhay is true

	}

}
