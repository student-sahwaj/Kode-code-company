package com.comapny.codewal38INterface4;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IAccount set = (a, b, c)-> {
			System.out.println("Opening Account... for " + a  + ", " + b + "Amount will  "  + c);
			return " Sahwaj Ansari";
		};
		 String result = set.openAcount("Kodewala","BTM BAngalore ", 200000);

	}

}
