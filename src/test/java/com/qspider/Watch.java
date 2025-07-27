package com.qspider;

public class Watch {

	String brand;
	int price;
	String type;
	
	Watch(String brand){
		this.brand = brand;		
	}
	Watch(String brand, String type){
		this.brand = brand;
		this.type = type;					
	}
	Watch(String brand,String type, int price){
		this.brand = brand;
		this.type = type;
		this.price = price;
	}
	public void watchDetails() {
		System.out.println(brand);
		System.out.println(type);
		System.out.println(price);
	}

}
