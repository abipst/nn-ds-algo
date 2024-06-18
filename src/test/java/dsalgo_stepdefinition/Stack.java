package dsalgo_stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgo_pom.StackPage;
import dsalgo_utilities.ExcelReader;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Stack {

	StackPage dsStackPOM;
	Stack dsStack;
	ExcelReader reader;
	private String expectedResult;

	public void stackMainwindow() {
		String mainwindow = Webdriver_Manager.getDriver().getWindowHandle();

		Webdriver_Manager.getDriver().switchTo().window(mainwindow);

	}

	@Given("The user goes to Stack Page")
	public void the_user_goes_to_stack_page() {
		dsStackPOM = new StackPage();
		dsStackPOM.getStartedBtnForStackPage().click();
	}

	@When("User landed in Stack Page")
	public void user_landed_in_stack_page() {
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();

		LoggerLoad.info("Opening Stack page " + currentUrl);

		Assert.assertEquals(currentUrl, "https://dsportalapp.herokuapp.com/stack/", "Stack page is not displayed");

		LoggerLoad.info("User validates Stack Page Url successfully" + currentUrl);

		String stackPageTitle = Webdriver_Manager.getDriver().getTitle();

		Assert.assertEquals(stackPageTitle, "Stack", "Stack page title is not displayed");

		LoggerLoad.info("User validates Stack Page Title successfully" + stackPageTitle);

		boolean stackHeaderPresent = dsStackPOM.stackHeaderPresent().isDisplayed();

		Assert.assertTrue(stackHeaderPresent, "Stack page header is not displayed");

		LoggerLoad.info("User validates Stack Page Header successfully" + stackHeaderPresent);

		boolean stktopicsCoveredSubHeaderPresent = dsStackPOM.stktopicsCoveredSubHeaderPresent().isDisplayed();

		Assert.assertTrue(stktopicsCoveredSubHeaderPresent, "Topics Cover sub header is not displayed in stack page");

		LoggerLoad.info("User validates Topics Cover Sub Header successfully" + stktopicsCoveredSubHeaderPresent);

	}

	@Then("User should validate {string} of Stack Page")
	public void user_should_validate_of_stack_page(String stacksubModuleName) {
		if (stacksubModuleName.equalsIgnoreCase("Operations in Stack")) {

			String operationsInStackUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(operationsInStackUrl, "https://dsportalapp.herokuapp.com/stack/operations-in-stack/",
					"Operations in Stack is not displayed");

			LoggerLoad.info("User validates Operations In Stack Page Url successfully" + operationsInStackUrl);

			String operationsInStackPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(operationsInStackPageTitle, "Operations In Stack",
					"Operations In Stack page title is not displayed");

			LoggerLoad.info("User validates Introduction Page Title successfully" + operationsInStackPageTitle);

			boolean operationsInStackHeaderPresent = dsStackPOM.operationsInStackHeaderPresent().isDisplayed();

			Assert.assertTrue(operationsInStackHeaderPresent,
					"Introduction header is not displayed in introduction page");

			LoggerLoad.info("User validates Introduction Page Header successfully" + operationsInStackHeaderPresent);

			dsStack.stackMainwindow();
		}

		else if (stacksubModuleName.equalsIgnoreCase("Implementation")) {

			String implementationPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(implementationPageUrl, "https://dsportalapp.herokuapp.com/stack/implementation/",
					"Implementation page is not displayed");

			LoggerLoad.info("User validates Implementation Page Url successfully" + implementationPageUrl);

			String implementationPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(implementationPageTitle, "Implementation",
					"Implementation page title is not displayed");

			LoggerLoad
					.info("User validates validates Implementation Page Title successfully" + implementationPageTitle);

			boolean implementationHeaderPresent = dsStackPOM.implementationHeaderPresent().isDisplayed();

			Assert.assertTrue(implementationHeaderPresent,
					"Implementation header is not displayed in Creating Linked LIst page");

			LoggerLoad.info(
					"User validates validates Implementation Page Header successfully" + implementationHeaderPresent);
			dsStack.stackMainwindow();
		}

		else if (stacksubModuleName.equalsIgnoreCase("Applications of Stack")) {

			String applicationsOfStackPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(applicationsOfStackPageUrl,
					"https://dsportalapp.herokuapp.com/stack/stack-applications/",
					"Types of Linked List page is not displayed");

			LoggerLoad.info("User validates Applications of Stack Page Url successfully" + applicationsOfStackPageUrl);

			String applicationsOfStackPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(applicationsOfStackPageTitle, "Applications of Stack",
					"Applications of Stack page title is not displayed");

			LoggerLoad.info(
					"User validates Applications of Stack Page Title successfully" + applicationsOfStackPageTitle);

			boolean applicationsOfStackHeaderPresent = dsStackPOM.applicationHeaderPresent().isDisplayed();

			Assert.assertTrue(applicationsOfStackHeaderPresent,
					"Applications of Stack header is not displayed in Types of Linked List page");

			LoggerLoad.info(
					"User validates Applications of Stack Page Header successfully" + applicationsOfStackHeaderPresent);

			dsStack.stackMainwindow();

		} else {

			LoggerLoad.warn(
					"Submodule name entered is not present in data structure intro side panel " + stacksubModuleName);

		}
	}

	@Then("User should see all the links in Stack page")
	public void user_should_see_all_the_links_in_stack_page() {
		for (WebElement link : dsStackPOM.StackPageLinks) {
			LoggerLoad.info(link.getText() + " - " + link.getAttribute("href"));
		}
		int count = dsStackPOM.StackPageLinks().size();
		LoggerLoad.info("Count of all the links are:" + count);
	}

	@Given("User clicks on Operations in Stack submodule link")
	public void user_clicks_on_operations_in_stack_submodule_link() {
		dsStackPOM.operationsInStackLink().click();
		LoggerLoad.info("User successfully landed in Operations in Stack page");
	}

	@When("The user is on Operations in Stack page")
	public void the_user_is_on_operations_in_stack_page() {

		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();

		LoggerLoad.info("Operations in Stack" + currentUrl);

	}

	@When("User is in the Operations in Stack page")
	public void user_is_in_the_operations_in_stack_page() {
		dsStackPOM.operationsInStackLink().click();
		LoggerLoad.info(" User is in Operations in Stack page ");

	}

	@Then("User should be able to validate {string} links in Stack page")
	public void user_should_be_able_to_validate_links_in_stack_page(String stacksubModuleName) {
		if (stacksubModuleName.equalsIgnoreCase("Implementation")) {

			dsStackPOM.implementationSidePanelLink().click();

			LoggerLoad.info(" User clicks on Implementation link on the side panel ");

		}

		else if (stacksubModuleName.equalsIgnoreCase("Operations in Stack")) {

			dsStackPOM.operationsInStackSidePanelLink().click();

			LoggerLoad.info(" User clicks on Operations in Stack link on the side panel ");

		}

		else if (stacksubModuleName.equalsIgnoreCase("Applications")) {

			dsStackPOM.applicapplicationsSidePanelLink().click();

			LoggerLoad.info(" User clicks on Applications link on the side panel ");

		} else {

			LoggerLoad.warn("Entering invalid page name " + stacksubModuleName);
		}
	}

	@When("User Clicks on Practice Question link in Stack page")
	public void user_clicks_on_practice_question_link_in_stack_page() {
		
		dsStackPOM.operationsInStackLink().click();
		dsStackPOM.practicequestionsSidePanelLink().click();
		LoggerLoad.info(" User clicks on practice questions link on the side panel ");
		
	}

	@Then("User should be able validate practice question link in Stack page")
	public void user_should_be_able_validate_practice_question_link_in_stack_page() {
			String practiceQuestionsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(practiceQuestionsPageUrl,
					"https://dsportalapp.herokuapp.com/stack/practice",
					"Practice Questions page is not displayed");
			
			LoggerLoad.info("Practice Questions page is landed successfully" +practiceQuestionsPageUrl);

			String practiceQuestionsPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(practiceQuestionsPageTitle, "Practice Questions",
					"Practice Questions page is not displayed");
			
			Assert.fail(" Practice Questions Page Title is Empty " +practiceQuestionsPageTitle);

			boolean practiceQuestionsHeaderPresent = dsStackPOM.StkpracticeQuestionsHeader().isDisplayed();

			Assert.assertTrue(practiceQuestionsHeaderPresent,
					"Practice Questions header is not displayed in practice questions page");

			Assert.fail(" Practice Questions header is not displayed " +practiceQuestionsHeaderPresent);
		}
	
	
	@When("The user clicks on Try here button in Stack page")
	public void the_user_clicks_on_try_here_button_in_stack_page() {

		dsStackPOM.stackTryHereBtn().click();

		LoggerLoad.info(" User clicks on Try here button");
	}

	@Then("The user should be redirected to tryEditor page of Stack page")
	public void the_user_should_be_redirected_to_try_editor_page_of_stack_page() {

		boolean tryEditorTextareaEnabled = dsStackPOM.stackTryEditorTextarea().isEnabled();

		Assert.assertTrue(tryEditorTextareaEnabled, "TryEditor textarea is not enabled");

		boolean runBtnEnabled = dsStackPOM.stackRunBtn().isEnabled();

		Assert.assertTrue(runBtnEnabled, "Run button is not enabled");

	}

	@When("The user enters invalid python code from excel sheet {string} and row number {int} of Stack module")
	public void the_user_enters_invalid_python_code_from_excel_sheet_and_row_number_of_stack_module(String sheetName,
			Integer rowNumber) {
		reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(sheetName);

		String invalidCode = testdata.get(rowNumber).get("Invalid code");

		dsStackPOM.stackTryEditorTextarea().sendKeys(invalidCode);

		LoggerLoad.info("Entering invalid python code " + invalidCode);
	}

	@When("The user clicks on Run button in Stack module")
	public void the_user_clicks_on_run_button_in_stack_module() {
		dsStackPOM.stackRunBtn().click();

		LoggerLoad.info(" User clicks on run button");

	}

	@Then("The user should see an alert to signal bad input in Stack module")
	public void the_user_should_see_an_alert_to_signal_bad_input_in_stack_module() {
		WebDriverWait wait = new WebDriverWait(Webdriver_Manager.getDriver(), Duration.ofSeconds(3));

		wait.until(ExpectedConditions.alertIsPresent());

		Alert alert = Webdriver_Manager.getDriver().switchTo().alert();

		if (alert != null) {

			String errMsg = alert.getText();

			LoggerLoad.warn(" Alert message says: " + errMsg);

			alert.accept();

		} else {

			Assert.fail("Alert is not thrown");
		}

	}

	@When("The user enters valid python code from excel sheet {string} and row number {int} of Stack module")
	public void the_user_enters_valid_python_code_from_excel_sheet_and_row_number_of_stack_module(String sheetName,
			Integer rowNumber) {
		reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(sheetName);

		String validCode = testdata.get(rowNumber).get("Valid code");

		dsStackPOM.stackTryEditorTextarea().sendKeys(validCode);

		expectedResult = testdata.get(rowNumber).get("Result for valid code");

		LoggerLoad.info(
				"Entering valid code " + validCode + " and the corresponding expected result is : " + expectedResult);

	}

	@Then("Console should display result in Stack module")
	public void console_should_display_result_in_stack_module() {

		String result = dsStackPOM.stackOutputConsole().getText();

		Assert.assertEquals(result.trim(), expectedResult, "Result is not displayed");

	}

	@Given("User is in the Implementation in Stack page")
	public void user_is_in_the_implementation_in_stack_page() {
		dsStackPOM.implementationLink().click();

		LoggerLoad.info("User is in ImplementationLink page");

	}

	@Given("User is in the Implementation page")
	public void user_is_in_the_implementation_page() {
		dsStackPOM.operationsInStackLink().click();
		LoggerLoad.info("User is in Deletion Linked list page");

	}

	@Given("User is in the Applications page")
	public void user_is_in_the_applications_page() {

		dsStackPOM.applicationsLink().click();
		LoggerLoad.info("User is in Applications page");
	}

}
