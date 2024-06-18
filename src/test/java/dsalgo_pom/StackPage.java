package dsalgo_pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class StackPage {

	public StackPage() {
		PageFactory.initElements(Webdriver_Manager.getDriver(), this);

	}

	@FindBy(xpath = "//button[text()='Get Started']")
	private WebElement getStartedBtn;

	@FindBy(xpath = "//h5[text()=\"Stack\"]//../a")
	private WebElement getStartedBtnForStackPage;

	// Stack headers

	@FindBy(xpath = "//h4[text()=\"Stack\"]")
	private WebElement stackHeaderPresent;

	@FindBy(xpath = "//*[text()=\"Topics Covered\"]")
	private WebElement stktopicsCoveredSubHeaderPresent;

	// Subcomponents headers

	@FindBy(xpath = "//p[text()=\"Operations in Stack\"]")
	private WebElement operationsInStackHeaderPresent;

	@FindBy(xpath = "//p[text()=\"Implementation\"]")
	private WebElement implementationHeaderPresent;

	@FindBy(xpath = "//p[text()=\"Applications\"]")
	private WebElement applicationHeaderPresent;

	@FindBy(xpath = "//p[text()='Practice Questions']")
	private WebElement practiceQuestionsHeader;

	// Stack page Links
	@FindBy(tagName = "a")
	public List<WebElement> StackPageLinks;

	// Submodules link in Stack page

	@FindBy(xpath = "//a[text()=\"Operations in Stack\"]")
	private WebElement operationsInStackLink;

	@FindBy(xpath = "//a[text()=\"Implementation\"]")
	private WebElement implementationLink;

	@FindBy(xpath = "//a[text()=\"Applications\"]")
	private WebElement applicationsLink;

	// Stack page side panel links

	@FindBy(xpath = "//a[text()=\"Operations in Stack\"]")
	private WebElement operationsInStackSidePanel;

	@FindBy(xpath = "//a[text()=\"Implementation\"]")
	private WebElement implementationSidePanel;

	@FindBy(xpath = "//a[text()=\"Applications\"]")
	private WebElement applicationsSidePanel;

	@FindBy(xpath = "//*[text()=\"Practice Questions\"]")
	private WebElement practicequestionsSidePanel;

	@FindBy(xpath = "//a[contains(text(),'Try here')]")
	private WebElement stackTryHereBtn;

	@FindBy(xpath = "//div[@class='input']//div/textarea")
	private WebElement stackTryEditorTextarea;

	@FindBy(xpath = "//div/*[@id='output']")
	private WebElement stackOutputConsole;

	@FindBy(xpath = "//button[text()='Run']")
	private WebElement stackRunBtn;

	
	// Practice Questions
	@FindBy ( xpath= "//p[text()='Practice Questions']")
	private WebElement StkpracticeQuestionsHeader;

	
	// creating getter methods to access private web elements outside the method

	// Get Started button

	public WebElement getStartedBtn() {
		return getStartedBtn;
	}

	public WebElement getStartedBtnForStackPage() {
		return getStartedBtnForStackPage;
	}

	// Stack Headers
	public WebElement stackHeaderPresent() {
		return stackHeaderPresent;
	}

	public WebElement stktopicsCoveredSubHeaderPresent() {
		return stktopicsCoveredSubHeaderPresent;
	}

	// Submodules header

	public WebElement operationsInStackHeaderPresent() {
		return operationsInStackHeaderPresent;
	}

	public WebElement implementationHeaderPresent() {
		return implementationHeaderPresent;
	}

	public WebElement applicationHeaderPresent() {
		return applicationHeaderPresent;
	}

	public WebElement practiceQuestionsHeader() {
		return practiceQuestionsHeader;
	}

	// StackPage links
	public List<WebElement> StackPageLinks() {
		return StackPageLinks;
	}

	// Submodules link in Stack page

	public WebElement operationsInStackLink() {
		return operationsInStackLink;
	}

	public WebElement implementationLink() {
		return implementationLink;
	}

	public WebElement applicationsLink() {
		return applicationsLink;
	}

	// Stack page side panel links

	public WebElement operationsInStackSidePanelLink() {
		return operationsInStackSidePanel;
	}

	public WebElement implementationSidePanelLink() {
		return implementationSidePanel;
	}

	public WebElement applicapplicationsSidePanelLink() {
		return applicationsSidePanel;
	}

	public WebElement practicequestionsSidePanelLink() {
		return practicequestionsSidePanel;
	}

	public WebElement stackTryHereBtn() {
		return stackTryHereBtn;
	}

	public WebElement stackTryEditorTextarea() {
		return stackTryEditorTextarea;
	}

	public WebElement stackOutputConsole() {
		return stackOutputConsole;
	}

	public WebElement stackRunBtn() {
		return stackRunBtn;
	}
	
	//Practice Question
	public WebElement StkpracticeQuestionsHeader() {
		return StkpracticeQuestionsHeader;
	}
	}
