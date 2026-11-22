package com.comapny.codewal;

public class RemoveDupicate {
	public static String removeDupicate(String input) {
		if (input == null) {
			return null;
		}
		StringBuilder result = new StringBuilder();
		for (char ch : input.toCharArray()) {
			if(result.indexOf(String.valueOf(ch))== -1) {
				result.append(ch);
			}
		}
		return result.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Progaraming";
		System.out.println(removeDupicate(input));

	}

}
