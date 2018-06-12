package com.cbt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicAuthenticationTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", 
				"C:\\Users\\Shahnoza\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
		
		WebDriver d= new ChromeDriver();
		d.get("http://newtours.demoaut.com");
		
		// find element by name
		// sendKeys()--> types on element
		d.findElement(By.name("userName")).sendKeys("tutorial");
		d.findElement(By.name("password")).sendKeys("tutorial");
		//click() --->clicks
		d.findElement(By.name("login")).click();
		
		String expected = "Find a Flight";
		String actual = d.getTitle();
		 if(actual.contains(expected)) {
				System.out.println("pass");
		  } else {
				System.out.println("fail");
				System.out.println("Expected:\t" + expected);
				System.out.println("Actual:\t" + actual);
			}
		
	}
}

