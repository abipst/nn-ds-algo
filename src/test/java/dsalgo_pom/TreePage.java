package dsalgo_pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import dsalgo_webdriver_manager.Webdriver_Manager;

public class TreePage {

	public TreePage(){
		  
		  PageFactory.initElements( Webdriver_Manager.getDriver(), this);
		  
		  }
	
	// elements in home page
	
	@FindBy ( xpath= "//*[text()='Tree']/..//a[text()='Get Started']")
	private WebElement getStartedBtnForTreePage;
	
	// elements for submodules under tree page
	
	@FindBy ( xpath= "//a[text()='Overview of Trees']")
	private WebElement overviewOfTreesLink;
	
	@FindBy ( xpath= "//a[text()='Terminologies']")
	private WebElement terminologiesLink;
	
	@FindBy ( xpath= "//a[text()='Types of Trees']")
	private WebElement typesOfTreesLink;
	
	@FindBy ( xpath= "//a[text()='Tree Traversals']")
	private WebElement treeTraversalsLink;
	
	@FindBy ( xpath= "//a[text()='Traversals-Illustration']")
	private WebElement traversalsIllustrationLink;
	
	@FindBy ( xpath= "//a[text()='Binary Trees']")
	private WebElement binaryTreesLink;
	
	@FindBy ( xpath= "//a[text()='Types of Binary Trees']")
	private WebElement typesOfBinaryTreesLink;
	
	@FindBy ( xpath= "//a[text()='Implementation in Python']")
	private WebElement implementationInPythonLink;
	
	@FindBy ( xpath= "//a[text()='Binary Tree Traversals']")
	private WebElement binaryTreeTraversalsLink;
	
	@FindBy ( xpath= "//a[text()='Implementation of Binary Trees']")
	private WebElement implementationOfBinaryTreesLink;
	
	@FindBy ( xpath= "//a[text()='Applications of Binary trees']")
	private WebElement applicationsOfBinaryTreesLink;
	
	@FindBy ( xpath= "//a[text()='Binary Search Trees']")
	private WebElement binarySearchTreesLink;
	
	@FindBy ( xpath= "//a[text()='Implementation Of BST']")
	private WebElement implementationOfBSTLink;
	
	// elements for headers of submodules under tree page
	
	@FindBy ( xpath= "//p[text()='Overview of Trees']")
	private WebElement overviewOfTreesHeader;
	
	@FindBy ( xpath= "//p[text()='Terminologies']")
	private WebElement terminologiesHeader;
	
	@FindBy ( xpath= "//p[text()='Types of Trees']")
	private WebElement typesOfTreesHeader;
	
	@FindBy ( xpath= "//p[text()='Tree Traversals']")
	private WebElement treeTraversalsHeader;
	
	@FindBy ( xpath= "//p[text()='Traversals-Illustration']")
	private WebElement traversalsIllustrationHeader;
	
	@FindBy ( xpath= "//p[text()='Binary Trees']")
	private WebElement binaryTreesHeader;
	
	@FindBy ( xpath= "//p[text()='Types of Binary Trees']")
	private WebElement typesOfBinaryTreesHeader;
	
	@FindBy ( xpath= "//p[text()='Implementation in Python']")
	private WebElement implementationInPythonHeader;
	
	@FindBy ( xpath= "//p[text()='Binary Tree Traversals']")
	private WebElement binaryTreeTraversalsHeader;
	
	@FindBy ( xpath= "//p[text()='Implementation of Binary Trees']")
	private WebElement implementationOfBinaryTreesHeader;
	
	@FindBy ( xpath= "//p[text()='Applications of Binary trees']")
	private WebElement applicationsOfBinaryTreesHeader;
	
	@FindBy ( xpath= "//p[text()='Binary Search Trees']")
	private WebElement binarySearchTreesHeader;
	
	@FindBy ( xpath= "//p[text()='Implementation Of BST']")
	private WebElement implementationOfBSTHeader;
	
	// elements for submodules in side panel
	
	@FindBy ( xpath= "//li/a[text()='Overview of Trees']")
	private WebElement overviewOfTreesLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Terminologies']")
	private WebElement terminologiesLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Types of Trees']")
	private WebElement typesOfTreesLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Tree Traversals']")
	private WebElement treeTraversalsLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Traversals-Illustration']")
	private WebElement traversalsIllustrationLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Binary Trees']")
	private WebElement binaryTreesLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Types of Binary Trees']")
	private WebElement typesOfBinaryTreesLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Implementation in Python']")
	private WebElement implementationInPythonLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Binary Tree Traversals']")
	private WebElement binaryTreeTraversalsLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Implementation of Binary Trees']")
	private WebElement implementationOfBinaryTreesLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Applications of Binary trees']")
	private WebElement applicationsOfBinaryTreesLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Binary Search Trees']")
	private WebElement binarySearchTreesLinkInSidepanel;
	
