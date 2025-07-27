package com.qspider;

public class Vehicle {
	
	public static void main(String[] args) {
		System.out.println("main starts");
		royalEnfield(200000);
		r15(215000);
			apache(150000);
		System.out.println("main ends");
}
	public static void royalEnfield(int price ) {
		System.out.println("The price of RE is : " + price);
	}
	public static void r15(int price){
		System.out.println("tThe price for r15 is " + price);
	}
	public static void apache(int price) {
		System.out.println("The price of apache is : " + price);
	}
}
