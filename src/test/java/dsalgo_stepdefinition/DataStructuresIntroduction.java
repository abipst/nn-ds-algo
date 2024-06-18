package dsalgo_stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgo_pom.DataStructuresIntroductionPage;
import dsalgo_utilities.ExcelReader;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataStructuresIntroduction {
	
	DataStructuresIntroductionPage dsIntroPOM = new DataStructuresIntroductionPage();
	
	ExcelReader reader = new ExcelReader();
	
	JavascriptExecutor javaScript = (JavascriptExecutor)Webdriver_Manager.getDriver();;
	
	private String expectedResult;

	@Given("The user goes to Data Structures - Introduction page")
	public void the_user_goes_to_data_structures_introduction_page() {
		
		dsIntroPOM.getGetStartedBtnForDataStructuresIntroPage().click();
		
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		
		LoggerLoad.info("Opening data structures introduction page "+currentUrl);    
	    
	}

	@When("The user clicks on Time Complexity link")
	public void the_user_clicks_on_time_complexity_link() {
		
		dsIntroPOM.getTimeComplexityLink().click();
		
		LoggerLoad.info(" User clicks on Time Complexity link ");
	    
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
			
			Assert.assertTrue( dsIntroPOM.getPracticeQuestionsHeader().isDisplayed() , "Practice Questions page is blank in Data structures Introduction module");
			
		}else {
			
			Assert.fail("Entering invalid page name "+subModuleName);
			
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
			
			LoggerLoad.info(" User clicks on Time Complexity link on the side panel ");
			
		}else if (subModuleName.equalsIgnoreCase("practice questions")) {
			
			dsIntroPOM.getPracticeQuestionsLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on practice questions link on the side panel ");
			
		} else {
			
			LoggerLoad.warn("Submodule name entered is not present in data structure intro side panel "+subModuleName);
		}
	}

	@When("The user clicks on Try here button")
	public void the_user_clicks_on_try_here_button() {
		
		javaScript.executeScript("arguments[0].scrollIntoView(true)", dsIntroPOM.getTryHereBtn());
		
		dsIntroPOM.getTryHereBtn().click();
		
		LoggerLoad.info(" User clicks on Try here button");
	    
	    
	}

	@Then("The user should be redirected to tryEditor page with a Run button to test")
	public void the_user_should_be_redirected_to_try_editor_page_with_a_run_button_to_test() {
		
		boolean tryEditorTextareaEnabled = dsIntroPOM.getTryEditorTextarea().isEnabled();
		
		Assert.assertTrue(tryEditorTextareaEnabled, "TryEditor textarea is not enabled");
		
		boolean runBtnEnabled = dsIntroPOM.getRunBtn().isEnabled();
		
		Assert.assertTrue(runBtnEnabled, "Run button is not enabled");
	    
	}

	@When("The user clicks on Run button")
	public void the_user_clicks_on_run_button() {
	    
	    dsIntroPOM.getRunBtn().click();
	    
	    LoggerLoad.info(" User clicks on run button");
	    
	}

	@Then("The user should see an alert to signal bad input")
	public void the_user_should_see_an_alert_to_signal_bad_input() {
		
		WebDriverWait wait = new WebDriverWait(Webdriver_Manager.getDriver(), Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		Alert alert = Webdriver_Manager.getDriver().switchTo().alert();
		
		if(alert != null) {
		
			String errMsg = alert.getText();
			
			LoggerLoad.warn(" Alert message says: "+errMsg);
			 
			alert.accept();	
			 
		} else {
			
			Assert.fail("Alert is not thrown");
		}
		  
	    
	}
	
	@When("The user enters invalid python code from excel sheet {string} and row number {int}")
	public void the_user_enters_invalid_python_code_from_excel_sheet_and_row_number(String sheetName, Integer rowNumber) {
		
		List<Map<String, String>> testdata = reader.getData(sheetName);

		String invalidCode = testdata.get(rowNumber).get("Invalid code");
		
		Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		
		javaScript.executeScript("arguments[0].click()", dsIntroPOM.getTryEditorTextarea());
				
		dsIntroPOM.getTryEditorTextarea().sendKeys(Keys.chord(cmdCtrl,"a", Keys.DELETE));
		
		dsIntroPOM.getTryEditorTextarea().sendKeys(invalidCode);

		LoggerLoad.info("Entering invalid python code "+invalidCode);
	
	}
	
	@When("The user enters valid python code from excel sheet {string} and row number {int}")
	public void the_user_enters_valid_python_code_from_excel_sheet_and_row_number(String sheetName, Integer rowNumber) {
		
		List<Map<String, String>> testdata = reader.getData(sheetName);

		String validCode = testdata.get(rowNumber).get("Valid code");
		
		Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;
		
		javaScript.executeScript("arguments[0].click()", dsIntroPOM.getTryEditorTextarea());
		
		dsIntroPOM.getTryEditorTextarea().sendKeys(Keys.chord(cmdCtrl,"a", Keys.DELETE));
		
		dsIntroPOM.getTryEditorTextarea().sendKeys(validCode);

		expectedResult = testdata.get(rowNumber).get("Result for valid code");

		LoggerLoad.info("Entering valid code "+validCode+" and the corresponding expected result is : "+ expectedResult);
		
	}
	
	
	@Then("Console should display result")
	public void console_should_display_result() {
	    
	    String result = dsIntroPOM.getOutputConsole().getText();
	    
	    Assert.assertEquals(result.trim(), expectedResult, "Result is not displayed");
	}

}
