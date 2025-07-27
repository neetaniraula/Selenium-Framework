package com.test;

public class SwitchStatement {
	public  static void main(String[] args) {
		
		char ch ='b';
		
		switch(ch) {
		case 'a': 
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A': 
		case 'E':
		case 'I':
		case 'O':
		case 'U':
		{
			System.out.println( ch + " is a vowel");
		}break;
			default:
			{
				System.out.println(ch + " is not a vowel");
			}
	}
	}

}
