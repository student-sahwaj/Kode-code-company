package com.comapny.codewal23;

public class AcounntMgmt { // This class can not become parent when i used Final key.
 int  UPI_LIMIT = 100000; // constant in java
public void doSomething1() {	
	UPI_LIMIT =200000; // able to change
	
}
public void doSomething2() {
	
}
	
 class Acount extends AcounntMgmt{
	 @Override
	 public void doSomething2() {
		 
	 }
	
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
