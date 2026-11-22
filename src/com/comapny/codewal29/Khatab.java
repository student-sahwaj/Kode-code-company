package com.comapny.codewal29;

public class Khatab {
	void show() {
		System.out.println("Vayas of Manchi");
	}

}
class Beta extends Khatab{
	@Override
	void show() {
		super.show();
		System.out.println("beta of Vayas: ");
	}
}
