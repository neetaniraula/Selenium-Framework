package com.test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FileReaderProp {

	public static void main(String[] args) throws Exception {
	
		FileInputStream fis = new FileInputStream("./src/test/resources/testData/credentials.properties");
		
		Properties pObj = new Properties();
		pObj.load(fis);
		String BROWSER = pObj.getProperty("browser");
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("url");
		String PASSWORD = pObj.getProperty("password");
		
		System.out.println("Browser: " + BROWSER );
		System.out.println("URL : " + URL );
		System.out.println("username: " + USERNAME );
		System.out.println("password " + PASSWORD );
		
		
		
		
	}

}
