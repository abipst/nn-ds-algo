package dsalgo_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class ArrayPage {
	
	public ArrayPage(){
		  
		  PageFactory.initElements( Webdriver_Manager.getDriver(), this);
		  
		  }
	
	// elements in home page
	
	@FindBy ( xpath= "//*[text()='Array']/..//a[text()='Get Started']")
	private WebElement getStartedBtnForArrayPage;
	
	// elements for submodules under array page
 	
 	@FindBy ( xpath= "//a[text()='Arrays in Python']")
	private WebElement arraysInPythonLink;
 	
 	@FindBy ( xpath= "//a[text()='Arrays Using List']")
	private WebElement arraysUsingListLink;
 	
 	@FindBy ( xpath= "//a[text()='Basic Operations in Lists']")
	private WebElement basicOperationsInListsLink;
 	
 	@FindBy ( xpath= "//a[text()='Applications of Array']")
	private WebElement applicationsOfArrayLink;
 	
 	@FindBy ( xpath= "//p[text()='Arrays in Python']")
	private WebElement arraysInPythonHeader;
	
 	@FindBy ( xpath= "//p[text()='Arrays Using List']")
	private WebElement arraysUsingListHeader;
 	
 	@FindBy ( xpath= "//p[text()='Basic Operations in Lists']")
	private WebElement basicOperationsInListsHeader;
 	
 	@FindBy ( xpath= "//p[text()='Applications of Array']")
	private WebElement applicationsOfArrayHeader;
 	
 	// elements for submodules in side panel
 	
 	@FindBy ( xpath= "//li/a[text()='Arrays in Python']")
	private WebElement arraysInPythonLinkInSidepanel;
 	
 	@FindBy ( xpath= "//li/a[text()='Arrays Using List']")
	private WebElement arraysUsingListLinkInSidepanel;
 	
 	@FindBy ( xpath= "//li/a[text()='Basic Operations in Lists']")
	private WebElement basicOperationsInListsLinkInSidepanel;
 	
 	@FindBy ( xpath= "//li/a[text()='Applications of Array']")
	private WebElement applicationsOfArrayLinkInSidepanel;
 	
 	@FindBy ( xpath= "//a[text()='Practice Questions']")
	private WebElement practiceQuestionsLinkInArraySidepanel;
 	
 	// elements for submodules under practice questions
 	
  	@FindBy ( xpath= "//a[text()='Search the array']")
 	private WebElement searchTheArrayLink;
  	
  	@FindBy ( xpath= "//a[text()='Max Consecutive Ones']")
 	private WebElement maxConsecutiveOnesLink;
  	
  	@FindBy ( xpath= "//a[text()='Find Numbers with Even Number of Digits']")
 	private WebElement findNumbersWithEvenNumberOfDigitsLink;
  	
  	@FindBy ( xpath= "//a[text()='Squares of  a Sorted Array']")
 	private WebElement squaresOfaSortedArrayLink;
  	
  	// elements in try editor page
 	
 	@FindBy ( xpath= "//div[@class='input']//div/textarea")
 	private WebElement tryEditorTextarea;
 		
 	@FindBy ( xpath= "//*[text()='QUESTION']")
 	private WebElement questionHeaderInTextEditorPage;
 
	@FindBy ( xpath= "//button[text()='Run']")
	private WebElement runBtn;
 	
 	public WebElement getGetStartedBtnForArrayPage() {
		return getStartedBtnForArrayPage;
	}

	public WebElement getArraysInPythonLink() {
		return arraysInPythonLink;
	}

	public WebElement getArraysUsingListLink() {
		return arraysUsingListLink;
	}

	public WebElement getBasicOperationsInListsLink() {
		return basicOperationsInListsLink;
	}

	public WebElement getApplicationsOfArrayLink() {
		return applicationsOfArrayLink;
	}

	public WebElement getArraysInPythonHeader() {
		return arraysInPythonHeader;
	}

	public WebElement getArraysUsingListHeader() {
		return arraysUsingListHeader;
	}

	public WebElement getBasicOperationsInListsHeader() {
		return basicOperationsInListsHeader;
	}

	public WebElement getApplicationsOfArrayHeader() {
		return applicationsOfArrayHeader;
	}

	public WebElement getArraysInPythonLinkInSidepanel() {
		return arraysInPythonLinkInSidepanel;
	}

	public WebElement getArraysUsingListLinkInSidepanel() {
		return arraysUsingListLinkInSidepanel;
	}

	public WebElement getBasicOperationsInListsLinkInSidepanel() {
		return basicOperationsInListsLinkInSidepanel;
	}

	public WebElement getApplicationsOfArrayLinkInSidepanel() {
		return applicationsOfArrayLinkInSidepanel;
	}

	public WebElement getPracticeQuestionsLinkInArraySidepanel() {
		return practiceQuestionsLinkInArraySidepanel;
	}

	public WebElement getSearchTheArrayLink() {
		return searchTheArrayLink;
	}

	public WebElement getMaxConsecutiveOnesLink() {
		return maxConsecutiveOnesLink;
	}

	public WebElement getFindNumbersWithEvenNumberOfDigitsLink() {
		return findNumbersWithEvenNumberOfDigitsLink;
	}

	public WebElement getSquaresOfaSortedArrayLink() {
		return squaresOfaSortedArrayLink;
	}

	public WebElement getTryEditorTextarea() {
		return tryEditorTextarea;
	}

	public WebElement getQuestionHeaderInTextEditorPage() {
		return questionHeaderInTextEditorPage;
	}

	public WebElement getRunBtn() {
		return runBtn;
	}
}
