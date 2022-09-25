package com.smarttechqa.basepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {
	
	
	public static void setUp () {
													  //find it under Driver, right click, copy path from /driver, add a dot then paste
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
	  //System is a Java class
		
		WebDriver driver = new ChromeDriver ();
		
		driver.manage().window().maximize(); 				// this opens the browser in full screen 
		
		driver.get("https://smarttechqa.com/login");
		
		driver.findElement(By.id("email")).sendKeys("testuser9@email.com");
		driver.findElement(By.id("password")).sendKeys("123456");
		
			
	//	driver.findElement(By.cssSelector("#password")).sendKeys("123456");          --> if you are testing with Internet explorer, this is better 
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		System.out.println("The tittle of the application is : "+driver.getTitle()); 	// to verify whether or not you logged in
		driver.quit();
		
		
		System.out.println("I did my first GitHub uplaod");
	}
	
	
	public static void main(String[] args) {
		
		BaseClass.setUp();
	}
	
	

}
