package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Shahnoza\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
		
	
		WebDriver driver = new ChromeDriver();
		driver.get("http://google.com");
		

		WebDriver driver1 = new ChromeDriver();
		driver1.get("http://ebay.com");

	}
}
