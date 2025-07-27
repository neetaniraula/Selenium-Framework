package com.qspider;

public class NonStatic {
int a = 10;
	public static void main(String[] args) {
		NonStatic n =  new NonStatic();
		System.out.println("Main starts");
		
		System.out.println(n.a);
		n.m1();
		System.out.println("Main ends");
				
	}
	public void m1() {
		System.out.println("m1 is executing");
	}
	
	//non static initializer{
	{
		System.out.println("non static initialiser");
	}


}
