package dsalgo_hooks;

import java.io.ByteArrayInputStream;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import dsalgo_utilities.ConfigReader;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

public class DSalgoHooks {

	
	@Before
	public void setUp() {
	
		
		ConfigReader config =  new ConfigReader();
		
		String browser = config.getBrowser();
		
		String applicationUrl = config.getApplicationUrl();
		
		WebDriver driver = Webdriver_Manager.initializeDriver(browser);
		
		LoggerLoad.info("Opening application url: "+applicationUrl);
		
		driver.get(applicationUrl);
		
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown(Scenario scenario) {
		
		WebDriver driver = Webdriver_Manager.getDriver();
		
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
