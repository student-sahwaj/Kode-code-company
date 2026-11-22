package com.comapny.codewal29;

public class Overriden {
	void show() {
		System.out.println("this is the partens class:");
	}
 class Child extends Overriden{
	 @Override
	 void show() {
		 super.show();
		 System.out.println("this is the child class:");
	 }
 }

}
