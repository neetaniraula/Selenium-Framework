package com.test;

public class StaticMethod {
static int a = 40;
	public static void main(String[] args) {
		System.out.println("main starts");
		int a = 10;
				System.out.println(a);
		System.out.println(StaticMethod.a);
			}
	public static void uday() {
	int	b=20;
		System.out.println(b);
		System.out.println(a);
	}
	public static void pratibha() {
		int c = 30;
		 System.out.println(c);
	}
	public static void anudeep() {
		int d = 40;
		System.out.println(d);
		System.out.println("main ends");
	}


}



