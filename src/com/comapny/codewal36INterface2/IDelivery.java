package com.comapny.codewal36INterface2;

public interface IDelivery {
    void delivery();
    default void deliveryStatus() {
    	System.out.println("Delivery is in progress");
    }
}
