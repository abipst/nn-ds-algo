package com.stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.drivermanager.DriverManager;
import com.pageobjects.SignIn_Elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignIn_StepDefinition {
	
	SignIn_Elements loginPOM = new SignIn_Elements();
	
	
	// need to check if this method can be replaced by Sowmya's home page step definition methods
	@Given("The user is on sign in page")
	public void the_user_is_on_sign_in_page() {
		
		loginPOM.getStartedBtn.click();
		
		loginPOM.navbarSignInBtn.click();
		
		String currentUrl = loginPOM.driver.getCurrentUrl();
		
		System.out.println(currentUrl);
			
		
	}
	
	@Then("The user should be redirected to Sign in Page")
	public void the_user_should_be_redirected_to_sign_in_page() {
	    
		
	}
	
	// might have to add valid username and password in the config file to access across the project
	@When("The user enters valid username and password and clicks on login button")
	public void the_user_enters_valid_username_and_password_and_clicks_on_login_button() {
		
		loginPOM.usernameBox.sendKeys("ninjafox");
		
		loginPOM.passwordBox.sendKeys("foxproject");
		
		loginPOM.loginBtn.click();  
	    
	}

	@Then("The user should be redirected to Home Page with the message {string}")
	public void the_user_should_be_redirected_to_home_page_with_the_message(String string) {
		
		String homePageUrl = loginPOM.driver.getCurrentUrl();
		
		Assert.assertEquals(homePageUrl,"https://dsportalapp.herokuapp.com/home", "Home page is not displayed");
		
		if (string.equalsIgnoreCase("You are logged in")) {
				
			boolean displayed = loginPOM.loginSuccessMsg.isDisplayed();
			
			Assert.assertTrue(displayed, "Login unsuccessful");
		
		}else if (string.equalsIgnoreCase("Logged out successfully")) {
				
			boolean displayed = loginPOM.logoutSuccessMsg.isDisplayed();
			
			Assert.assertTrue(displayed, "Logout unsuccessful");
		}
	    
	    
	}

	@Then("Username should be on the navigation bar next to sign out button")
	public void username_should_be_on_the_navigation_bar_next_to_sign_out_button() {
		
		String username = loginPOM.navbarUsernameBtn.getText();
		
	    boolean usernamePresent = username.trim().equalsIgnoreCase("ninjafox");
	    	
	    Assert.assertTrue(usernamePresent, "Login unsuccessful");
	    
	}

	@When("The user enters username as user and password as pass")
	public void the_user_enters_username_as_user_and_password_as_pass() {
		
		loginPOM.usernameBox.sendKeys("ninjafox");
		
		loginPOM.passwordBox.sendKeys("foxproject");
		
		loginPOM.loginBtn.click(); 
	    
	}

	@When("The user enters username as {string} and password as {string}")
	public void the_user_enters_username_as_and_password_as(String string, String string2) {
	    
	}

	@Then("The user should receive an error message as {string} and login status is {string}")
	public void the_user_should_receive_an_error_message_as_and_login_status_is(String string, String string2) {
	    
	}
	
	@When("The user clicks on login button")
	public void the_user_clicks_on_login_button() {
	    
	    
	}

	@When("The user clicks on Sign out button")
	public void the_user_clicks_on_sign_out_button() {
	    
	    
	}

	@When("The user clicks on Register button")
	public void the_user_clicks_on_register_button() {
	    
	    
	}

	@Then("The user should be redirected to Register Page")
	public void the_user_should_be_redirected_to_register_page() {
	    
	    
	}

	
}
