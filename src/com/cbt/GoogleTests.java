package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleTests {

	public static void main(String[] args) {
		
	    	//1.Open Chrome
	     //	C:\Users\Shahnoza\Documents\Selenium dependencies\drivers\chromedriver
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shahnoza\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
		WebDriver  driver = new ChromeDriver();
		
		
		 // 2. go to url www.google.com
		// goes  to  website
		driver.get("htpp://cybertekschool.com");
		
		 // 3. verify title
		// Excpected : Google
		String expected = "http://cybertekschool.com";
		String actual = driver.getCurrentUrl();
		System.out.println(actual);
		
		  if(expected.equals(actual)) {
			System.out.println("pass");
		   } else {
			System.out.println("fail");
			System.out.println("Expected:\t" + expected);
			System.out.println("Actual:\t" + actual);
		}
		 
	}
}
