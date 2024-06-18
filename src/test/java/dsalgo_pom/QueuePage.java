package dsalgo_pom;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class QueuePage {

	public QueuePage() {
		PageFactory.initElements(Webdriver_Manager.getDriver(), this);

	}

	@FindBy(xpath = "//h5[text()=\"Queue\"]//../a")
	private WebElement getStartedBtnForQueuePage;

	@FindBy(tagName = "a")
	public List<WebElement> QueuePageLinks;

	// Queue headers

	@FindBy(xpath = "//h4[text()=\"Queue\"]")
	private WebElement queueHeaderPresent;

	@FindBy(xpath = "//p[text()=\"Topics Covered\"]")
	private WebElement qtpcsCvrdSubHeaderPresent;

	// Submodules link in Queue page

	@FindBy(xpath = "//a[text()=\"Implementation of Queue in Python\"]")
	private WebElement impQueueLink;

	@FindBy(xpath = "//a[text()=\"Implementation using collections.deque\"]")
	private WebElement impcollectionsLink;

	@FindBy(xpath = "//a[text()=\"Implementation using array\"]")
	private WebElement imparrayLink;

	@FindBy(xpath = "//a[text()=\"Queue Operations\"]")
	private WebElement queueOpLink;

	// Queue Side Panel

	@FindBy(xpath = "//a[text()=\"Implementation of Queue in Python\"]")
	private WebElement impQueueSideLink;

	@FindBy(xpath = "//a[text()=\"Implementation using collections.deque\"]")
	private WebElement impcollectionsSideLink;

	@FindBy(xpath = "//a[text()=\"Implementation using array\"]")
	private WebElement imparrayLinkSideLink;

	@FindBy(xpath = "//a[text()=\"Queue Operations\"]")
	private WebElement QopSideLink;

	@FindBy(xpath = "//*[text()=\"Practice Questions\"]")
	private WebElement practicequeSidePanel;

	@FindBy(xpath = "//p[text()='Practice Questions']")
	private WebElement practiceQuestionsHeader;

	// Try Here

	@FindBy(xpath = "//a[contains(text(),'Try here')]")
	private WebElement queueTryHereBtn;

	@FindBy(xpath = "//div[@class='input']//div/textarea")
	private WebElement queueTryEditorTextarea;

	@FindBy(xpath = "//div/*[@id='output']")
	private WebElement queueOutputConsole;

	@FindBy(xpath = "//button[text()='Run']")
	private WebElement queueRunBtn;

	// submodules headers

	@FindBy(xpath = "//p[text()=\"Implementation of Queue in Python\"]")
	private WebElement impQHeaderPresent;

	@FindBy(xpath = "//p[text()=\"Implementation using collections.deque\"]")
	private WebElement impcollecHeaderPresent;

	@FindBy(xpath = "//p[text()=\"Implementation using array\"]")
	private WebElement imparrayHeaderPresent;

	@FindBy(xpath = "//p[text()=\"Queue Operations\"]")
	private WebElement QopHeaderPresent;

	// creating getter methods to access private web elements outside the method

	// Get Started button

	public WebElement getStartedBtnForQueuePage() {
		return getStartedBtnForQueuePage;
	}

	public List<WebElement> QueuePageLinks() {
		return QueuePageLinks;
	}

	public WebElement queueHeaderPresent() {
		return queueHeaderPresent;
	}

	public WebElement qtpcsCvrdSubHeaderPresent() {
		return qtpcsCvrdSubHeaderPresent;
	}

	public WebElement impQueueLink() {
		return impQueueLink;
	}

	public WebElement impcollectionsLink() {
		return impcollectionsLink;
	}

	public WebElement imparrayLink() {
		return imparrayLink;
	}

	public WebElement queueOpLink() {
		return queueOpLink;
	}
	// Queue page side panel links

	public WebElement impQueueSideLink() {
		return impQueueSideLink;
	}

	public WebElement impcollectionsSideLink() {
		return impcollectionsSideLink;
	}

	public WebElement imparrayLinkSideLink() {
		return imparrayLinkSideLink;
	}

	public WebElement QopSideLink() {
		return QopSideLink;
	}

	public WebElement practicequeSidePanel() {
		return practicequeSidePanel;
	}

	public WebElement practiceQuestionsHeader() {
		return practiceQuestionsHeader;
	}

	// Try here

	public WebElement queueTryHereBtn() {
		return queueTryHereBtn;
	}

	public WebElement queueTryEditorTextarea() {
		return queueTryEditorTextarea;
	}

	public WebElement queueOutputConsole() {
		return queueOutputConsole;
	}

	public WebElement queueRunBtn() {
		return queueRunBtn;
	}

	// Queue Subcomponents headers

	public WebElement impQHeaderPresent() {
		return impQHeaderPresent;
	}

	public WebElement impcollecHeaderPresent() {
		return impcollecHeaderPresent;
	}

	public WebElement imparrayHeaderPresent() {
		return imparrayHeaderPresent;
	}

	public WebElement QopHeaderPresent() {
		return QopHeaderPresent;
	}

}
