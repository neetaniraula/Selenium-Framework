package com.qspider;

public class Encapsultation {

	public static void main(String[] args) {
		MovieDriver  m1 = new MovieDriver();
	
		m1.setmovieName("sachin");
		m1.setPrice(5000);
		System.out.println(m1.getmovieName());
		System.out.println(m1.getPrice());
		System.out.println("orign value======================");
		
		MovieDriver m2 = new MovieDriver();
		
		System.out.println(m2.getmovieName());
		System.out.println(m2.getPrice());
	}

}
