package com.comapny.codewal34;

public class Delivery {
//	public void doDelivery() {
//		System.out.println("Delivery.doDelivery");
//	}

	public void doDelivery() {
		// TODO Auto-generated method stub
		System.out.println("Delivery.doDelivery");
		
	}

}
class ExpressBi extends Delivery{
	@Override
	public void doDelivery() {
		System.out.println("ExpressBi.doDelivey");
	}
}
class Ekarty extends Delivery{
	public void doDelivery() {
		System.out.println("Ekarty.doDelivery");
	}
}
