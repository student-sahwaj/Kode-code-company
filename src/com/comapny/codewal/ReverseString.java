package com.comapny.codewal;

public class ReverseString {
	public static String reverse(String input) {
		if (input == null) {
			return null;
		}
		return  new StringBuilder(input).reverse().toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(reverse("Java code"));

	}

}
