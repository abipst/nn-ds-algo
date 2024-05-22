package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drivermanager.DriverManager;
import com.hooks.Hooks;

public class SignIn_Elements extends DriverManager{
	
	 public SignIn_Elements() {
		  
		  PageFactory.initElements(driver, this);
		  
		  }
		
	 	@FindBy ( xpath= "//button[text()='Get Started']")
		public WebElement getStartedBtn;
	 
		@FindBy ( xpath = "//a[text()='Sign in']") 
		public WebElement navbarSignInBtn;
		
		@FindBy ( id = "id_username") 
		public WebElement usernameBox;
		
		@FindBy ( id = "id_password") 
		public WebElement passwordBox;
		
		@FindBy ( xpath = "//input[@type='submit']") 
		public WebElement loginBtn;
		
		@FindBy ( xpath = "//div[contains(text(),'You are logged in')]") 
		public WebElement loginSuccessMsg;
		
		//Register!
		
		//div[contains(text(),'Invalid Username and Password')]   
		//a[contains(text(),'Ninjafox')]
		
		@FindBy ( xpath = "//a[text()='Sign out']/../a[2]") 
		public WebElement navbarUsernameBtn;
		
		@FindBy ( linkText = "Sign out") 
		public WebElement navbarSignOutBtn;
		

		@FindBy ( xpath = "//div[contains(text(),'Logged out successfully')]") 
		public WebElement logoutSuccessMsg;
       // Logged out successfully
		

}
