package com.comapny.codewal36INterface3;

public class ExpressBi implements IDelivery {

	@Override
	public void delivey() {
		// TODO Auto-generated method stub
		System.out.println("ExpressBi.delivey() ....");
		
	}

}
  


///**
// * Why do we use these methods?
//Method	Why do we use it?	                                                    How to call it?
//Abstract	   Forces implementing classes to provide their own implementation	   Through object
//Default	   Provides a common method implementation to implementing classes	   Through object
//Static	   Provides utility functionality related to the interface	            Delivery.companyInfo()
//Private	   Reuses internal code inside interface methods	                       Only inside interface
//Private static	Reuses common static logic inside interface methods	          Only inside interface
