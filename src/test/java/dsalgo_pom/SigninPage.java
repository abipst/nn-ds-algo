package dsalgo_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class SigninPage {

	 public SigninPage(){
		  
		  PageFactory.initElements( Webdriver_Manager.getDriver(), this);
		  
		  }
		
	 	@FindBy ( xpath= "//button[text()='Get Started']")
		private WebElement getStartedBtn;
	 	
	 	// navigation bar elements
	 
		@FindBy ( xpath = "//a[text()='Sign in']") 
		private WebElement navbarSignInBtn;

		@FindBy ( linkText = "Sign out") 
		private WebElement navbarSignOutBtn;
		
		@FindBy ( xpath = "//a[text()='Sign out']/../a[2]") 
		private WebElement navbarUsernameBtn;
		
		
		// sign in page elements
		
		@FindBy ( id = "id_username") 
		private WebElement usernameBox;
		
		@FindBy ( id = "id_password") 
		private WebElement passwordBox;
		
		@FindBy ( xpath = "//input[@type='submit']") 
		private WebElement loginBtn;
		
		@FindBy ( linkText = "Register!") 
		private WebElement registerBtnInSigninPage;
		
		
		// login success / fail message elements
		
		@FindBy ( xpath = "//div[contains(text(),'You are logged in')]") 
		private WebElement loginSuccessMsg;	

		@FindBy ( xpath = "//div[contains(text(),'Logged out successfully')]") 
		private WebElement logoutSuccessMsg;
		
		@FindBy ( xpath = "//div[contains(text(),'Invalid Username and Password')]") 
		private WebElement invalidUsernamePasswordMsg;
		
		@FindBy ( xpath = "//div[contains(text(),'Please check your password')]") 
		private WebElement checkYourPasswordMsg;

		// getters for web elements to use outside this class

		public WebElement getGetStartedBtn() {
			return getStartedBtn;
		}

		public WebElement getNavbarSignInBtn() {
			return navbarSignInBtn;
		}

		public WebElement getNavbarSignOutBtn() {
			return navbarSignOutBtn;
		}

		public WebElement getNavbarUsernameBtn() {
			return navbarUsernameBtn;
		}

		public WebElement getUsernameBox() {
			return usernameBox;
		}

		public WebElement getPasswordBox() {
			return passwordBox;
		}

		public WebElement getLoginBtn() {
			return loginBtn;
		}

		public WebElement getRegisterBtnInSigninPage() {
			return registerBtnInSigninPage;
		}

		public WebElement getLoginSuccessMsg() {
			return loginSuccessMsg;
		}

		public WebElement getLogoutSuccessMsg() {
			return logoutSuccessMsg;
		}

		public WebElement getInvalidUsernamePasswordMsg() {
			return invalidUsernamePasswordMsg;
		}	

		public WebElement getCheckYourPasswordMsg() {
			return checkYourPasswordMsg;
		}

}
