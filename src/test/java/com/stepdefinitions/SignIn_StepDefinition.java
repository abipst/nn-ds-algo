package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.drivermanager.DriverManager;
import com.pageobjects.SignIn_Elements;

import dsalgo_pom.SignIn_Page;
import dsalgo_utilities.ConfigReader;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn_StepDefinition {
SignIn_Page signInPOM = new SignIn_Page();
	
	ConfigReader config =  new ConfigReader();
	
	@Given("The user is on sign in page")
	public void the_user_is_on_sign_in_page() {
		
		signInPOM.getGetStartedBtn().click();
		
		signInPOM.getNavbarSignInBtn().click();
		
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		
		LoggerLoad.info("Opening sign in page "+currentUrl);
		
	}

	@When("The user enters username as {string} and password as {string}")
	public void the_user_enters_username_as_and_password_as(String username, String password) {
		
		LoggerLoad.info("Entering invalid username "+username+" and password "+password);
		
		signInPOM.getUsernameBox().sendKeys(username);
		
		signInPOM.getPasswordBox().sendKeys(password);
	
	}
	
	@When("The user enters invalid credentials {string}, {string} and {string}")
	public void the_user_enters_invalid_credentials_and(String invalidInput, String username, String password) {
		
		LoggerLoad.info("Entering invalid credentials "+invalidInput+" username "+username+" and password "+password);
		
		signInPOM.getUsernameBox().sendKeys(username);
		
		signInPOM.getPasswordBox().sendKeys(password);
		
	}

	@Then("The user should receive an {string} for {string} and login status is {string}")
	public void the_user_should_receive_an_for_and_login_status_is(String errorMsg, String invalidInput, String loginStatus) {
		
		if(errorMsg.equalsIgnoreCase("Please fill out this field.")) {
		
			WebElement activeElement = Webdriver_Manager.getDriver().switchTo().activeElement();
		
			String errMsg = activeElement.getAttribute("validationMessage");
		
			Assert.assertEquals(errMsg, errorMsg, "Sign in fail with either leaving username or password blank");
			
		}else if (errorMsg.equalsIgnoreCase("Invalid Username and Password")){
			
			boolean errorMsgPresent = signInPOM.getInvalidUsernamePasswordMsg().isDisplayed();
			
			Assert.assertTrue(errorMsgPresent, "Invalid username and password error message is not displayed");
			
			String errMsg = signInPOM.getInvalidUsernamePasswordMsg().getText();
			
			Assert.assertEquals(errMsg, errorMsg, "Invalid username and Password - Error message is incorrect");
			
		}else if (errorMsg.equalsIgnoreCase("Please check your password")) {
			
			boolean errorMsgPresent = signInPOM.getCheckYourPasswordMsg().isDisplayed();
			
			Assert.assertTrue(errorMsgPresent, "Please check your password error message is not displayed");
			
			String errMsg = signInPOM.getCheckYourPasswordMsg().getText();
			
			Assert.assertEquals(errMsg, errorMsg, "Please check your password - Error message is incorrect");
		
		}else {
			
			LoggerLoad.warn("Entering invalid credentials"+invalidInput+" with error message "+errorMsg);
		}

	}	
	@When("The user clicks on login button")
	public void the_user_clicks_on_login_button() {
	    
		signInPOM.getLoginBtn().click();
	    
	}


	@When("The user enters valid username and password")
	public void the_user_enters_valid_username_and_password() {
		
		String validUsername = config.getUserName().trim();
		
		String validPassword = config.getPassword().trim();
		
		LoggerLoad.info("Entering valid username "+validUsername+" and password "+validPassword);
		
		signInPOM.getUsernameBox().sendKeys(validUsername);
		
		signInPOM.getPasswordBox().sendKeys(validPassword);
	  
	}

	@Then("The user should be redirected to Home Page with the message {string}")
	public void the_user_should_be_redirected_to_home_page_with_the_message(String string) {
		
		String homePageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		
		Assert.assertEquals(homePageUrl,"https://dsportalapp.herokuapp.com/home", "Home page is not displayed after sign in");
		
		if (string.equalsIgnoreCase("You are logged in")) {
				
			boolean displayed = signInPOM.getLoginSuccessMsg().isDisplayed();
			
			Assert.assertTrue(displayed, "Login successful message is not displayed");
		
		}else if (string.equalsIgnoreCase("Logged out successfully")) {
				
			boolean displayed = signInPOM.getLogoutSuccessMsg().isDisplayed();
			
			Assert.assertTrue(displayed, "Logout successful message is not displayed");
		}
	    
	}

	@Then("Username should be on the navigation bar next to sign out button")
	public void username_should_be_on_the_navigation_bar_next_to_sign_out_button() {
		
		String username = signInPOM.getNavbarUsernameBtn().getText();
		
	    boolean usernamePresent = username.trim().equalsIgnoreCase(config.getUserName());
	    	
	    Assert.assertTrue(usernamePresent, "Username is not displayed next to sign out button in navigation bar");
	    
	    
	}

	@When("The user clicks on Sign out button")
	public void the_user_clicks_on_sign_out_button() {
		
		signInPOM.getNavbarSignOutBtn().click();
	        
	}

	@When("The user clicks on Register button")
	public void the_user_clicks_on_register_button() {
		
		signInPOM.getRegisterBtnInSigninPage().click();    
	    
	}

	@Then("The user should be redirected to Register Page")
	public void the_user_should_be_redirected_to_register_page() {
	    
		String registerPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		
		Assert.assertEquals(registerPageUrl,"https://dsportalapp.herokuapp.com/register", "Register page is not displayed");
		
		String registerPageTitle = Webdriver_Manager.getDriver().getTitle();
		
		Assert.assertEquals(registerPageTitle,"Registration", "Register page is not displayed");
	    
	}

	
}
