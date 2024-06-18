package dsalgo_stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgo_pom.LinkedListPage;
import dsalgo_utilities.ExcelReader;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LinkedList {

	LinkedListPage dsLListPOM;
	LinkedList dsLList;
	ExcelReader reader;
	private String expectedResult;

	public void linkedListMainwindow() {
		String mainwindow = Webdriver_Manager.getDriver().getWindowHandle();

		Webdriver_Manager.getDriver().switchTo().window(mainwindow);
		dsLListPOM.creatingLinkedListLinkInLinkedList();
	}

	@Given("The user goes to LinkedList Page")
	public void the_user_goes_to_linked_list_page() {

		dsLListPOM = new LinkedListPage();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		dsLListPOM.getStartedBtnForLinkedListPage().click();
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();

		LoggerLoad.info("Opening LinkedList page " + currentUrl);

	}

	@Given("User landed in Linked List Page")
	public void user_landed_in_linked_list_page() {
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();

		LoggerLoad.info("Opening data structures introduction page " + currentUrl);

	}

	@Given("User clicks on Introduction submodule link")
	public void user_clicks_on_inroduction_submodule_link() {

		dsLListPOM.introductionLinkInLinkedList();
		LoggerLoad.info(" User clicks on Introduction link ");
	}

	@When("User validating all the submodules links in {string} page")
	public void user_validating_all_the_submodule_links_in_page(String linkListsubModuleName) {
		if (linkListsubModuleName.equalsIgnoreCase("introduction")) {

			String introductionPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(introductionPageUrl, "https://dsportalapp.herokuapp.com/linked-list/introduction/",
					"Introduction page is not displayed");

			LoggerLoad.info("User validates Introduction Page Url successfully");

			String introductionPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(introductionPageTitle, "Introduction", "Introduction page title is not displayed");

			LoggerLoad.info("User validates Introduction Page Title successfully");

			boolean introductionHeaderPresent = dsLListPOM.introductionPageHeaderInLinkedList().isDisplayed();

			Assert.assertTrue(introductionHeaderPresent, "Introduction header is not displayed in introdduction page");

			LoggerLoad.info("User validates Introduction Page Header successfully");

			dsLList.linkedListMainwindow();
		}

		else if (linkListsubModuleName.equalsIgnoreCase("creating linked list")) {

			String creatingLinkedLIstPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(creatingLinkedLIstPageUrl,
					"https://dsportalapp.herokuapp.com/linked-list/creating-linked-list",
					"Creating Linked LIst page is not displayed");

			LoggerLoad.info("User validates Creating Linked List Page Url successfully");

			String creatingLinkedLIstPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(creatingLinkedLIstPageTitle, "Creating Linked LIst",
					"Creating Linked LIst page title is not displayed");

			LoggerLoad.info("User validates validates Creating Linked List Page Title successfully");

			boolean creatingLinkedLIstHeaderPresent = dsLListPOM.CreatingLinkedListPageHeaderInLinkedList()
					.isDisplayed();

			Assert.assertTrue(creatingLinkedLIstHeaderPresent,
					"Creating Linked LIst header is not displayed in Creating Linked LIst page");

			LoggerLoad.info("User validates validates Creating Linked List Page Header successfully");
			dsLList.linkedListMainwindow();
		}

		else if (linkListsubModuleName.equalsIgnoreCase("types of linked list")) {

			String typesOfLinkedListPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(typesOfLinkedListPageUrl,
					"https://dsportalapp.herokuapp.com/linked-list/types-of-linked-list",
					"Types of Linked List page is not displayed");

			LoggerLoad.info("User validates Types Of LinkedList Page Url successfully");
			String typesOfLinkedLIstPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(typesOfLinkedLIstPageTitle, "Types of Linked List",
					"Types of Linked List page title is not displayed");

			LoggerLoad.info("User validates Types Of LinkedList Page Title successfully");

			boolean typesOfLinkedLIstHeaderPresent = dsLListPOM.TypesofLinkedListPageHeaderInLinkedList().isDisplayed();

			Assert.assertTrue(typesOfLinkedLIstHeaderPresent,
					"Types of Linked List header is not displayed in Types of Linked List page");

			LoggerLoad.info("User validates Types Of LinkedList Page Header successfully");

			dsLList.linkedListMainwindow();

		}

		else if (linkListsubModuleName.equalsIgnoreCase("implement linked list in python")) {

			String implementLinkedListPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(implementLinkedListPageUrl,
					"https://dsportalapp.herokuapp.com/linked-list/implement-linked-list-in-python",
					"Implement Linked List page is not displayed");

			LoggerLoad.info("User validates Implement LinkedList Page Url successfully");

			String implementLinkedLIstPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(implementLinkedLIstPageTitle, "Implement Linked List in Python",
					"Implement Linked List in Python page title is not displayed");

			LoggerLoad.info("User validates Implement LinkedList Page Title successfully");

			boolean implementLinkedLIstHeaderPresent = dsLListPOM.ImplementLinkedListInPythonPageHeaderInLinkedList()
					.isDisplayed();

			Assert.assertTrue(implementLinkedLIstHeaderPresent,
					"Implement Linked List in Python header is not displayed in Implement Linked List in Python page");

			LoggerLoad.info("User validates Implement LinkedList Page Header successfully");

			dsLList.linkedListMainwindow();

		}

		else if (linkListsubModuleName.equalsIgnoreCase("traversal")) {

			String traversalLinkedListPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(traversalLinkedListPageUrl, "https://dsportalapp.herokuapp.com/linked-list/traversal",
					"Traversal page is not displayed");

			LoggerLoad.info("User validates Traversal Page Url successfully");

			String traversalLinkedLIstPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(traversalLinkedLIstPageTitle, "Traversal", "Traversal title is not displayed");

			LoggerLoad.info("User validates Traversal Page Title successfully");

			boolean traversalLinkedLIstHeaderPresent = dsLListPOM.TraversalPageHeaderInLinkedList().isDisplayed();

			Assert.assertTrue(traversalLinkedLIstHeaderPresent, "Traversal header is not displayed in traversal page");

			LoggerLoad.info("User validates Traversal Page Header successfully");

			dsLList.linkedListMainwindow();

		}

		else if (linkListsubModuleName.equalsIgnoreCase("insertion")) {

			String insertionLinkedListPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(insertionLinkedListPageUrl,
					"https://dsportalapp.herokuapp.com/linked-list/insertion-in-linked-list/",
					"Insertion page is not displayed");

			LoggerLoad.info("User validates Insertion Page Url successfully");

			String insertionLinkedLIstPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(insertionLinkedLIstPageTitle, "Insertion", "Insertion title is not displayed");

			LoggerLoad.info("User validates Insertion Page Title successfully");

			boolean insertionLinkedLIstHeaderPresent = dsLListPOM.InsertionPageHeaderInLinkedList().isDisplayed();

			Assert.assertTrue(insertionLinkedLIstHeaderPresent, "Insertion header is not displayed in insertion page");

			LoggerLoad.info("User validates Insertion Page Header successfully");

			dsLList.linkedListMainwindow();

		}

		else if (linkListsubModuleName.equalsIgnoreCase("deletion")) {

			String deletionLinkedListPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(deletionLinkedListPageUrl,
					"https://dsportalapp.herokuapp.com/linked-list/deletion-in-linked-list/",
					"Deletion page is not displayed");

			LoggerLoad.info("User validates Deletion Page Url successfully");

			String deletionLinkedLIstPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(deletionLinkedLIstPageTitle, "deletion", "Deletion title is not displayed");

			LoggerLoad.info("User validates Deletion Page Title successfully");

			boolean deletionLinkedLIstHeaderPresent = dsLListPOM.DeletionPageHeaderInLinkedList().isDisplayed();

			Assert.assertTrue(deletionLinkedLIstHeaderPresent, "Deletion header is not displayed in deletion page");

			LoggerLoad.info("User validates Deletion Page Header successfully");

		}

		else {

			LoggerLoad.warn("Submodule name entered is not present in LinkedList introduction side panel "
					+ linkListsubModuleName);
		}

	}

	@When("User should see all the links in linkedlist page")
	public void user_should_see_all_the_links_in_linkedlist_page() {

		for (WebElement link : dsLListPOM.linkedListPageLinks) {
			LoggerLoad.info(link.getText() + " - " + link.getAttribute("href"));
		}
		int count = dsLListPOM.linkedListPageLinks().size();
		System.out.println("Count of all the links are:" + count);
	}

	@When("User is in the Introduction of Linked list page")
	public void user_is_in_the_introduction_of_linked_list_page() {
		dsLListPOM.introductionLinkInLinkedList().click();
		;
		LoggerLoad.info(" User is in Introduction page ");
	}

	@Then("User should be able to validate {string} links in LinkedList page")
	public void user_should_be_able_to_validate_links_in_linked_list_page(String linkListsubModuleName) {
		if (linkListsubModuleName.equalsIgnoreCase("creating linked list")) {

			dsLListPOM.CreatingLinkedListSidePanelInLinkedList().click();

			LoggerLoad.info(" User clicks on Creating Linked LIst link on the side panel ");

		} else if (linkListsubModuleName.equalsIgnoreCase("introduction")) {

			dsLListPOM.introductionSidePanelInLinkedList().click();

			LoggerLoad.info(" User clicks on Introduction link on the side panel ");

		} else if (linkListsubModuleName.equalsIgnoreCase("types of linked list")) {

			dsLListPOM.TypesofLinkedListSidePanelInLinkedList().click();

			LoggerLoad.info(" User clicks on Creating Linked LIst link on the side panel ");

		} else if (linkListsubModuleName.equalsIgnoreCase("implement linked list in python")) {

			dsLListPOM.ImplementLinkedListPythonSidePanelInLinkedList().click();

			LoggerLoad.info(" User clicks on Implement Linked List in Python link on the side panel ");

		} else if (linkListsubModuleName.equalsIgnoreCase("traversal")) {

			dsLListPOM.TraversalSidePanelInLinkedList().click();

			LoggerLoad.info(" User clicks on Traversal link on the side panel ");

		} else if (linkListsubModuleName.equalsIgnoreCase("insertion")) {

			dsLListPOM.InsertionSidePanelInLinkedList().click();

			LoggerLoad.info(" User clicks on Insertion link on the side panel ");

		} else if (linkListsubModuleName.equalsIgnoreCase("deletion")) {

			dsLListPOM.DeletionSidePanelInLinkedList().click();

			LoggerLoad.info(" User clicks on Deletion link on the side panel ");

		} else if (linkListsubModuleName.equalsIgnoreCase("practice questions")) {

			dsLListPOM.PracticeQuestionsSidePanelInLinkedList().click();

			LoggerLoad.info(" User clicks on Practice Questions link on the side panel ");

			String practiceQuestionsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(practiceQuestionsPageUrl,
					"https://dsportalapp.herokuapp.com/stack/practice",
					"Practice Questions page is not displayed");

			String practiceQuestionsPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(practiceQuestionsPageTitle, "Practice Questions",
					"Practice Questions page is not displayed");

			boolean practiceQuestionsHeaderPresent = dsLListPOM.PracticeQuestionsPageHeaderInLinkedList().isDisplayed();

			Assert.assertTrue(practiceQuestionsHeaderPresent,
					"Practice Questions header is not displayed in practice questions page");

		} else {

			LoggerLoad.warn("Entering invalid page name " + linkListsubModuleName);

		}
	}
	
	@When("User Clicks on Practice Question link")
	public void user_clicks_on_practice_question_link() throws InterruptedException {
			Thread.sleep(2000);
			dsLListPOM.introductionLinkInLinkedList().click();
			dsLListPOM.PracticeQuestionsSidePanelInLinkedList().click();
			LoggerLoad.info(" User clicks on Practice Questions link on the side panel ");

		} 

	

	@Then("User should be able validate practice question page")
	public void user_should_be_able_validate_practice_question_page() {

		String practiceQuestionsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

		Assert.assertEquals(practiceQuestionsPageUrl,
				"https://dsportalapp.herokuapp.com/linked-list/practice",
				"Practice Questions page is not displayed");
		
		LoggerLoad.info("Practice Questions page is landed successfully" +practiceQuestionsPageUrl);
		
		String practiceQuestionsPageTitle = Webdriver_Manager.getDriver().getTitle();

		Assert.assertEquals(practiceQuestionsPageTitle, "Practice Questions",
				"Practice Questions page is not displayed");
		
		Assert.fail(" Practice Questions Page Title is Empty " +practiceQuestionsPageTitle);

		boolean practiceQuestionsHeaderPresent = dsLListPOM.PracticeQuestionsPageHeaderInLinkedList().isDisplayed();
		
		Assert.assertTrue(practiceQuestionsHeaderPresent,
				"Practice Questions header is not displayed in practice questions page");
		Assert.fail(" Practice Questions Header is Missing " +practiceQuestionsHeaderPresent);
		
	}

	@When("The user clicks on Try here button in Linked list page")
	public void the_user_clicks_on_try_here_button_in_linked_list_page() {

		dsLListPOM.linkedlistTryHereBtn().click();

		LoggerLoad.info(" User clicks on Try here button");
	}

	@Then("The user should be redirected to tryEditor page of Linked list page")
	public void the_user_should_be_redirected_to_tryeditor_page_of_linked_list_page() {

		boolean tryEditorTextareaEnabled = dsLListPOM.linkedlistTryEditorTextarea().isEnabled();

		Assert.assertTrue(tryEditorTextareaEnabled, "TryEditor textarea is not enabled");

		boolean runBtnEnabled = dsLListPOM.linkedlistRunBtn().isEnabled();

		Assert.assertTrue(runBtnEnabled, "Run button is not enabled");

	}

	@When("The user enters invalid python code from excel sheet {string} and row number {int} of Linkedlist module")
	public void the_user_enters_invalid_python_code_from_excel_sheet_and_row_number_of_linkedlist_module(
			String sheetName, Integer rowNumber) {
		reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(sheetName);

		String invalidCode = testdata.get(rowNumber).get("Invalid code");

		dsLListPOM.linkedlistTryEditorTextarea().sendKeys(invalidCode);

		LoggerLoad.info("Entering invalid python code " + invalidCode);
	}

	@When("The user clicks on Run button in LinkedList module")
	public void the_user_clicks_on_run_button_in_linked_list_module() {
		dsLListPOM.linkedlistRunBtn().click();

		LoggerLoad.info(" User clicks on run button");
	}

	@Then("The user should see an alert to signal bad input in Linkedlist module")
	public void the_user_should_see_an_alert_to_signal_bad_input_in_linkedlist_module() {
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

	@When("The user enters valid python code from excel sheet {string} and row number {int} of Linkedlist module")
	public void the_user_enters_valid_python_code_from_excel_sheet_and_row_number_of_linkedlist_module(String sheetName,
			Integer rowNumber) {
		reader = new ExcelReader();

		List<Map<String, String>> testdata = reader.getData(sheetName);

		String validCode = testdata.get(rowNumber).get("Valid code");

		dsLListPOM.linkedlistTryEditorTextarea().sendKeys(validCode);

		expectedResult = testdata.get(rowNumber).get("Result for valid code");

		LoggerLoad.info(
				"Entering valid code " + validCode + " and the corresponding expected result is : " + expectedResult);

	}

	@Then("Console should display result in LinkedList module")
	public void console_should_display_result_in_linked_list_module() {

		String result = dsLListPOM.linkedlistOutputConsole().getText();

		Assert.assertEquals(result.trim(), expectedResult, "Result is not displayed");

	}

	@Given("User is in the Creating Linked list page")
	public void user_is_in_the_creating_linked_list_page() {
		dsLListPOM.creatingLinkedListLinkInLinkedList().click();

		LoggerLoad.info("User is in Creating Linked list page");
	}

	@Given("User is in the Types of Linked list page")
	public void user_is_in_the_types_of_linked_list_page() {
		dsLListPOM.TypesOfLinkedListLinkInLinkedList().click();
	}

	@Given("User is in the Implement Linked List in Python page")
	public void user_is_in_the_implement_linked_list_in_python_page() {
		dsLListPOM.ImplementationLinkInLinkedList().click();
	}

	@Given("User is in the Traversal page")
	public void user_is_in_the_traversal_page() {
		dsLListPOM.TraversalLinkInLinkedList().click();
	}

	@Given("User is in the Insertion page")
	public void user_is_in_the_insertion_page() {
		dsLListPOM.InsertionLinkInLinkedList().click();
	}

	@Given("User is in the Deletion page")
	public void user_is_in_the_deletion_page() {
		dsLListPOM.DeletionLinkInLinkedList().click();
	}
}