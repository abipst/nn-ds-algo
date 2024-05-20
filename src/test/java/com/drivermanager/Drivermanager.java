package com.drivermanager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Drivermanager {
	
	public WebDriver driver;
	
	public WebDriver getDriver() {
		
		driver = new ChromeDriver();
		
		driver.get("https://dsportalapp.herokuapp.com");
		
		return driver;

	}
	
	
	
	
	
	
	

}
