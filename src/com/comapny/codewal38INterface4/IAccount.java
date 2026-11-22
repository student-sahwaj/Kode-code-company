package com.comapny.codewal38INterface4;
//@FunctionalInterface
public interface IAccount{
//	@FunctionalInterface means only one abstract  method  
//	@NormalInterface means more than one abstract method
//  @markerINterface means empty abstract method	
	String  openAcount( String name, String address, int amount); // only one abstract method - SAM  + one abstract method from IAccountMgmt
//	default void addBeni() {
//		System.out.println("@FunctionalInterface means only one abstract  method ");
//	}
//	 static void moneyOfAccount() {
//		
//	}

}
  // to the achieve the lambda Expression from functional interface