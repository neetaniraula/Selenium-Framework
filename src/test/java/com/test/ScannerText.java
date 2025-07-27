package com.test;

import java.util.Scanner;

public class ScannerText {

	public static void main(String[] args) {
		
		
		System.out.println("main starts ");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the String Value 1 ");
		String s1 = sc.nextLine();
		System.out.println(s1);
		
		System.out.println("enter the string value 2 ");
		String s2 = sc.next();
		System.out.println(s2);
		
		sc.close();

	}

}