	@FindBy ( xpath= "//li/a[text()='Implementation Of BST']")
	private WebElement implementationOfBSTLinkInSidepanel;
	
	@FindBy ( xpath= "//a[text()='Practice Questions']")
	private WebElement practiceQuestionsLinkInTreeSidepanel;

	public WebElement getGetStartedBtnForTreePage() {
		return getStartedBtnForTreePage;
	}

	public WebElement getOverviewOfTreesLink() {
		return overviewOfTreesLink;
	}

	public WebElement getTerminologiesLink() {
		return terminologiesLink;
	}

	public WebElement getTypesOfTreesLink() {
		return typesOfTreesLink;
	}

	public WebElement getTreeTraversalsLink() {
		return treeTraversalsLink;
	}

	public WebElement getTraversalsIllustrationLink() {
		return traversalsIllustrationLink;
	}

	public WebElement getBinaryTreesLink() {
		return binaryTreesLink;
	}

	public WebElement getTypesOfBinaryTreesLink() {
		return typesOfBinaryTreesLink;
	}

	public WebElement getImplementationInPythonLink() {
		return implementationInPythonLink;
	}

	public WebElement getBinaryTreeTraversalsLink() {
		return binaryTreeTraversalsLink;
	}

	public WebElement getImplementationOfBinaryTreesLink() {
		return implementationOfBinaryTreesLink;
	}

	public WebElement getApplicationsOfBinaryTreesLink() {
		return applicationsOfBinaryTreesLink;
	}

	public WebElement getBinarySearchTreesLink() {
		return binarySearchTreesLink;
	}

	public WebElement getImplementationOfBSTLink() {
		return implementationOfBSTLink;
	}

	public WebElement getOverviewOfTreesHeader() {
		return overviewOfTreesHeader;
	}

	public WebElement getTerminologiesHeader() {
		return terminologiesHeader;
	}

	public WebElement getTypesOfTreesHeader() {
		return typesOfTreesHeader;
	}

	public WebElement getTreeTraversalsHeader() {
		return treeTraversalsHeader;
	}

	public WebElement getTraversalsIllustrationHeader() {
		return traversalsIllustrationHeader;
	}

	public WebElement getBinaryTreesHeader() {
		return binaryTreesHeader;
	}

	public WebElement getTypesOfBinaryTreesHeader() {
		return typesOfBinaryTreesHeader;
	}

	public WebElement getImplementationInPythonHeader() {
		return implementationInPythonHeader;
	}

	public WebElement getBinaryTreeTraversalsHeader() {
		return binaryTreeTraversalsHeader;
	}

	public WebElement getImplementationOfBinaryTreesHeader() {
		return implementationOfBinaryTreesHeader;
	}

	public WebElement getApplicationsOfBinaryTreesHeader() {
		return applicationsOfBinaryTreesHeader;
	}

	public WebElement getBinarySearchTreesHeader() {
		return binarySearchTreesHeader;
	}

	public WebElement getImplementationOfBSTHeader() {
		return implementationOfBSTHeader;
	}

	public WebElement getOverviewOfTreesLinkInSidepanel() {
		return overviewOfTreesLinkInSidepanel;
	}

	public WebElement getTerminologiesLinkInSidepanel() {
		return terminologiesLinkInSidepanel;
	}

	public WebElement getTypesOfTreesLinkInSidepanel() {
		return typesOfTreesLinkInSidepanel;
	}

	public WebElement getTreeTraversalsLinkInSidepanel() {
		return treeTraversalsLinkInSidepanel;
	}

	public WebElement getTraversalsIllustrationLinkInSidepanel() {
		return traversalsIllustrationLinkInSidepanel;
	}

	public WebElement getBinaryTreesLinkInSidepanel() {
		return binaryTreesLinkInSidepanel;
	}

	public WebElement getTypesOfBinaryTreesLinkInSidepanel() {
		return typesOfBinaryTreesLinkInSidepanel;
	}

	public WebElement getImplementationInPythonLinkInSidepanel() {
		return implementationInPythonLinkInSidepanel;
	}

	public WebElement getBinaryTreeTraversalsLinkInSidepanel() {
		return binaryTreeTraversalsLinkInSidepanel;
	}

	public WebElement getImplementationOfBinaryTreesLinkInSidepanel() {
		return implementationOfBinaryTreesLinkInSidepanel;
	}

	public WebElement getApplicationsOfBinaryTreesLinkInSidepanel() {
		return applicationsOfBinaryTreesLinkInSidepanel;
	}

	public WebElement getBinarySearchTreesLinkInSidepanel() {
		return binarySearchTreesLinkInSidepanel;
	}

	public WebElement getImplementationOfBSTLinkInSidepanel() {
		return implementationOfBSTLinkInSidepanel;
	}

	public WebElement getPracticeQuestionsLinkInTreeSidepanel() {
		return practiceQuestionsLinkInTreeSidepanel;
	}
	
	
}
