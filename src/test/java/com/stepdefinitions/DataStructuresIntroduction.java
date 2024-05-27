package com.stepdefinitions;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgo_pom.DataStructuresIntroductionPage;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructuresIntroduction {
	
	DataStructuresIntroductionPage dsIntroPOM = new DataStructuresIntroductionPage();

	@Given("The user goes to Data Structures - Introduction page")
	public void the_user_goes_to_data_structures_introduction_page() {
		
		dsIntroPOM.getGetStartedBtnForDataStructuresIntroPage().click();
		
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		
		LoggerLoad.info("Opening data structures introduction page "+currentUrl);    
	    
	}

	@When("The user clicks on Time Complexity link")
	public void the_user_clicks_on_time_complexity_link() {
	    
		dsIntroPOM.getTimeComplexityLink().click();
	    
	}

	@Then("The user should be redirected to {string} of Data structures-Introduction page")
	public void the_user_should_be_redirected_to_of_data_structures_introduction_page(String subModuleName) {
	    
		if (subModuleName.equalsIgnoreCase("time complexity")) {
			
			String timeComplexityPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(timeComplexityPageUrl,"https://dsportalapp.herokuapp.com/data-structures-introduction/time-complexity/", "Time Complexity page is not displayed");
			
			String timeComplexityPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(timeComplexityPageTitle,"Time Complexity", "Time Complexity page is not displayed");
			
			boolean timeComplexityHeaderPresent = dsIntroPOM.getTimeComplexityHeader().isDisplayed();
			
			Assert.assertTrue(timeComplexityHeaderPresent, "Time Complexity header is not displayed in time complexity page");
			
			
		}else if (subModuleName.equalsIgnoreCase("practice questions")) {
			
			String practiceQuestionsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(practiceQuestionsPageUrl,"https://dsportalapp.herokuapp.com/data-structures-introduction/practice", "Practice Questions page is not displayed");
			
			String practiceQuestionsPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(practiceQuestionsPageTitle,"Practice Questions", "Practice Questions page is not displayed");
			
			boolean practiceQuestionsHeaderPresent = dsIntroPOM.getPracticeQuestionsHeader().isDisplayed();
			
			Assert.assertTrue(practiceQuestionsHeaderPresent, "Practice Questions header is not displayed in practice questions page");
			
		}else {
			
			Assert.fail("Entering invalid page name "+subModuleName);
			
			//LoggerLoad.warn("Entering invalid credentials"+invalidInput+" with error message "+errorMsg);
		}
	    
	}

	@Given("The user is on Time complexity page")
	public void the_user_is_on_time_complexity_page() {
		
		dsIntroPOM.getTimeComplexityLink().click();
		
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		
		LoggerLoad.info("Opening Time Complexity page "+currentUrl); 
	    	    
	}

	@When("The user clicks on {string} link on the side panel of Data structures-Introduction page")
	public void the_user_clicks_on_link_on_the_side_panel_of_data_structures_introduction_page(String subModuleName) {
		
		if (subModuleName.equalsIgnoreCase("time complexity")) {
			
			dsIntroPOM.getTimeComplexityLinkInSidepanel().click();
			
		}else if (subModuleName.equalsIgnoreCase("practice questions")) {
			
			dsIntroPOM.getPracticeQuestionsLinkInSidepanel().click();
			
		} else {
			
			LoggerLoad.warn("Submodule name entered is not present in data structure intro side panel"+subModuleName);
		}
	}

	@When("The user clicks on Try here button")
	public void the_user_clicks_on_try_here_button() {
		
		dsIntroPOM.getTryHereBtn().click();
	    
	    
	}

	@Then("The user should be redirected to tryEditor page with a Run button to test")
	public void the_user_should_be_redirected_to_try_editor_page_with_a_run_button_to_test() {
		
		boolean tryEditorTextareaEnabled = dsIntroPOM.getTryEditorTextarea().isEnabled();
		
		Assert.assertTrue(tryEditorTextareaEnabled, "TryEditor textarea is not enabled");
		
		boolean runBtnEnabled = dsIntroPOM.getRunBtn().isEnabled();
		
		Assert.assertTrue(runBtnEnabled, "Run button is not enabled");
	    
	}

	@When("The user enters invalid python code to the texteditor")
	public void the_user_enters_invalid_python_code_to_the_texteditor() {
	    
		
	    
	}

	@When("The user clicks on Run button")
	public void the_user_clicks_on_run_button() {
	    
	    dsIntroPOM.getRunBtn().click();
	    
	}

	@Then("The user should see an alert to signal bad input")
	public void the_user_should_see_an_alert_to_signal_bad_input() {
	    
	    
	}

	@When("The user enters valid python code from excel sheet {string} and row number {string}")
	public void the_user_enters_valid_python_code_from_excel_sheet_and_row_number(String input, String string2) {
		
		String code = "print \"numpy ninja\"";
		
		//dsIntroPOM.getTryEditorTextarea().clear();
		/*
		 * WebDriverWait wait = new WebDriverWait(Webdriver_Manager.getDriver(),
		 * Duration.ofSeconds(3));
		 * 
		 * wait.until(ExpectedConditions.visibilityOf(dsIntroPOM.getTryEditorTextarea())
		 * );
		 */
		
		dsIntroPOM.getTryEditorTextarea().sendKeys(code);
		
		
		/*
		 * JavascriptExecutor js = (JavascriptExecutor) Webdriver_Manager.getDriver();
		 * 
		 * js.executeScript("arguments[0].setAttribute('value','print \"ninja\"')",
		 * dsIntroPOM.getTryEditorTextarea());
		 * 
		 * Object executeScript =
		 * js.executeScript("return arguments[0].getAttribute('value')",
		 * dsIntroPOM.getTryEditorTextarea());
		 * 
		 * String s = (String) executeScript;
		 * 
		 * LoggerLoad.warn("code "+s);
		 */
	}

	@Then("Console should display result {string}")
	public void console_should_display_result(String string) {
	    
	    String result = dsIntroPOM.getOutputConsole().getText();
	    
	    Assert.assertEquals(result.trim(),"numpy ninja", "Result is not displayed");
	}



}
