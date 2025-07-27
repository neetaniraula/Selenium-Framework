package com.qspider;

public class Watch1 {
	String brand;
	int price;
	String type;
	
	Watch1(String brand,int price,String type){
		this.brand = brand;
		this.price = price;
		this.type = type;
	}
	public void watchDetails() {
		System.out.println(brand);
		System.out.println(price);
		System.out.println(type);
		
	}
	
	

}
