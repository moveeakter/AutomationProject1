package com.smarttechqa.basepage;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class BaseMS {
	
	
	public static void setUpMS () {
		
		System.setProperty("webdriver.edge.driver", "./Driver/msedgedriver.exe");
		
		WebDriver driver = new EdgeDriver ();
		
		driver.manage().window().maximize();
		driver.get("https://smarttechqa.com/");
		driver.close();
		
		
		
		
		
	}

	
	public static void main(String[] args) {
		
		BaseMS.setUpMS();
	}
}
