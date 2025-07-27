package com.test;

public class ConditionaStatement {

	public static void main(String[] args) {
	
		System.out.println("Main starts");
		
		int a = 1000;int b = 2000; int c = 3000; int d = 4000; int e = 500;
		 if (a < b && a < c && a < e )  {
			 System.out.println(a + " is the smaller number ");
		 }
		 else if(b<c && b< d && b< e)  
		 {
			 System.out.println(b + " is the smaller numberr");
			 
		 }
		 
		 else if(c< d  && c < e)  
		 {
			 System.out.println(c + " is the smaller numberr");
		 }
		 
		 else if(d < e  )  
		 {
			 System.out.println(d + " is the smaller numberr");
		 }
		 
		 else {
			 System.out.println(e + " is the smallest number ");
		 }
		 
		System.out.println("Main end ");
	}

}
