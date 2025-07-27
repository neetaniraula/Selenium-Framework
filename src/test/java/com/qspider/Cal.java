package com.qspider;

import java.security.PublicKey;

public class Cal {

	public static void main(String[] args) {
		System.out.println("Main starts");
		int res = add(10,20);
		int res2 = sub(20,10);
			System.out.println("Addition is "+ res);
			System.out.println("Sub res is " + res2);
		System.out.println("Main ends");

	}
	public static int add(int a , int b) {
		System.out.println("Addition starts");
		int c = a+b;
		return c;
	}
	
	public static int sub(int a, int b) {
		System.out.println("Sub starts");
		int c = a-b;
		return c;
	}
	}


