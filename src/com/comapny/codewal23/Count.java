package com.comapny.codewal23;

import java.util.Scanner;

public class Count {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the name: ");
		String s = sc.nextLine();
		String[]arr = s.trim().split("\\s+");
		System.out.println(arr.length);

	}

}
