package com.qspider;

public class Bike {
	String brand;
	int price;
	int cc;
	
	
	Bike(String brand, int price,int cc){
		this.brand = brand;
		this.price = price;
		this.cc = cc;
		
	}
	
	public void bikeDetails() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(cc);
	}

}
