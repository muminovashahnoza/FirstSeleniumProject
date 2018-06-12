package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anothertest {

	public static void main(String[] args) throws InterruptedException {
		 System.setProperty("webdriver.chrome.driver",
				 "C:\\Users\\Shahnoza\\Documents\\Selenium dependencies\\drivers\\chromedriver.exe");
		 WebDriver driver1 = new ChromeDriver();
		 // navigate
		 driver1.navigate().to("http://www.cybertekschool.com");
		 
		 String expected ="cybertekschool";
		 
		 // getCurrentUrl()--> get URL of the current tab
		 String actual = driver1.getCurrentUrl();
		 
		 if(actual.contains(expected)) {
				System.out.println("pass");
		   } else {
				System.out.println("fail");
				System.out.println("Expected:\t" + expected);
				System.out.println("Actual:\t" + actual);
			}
		  
		  driver1.navigate().to("http://google.com");
		  Thread.sleep(1000);
		  driver1.navigate().back();
		  Thread.sleep(1000);
		  driver1.navigate().forward();
		  Thread.sleep(1000);
		  driver1.navigate().refresh();
		  Thread.sleep(1000);
		 
	}
}
