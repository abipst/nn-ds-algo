package dsalgo_stepdefinition;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.Platform;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import dsalgo_pom.GraphPage;
import dsalgo_utilities.ExcelReader;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.*;

public class Graph {
	GraphPage graphpage = new GraphPage();
	ExcelReader reader = new ExcelReader();
	private String expectedResult;

	@Given("The user clicks on Graph get started link and navigated to graph page1")
	public void the_user_clicks_on_graph_get_started_link_and_navigated_to_graph_page1() {
		graphpage.getGraphgetStartedBtn().click();
		LoggerLoad.info("User navigates To Graph module page");

	}

	@When("The User clicks on the Graph hyperlink which is available on the Graph page1 side panel")
	public void the_user_clicks_on_the_graph_hyperlink_which_is_available_on_the_graph_page1_side_panel() {
		graphpage.getGraphlink().click();
		LoggerLoad.info("User navigates To another graph page");

	}

	@Then("The user should able to navigate into another Graph page from current Graph page")
	public void the_user_should_able_to_navigate_into_another_graph_page_from_current_grpah_page() {
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		LoggerLoad.info("Graph module current page url is " + currentUrl);
		String textmess = graphpage.getAtriGraph1().getText();
		Assert.assertEquals(textmess, "Graph", "Graph current page is not visible");
		LoggerLoad.info("Graph module current page is:" + textmess);

	}

	@Then("The user should able to capture the Graph page2 attribute")
	public void the_user_should_able_to_capture_the_graph_page2_attribute() {
		String textmess = graphpage.getAtriGraph1().getText();
		Assert.assertEquals(textmess, "Graph", "Graph current page is not visible");
		LoggerLoad.info("Graph module current page header is: " + textmess);

	}

	@Given("user is navigated from graph page1 to the Graph page2")
	public void user_is_naviagted_from_graph_page1_to_the_graph_page2() {
		graphpage.getGraphlink().click();
		LoggerLoad.info("User navigated to another graph page");

	}

	@When("The user click on Grpah page2 Try here navigation button")
	public void the_user_click_on_grpah_page2_try_here_navigation_button() {
		graphpage.getTryhere().click();
		LoggerLoad.info("User navigated from current page to TryEditor page");

	}

	@Then("The user should able to navigate into Try Editor text box field")
	public void the_user_should_able_to_navigate_into_grpah_page2_try_editor_text_box_field() {
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		LoggerLoad.info("Graph module TryEditor page url is " + currentUrl);
		boolean tryEditorTextareaEnabled = graphpage.getTryEditorTextarea().isEnabled();
		Assert.assertTrue(tryEditorTextareaEnabled, "TryEditor textarea is not enabled");
		LoggerLoad.info("TryEditor textarea is enabled");

	}

	@When("The user enters invalid python code from excel sheet {string} and row number {int} into the text box")
	public void the_user_enters_invalid_python_code_from_excel_sheet_and_row_number_into_the_text_box(String sheetName,
			Integer rowNumber) {

		List<Map<String, String>> testdata = reader.getData(sheetName);

		String invalidCode = testdata.get(rowNumber).get("Invalid code");

		Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		graphpage.getTryEditorTextarea().sendKeys(Keys.chord(cmdCtrl, "a", Keys.DELETE));

		graphpage.getTryEditorTextarea().sendKeys(invalidCode);

		LoggerLoad.info("Entering invalid python code " + invalidCode);

	}

	@When("The user clicks the Run button")
	public void the_user_clicks_the_run_button() {
		graphpage.getRun().click();
		LoggerLoad.info("User clicks on run button");
	}

	@Then("The user should see an alert")
	public void the_user_should_see_an_alert() {
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

	@When("The user enters valid python code from excel sheet {string} and row number {int} into the text box")
	public void the_user_enters_valid_python_code_from_excel_sheet_and_row_number_into_the_text_box(String sheetName,
			Integer rowNumber) {

		List<Map<String, String>> testdata = reader.getData(sheetName);

		String validCode = testdata.get(rowNumber).get("Valid code");

		Keys cmdCtrl = Platform.getCurrent().is(Platform.MAC) ? Keys.COMMAND : Keys.CONTROL;

		try {
			Thread.sleep(1000);

		} catch (InterruptedException e) {

			e.printStackTrace();
		}

		graphpage.getTryEditorTextarea().sendKeys(Keys.chord(cmdCtrl, "a", Keys.DELETE));

		graphpage.getTryEditorTextarea().sendKeys(validCode);

		expectedResult = testdata.get(rowNumber).get("Result for valid code");

		LoggerLoad.info(
				"Entering valid code " + validCode + " and the corresponding expected result is : " + expectedResult);

	}

	@Then("The user should able to get the output on the console")
	public void the_user_should_able_to_get_the_output_on_the_console() {
		String result = graphpage.getOutputConsole().getText();

		Assert.assertEquals(result.trim(), expectedResult, "Result is not displayed");
		LoggerLoad.info("The output console display the result as: " + result);

	}

	@When("The user clicks on Graph Representations link which is available on the Graph page1 side panel")
	public void the_user_clicks_on_graph_representations_link_which_is_available_on_the_graph_page1_side_panel() {
		graphpage.getGrapreplink().click();
		LoggerLoad.info("User navigates To Graph Representations page from graph page");

	}

	@Then("The user should able to navigate into Graph Representations page")
	public void the_user_should_able_to_navigate_into_graph_representations_page() {

		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		LoggerLoad.info("Graph module current page url is " + currentUrl);

	}

	@Then("The user should able to capture Graph Representations page attribute")
	public void the_user_should_able_to_capture_graph_representations_page_attribute() {
		String textmess = graphpage.getGraphrepattri().getText();
		Assert.assertEquals(textmess, "Graph Representations", "Graph Representations current page is not visible");
		LoggerLoad.info("Graph representation page shows the text as: " + textmess);

	}

	@Given("user is on graph representation page")
	public void user_is_on_graph_representation_page() {
		graphpage.getGrapreplink().click();
		LoggerLoad.info("User navigates To Graph Representations page from graph page");

	}

	@When("The user clicks on practice questions {string} link")
	public void the_user_clicks_on_practice_questions__link(String subModuleName) {

		if (subModuleName.equalsIgnoreCase("practice questions")) {

			graphpage.getPracquest().click();

			LoggerLoad.info("User clicks on practice questions link on the side panel ");

		} else {

			LoggerLoad
					.warn("Submodule name entered is not present in data structure intro side panel " + subModuleName);
		}

	}

	@Then("The user should able to navigate into practice questions {string} page")
	public void the_user_should_able_to_navigate_into_practice_questions_page(String subModuleName) {
		if (subModuleName.equalsIgnoreCase("practice questions")) {

			String practiceQuestionsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();

			Assert.assertEquals(practiceQuestionsPageUrl, "https://dsportalapp.herokuapp.com/graph/practice",
					"Practice Questions page is not displayed");

			String practiceQuestionsPageTitle = Webdriver_Manager.getDriver().getTitle();

			Assert.assertEquals(practiceQuestionsPageTitle, "Practice Questions",
					"Practice Questions page is not displayed");

			boolean practiceQuestionsHeaderPresent = graphpage.getPracticeQuestionsHeader().isDisplayed();

			Assert.assertTrue(practiceQuestionsHeaderPresent,
					"Practice Questions header is not displayed in practice questions page");

		} else {

			Assert.fail("Entering invalid page name " + subModuleName);

		}

	}

}
