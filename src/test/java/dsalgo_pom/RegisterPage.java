package dsalgo_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class RegisterPage {

	public RegisterPage() {

		PageFactory.initElements(Webdriver_Manager.getDriver(), this);
	}

	@FindBy(xpath = "//button[text()='Get Started']")
	private WebElement getStartedBtn;

	// navigate to register link

	@FindBy(linkText = "Register")
	private WebElement navigatregisterBtn;

	// register page text-box field

	@FindBy(id = "id_username")
	private WebElement navigatusernameBtn;

	@FindBy(id = "id_password1")
	private WebElement navigatpasswordBtn;

	@FindBy(id = "id_password2")
	private WebElement navigatconfirpasswordBtn;

	// register button

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement registerBtn;

	// login button

	@FindBy(linkText = "Login")
	private WebElement login1Btn;

	// sign button

	@FindBy(linkText = "Sign in")
	private WebElement signinbtn;

	// Success message and fail error message

	@FindBy(xpath = "//div[@class='alert alert-primary']")
	private WebElement regsucessfulmessage;

	@FindBy(xpath = "//div[@class= 'alert alert-primary']")
	private WebElement regunsucesserrormessage;

	// creating getter methods to access private web elements outside the method

	public WebElement getStartedBtn() {

		return getStartedBtn;
	}

	public WebElement navigatregisterBtn() {

		return navigatregisterBtn;
	}

	public WebElement navigatusernameBtn() {
		return navigatusernameBtn;

	}

	public WebElement navigatpasswordBtn() {
		return navigatpasswordBtn;

	}

	public WebElement navigatconfirpasswordBtn() {

		return navigatconfirpasswordBtn;
	}

	public WebElement registerBtn() {
		return registerBtn;

	}

	public WebElement login1Btn() {

		return login1Btn;
	}

	public WebElement signinbtn() {

		return signinbtn;

	}

	public WebElement regsucessfulmessage() {

		return regsucessfulmessage;
	}

	public WebElement regunsucesserrormessage() {

		return regunsucesserrormessage;

	}

}
