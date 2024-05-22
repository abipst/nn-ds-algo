package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.drivermanager.DriverManager;
import com.utilities.ConfigReader;

import java.io.*;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class Hooks extends DriverManager{
	
	@Before
	public void setUp() {
		
		ConfigReader config =  new ConfigReader();
		String browser = config.getBrowser();
		String applicationUrl = config.getApplicationUrl();
		
		WebDriver driver = DriverManager.initializeDriver(browser);
		
		driver.get(applicationUrl);
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		if(driver!=null && scenario.isFailed()) {
		
			TakesScreenshot ts = (TakesScreenshot)driver;
		
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		
			//scenario.attach(screenshot, "image/png", "errorscreen");
		
			Allure.addAttachment("failed scenario screenshot", new ByteArrayInputStream(screenshot));

		}
		//Log
		if(driver!=null) {
			
			driver.quit();
		}
	
		}
}
