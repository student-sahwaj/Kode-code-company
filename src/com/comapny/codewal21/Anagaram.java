package com.comapny.codewal21;

import java.util.Arrays;
import java.util.Scanner;

public class Anagaram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.next();
		String s1 = sc.next();
		char[] x = s.toCharArray();
		char[] y = s1.toCharArray();
		Arrays.sort(x);
		Arrays.sort(y);
		if (Arrays.equals(x, y)) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}

}
