package com.qspider;

public class MovieReview {

	public static void main(String[] args) {
		System.out.println("main starts....................");
		String  review1 = movie1("squid game");
				System.out.println(review1);
				System.out.println("===============================");
		String review2 = movie2("money heist");
		System.out.println(review2);
		System.out.println("main ends.....................");
		

	}
	public static String movie1(String wname) {
		System.out.println("The review of the web series "+ wname);
		return "must watch web series";
		
	}
	
	public static String movie2(String wname) {
		System.out.println("The review of the webseries  "+ wname);
		return "non borable web series";
	}

}
