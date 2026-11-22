package com.comapny.codewal26;

 class Emp {
	
	String name= " Ankit";
	String adress = "BTM";
	private String empCode = "asd234";
	public void markIn(String empId) {
		System.err.println("Marking IN " + empId);
	}
}
	class   Manager extends Emp{
		public void doSomething(String name,String adress) {
			System.out.println(adress);
			System.out.println(name);
			markIn(adress);
			
	}



}
	
	class Employee
	{
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Manager set = new Manager();
			set.doSomething("Sahwaj", "BTM");
//			System.out.println(set.adress);
		}
	}
