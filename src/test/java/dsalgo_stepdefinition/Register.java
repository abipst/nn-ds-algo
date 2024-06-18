package dsalgo_stepdefinition;

import org.apache.commons.lang3.RandomStringUtils;

import dsalgo_pom.RegisterPage;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.*;
import org.testng.Assert;

public class Register {
	RegisterPage rg = new RegisterPage();

	@Given("The user clicks on Get started button and navigates to home page")
	public void the_user_clicks_on_get_started_button_and_navigates_to_home_page() {
		rg.getStartedBtn().click();
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		LoggerLoad.info("Opening home page " + currentUrl);

	}

	@When("The user navigates to register page by clicking register button on the home page")
	public void the_user_navigates_to_register_page_by_clicking_register_button_on_the_home_page() {
		rg.navigatregisterBtn().click();
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		LoggerLoad.info("Opening register page " + currentUrl);

	}

	@When("The user enters the valid username into the username textfield")
	public void the_user_enters_the_valid_username_into_the_username_textfield() {
		String usern1 = RandomStringUtils.randomAlphanumeric(6) + "@gmail.com";
		rg.navigatusernameBtn().sendKeys(usern1);
		LoggerLoad.info("Entering valid username : " + usern1);

	}

	@And("The user enters the valid password {string} into the password textfield")
	public void the_user_enters_the_valid_password_into_the_password_textfield(String password) {
		rg.navigatpasswordBtn().sendKeys(password);
		LoggerLoad.info("Entering valid password : " + password);

	}

	@And("The user enters the password {string} into the confirm password textfield")
	public void the_user_enters_the_password_into_the_confirm_password_textfield(String conpassword) {
		rg.navigatconfirpasswordBtn().sendKeys(conpassword);

		LoggerLoad.info("Re-entering the password as confirm password : " + conpassword);

	}

	@Then("The registration should be successful and user should able to navigate into the home page and The user should able to see the alert message {string}")
	public void the_registration_should_be_successful_and_user_should_able_to_navigate_into_the_home_page_and_the_user_should_able_to_see_the_alert_message(
			String message) {
		rg.registerBtn().click();
		LoggerLoad.info("Registration is successful");
		String homePageUrl1 = Webdriver_Manager.getDriver().getCurrentUrl();
		Assert.assertEquals(homePageUrl1, "https://dsportalapp.herokuapp.com/home",
				"Home page is not displayed after successful registration");
		if (message.equalsIgnoreCase("New Account created")) {
			boolean displayed = rg.regsucessfulmessage().isDisplayed();
			Assert.assertTrue(displayed, "Register successful message is not displayed");
		}

	}

	@When("The user enters the valid username as {string} into the username textfield")
	public void the_user_enters_the_valid_username_as_into_the_username_textfield(String username1) {

		rg.navigatusernameBtn().sendKeys(username1);
		LoggerLoad.info("User enters the valid username as " + username1);

	}

	@And("The user enters the invalid password {string} into the password textfield")
	public void the_user_enters_the_invalid_password_into_the_password_textfield(String password1) {
		rg.navigatpasswordBtn().sendKeys(password1);
		LoggerLoad.info("User enters the invalid password as " + password1);

	}

	@And("The user reenters the password {string} into the confirm password textfield")
	public void the_user_reenters_the_password_into_the_confirm_password_textfield(String confirmpassword1) {
		rg.navigatconfirpasswordBtn().sendKeys(confirmpassword1);
		LoggerLoad.info("User enters the invalid confirm password as " + confirmpassword1);

	}

	@Then("The registration should be unsucessful and user should get a error message {string}")
	public void the_registration_should_be_unsucessful_and_user_should_get_a_error_message(String mess) {
		rg.registerBtn().click();
		String errm = rg.regunsucesserrormessage().getText();

		mess = "password_mismatch:The two password fields didn’t match.";
		Assert.assertEquals(errm, mess, "error message is not displayed");

		LoggerLoad.info("Registration is unsuccessful" + errm);
	}

