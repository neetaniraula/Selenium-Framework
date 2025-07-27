package com.test;

import java.util.Scanner;

public class FavouriteThing {

	public static void main(String[] args) {
		for (int i = 0 ;i < 10;i++) {
		Scanner sc = new Scanner(System.in);
		System.out.println("What is your fav thing to do ?");
		String favthing1 = sc.nextLine();
		System.out.println(favthing1);
		sc.close();
		
		}

		
	}

}


