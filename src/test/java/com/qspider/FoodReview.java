package com.qspider;

public class FoodReview {

	public static void main(String[] args) {
		System.out.println("main starts....................");
		String review1= food1("Briyani");
		System.out.println(review1);
		System.out.println("=============================");
		String review2 = food2("idli");
		System.out.println(review2);
		System.out.println("main ends.....................");
	}
	public static String food1(String fname) {
		System.out.println("The food   "+ fname);
		return "Very delicious ";		
}
	public static String food2(String fname) {
		System.out.println("The food:  " +fname);
		return "Its ok";
	}
}
