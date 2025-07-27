package com.test;
import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		System.out.println("main starts ");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the byte value ");
		int userInput = sc.nextByte();
		System.out.println(userInput);
		
		System.out.println("Enter the short  value ");
		short shortInput = sc.nextShort();
		System.out.println(shortInput);
		
		System.out.println("Enter the double value ");
		double doubleInput = sc.nextDouble();
		System.out.println(doubleInput);
		
		
		System.out.println("Enter a character ");
		char chaRead = sc.next().charAt(2);
		
		System.out.println(chaRead);
		
		System.out.println("main end ");
		
	sc.close();

}
}

