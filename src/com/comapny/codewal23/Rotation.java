package com.comapny.codewal23;

import java.util.Scanner;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String s1 = sc.next();
		String temp = s + s1;
		if (temp.contains(s1)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}

}
