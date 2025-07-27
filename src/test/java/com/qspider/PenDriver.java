package com.qspider;

public class PenDriver {

	public static void main(String[] args) {
		Pen p1 = new Pen();
		p1.penDetails();
		System.out.println("=================================");
		Pen p2 = new Pen();
		p2.penDetails();
		System.out.println("========================");
		p2.brand = "reynolds";
		p2.price = 10;
		p2.penDetails();
		System.out.println("===========================================");
		Pen p3 = new Pen();
		p3.penDetails();
		System.out.println("====================================");
		p3.brand = "rorito";
		p3.price = 5;
		p3.penDetails();
		System.out.println("====================================");
		
		
	}

}
