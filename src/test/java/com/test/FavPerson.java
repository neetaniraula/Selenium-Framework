package com.test;

import java.util.Scanner;

public class FavPerson {

	public static void main(String[] args) {
			
		for (int i = 0 ; i < 10 ;i++) {
			Scanner scanner = new Scanner(System.in);
			System.out.println("What is your fav food ?");
			String favFood = scanner.nextLine();
			System.out.println(favFood);
		}
		
		
		

	}

}
