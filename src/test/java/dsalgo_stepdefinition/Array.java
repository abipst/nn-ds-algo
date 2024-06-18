package dsalgo_stepdefinition;


import org.testng.Assert;

import dsalgo_pom.ArrayPage;

import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Array {
	
	ArrayPage arrayPOM;
	
	@Given("The user goes to Array page")
	public void the_user_goes_to_array_page() {
		
		arrayPOM = new ArrayPage();
		
		arrayPOM.getGetStartedBtnForArrayPage().click();
		
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		
		LoggerLoad.info("Opening array page "+currentUrl); 
	  
	}

	@When("The user clicks on {string} link available in array home page")
	public void the_user_clicks_on_link_available_in_array_home_page(String subModuleName) {
		
		if (subModuleName.equalsIgnoreCase("Arrays in Python")) {
			
			arrayPOM.getArraysInPythonLink().click();
			
			LoggerLoad.info(" User clicks on Arrays in Python link ");
			
		} else if (subModuleName.equalsIgnoreCase("Arrays Using List")) {
			
			arrayPOM.getArraysUsingListLink().click();
			
			LoggerLoad.info(" User clicks on Arrays Using List link ");
		
		} else if (subModuleName.equalsIgnoreCase("Basic Operations in Lists")) {
			
			arrayPOM.getBasicOperationsInListsLink().click();
			
			LoggerLoad.info(" User clicks on Basic Operations in Lists link ");
			
		} else if (subModuleName.equalsIgnoreCase("Applications of Array")) {
			
			arrayPOM.getApplicationsOfArrayLink().click();
			
			LoggerLoad.info(" User clicks on Applications of Array link ");
			
		} else {
			
			LoggerLoad.warn("Submodule name is not available "+subModuleName);
		}
	
	}

	@Then("The user should be redirected to {string} page under array module")
	public void the_user_should_be_redirected_to_page_under_array_module(String subModuleName) {
		
		if (subModuleName.equalsIgnoreCase("Arrays in Python")) {
			
			String arraysInPythonPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(arraysInPythonPageUrl,"https://dsportalapp.herokuapp.com/array/arrays-in-python/", "Arrays in Python page is not displayed");
			
			String arraysInPythonPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(arraysInPythonPageTitle,"Arrays in Python", "Arrays in Python page is not displayed");
			
			boolean arraysInPythonHeaderPresent = arrayPOM.getArraysInPythonHeader().isDisplayed();
			
			Assert.assertTrue(arraysInPythonHeaderPresent, "Arrays in Python header is not displayed");	
			
		} else if (subModuleName.equalsIgnoreCase("Arrays Using List")) {
			
			String arraysUsingListPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(arraysUsingListPageUrl,"https://dsportalapp.herokuapp.com/array/arrays-using-list/", "Arrays Using List page is not displayed");
			
			String arraysUsingListPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(arraysUsingListPageTitle,"Arrays Using List", "Arrays Using List page is not displayed");
			
			boolean arraysUsingListHeaderPresent = arrayPOM.getArraysUsingListHeader().isDisplayed();
			
			Assert.assertTrue(arraysUsingListHeaderPresent, "Arrays Using List header is not displayed");
		
		} else if (subModuleName.equalsIgnoreCase("Basic Operations in Lists")) {
			
			String basicOperationsInListsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(basicOperationsInListsPageUrl,"https://dsportalapp.herokuapp.com/array/basic-operations-in-lists/", "Basic Operations in Lists page is not displayed");
			
			String basicOperationsInListsPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(basicOperationsInListsPageTitle,"Basic Operations in Lists", "Basic Operations in Lists page is not displayed");
			
			boolean basicOperationsInListsHeaderPresent = arrayPOM.getBasicOperationsInListsHeader().isDisplayed();
			
			Assert.assertTrue(basicOperationsInListsHeaderPresent, "Basic Operations in Lists header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Applications of Array")) {
			
			String applicationsOfArrayPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(applicationsOfArrayPageUrl,"https://dsportalapp.herokuapp.com/array/applications-of-array/", "Applications of Array page is not displayed");
			
			String applicationsOfArrayPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(applicationsOfArrayPageTitle,"Applications of Array", "Applications of Array page is not displayed");
			
			boolean applicationsOfArrayHeaderPresent = arrayPOM.getApplicationsOfArrayHeader().isDisplayed();
			
			Assert.assertTrue(applicationsOfArrayHeaderPresent, "Applications of Array header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Practice Questions")) {
			
			String practiceQuestionsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(practiceQuestionsPageUrl,"https://dsportalapp.herokuapp.com/array/practice", "Practice Questions page is not displayed");
			
			String practiceQuestionsPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(practiceQuestionsPageTitle,"Practice Questions", "Practice Questions page is not displayed");
			
			boolean searchTheArrayLinkPresent = arrayPOM.getSearchTheArrayLink().isDisplayed();
			
			Assert.assertTrue(searchTheArrayLinkPresent, "Practice Questions page is blank");
			
		} else {
			
			Assert.fail("Entering invalid page name "+subModuleName);
		}
	    
	    
	}

	@When("The user clicks on {string} link on the side panel of array page")
	public void the_user_clicks_on_link_on_the_side_panel_of_array_page(String subModuleName) {
		
		if (subModuleName.equalsIgnoreCase("Arrays in Python")) {
			
			arrayPOM.getArraysInPythonLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Arrays in Python link from side panel");
			
		} else if (subModuleName.equalsIgnoreCase("Arrays Using List")) {
			
			arrayPOM.getArraysUsingListLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Arrays Using List link from side panel");
		
		} else if (subModuleName.equalsIgnoreCase("Basic Operations in Lists")) {
			
			arrayPOM.getBasicOperationsInListsLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Basic Operations in Lists link from side panel");
			
		} else if (subModuleName.equalsIgnoreCase("Applications of Array")) {
			
			arrayPOM.getApplicationsOfArrayLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Applications of Array link from side panel");
			
		} else if (subModuleName.equalsIgnoreCase("Practice Questions")) {
			
			arrayPOM.getPracticeQuestionsLinkInArraySidepanel().click();
			
			LoggerLoad.info(" User clicks on Practice Questions link from side panel");
			
		} else {
			
			LoggerLoad.warn("Submodule name is not available "+subModuleName);
		}
		
	}

	@When("The user clicks on {string} link available in practice questions page")
	public void the_user_clicks_on_link_available_in_practice_questions_page(String subModuleName) {
		
		if (subModuleName.equalsIgnoreCase("Search the array")) {
			
			arrayPOM.getSearchTheArrayLink().click();
			
			LoggerLoad.info(" User clicks on Search the array link");
			
		} else if (subModuleName.equalsIgnoreCase("Max Consecutive Ones")) {
			
			arrayPOM.getMaxConsecutiveOnesLink().click();
			
			LoggerLoad.info(" User clicks on Max Consecutive Ones link");
		
		} else if (subModuleName.equalsIgnoreCase("Find Numbers with Even Number of Digits")) {
			
			arrayPOM.getFindNumbersWithEvenNumberOfDigitsLink().click();
			
			LoggerLoad.info(" User clicks on Find Numbers with Even Number of Digits link");
			
		} else if (subModuleName.equalsIgnoreCase("Squares of a Sorted Array")) {
			
			arrayPOM.getSquaresOfaSortedArrayLink().click();
			
			LoggerLoad.info(" User clicks on Squares of a Sorted Array link");
			
		} else {
			
			LoggerLoad.warn("Submodule name is not available "+subModuleName);
		}
	}

	@Then("The user should be redirected to Question page contains a question,a tryEditor to write code with Run and Submit buttons")
	public void the_user_should_be_redirected_to_question_page_contains_a_question_a_try_editor_to_write_code_with_run_and_submit_buttons() {
	
		boolean questionHeaderPresent = arrayPOM.getQuestionHeaderInTextEditorPage().isDisplayed();
		
		Assert.assertTrue(questionHeaderPresent, "Question header is not displayed");
		
		boolean tryEditorTextareaEnabled = arrayPOM.getTryEditorTextarea().isEnabled();
		
		Assert.assertTrue(tryEditorTextareaEnabled, "TryEditor textarea is not enabled");
		
		boolean runBtnEnabled = arrayPOM.getRunBtn().isEnabled();
		
		Assert.assertTrue(runBtnEnabled, "Run button is not enabled");
		
	}


}
