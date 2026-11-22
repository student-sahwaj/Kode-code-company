package com.comapny.codewal26;

public class Driver1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Product set = new Product("Iohone", "good", 12, "In stock");
//		set.viewProdctDetails();
		ElectronicProduct set1 = new ElectronicProduct("Iohone", "good", 12, "In stock", true, 3);
		set1.viewElectronicProduct();
		ClothingProduct set2 = new ClothingProduct("Iohone", "good", 12, "In stock", true, 3, "red color", 230000);
		set2.viewClothingProduct();

	}

}
