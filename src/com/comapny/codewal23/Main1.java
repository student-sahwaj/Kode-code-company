package com.comapny.codewal23;

public class Main1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder set = new StringBuilder("Sahwaj");
		set.append("Ansari");
		System.out.println(set);
		set.insert(5, "Khan");
		System.out.println(set);
		set.replace(0, 3, "waj");
		System.out.println(set);
		set.delete(0, 4);
		System.out.println(set);
		set.reverse();
		System.out.println(set);
		String result = set.toString();
		System.out.println(result);
	}

}
