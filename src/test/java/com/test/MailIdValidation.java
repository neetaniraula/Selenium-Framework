package com.test;

public class MailIdValidation {

	public static void main(String[] args) {
	 String id = "neeta@gmail.com";
	 int pwd = 12345;
	 
	if (id == "neeta@gmail.com") {
		System.out.println("id matched , enter your password");
		if(pwd ==1234)
	{
		System.out.println("password matched");
		System.out.println("Login successful");
	}
	else {
		System.out.println("invalid password, login unsuccesful");
		
	}

}
	else {
		System.out.println("Invalid id, login unsuccessful");
		System.out.println("enter the valid id");
		
	}
	System.out.println("Main ends");
	
	
}
}