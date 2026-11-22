package com.comapny.codewal23;

import java.util.Scanner;

public class LongestSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String ");
		String s = sc.nextLine();
		String []world = s.split("");
		String longest = "";
		for (String w : world) {
			if (w.length()>longest.length()) {
				longest =w; 
			}
		}
		System.out.println(longest);

	}

}
