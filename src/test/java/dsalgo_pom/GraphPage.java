package dsalgo_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class GraphPage {

	public GraphPage() {

		PageFactory.initElements(Webdriver_Manager.getDriver(), this);

	}

	@FindBy(xpath = "//div/h5[text() ='Graph']/..//a[text() ='Get Started']")
	private WebElement graphgetStartedBtn;

	@FindBy(xpath = "//p[@class='bg-secondary text-white']")
	private WebElement atriGraph1;

	// side panel web-elements

	@FindBy(xpath = "//a[@class='list-group-item']")

	private WebElement Graphlink;

	@FindBy(xpath = "//a[text()='Graph Representations']")
	private WebElement Grapreplink;

	@FindBy(linkText = "Practice Questions")
	private WebElement pracquest;

	// Try here Web-elements link
	@FindBy(xpath = "//*[@class='btn btn-info']")
	private WebElement tryhere;

	@FindBy(xpath = "//div[@class='input']//div/textarea")
	private WebElement tryEditorTextarea;

	@FindBy(xpath = "//*[text()='Run']")
	private WebElement run;

	@FindBy(xpath = "//div/*[@id='output']")
	private WebElement outputConsole;

	@FindBy(xpath = "//p[text()='Practice Questions']")
	private WebElement practiceQuestionsHeader;

	// attributes link

	@FindBy(xpath = "//strong/p[text()='Graph']")
	private WebElement graph2attri;

	@FindBy(xpath = "//strong/p[text()='Graph Representations']")
	private WebElement graphrepattri;

	public WebElement getGraphgetStartedBtn() {
		return graphgetStartedBtn;
	}

	public WebElement getAtriGraph1() {
		return atriGraph1;
	}

	public WebElement getGraphlink() {
		return Graphlink;
	}

	public WebElement getGrapreplink() {
		return Grapreplink;
	}

	public WebElement getPracquest() {
		return pracquest;
	}

	public WebElement getTryhere() {
		return tryhere;
	}

	public WebElement getRun() {
		return run;
	}

	public WebElement getGraph2attri() {
		return graph2attri;
	}

	public WebElement getGraphrepattri() {
		return graphrepattri;
	}

	public WebElement getTryEditorTextarea() {
		return tryEditorTextarea;
	}

	public WebElement getOutputConsole() {
		return outputConsole;
	}

	public WebElement getPracticeQuestionsHeader() {
		return practiceQuestionsHeader;
	}

}
