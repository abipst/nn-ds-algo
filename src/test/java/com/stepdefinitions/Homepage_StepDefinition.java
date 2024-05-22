package com.stepdefinitions;


import org.testng.Assert;

import com.pageobjects.Homepage_Elements;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class Homepage_StepDefinition {
	
	@Given("The user is already on Home Page")
	public void the_user_is_already_on_home_page() throws InterruptedException {
		
		Homepage_Elements h = new Homepage_Elements();
		
		h.getGetStartedBtn().click();
		
	
		
		String currentUrl = h.findCurrentUrl();
		
		Assert.assertEquals( currentUrl,"https://dsportalapp.herokuapp.com/home","Home page is not displayed");
	     
	}

	@Given("The user is not signed in")
	public void the_user_is_not_signed_in() {
	    
	    
	}

	@Then("The user should see NumpyNinja icon")
	public void the_user_should_see_numpy_ninja_icon() {
	    
	    
	}

	@Then("The user should see Data structures dropdown with {int} options")
	public void the_user_should_see_data_structures_dropdown_with_options(Integer int1) {
	    
	    
	}

	@Then("The user should see Register and Sign in buttons")
	public void the_user_should_see_register_and_sign_in_buttons() {
	    
	    
	}

}
