package com.pageobjects;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drivermanager.DriverManager;

public class Homepage_Elements extends DriverManager{
	
	  public Homepage_Elements() {
	  
	  PageFactory.initElements(getDriver(), this);
	  
	  }
	 
	
	@FindBy ( xpath= "//button[text()='Get Started']") WebElement getStartedBtn;
	
	@FindBy ( xpath= "//a[text()='NumpyNinja']") WebElement numpyNinjaIcon;
	
	@FindBy ( xpath= "//a[text()=' Register ']") WebElement registerBtn;
	
	@FindBy ( xpath= "//a[text()='Sign in']") WebElement signInBtn;
	
	@FindBy ( xpath= "//a[text()='Data Structures']") WebElement dataStructuresDropdown;
	
	@FindBy ( xpath = "//a[@class='dropdown-item']") List<WebElement> dropdownDSList;
	
	
	public String findCurrentUrl() throws InterruptedException {
		
		//getStartedBtn.click();
		
		String currentUrl = driver.getCurrentUrl();
		
		return currentUrl;
	}


	public WebElement getGetStartedBtn() {
		
		return getStartedBtn;
	}
	
	
	
	/*
	 * private void name() { for (WebElement webElement : dropdownDSList) {
	 * webElement.getText();
	 * 
	 * } }
	 */
	

}
