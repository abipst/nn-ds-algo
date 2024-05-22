package com.drivermanager;

import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.chromium.ChromiumOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;

import com.utilities.LoggerLoad;

public class DriverManager {
	
	public static WebDriver driver;
	
	public static  WebDriver initializeDriver(String browser) {
		
		switch (browser.toLowerCase()) {
		
		case "chrome":
			
			LoggerLoad.info("Launching chrome : "+browser);	
			ChromeOptions chromeOptions = new ChromeOptions();	
			chromeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);	
			chromeOptions.setAcceptInsecureCerts(true);
			//chromeOptions.addArguments("--headless");
			driver = new ChromeDriver(chromeOptions);
			break;
			
		case "firefox":
			
			LoggerLoad.info("Launching firefox : "+browser);	
			FirefoxOptions firefoxOptions = new FirefoxOptions();
			firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);	
			firefoxOptions.setAcceptInsecureCerts(true);
			firefoxOptions.addArguments("--headless");
			driver = new FirefoxDriver(firefoxOptions);		
			break;
		
		case "edge":
			
			LoggerLoad.info("Launching edge : "+browser);	
			EdgeOptions edgeOptions = new EdgeOptions();
			edgeOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);	
			edgeOptions.setAcceptInsecureCerts(true);
			edgeOptions.addArguments("--headless");
			driver = new EdgeDriver(edgeOptions);		
			break;
		
		case "safari":
			
			LoggerLoad.info("Launching safari : "+browser);	
			SafariOptions safariOptions = new SafariOptions();
			safariOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);	
			safariOptions.setAcceptInsecureCerts(true);
			driver = new SafariDriver(safariOptions);		
			break;
		
		default:
			
			LoggerLoad.info("Launching : "+browser);
			driver = new ChromeDriver();
			break;
			
		}
		
		return driver;
	}
	
	
	
	
	
	
	

}
