package dsalgo_stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgo_pom.HomePage;
import dsalgo_pom.QueuePage;
import dsalgo_pom.StackPage;
import dsalgo_utilities.ExcelReader;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Queue {

	QueuePage dsQueuePOM;

	StackPage dsstkpage;
	Queue dsQueue;
	ExcelReader reader;
	private String expectedResult;

	public void queueMainwindow() {
		String mainwindow = Webdriver_Manager.getDriver().getWindowHandle();

		Webdriver_Manager.getDriver().switchTo().window(mainwindow);
	}

	@Given("The user goes to Queue Page")
	public void the_user_goes_to_queue_page() {
		dsQueuePOM = new QueuePage();
		dsQueuePOM.getStartedBtnForQueuePage().click();
		LoggerLoad.info("User landed in Queue page successfully");
	}

	@When("User landed in Queue Page")
	public void user_landed_in_queue_page() {
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();

		LoggerLoad.info("Opening Queue page " + currentUrl);

		Assert.assertEquals(currentUrl, "https://dsportalapp.herokuapp.com/queue/", "Queue page is not displayed");

		LoggerLoad.info("User validates Queue Page Url successfully" + currentUrl);

		String queuePageTitle = Webdriver_Manager.getDriver().getTitle();

		Assert.assertEquals(queuePageTitle, "Queue", "Queue page title is not displayed");

		LoggerLoad.info("User validates Queue Page Title successfully" + queuePageTitle);

		boolean queueHeaderPresent = dsQueuePOM.queueHeaderPresent().isDisplayed();

		Assert.assertTrue(queueHeaderPresent, "Queue page header is not displayed");

		LoggerLoad.info("User validates Queue Page Header successfully" + queueHeaderPresent);

		boolean queuetopicsCoveredSubHeaderPresent = dsQueuePOM.qtpcsCvrdSubHeaderPresent().isDisplayed();

		Assert.assertTrue(queuetopicsCoveredSubHeaderPresent, "Topics Cover sub header is not displayed in queue page");

		LoggerLoad.info("User validates Topics Cover Sub Header successfully" + queuetopicsCoveredSubHeaderPresent);

	}

	@Then("User should see all the links in Queue page")
	public void user_should_see_all_the_links_in_queue_page() {
		for (WebElement link : dsQueuePOM.QueuePageLinks) {
			LoggerLoad.info(link.getText() + " - " + link.getAttribute("href"));
		}
		int count = dsQueuePOM.QueuePageLinks().size();
		LoggerLoad.info("Count of all the links are:" + count);

	}

	@Then("User should validate {string} of Queue Page")
	public void user_should_validate_of_queue_page(String queuesubModuleName) {

		if (queuesubModuleName.equalsIgnoreCase("Implementation of Queue in Python")) {

			dsQueuePOM.impQueueLink().click();

			LoggerLoad.info(" User clicks on Implementation of Queue in Python submodule link ");

		}

		else if (queuesubModuleName.equalsIgnoreCase("Implementation using collections.deque")) {

			dsQueuePOM.impcollectionsLink().click();

			LoggerLoad.info(" User clicks on Implementation using collections.deque submodule link");

		}

		else if (queuesubModuleName.equalsIgnoreCase("Implementation using array")) {

			dsQueuePOM.imparrayLink().click();

			LoggerLoad.info(" User clicks on Implementation using array submodule link");

		}

		else if (queuesubModuleName.equalsIgnoreCase("Queue Operations")) {

			dsQueuePOM.queueOpLink().click();

			LoggerLoad.info(" User clicks on Queue Operations submodule link");

		}

		else {

			LoggerLoad.warn("Entering invalid page name " + queuesubModuleName);
		}
	}

	@Given("User clicks on Implementation of Queue in Python submodule link")
	public void user_clicks_on_implementation_of_queue_in_python_submodule_link() {
		dsQueuePOM.impQueueLink().click();
		LoggerLoad.info("User successfully landed in Implementation of Queue in Python page");

	}

	@Then("User should validate {string} of submodules Queue Page")
	public void user_should_validate_of_submodules_queue_page(String queuesubModuleName) {

		if (queuesubModuleName.equalsIgnoreCase("Implementation using collections.deque")) {

			dsQueuePOM.impcollectionsLink().click();

			LoggerLoad.info(" User clicks on Implementation using collections.deque link on the side panel ");

		}

		else if (queuesubModuleName.equalsIgnoreCase("Implementation of Queue in Python")) {

			dsQueuePOM.impQueueSideLink().click();

			LoggerLoad.info(" User clicks on Implementation of Queue in Python link on the side panel ");

		}

		else if (queuesubModuleName.equalsIgnoreCase("Implementation using array")) {

			dsQueuePOM.imparrayLinkSideLink().click();

			LoggerLoad.info(" User clicks on Implementation using array link on the side panel");

		}

		else if (queuesubModuleName.equalsIgnoreCase("Queue Operations")) {

			dsQueuePOM.QopSideLink().click();

			LoggerLoad.info(" User clicks on Queue Operations link on the side panel");

		}

		else {

			LoggerLoad.warn("Entering invalid page name " + queuesubModuleName);
		}
	}

	@Then("User should validate {string} Pages")
	public void user_should_validate_pages(String queuesubModuleName) {

		if (queuesubModuleName.equalsIgnoreCase("Implementation of Queue in Python")) {

			String impQueueUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(impQueueUrl, "https://dsportalapp.herokuapp.com/queue/implementation-lists/",
					"Implementation of Queue in Python");

			LoggerLoad.info("User validates Implementation of Queue in Python Url successfully" + impQueueUrl);

			String impQueuePageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(impQueuePageTitle, "Implementation of Queue in Python",
					"Implementation of Queue in Python title is not displayed");

			LoggerLoad.info("User validates Implementation of Queue in Python" + impQueuePageTitle);

			boolean operationsInStackHeaderPresent = dsQueuePOM.QopHeaderPresent().isDisplayed();

			Assert.assertTrue(operationsInStackHeaderPresent,
					"Introduction header is not displayed in introduction page");

			LoggerLoad.info("User validates Introduction Page Header successfully" + operationsInStackHeaderPresent);

			dsQueue.queueMainwindow();
		}

		else if (queuesubModuleName.equalsIgnoreCase("Implementation using collections")) {

			String impcollectionPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(impcollectionPageUrl,
					"https://dsportalapp.herokuapp.com/queue/implementation-collections/",
					"Implementation using collections page is not displayed");

			LoggerLoad.info(
					"User validates Implementation using collections Page Url successfully" + impcollectionPageUrl);

			String impcollectionPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(impcollectionPageTitle, "Implementation using collections",
					"Implementation using collections page title is not displayed");

			LoggerLoad.info("User validates validates Implementation Page Title successfully" + impcollectionPageTitle);

			boolean impcollectionHeaderPresent = dsQueuePOM.impcollecHeaderPresent().isDisplayed();

			Assert.assertTrue(impcollectionHeaderPresent,
					"Implementation header is not displayed in Creating Linked LIst page");

			LoggerLoad.info(
					"User validates validates Implementation Page Header successfully" + impcollectionHeaderPresent);
			dsQueue.queueMainwindow();
		}

		else if (queuesubModuleName.equalsIgnoreCase("Implementation using array")) {

			String imparrayPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(imparrayPageUrl, "https://dsportalapp.herokuapp.com/queue/Implementation-array/",
					"Implementation using array page is not displayed");

			LoggerLoad.info("User validates Implementation using array Page Url successfully" + imparrayPageUrl);

			String imparrayPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(imparrayPageTitle, "Implementation using array",
					"Implementation using array page title is not displayed");

			LoggerLoad.info("User validates Implementation using array Page Title successfully" + imparrayPageTitle);

			boolean imparrayHeaderPresent = dsQueuePOM.imparrayHeaderPresent().isDisplayed();

			Assert.assertTrue(imparrayHeaderPresent,
					"Implementation using array header is not displayed in Implementation using array page");

			LoggerLoad
					.info("User validates Implementation using array Page Header successfully" + imparrayHeaderPresent);

			dsQueue.queueMainwindow();

		} else if (queuesubModuleName.equalsIgnoreCase("Queue Operations")) {

			String queueOpPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(queueOpPageUrl, "https://dsportalapp.herokuapp.com/queue/QueueOp/",
					"Queue Operations page is not displayed");

			LoggerLoad.info("User validates IQueue Operations Page Url successfully" + queueOpPageUrl);

			String queueOpPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(queueOpPageTitle, "Queue Operations", "Queue Operations page title is not displayed");

			LoggerLoad.info("User validates Queue Operations Page Title successfully" + queueOpPageTitle);
			boolean queueOpHeaderPresent = dsQueuePOM.imparrayHeaderPresent().isDisplayed();

			Assert.assertTrue(queueOpHeaderPresent, "Queue Operations header is not displayed");

			LoggerLoad.info("User validates Queue Operations Page Header successfully" + queueOpHeaderPresent);

			dsQueue.queueMainwindow();

		}

		else {

			LoggerLoad.warn(
					"Submodule name entered is not present in data structure intro side panel " + queuesubModuleName);

		}

	}

	@When("User Clicks on Practice Question link in Queue page")
	public void user_clicks_on_practice_question_link_in_queue_page() {

		dsQueuePOM.impQueueLink().click();
		dsQueuePOM.practicequeSidePanel().click();
		LoggerLoad.info(" User clicks on Practice Questions link on the side panel ");

	}

	@Then("User should be able to validate practice question link")

	public void user_should_be_able_to_validate_practice_question_link() {
		String practiceQuestionsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

		Assert.assertEquals(practiceQuestionsPageUrl, "https://dsportalapp.herokuapp.com/queue/practice",
				"Practice Questions page is not displayed");

		LoggerLoad.info("Practice Questions page is landed successfully" + practiceQuestionsPageUrl);

		String practiceQuestionsPageTitle = Webdriver_Manager.getDriver().getTitle();

		Assert.assertEquals(practiceQuestionsPageTitle, "Practice Questions",
				"Practice Questions page is not displayed");

		Assert.fail(" Practice Questions Page Title is Empty " + practiceQuestionsPageTitle);

		boolean practiceQuestionsHeaderPresent = dsQueuePOM.practiceQuestionsHeader().isDisplayed();

		Assert.assertTrue(practiceQuestionsHeaderPresent,
				"Practice Questions header is not displayed in practice questions page");

		Assert.fail(" Practice Questions header is not displayed " + practiceQuestionsHeaderPresent);

	}

	@Given("User is in the Implementation Of Queue in Python page")
	public void user_is_in_the_implementation_of_queue_in_python_page() {
		dsQueuePOM.impQueueLink().click();
		LoggerLoad.info(" User is in Implementation Of Queue in Python page ");

	}

	@When("The user clicks on Try here button in Queue page")
	public void the_user_clicks_on_try_here_button_in_queue_page() {

		dsQueuePOM.queueTryHereBtn().click();

		LoggerLoad.info(" User clicks on Try here button");

	}

	@Then("The user should be redirected to tryEditor page of Queue page")
	public void the_user_should_be_redirected_to_try_editor_page_of_queue_page() {

		boolean tryEditorTextareaEnabled = dsQueuePOM.queueTryEditorTextarea().isEnabled();

		Assert.assertTrue(tryEditorTextareaEnabled, "TryEditor textarea is not enabled");

		boolean runBtnEnabled = dsQueuePOM.queueRunBtn().isEnabled();

		Assert.assertTrue(runBtnEnabled, "Run button is not enabled");
	}

	@When("The user enters invalid python code from excel sheet {string} and row number {int} of Queue module")
	public void the_user_enters_invalid_python_code_from_excel_sheet_and_row_number_of_queue_module(String sheetName,
			Integer rowNumber) throws InterruptedException {

		reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(sheetName);

		String invalidCode = testdata.get(rowNumber).get("Invalid code");

		dsQueuePOM.queueTryEditorTextarea().sendKeys(invalidCode);

		LoggerLoad.info("Entering invalid python code " + invalidCode);

	}

	@When("The user clicks on Run button in Queue module")
	public void the_user_clicks_on_run_button_in_queue_module() {

		dsQueuePOM.queueRunBtn().click();

		LoggerLoad.info("User clicks on run button");

	}

	@Then("The user should see an alert to signal bad input in Queue module")
	public void the_user_should_see_an_alert_to_signal_bad_input_in_queue_module() {
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

	@When("The user enters valid python code from excel sheet {string} and row number {int} of Queue module")
	public void the_user_enters_valid_python_code_from_excel_sheet_and_row_number_of_queue_module(String sheetName,
			Integer rowNumber) {

		reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(sheetName);

		String validCode = testdata.get(rowNumber).get("Valid code");

		dsQueuePOM.queueTryEditorTextarea().sendKeys(validCode);

		expectedResult = testdata.get(rowNumber).get("Result for valid code");

		LoggerLoad.info(
				"Entering valid code " + validCode + " and the corresponding expected result is : " + expectedResult);

	}

	@Then("Console should display result in Queue module")
	public void console_should_display_result_in_queue_module() {

		String result = dsQueuePOM.queueOutputConsole().getText();

		Assert.assertEquals(result.trim(), expectedResult, "Result is not displayed");

	}

	@Given("User is in the Implementation using collections.deque page")
	public void user_is_in_the_implementation_using_collections_deque_page() {

		dsQueuePOM.impcollectionsLink().click();

		LoggerLoad.info("User is in ImplementationLink using collections.deque page");
	}

	@Given("User is in the Implementation using array page")
	public void user_is_in_the_implementation_using_array_page() {
		dsQueuePOM.imparrayLink().click();
		LoggerLoad.info(" User is in Implementation using array page ");

	}

	@Given("User is in the Queue Operations page")
	public void user_is_in_the_queue_operations_page() {
		dsQueuePOM.queueOpLink().click();
		LoggerLoad.info(" User is in Queue Operations page ");

	}

}
