package com.qspider;

public class ProgrammingLanguage {

	public static void main(String[] args) {
		System.out.println("main starts");
		java();
		System.out.println("main ends");
	}
	public static void java() {
		python();
			System.out.println("java method");
		}
	public static void python() {
	c();
		System.out.println("python method");
		}
public static void c() {
	
	System.out.println("c Method");
}

}

