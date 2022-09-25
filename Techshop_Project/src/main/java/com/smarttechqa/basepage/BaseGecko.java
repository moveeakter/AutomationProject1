package com.smarttechqa.basepage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseGecko {

	
	public void setUpGecko () {
		
	//	System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");				// old version 
		
		
		WebDriverManager.firefoxdriver().setup();					// new version 
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.get("https://smarttechqa.com/");
		
//		driver.close();
		
		
	}
	public static void main(String[] args) {
		BaseGecko obj = new BaseGecko ();
		obj.setUpGecko();
		
	}
	
	
}