	@When("The user enters the valid username {string} into the username textboxfield")
	public void the_user_enters_the_valid_username_into_the_username_textboxfield(String username2) {
		rg.navigatusernameBtn().sendKeys(username2);
		LoggerLoad.info("User enters the valid username" + username2);
	}

	@And("The user enters the valid password {string} into the password textboxfield")
	public void the_user_enters_the_valid_password_into_the_password_textboxfield(String password2) {
		rg.navigatpasswordBtn().sendKeys(password2);
		LoggerLoad.info("User enters valid password " + password2);

	}

	@And("The user enters the invalid password {string} into the confirm password textfield")
	public void the_user_enters_the_invalid_password_into_the_confirm_password_textfield(String confirmpassword2) {
		rg.navigatconfirpasswordBtn().sendKeys(confirmpassword2);
		LoggerLoad.info("User enters the invalid confirm password" + confirmpassword2);

	}

	@Then("The registration should be unsucessful with the error message {string}")
	public void the_registration_should_be_unsucessful_with_the_error_message(String msg) {
		rg.registerBtn().click();
		rg.regunsucesserrormessage().click();
		boolean errmesspresent = rg.regunsucesserrormessage().isDisplayed();
		Assert.assertTrue(errmesspresent, "error message is not present");
		String errm = rg.regunsucesserrormessage().getText();
		msg = "password_mismatch:The two password fields didn’t match.";
		Assert.assertEquals(errm, msg, "error message is not displayed");
		LoggerLoad.info("Registration is unsuccessful" + errm);

	}

	@When("The user does not enters the username {string} into the username textfield")
	public void the_user_does_not_enters_the_username_into_the_username_textfield(String username3) {
		rg.navigatusernameBtn().sendKeys(username3);
		LoggerLoad.info("User doesnot enters the username" + username3);
	}

	@And("The user does not enters the  password {string}into the password textfield")
	public void the_user_does_not_enters_the_password_into_the_password_textfield(String password3) {
		rg.navigatpasswordBtn().click();
		rg.navigatpasswordBtn().sendKeys(password3);
		LoggerLoad.info("User doesnot enters the password" + password3);

	}

	@And("The user does not enters the same password {string} into the confirm password textfield")
	public void the_user_does_not_enters_the_same_password_into_the_confirm_password_textfield(String confirmpass3) {
		rg.navigatpasswordBtn().click();
		rg.navigatpasswordBtn().sendKeys(confirmpass3);
		LoggerLoad.info("User doesnot enters the confirm password" + confirmpass3);

	}

	@Then("Registration should be unsucessful and he should get a alert message{string}")
	public void registration_should_be_unsucessful_and_he_should_get_a_alert_message(String name) {
		rg.registerBtn().click();
		String msg = rg.navigatusernameBtn().getAttribute("validationMessage");
		// Please fill out this field.
		Assert.assertEquals(msg, "Please fill out this field.", "Alert message is not displayed");
		LoggerLoad.info("Registration unsucessful alert message is : " + msg);

	}

	@When("The user clicks on the Login button")
	public void the_user_clicks_on_the_Login_button() {
		rg.login1Btn().click();
		LoggerLoad.info("User navigates to Login page");

	}

	@Then("The User should able to succesfully navigate into the login page")
	public void the_user_should_able_to_succesfully_navigate_into_the_login_page() {

		String loginPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		Assert.assertEquals(loginPageUrl, "https://dsportalapp.herokuapp.com/login", "User is not on the login page");
		LoggerLoad.info("User is on the login page " + loginPageUrl);
	}

	@When("The user clicks on the Sign in button")
	public void the_user_clicks_on_the_sign_in_button() {

		rg.signinbtn().click();
		LoggerLoad.info("User navigates to register page sign-in button");

	}

	@When("The User should able to succesfully navigate into the Sign in page")
	public void The_User_should_able_to_succesfully_navigate_into_the_Sign_in_page() {

		String loginPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

		LoggerLoad.info("User is on the login page " + loginPageUrl);
		Assert.assertEquals(loginPageUrl, "https://dsportalapp.herokuapp.com/login", "User is not on the signin page");

	}

}
