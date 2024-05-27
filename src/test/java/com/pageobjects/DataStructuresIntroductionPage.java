package com.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.drivermanager.DriverManager;



public class DataStructuresIntroductionPage {
	
	public DataStructuresIntroductionPage(){
		  
		  PageFactory.initElements( DriverManager.getDriver(), this);
		  
		  }
		
	 	@FindBy ( xpath= "//button[text()='Get Started']")
		private WebElement getStartedBtninApplnUrlPage;

	 	@FindBy ( xpath= "//*[text()='Data Structures-Introduction']/..//a[text()='Get Started']")
		private WebElement getStartedBtnForDataStructuresIntroPage;
	 	
	 	@FindBy ( xpath= "//a[text()='Time Complexity']")
		private WebElement timeComplexityLink;
	 	
	 	@FindBy ( xpath= "//p[text()='Time Complexity']")
		private WebElement timeComplexityHeader;
	 	
	 	@FindBy ( xpath= "//p[text()='Practice Questions']")
		private WebElement practiceQuestionsHeader;
	 	
	 	@FindBy ( xpath= "//li/a[text()='Time Complexity']")
	 	private WebElement timeComplexityLinkInSidepanel;
	 	
	 	@FindBy ( xpath= "//a[text()='Practice Questions']")
		private WebElement practiceQuestionsLinkInSidepanel;
	 	
	 	@FindBy ( xpath= "//a[contains(text(),'Try here')]")
		private WebElement tryHereBtn;
	 	 	
	 	@FindBy ( xpath= "//div[@class='input']//div/textarea")
		private WebElement tryEditorTextarea;
		
	 	@FindBy ( xpath= "//div/*[@id='output']")
		private WebElement outputConsole;
	 
		@FindBy ( xpath= "//button[text()='Run']")
		private WebElement runBtn;
	 		
	 	public WebElement getGetStartedBtninApplnUrlPage() {
			return getStartedBtninApplnUrlPage;
		}

		public WebElement getGetStartedBtnForDataStructuresIntroPage() {
			return getStartedBtnForDataStructuresIntroPage;
		}

		public WebElement getTimeComplexityLink() {
			return timeComplexityLink;
		}

		public WebElement getTimeComplexityHeader() {
			return timeComplexityHeader;
		}

		public WebElement getPracticeQuestionsHeader() {
			return practiceQuestionsHeader;
		}

		public WebElement getTimeComplexityLinkInSidepanel() {
			return timeComplexityLinkInSidepanel;
		}

		public WebElement getPracticeQuestionsLinkInSidepanel() {
			return practiceQuestionsLinkInSidepanel;
		}

		public WebElement getTryHereBtn() {
			return tryHereBtn;
		}

		public WebElement getTryEditorTextarea() {
			return tryEditorTextarea;
		}

		public WebElement getRunBtn() {
			return runBtn;
		}
		
	 	public WebElement getOutputConsole() {
			return outputConsole;
		}


		
}
