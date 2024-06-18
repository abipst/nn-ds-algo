package dsalgo_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class HomePage {

	public HomePage() {

		PageFactory.initElements(Webdriver_Manager.getDriver(), this);

	}

	// drop-down navigation web-elements

	@FindBy(xpath = "//a[@class='nav-link dropdown-toggle']")
	private WebElement navDropDetastruc;

	@FindBy(linkText = "Arrays")
	private WebElement navDropArray;

	@FindBy(linkText = "Linked List")
	private WebElement navDropLinklist;

	@FindBy(linkText = "Stack")
	private WebElement navDropstack;

	@FindBy(linkText = "Queue")
	private WebElement navDropQueue;

	@FindBy(linkText = "Tree")
	private WebElement navDropTree;

	@FindBy(linkText = "Graph")
	private WebElement navDropGraph;

	// Error message web elements
	@FindBy(xpath = "//*[@class ='alert alert-primary']")
	private WebElement loginerrmeth;

	@FindBy(xpath = "//*[@class ='alert alert-primary']")
	private WebElement loginalertmes;

	// Home page get started links

	@FindBy(xpath = "//*[text() ='Data Structures-Introduction']/..//a[text() ='Get Started']")
	private WebElement dataStrucGetStart;

	@FindBy(xpath = "//div/h5[text() ='Array']/..//a[text() ='Get Started']")
	private WebElement arrayGetStart;

	@FindBy(xpath = "//div/h5[text() ='Linked List']/..//a[text() ='Get Started']")
	private WebElement LinklistGetStart;

	@FindBy(xpath = "//div/h5[text() ='Stack']/..//a[text() ='Get Started']")
	private WebElement stackGetStart;

	@FindBy(xpath = "//div/h5[text() ='Queue']/..//a[text() ='Get Started']")
	private WebElement queueGetStart;

	@FindBy(xpath = "//div/h5[text() ='Tree']/..//a[text() ='Get Started']")
	private WebElement treeGetStart;

	@FindBy(xpath = "//div/h5[text() ='Graph']/..//a[text() ='Get Started']")
	private WebElement graphGetStart;

	// Register @ Sign-in web elements

	@FindBy(linkText = "Register")
	private WebElement registerHomBut;

	@FindBy(linkText = "Sign in")
	private WebElement SignInHomBut;

	// Each module web-elements attributes locators

	@FindBy(xpath = "//div/h4[@class='bg-secondary text-white']")
	private WebElement atriDataStruc;

	@FindBy(xpath = "//div/h4[@class='bg-secondary text-white']")
	private WebElement atriArraystruc;

	@FindBy(xpath = "//div/h4[@class='bg-secondary text-white']")
	private WebElement atriLinkedList;

	@FindBy(xpath = "//div/h4[@class='bg-secondary text-white']")
	private WebElement atriStack;

	@FindBy(xpath = "//div/h4[@class='bg-secondary text-white']")
	private WebElement atriQueue;
	@FindBy(xpath = "//div/h4[@class='bg-secondary text-white']")
	private WebElement atriTree;
	@FindBy(xpath = "//div/h4[@class='bg-secondary text-white']")
	private WebElement atriGraph;

	public WebElement getNavDropDetastruc() {
		return navDropDetastruc;
	}

	public WebElement getNavDropArray() {
		return navDropArray;
	}

	public WebElement getNavDropLinklist() {
		return navDropLinklist;
	}

	public WebElement getNavDropstack() {
		return navDropstack;
	}

	public WebElement getNavDropQueue() {
		return navDropQueue;
	}

	public WebElement getNavDropTree() {
		return navDropTree;
	}

	public WebElement getNavDropGraph() {
		return navDropGraph;
	}

	public WebElement getLoginerrmeth() {
		return loginerrmeth;
	}

	public WebElement getLoginalertmes() {
		return loginalertmes;
	}

	public WebElement getDataStrucGetStart() {
		return dataStrucGetStart;
	}

	public WebElement getArrayGetStart() {
		return arrayGetStart;
	}

	public WebElement getLinklistGetStart() {
		return LinklistGetStart;
	}

	public WebElement getStackGetStart() {
		return stackGetStart;
	}

	public WebElement getQueueGetStart() {
		return queueGetStart;
	}

	public WebElement getTreeGetStart() {
		return treeGetStart;
	}

	public WebElement getGraphGetStart() {
		return graphGetStart;
	}

	public WebElement getRegisterHomBut() {
		return registerHomBut;
	}

	public WebElement getSignInHomBut() {
		return SignInHomBut;
	}

	public WebElement getAtriDataStruc() {
		return atriDataStruc;
	}

	public WebElement getAtriArraystruc() {
		return atriArraystruc;
	}

	public WebElement getAtriLinkedList() {
		return atriLinkedList;
	}

	public WebElement getAtriStack() {
		return atriStack;
	}

	public WebElement getAtriQueue() {
		return atriQueue;
	}

	public WebElement getAtriTree() {
		return atriTree;
	}

	public WebElement getAtriGraph() {
		return atriGraph;
	}

}
