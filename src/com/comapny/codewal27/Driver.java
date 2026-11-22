package com.comapny.codewal27;

public class Driver {
	public void main (String[]args) {
		Pardhuman set = new Pardhuman("Ansari", 23000);
		set.viewPardhumanDetails();
		System.out.println(set.money);
		System.out.println(set.name);
		Pardhuman1 set1 = new Pardhuman1("Ansari", 34000, "new Ansari");
		System.out.println(set1.name);
		System.out.println(set1.money);
		System.out.println(set1.money);
		Pardhuman2 set2 = new Pardhuman2("Ansari", 500000, "SecondAnsari");
		System.out.println(set2.name);
		System.out.println(set2.money);
		System.out.println(set2.secondSon);
	}

}
