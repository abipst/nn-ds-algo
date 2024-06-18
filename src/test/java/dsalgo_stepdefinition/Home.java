package dsalgo_stepdefinition;

import org.testng.Assert;

import dsalgo_pom.HomePage;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Home {

	HomePage homepage = new HomePage();

	@When("The user click on data structure dropdown button")
	public void the_user_click_on_data_structure_dropdown_button() {
		homepage.getNavDropDetastruc().click();

		LoggerLoad.info("User successfully selected Data structure dropdown button");

	}

	@When("the user select any dropdown menu {string}")
	public void the_user_select_any_dropdown_menu(String options) {
		if (options.equalsIgnoreCase("Arrays")) {
			homepage.getNavDropArray().click();
			LoggerLoad.info("User clicks on Arrays dropdown button");

		} else if (options.equalsIgnoreCase("Linked List")) {

			homepage.getNavDropLinklist().click();
			LoggerLoad.info("User clicks on Link List dropdown button");

		} else if (options.equalsIgnoreCase("Stack")) {

			homepage.getNavDropstack().click();
			LoggerLoad.info("User clicks on stack dropdown button");
		}

		else if (options.equalsIgnoreCase("Queue")) {

			homepage.getNavDropQueue().click();
			LoggerLoad.info("User clicks on Queue dropdown button");

		} else if (options.equalsIgnoreCase("Tree")) {

			homepage.getNavDropTree().click();
			LoggerLoad.info("User clicks on Tree dropdown button");
		}

		else if (options.equalsIgnoreCase("Graph")) {

			homepage.getNavDropGraph().click();
			LoggerLoad.info("User clicks on Graph dropdown button");
		} else {

			LoggerLoad.warn(options + " module name is not present in the data structure dropdown.");
		}

	}

	@Then("user should get the error message {string}")
	public void user_should_get_the_error_message(String exptmsge) {

		if (exptmsge.equalsIgnoreCase("You are not logged in")) {

			boolean errmsge = homepage.getLoginerrmeth().isDisplayed();
			Assert.assertTrue(errmsge, "You are not logged in");
			String errmes1 = homepage.getLoginerrmeth().getText();
			Assert.assertEquals(errmes1, "You are not logged in", "error message is not displayes");
			LoggerLoad.info("The error message is: " + errmes1);

		} else {

			LoggerLoad.warn("Error message is not displayed on the home page");
		}
	}

	@When("the user click any of the getStarted link before sign in {string} in home page")
	public void the_user_click_any_of_the_get_started_link_before_sign_in_in_home_page(String modules) {
		if (modules.equalsIgnoreCase("Data Structures-Introduction")) {
			homepage.getDataStrucGetStart().click();
			LoggerLoad.info("User clicks on Data strucure-Introduction get started button");
		}

		else if (modules.equalsIgnoreCase("Array")) {

			homepage.getArrayGetStart().click();

			LoggerLoad.info("User clicks on Arrays get started button");

		} else if (modules.equalsIgnoreCase("Linked List")) {

			homepage.getLinklistGetStart().click();
			LoggerLoad.info("User clicks on Link List get started button");

		} else if (modules.equalsIgnoreCase("Stack")) {

			homepage.getStackGetStart().click();
			LoggerLoad.info("User clicks on stack get started button");
		}

		else if (modules.equalsIgnoreCase("Queue")) {

			homepage.getQueueGetStart().click();
			LoggerLoad.info("User clicks on Queue get started button");

		} else if (modules.equalsIgnoreCase("Tree")) {

			homepage.getTreeGetStart().click();
			LoggerLoad.info("User clicks on Tree get started button");
		}

		else if (modules.equalsIgnoreCase("Graph")) {

			homepage.getGraphGetStart().click();
			LoggerLoad.info("User clicks on Graph get started button");
		} else {

			LoggerLoad.warn(modules + " Module get started link is not present. ");
		}

	}

	@When("The user clicks on sign in button")
	public void the_user_clicks_on_sign_in_button() {
		homepage.getSignInHomBut().click();
		LoggerLoad.info("User is able to click on sign-in button");

	}

	@Then("The user should naviagtes to login page")
	public void the_user_should_naviagtes_to_login_page() {
		String getcurrenturl = Webdriver_Manager.getDriver().getCurrentUrl();
		Assert.assertEquals(getcurrenturl, "https://dsportalapp.herokuapp.com/login",
				"login page url is not displayes");

		LoggerLoad.info("Login page url is " + getcurrenturl);

	}

	@When("The user clicks on register button")
	public void the_user_clicks_on_register_button() {
		homepage.getRegisterHomBut().click();
		LoggerLoad.info("User is able to click on register button");

	}

	@Then("The user should navigates to register page")
	public void the_user_should_navigates_to_register_page() {
		String getcurrenturl = Webdriver_Manager.getDriver().getCurrentUrl();

		Assert.assertEquals(getcurrenturl, "https://dsportalapp.herokuapp.com/register",
				"register page url is not displayes");

		LoggerLoad.info("Register page url is " + getcurrenturl);

	}

	@When("The user select the modules on data structure dropdown with sign in as {string} in home page")
	public void the_user_select_the_module_on_data_structure_dropdown_with_sign_in_as_module_in_home_page(
			String options) {

		if (options.equalsIgnoreCase("Arrays")) {
			homepage.getNavDropArray().click();
			LoggerLoad.info("User navigates To Arrays dropdown module");

		} else if (options.equalsIgnoreCase("Linked List")) {
			homepage.getNavDropLinklist().click();
			LoggerLoad.info("User navigates To ink List dropdown module");

		} else if (options.equalsIgnoreCase("Stack")) {
			homepage.getNavDropstack().click();
			LoggerLoad.info("User navigates To stack dropdown module");
		}

		else if (options.equalsIgnoreCase("Queue")) {
			homepage.getNavDropQueue().click();
			LoggerLoad.info("User navigates To Queue dropdown module");

		} else if (options.equalsIgnoreCase("Tree")) {
			homepage.getNavDropTree().click();
			LoggerLoad.info("User navigates To Tree dropdown module");
		}

		else if (options.equalsIgnoreCase("Graph")) {
			homepage.getNavDropGraph().click();
			LoggerLoad.info("User navigates To Graph dropdown module");
		} else {

			LoggerLoad.warn(options + " module name is not present in the data structure dropdown.");
		}

	}

	@Then("user should navigate into {string} page")
	public void user_should_navigate_into_page(String options) {

		if (options.equalsIgnoreCase("Arrays")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(options + " module current page url is " + currentUrl);
			String textmess = homepage.getAtriArraystruc().getText();
			Assert.assertEquals(textmess, "Array", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (options.equalsIgnoreCase("Linked List")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(options + " module current page url is " + currentUrl);
			String textmess = homepage.getAtriLinkedList().getText();
			Assert.assertEquals(textmess, "Linked List", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (options.equalsIgnoreCase("Stack")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(options + " module current page url is " + currentUrl);
			String textmess = homepage.getAtriStack().getText();
			Assert.assertEquals(textmess, "Stack", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (options.equalsIgnoreCase("Queue")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(options + " module current page url is " + currentUrl);
			String textmess = homepage.getAtriQueue().getText();
			Assert.assertEquals(textmess, "Queue", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (options.equalsIgnoreCase("Tree")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(options + " module current page url is " + currentUrl);
			String textmess = homepage.getAtriTree().getText();
			Assert.assertEquals(textmess, "Tree", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (options.equalsIgnoreCase("Graph")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(options + " module current page url is " + currentUrl);
			String textmess = homepage.getAtriGraph().getText();
			Assert.assertEquals(textmess, "Graph", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		}

	}

	@When("The user clicks any of the getStarted link with sign in {string} module in home page")
	public void the_user_clicks_any_of_the_get_started_link_with_sign_in_module_in_home_page(String modules) {

		if (modules.equalsIgnoreCase("Data Structures-Introduction")) {
			homepage.getDataStrucGetStart().click();
			LoggerLoad.info("User navigates To Data strucure-Introduction module page");
		}

		else if (modules.equalsIgnoreCase("Array")) {
			homepage.getArrayGetStart().click();
			LoggerLoad.info("User navigates To Array module page");

		} else if (modules.equalsIgnoreCase("Linked List")) {

			homepage.getLinklistGetStart().click();
			LoggerLoad.info("User navigates To Linked List module page");

		} else if (modules.equalsIgnoreCase("Stack")) {

			homepage.getStackGetStart().click();
			LoggerLoad.info("User navigates To Stack module page");
		}

		else if (modules.equalsIgnoreCase("Queue")) {

			homepage.getQueueGetStart().click();
			LoggerLoad.info("User navigates To Queue module page");

		} else if (modules.equalsIgnoreCase("Tree")) {

			homepage.getTreeGetStart().click();
			LoggerLoad.info("User navigates To Tree module page");
		}

		else if (modules.equalsIgnoreCase("Graph")) {

			homepage.getGraphGetStart().click();
			LoggerLoad.info("User navigates To Graph module page");
		} else {

			LoggerLoad.warn(modules + " Module get started link is not present. ");
		}

	}

	@Then("user should navigate into respective {string} page")
	public void user_should_navigate_into_respective_page(String modules) {

		if (modules.equalsIgnoreCase("Data Structures-Introduction")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(modules + "module current page url is " + currentUrl);
			String textmess = homepage.getAtriDataStruc().getText();
			Assert.assertEquals(textmess, "Data Structures-Introduction",
					"Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (modules.equalsIgnoreCase("Array")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(modules + "module current page url is " + currentUrl);
			String textmess = homepage.getAtriArraystruc().getText();
			Assert.assertEquals(textmess, "Array", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (modules.equalsIgnoreCase("Linked List")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(modules + "module current page url is " + currentUrl);
			String textmess = homepage.getAtriLinkedList().getText();
			Assert.assertEquals(textmess, "Linked List", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (modules.equalsIgnoreCase("Stack")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(modules + "module current page url is " + currentUrl);
			String textmess = homepage.getAtriStack().getText();
			Assert.assertEquals(textmess, "Stack", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (modules.equalsIgnoreCase("Queue")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(modules + "module current page url is " + currentUrl);
			String textmess = homepage.getAtriQueue().getText();
			Assert.assertEquals(textmess, "Queue", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (modules.equalsIgnoreCase("Tree")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(modules + "module current page url is " + currentUrl);
			String textmess = homepage.getAtriTree().getText();
			Assert.assertEquals(textmess, "Tree", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		} else if (modules.equalsIgnoreCase("Graph")) {
			String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			LoggerLoad.info(modules + "module current page url is " + currentUrl);
			String textmess = homepage.getAtriGraph().getText();
			Assert.assertEquals(textmess, "Graph", "Respective get started module page is not visible");
			LoggerLoad.info("current page module is " + textmess);
		}

	}

}
