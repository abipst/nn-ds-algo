package com.hooks;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.drivermanager.DriverManager;
import com.utilities.ConfigReader;
import com.utilities.LoggerLoad;

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
		
		LoggerLoad.info("Opening application url: "+applicationUrl);
		
		driver.get(applicationUrl);
		
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		WebDriver driver = DriverManager.getDriver();
		
		if(driver!=null && scenario.isFailed()) {
			
			LoggerLoad.info("Taking screenshot for a failed sceanrio "+scenario);
		
			TakesScreenshot ts = (TakesScreenshot)driver;
		
			byte[] screenshot = ts.getScreenshotAs(OutputType.BYTES);
		
			scenario.attach(screenshot, "image/png", "errorscreen");	
		
			Allure.addAttachment("failed scenario screenshot", new ByteArrayInputStream(screenshot));

		}
		
		if(driver!=null) {
			
			LoggerLoad.info("Quitting the browser ");
			
			driver.quit();
		}
	
		}
}
