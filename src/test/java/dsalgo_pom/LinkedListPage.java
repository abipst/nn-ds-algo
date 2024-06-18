package dsalgo_pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class LinkedListPage {

	public LinkedListPage() {
		PageFactory.initElements(Webdriver_Manager.getDriver(), this);

	}

	@FindBy(xpath = "//button[text()='Get Started']")
	private WebElement getStartedBtn;

	@FindBy(linkText = "Sign in")
	private WebElement signinBtn;

//sign in page elements

	@FindBy(id = "id_username")
	private WebElement usernameBox;

	@FindBy(id = "id_password")
	private WebElement passwordBox;

	@FindBy(xpath = "//input[@type='submit']")
	private WebElement loginBtn;

	// Linkedlist page

	@FindBy(xpath = "//h5[text()='Linked List']/..//a[text()='Get Started']")
	private WebElement getStartedBtnForLinkedListPage;

	@FindBy(xpath = "//h4[text()=\"Linked List\"]")
	private WebElement linkedListHeader;

	@FindBy(xpath = "//*[text()=\"Topics Covered\"]")
	private WebElement topicsCoveredHeader;

	// @FindBy(xpath = "//*[text()=\"Introduction\"]")
	// private WebElement linkedListIntroduction_link;

	@FindBy(tagName = "a")
	public List<WebElement> linkedListPageLinks;

	// Linkedlist page side panel links

	@FindBy(xpath = "//a[text()=\"Introduction\"]")
	private WebElement introductionSidePanelInLinkedList;

	@FindBy(xpath = "//a[text()=\"Creating Linked LIst\"]")
	private WebElement CreatingLinkedListSidePanelInLinkedList;

	@FindBy(xpath = "//a[text()=\"Types of Linked List\"]")
	private WebElement TypesofLinkedListSidePanelInLinkedList;

	@FindBy(xpath = "//a[text()=\"Implement Linked List in Python\"]")
	private WebElement ImplementLinkedListPythonSidePanelInLinkedList;

	@FindBy(xpath = "//a[text()=\"Traversal\"]")
	private WebElement TraversalSidePanelInLinkedList;

	@FindBy(xpath = "//a[text()=\"Insertion\"]")
	private WebElement InsertionSidePanelInLinkedList;

	@FindBy(xpath = "//a[text()=\"Deletion\"]")
	private WebElement DeletionSidePanelInLinkedList;

	@FindBy(xpath = "//*[text()=\"Practice Questions\"]")
	private WebElement PracticeQuestionsSidePanelInLinkedList;

	// Submodules link

	@FindBy(xpath = "//a[text()=\"Introduction\"]")
	private WebElement introductionLinkInLinkedList;

	@FindBy(xpath = "//a[text()=\"Creating Linked LIst\"]")
	private WebElement creatingLinkedListLinkInLinkedList;

	@FindBy(xpath = "//a[text()=\"Types of Linked List\"]")
	private WebElement TypesOfLinkedListLinkInLinkedList;

	@FindBy(xpath = "//a[text()=\"Implement Linked List in Python\"]")
	private WebElement ImplementationLinkInLinkedList;

	@FindBy(xpath = "//a[text()=\"Traversal\"]")
	private WebElement TraversalLinkInLinkedList;

	@FindBy(xpath = "//a[text()=\"Insertion\"]")
	private WebElement InsertionLinkInLinkedList;

	@FindBy(xpath = "//a[text()=\"Deletion\"]")
	private WebElement DeletionLinkInLinkedList;

	// Subcomponents headers

	@FindBy(xpath = "//p[text()=\"Introduction\"]")
	private WebElement introductionPageHeaderInLinkedList;

	@FindBy(xpath = "//p[text()=\"Creating Linked LIst\"]")
	private WebElement CreatingLinkedListPageHeaderInLinkedList;

	@FindBy(xpath = "//p[text()=\"Types of Linked List\"]")
	private WebElement TypesofLinkedListPageHeaderInLinkedList;

	@FindBy(xpath = "//p[text()=\"Implement Linked List in Python\"]")
	private WebElement ImplementLinkedListInPythonPageHeaderInLinkedList;

	@FindBy(xpath = "//p[text()=\"Traversal\"]")
	private WebElement TraversalPageHeaderInLinkedList;

	@FindBy(xpath = "//p[text()=\"Insertion\"]")
	private WebElement InsertionPageHeaderInLinkedList;

	@FindBy(xpath = "//p[text()=\"Deletion\"]")
	private WebElement DeletionPageHeaderInLinkedList;

	@FindBy(xpath = "//p[text()=\"Practice Questions\"]")
	private WebElement PracticeQuestionsPageHeaderInLinkedList;

	// elements in try editor page

	@FindBy(xpath = "//a[contains(text(),'Try here')]")
	private WebElement linkedlistTryHereBtn;

	@FindBy(xpath = "//div[@class='input']//div/textarea")
	private WebElement linkedlistTryEditorTextarea;

	@FindBy(xpath = "//div/*[@id='output']")
	private WebElement linkedlistOutputConsole;

	@FindBy(xpath = "//button[text()='Run']")
	private WebElement linkedlistRunBtn;

//creating getter methods to access private web elements outside the method

//Get Started button
	public WebElement getStartedBtn() {
		return getStartedBtn;
	}

//SignIn button
	public WebElement signInBtn() {
		return signinBtn;

	}

	public WebElement getUsernameBox() {
		return usernameBox;
	}

	public WebElement getPasswordBox() {
		return passwordBox;
	}

	public WebElement getLoginBtn() {
		return loginBtn;
	}

	// LinkedList page GetStartedBtn
	public WebElement getStartedBtnForLinkedListPage() {
		return getStartedBtnForLinkedListPage;
	}

	// LinkedList page
	public WebElement linkedListHeader() {
		return linkedListHeader;
	}

	public WebElement topicsCoveredHeader() {
		return topicsCoveredHeader;
	}

	public List<WebElement> linkedListPageLinks() {
		return linkedListPageLinks;
	}

	// Linkedlist Introduction Page
	// public WebElement linkedListIntroduction_link() {
	// return linkedListIntroduction_link;
	// }

	// Linkedlist page side panel links

	public WebElement introductionSidePanelInLinkedList() {
		return introductionSidePanelInLinkedList;
	}

	public WebElement CreatingLinkedListSidePanelInLinkedList() {
		return CreatingLinkedListSidePanelInLinkedList;
	}

	public WebElement TypesofLinkedListSidePanelInLinkedList() {
		return TypesofLinkedListSidePanelInLinkedList;
	}

	public WebElement ImplementLinkedListPythonSidePanelInLinkedList() {
		return ImplementLinkedListPythonSidePanelInLinkedList;
	}

	public WebElement TraversalSidePanelInLinkedList() {
		return TraversalSidePanelInLinkedList;
	}

	public WebElement InsertionSidePanelInLinkedList() {
		return InsertionSidePanelInLinkedList;
	}

	public WebElement DeletionSidePanelInLinkedList() {
		return DeletionSidePanelInLinkedList;
	}

	public WebElement PracticeQuestionsSidePanelInLinkedList() {
		return PracticeQuestionsSidePanelInLinkedList;
	}

	// submodules links

	public WebElement introductionLinkInLinkedList() {
		return introductionLinkInLinkedList;
	}

	public WebElement creatingLinkedListLinkInLinkedList() {
		return creatingLinkedListLinkInLinkedList;
	}

	public WebElement TypesOfLinkedListLinkInLinkedList() {
		return TypesOfLinkedListLinkInLinkedList;
	}

	public WebElement ImplementationLinkInLinkedList() {
		return ImplementationLinkInLinkedList;
	}

	public WebElement TraversalLinkInLinkedList() {
		return TraversalLinkInLinkedList;
	}

	public WebElement InsertionLinkInLinkedList() {
		return InsertionLinkInLinkedList;
	}

	public WebElement DeletionLinkInLinkedList() {
		return DeletionLinkInLinkedList;
	}

	// Subcomponents headers

	public WebElement introductionPageHeaderInLinkedList() {
		return introductionPageHeaderInLinkedList;
	}

	public WebElement CreatingLinkedListPageHeaderInLinkedList() {
		return CreatingLinkedListPageHeaderInLinkedList;
	}

	public WebElement TypesofLinkedListPageHeaderInLinkedList() {
		return TypesofLinkedListPageHeaderInLinkedList;
	}

	public WebElement ImplementLinkedListInPythonPageHeaderInLinkedList() {
		return ImplementLinkedListInPythonPageHeaderInLinkedList;
	}

	public WebElement TraversalPageHeaderInLinkedList() {
		return TraversalPageHeaderInLinkedList;
	}

	public WebElement InsertionPageHeaderInLinkedList() {
		return InsertionPageHeaderInLinkedList;
	}

	public WebElement DeletionPageHeaderInLinkedList() {
		return DeletionPageHeaderInLinkedList;
	}

	public WebElement PracticeQuestionsPageHeaderInLinkedList() {
		return PracticeQuestionsPageHeaderInLinkedList;
	}

	// Tryhere editor page
	public WebElement linkedlistTryHereBtn() {
		return linkedlistTryHereBtn;
	}

	public WebElement linkedlistTryEditorTextarea() {
		return linkedlistTryEditorTextarea;
	}

	public WebElement linkedlistRunBtn() {
		return linkedlistRunBtn;
	}

	public WebElement linkedlistOutputConsole() {
		return linkedlistOutputConsole;
	}
}