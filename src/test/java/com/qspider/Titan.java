package com.qspider;

public class Titan extends Watch1 {
	
	String color ;
	boolean strap;

	Titan(String brand, int price, String type,String color,Boolean strap) {
		super(brand,price,type);
		this.color= color;
		this.strap= strap;
	}
	public void titanDetails() {
		System.out.println(color);
		System.out.println(strap);
	}
		
	

}
