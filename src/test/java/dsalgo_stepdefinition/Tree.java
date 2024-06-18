package dsalgo_stepdefinition;

import org.testng.Assert;

import dsalgo_pom.TreePage;
import dsalgo_utilities.LoggerLoad;
import dsalgo_webdriver_manager.Webdriver_Manager;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Tree {
	
	TreePage treePOM;
	
	@Given("The user goes to Tree page")
	public void the_user_goes_to_tree_page() {
		
		treePOM = new TreePage();
		
		treePOM.getGetStartedBtnForTreePage().click();
		
		String currentUrl = Webdriver_Manager.getDriver().getCurrentUrl();
		
		LoggerLoad.info("Opening tree page "+currentUrl);
	    
	}

	@When("The user clicks on {string} link available in tree home page")
	public void the_user_clicks_on_link_available_in_tree_home_page(String subModuleName) {
		
		if (subModuleName.equalsIgnoreCase("Overview of Trees")) {
			
			treePOM.getOverviewOfTreesLink().click();
			
			LoggerLoad.info(" User clicks on Overview of Trees link ");
			
		} else if (subModuleName.equalsIgnoreCase("Terminologies")) {
			
			treePOM.getTerminologiesLink().click();
			
			LoggerLoad.info(" User clicks on Terminologies link ");
		
		} else if (subModuleName.equalsIgnoreCase("Types of Trees")) {
			
			treePOM.getTypesOfTreesLink().click();
			
			LoggerLoad.info(" User clicks on Types of Trees link ");
			
		} else if (subModuleName.equalsIgnoreCase("Tree Traversals")) {
			
			treePOM.getTreeTraversalsLink().click();
			
			LoggerLoad.info(" User clicks on Tree Traversals link ");
			
		}  else if (subModuleName.equalsIgnoreCase("Traversals-Illustration")) {
			
			treePOM.getTraversalsIllustrationLink().click();
			
			LoggerLoad.info(" User clicks on Traversals-Illustration link ");
		
		} else if (subModuleName.equalsIgnoreCase("Binary Trees")) {
			
			treePOM.getBinaryTreesLink().click();
			
			LoggerLoad.info(" User clicks on Binary Trees link ");
			
		} else if (subModuleName.equalsIgnoreCase("Types of Binary Trees")) {
			
			treePOM.getTypesOfBinaryTreesLink().click();
			
			LoggerLoad.info(" User clicks on Types of Binary Trees link ");
		
		} else if (subModuleName.equalsIgnoreCase("Implementation in Python")) {
			
			treePOM.getImplementationInPythonLink().click();
			
			LoggerLoad.info(" User clicks on Implementation in Python link ");
			
		} else if (subModuleName.equalsIgnoreCase("Binary Tree Traversals")) {
			
			treePOM.getBinaryTreeTraversalsLink().click();
			
			LoggerLoad.info(" User clicks on Binary Tree Traversals link ");
			
		} else if (subModuleName.equalsIgnoreCase("Implementation of Binary Trees")) {
			
			treePOM.getImplementationOfBinaryTreesLink().click();
			
			LoggerLoad.info(" User clicks on Implementation of Binary Trees link ");
			
		} else if (subModuleName.equalsIgnoreCase("Applications of Binary trees")) {
			
			treePOM.getApplicationsOfBinaryTreesLink().click();
			
			LoggerLoad.info(" User clicks on Applications of Binary trees link ");
			
		} else if (subModuleName.equalsIgnoreCase("Binary Search Trees")) {
			
			treePOM.getBinarySearchTreesLink().click();
			
			LoggerLoad.info(" User clicks on Binary Search Trees link ");
			
		} else if (subModuleName.equalsIgnoreCase("Implementation Of BST")) {
			
			treePOM.getImplementationOfBSTLink().click();
			
			LoggerLoad.info(" User clicks on Implementation Of BST link ");
		
		} else {
			
			LoggerLoad.warn("Submodule name is not available "+subModuleName);
		}  
	    
	}
	
	@When("The user clicks on {string} link on the side panel of tree page")
	public void the_user_clicks_on_link_on_the_side_panel_of_tree_page(String subModuleName) {
		
		if (subModuleName.equalsIgnoreCase("Overview of Trees")) {
			
			treePOM.getOverviewOfTreesLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Overview of Trees link from side panel ");
			
		} else if (subModuleName.equalsIgnoreCase("Terminologies")) {
			
			treePOM.getTerminologiesLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Terminologies link from side panel ");
		
		} else if (subModuleName.equalsIgnoreCase("Types of Trees")) {
			
			treePOM.getTypesOfTreesLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Types of Trees link from side panel ");
			
		} else if (subModuleName.equalsIgnoreCase("Tree Traversals")) {
			
			treePOM.getTreeTraversalsLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Tree Traversals link from side panel ");
			
		}  else if (subModuleName.equalsIgnoreCase("Traversals-Illustration")) {
			
			treePOM.getTraversalsIllustrationLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Traversals-Illustration link from side panel ");
		
		} else if (subModuleName.equalsIgnoreCase("Binary Trees")) {
			
			treePOM.getBinaryTreesLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Binary Trees link from side panel ");
			
		} else if (subModuleName.equalsIgnoreCase("Types of Binary Trees")) {
			
			treePOM.getTypesOfBinaryTreesLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Types of Binary Trees link from side panel ");
		
		} else if (subModuleName.equalsIgnoreCase("Implementation in Python")) {
			
			treePOM.getImplementationInPythonLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Implementation in Python link from side panel ");
			
		} else if (subModuleName.equalsIgnoreCase("Binary Tree Traversals")) {
			
			treePOM.getBinaryTreeTraversalsLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Binary Tree Traversals link from side panel ");
			
		} else if (subModuleName.equalsIgnoreCase("Implementation of Binary Trees")) {
			
			treePOM.getImplementationOfBinaryTreesLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Implementation of Binary Trees link from side panel ");
			
		} else if (subModuleName.equalsIgnoreCase("Applications of Binary trees")) {
			
			treePOM.getApplicationsOfBinaryTreesLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Applications of Binary trees link from side panel ");
			
		} else if (subModuleName.equalsIgnoreCase("Binary Search Trees")) {
			
			treePOM.getBinarySearchTreesLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Binary Search Trees link from side panel ");
			
		} else if (subModuleName.equalsIgnoreCase("Implementation Of BST")) {
			
			treePOM.getImplementationOfBSTLinkInSidepanel().click();
			
			LoggerLoad.info(" User clicks on Implementation Of BST link from side panel ");
		
		}  else if (subModuleName.equalsIgnoreCase("Practice Questions")) {
			
			treePOM.getPracticeQuestionsLinkInTreeSidepanel().click();
			
			LoggerLoad.info(" User clicks on Practice Questions link from side panel");
			
		} else {
			
			LoggerLoad.warn("Submodule name is not available "+subModuleName);
		}  
	   
	}

	@Then("The user should be redirected to {string} page under tree module")
	public void the_user_should_be_redirected_to_page_under_tree_module(String subModuleName) {
		
		if (subModuleName.equalsIgnoreCase("Overview of Trees")) {
			
			String overviewOfTreesPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(overviewOfTreesPageUrl,"https://dsportalapp.herokuapp.com/tree/overview-of-trees/", "Overview of Trees page is not displayed");
			
			String overviewOfTreesPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(overviewOfTreesPageTitle,"Overview of Trees", "Overview of Trees page is not displayed");
			
			boolean overviewOfTreesHeaderPresent = treePOM.getOverviewOfTreesHeader().isDisplayed();
			
			Assert.assertTrue(overviewOfTreesHeaderPresent, "Overview of Trees header is not displayed");	
			
		} else if (subModuleName.equalsIgnoreCase("Terminologies")) {
			
			String terminologiesPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(terminologiesPageUrl,"https://dsportalapp.herokuapp.com/tree/terminologies/", "Terminologies page is not displayed");
			
			String terminologiesPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(terminologiesPageTitle,"Terminologies", "Terminologies page is not displayed");
			
			boolean terminologiesHeaderPresent = treePOM.getTerminologiesHeader().isDisplayed();
			
			Assert.assertTrue(terminologiesHeaderPresent, "Terminologies header is not displayed");
		
		} else if (subModuleName.equalsIgnoreCase("Types of Trees")) {
			
			String typesOfTreesPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(typesOfTreesPageUrl,"https://dsportalapp.herokuapp.com/tree/types-of-trees/", "Types of Trees page is not displayed");
			
			String typesOfTreesPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(typesOfTreesPageTitle,"Types of Trees", "Types of Trees page is not displayed");
			
			boolean typesOfTreesHeaderPresent = treePOM.getTypesOfTreesHeader().isDisplayed();
			
			Assert.assertTrue(typesOfTreesHeaderPresent, "Types of Trees header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Tree Traversals")) {
			
			String treeTraversalsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(treeTraversalsPageUrl,"https://dsportalapp.herokuapp.com/tree/tree-traversals/", "Tree Traversals page is not displayed");
			
			String treeTraversalsPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(treeTraversalsPageTitle,"Tree Traversals", "Tree Traversals page is not displayed");
			
			boolean treeTraversalsHeaderPresent = treePOM.getTreeTraversalsHeader().isDisplayed();
			
			Assert.assertTrue(treeTraversalsHeaderPresent, "Tree Traversals header is not displayed");
			
		}  else if (subModuleName.equalsIgnoreCase("Traversals-Illustration")) {
			
			String traversalsIllustrationPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(traversalsIllustrationPageUrl,"https://dsportalapp.herokuapp.com/tree/traversals-illustration/", "Traversals-Illustration page is not displayed");
			
			String traversalsIllustrationPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(traversalsIllustrationPageTitle,"Traversals-Illustration", "Traversals-Illustration page is not displayed");
			
			boolean traversalsIllustrationHeaderPresent = treePOM.getTraversalsIllustrationHeader().isDisplayed();
			
			Assert.assertTrue(traversalsIllustrationHeaderPresent, "Traversals-Illustration header is not displayed");
		
		} else if (subModuleName.equalsIgnoreCase("Binary Trees")) {
			
			String binaryTreesPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(binaryTreesPageUrl,"https://dsportalapp.herokuapp.com/tree/binary-trees/", "Binary Trees page is not displayed");
			
			String binaryTreesPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(binaryTreesPageTitle,"Binary Trees", "Binary Trees page is not displayed");
			
			boolean binaryTreesHeaderPresent = treePOM.getBinaryTreesHeader().isDisplayed();
			
			Assert.assertTrue(binaryTreesHeaderPresent, "Binary Trees header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Types of Binary Trees")) {
			
			String typesOfBinaryTreesPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(typesOfBinaryTreesPageUrl,"https://dsportalapp.herokuapp.com/tree/types-of-binary-trees/", "Types of Binary Trees page is not displayed");
			
			String typesOfBinaryTreesPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(typesOfBinaryTreesPageTitle,"Types of Binary Trees", "Types of Binary Trees page is not displayed");
			
			boolean typesOfBinaryTreesHeaderPresent = treePOM.getTypesOfBinaryTreesHeader().isDisplayed();
			
			Assert.assertTrue(typesOfBinaryTreesHeaderPresent, "Types of Binary Trees header is not displayed");
		
		} else if (subModuleName.equalsIgnoreCase("Implementation in Python")) {
			
			String implementationInPythonPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(implementationInPythonPageUrl,"https://dsportalapp.herokuapp.com/tree/implementation-in-python/", "Implementation in Python page is not displayed");
			
			String implementationInPythonPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(implementationInPythonPageTitle,"Implementation in Python", "Implementation in Python page is not displayed");
			
			boolean implementationInPythonHeaderPresent = treePOM.getImplementationInPythonHeader().isDisplayed();
			
			Assert.assertTrue(implementationInPythonHeaderPresent, "Implementation in Python header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Binary Tree Traversals")) {
			
			String binaryTreeTraversalsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(binaryTreeTraversalsPageUrl,"https://dsportalapp.herokuapp.com/tree/binary-tree-traversals/", "Binary Tree Traversals is not displayed");
			
			String binaryTreeTraversalsPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(binaryTreeTraversalsPageTitle,"Binary Tree Traversals", "Binary Tree Traversals page is not displayed");
			
			boolean binaryTreeTraversalsHeaderPresent = treePOM.getBinaryTreeTraversalsHeader().isDisplayed();
			
			Assert.assertTrue(binaryTreeTraversalsHeaderPresent, "Binary Tree Traversals header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Implementation of Binary Trees")) {
			
			String implementationOfBinaryTreesPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(implementationOfBinaryTreesPageUrl,"https://dsportalapp.herokuapp.com/tree/implementation-of-binary-trees/", "Implementation of Binary Trees page is not displayed");
			
			String implementationOfBinaryTreesPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(implementationOfBinaryTreesPageTitle,"Implementation of Binary Trees", "Implementation of Binary Trees page is not displayed");
			
			boolean implementationOfBinaryTreesHeaderPresent = treePOM.getImplementationOfBinaryTreesHeader().isDisplayed();
			
			Assert.assertTrue(implementationOfBinaryTreesHeaderPresent, "Implementation of Binary Trees header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Applications of Binary trees")) {
			
			String applicationsOfBinaryTreesPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(applicationsOfBinaryTreesPageUrl,"https://dsportalapp.herokuapp.com/tree/applications-of-binary-trees/", "Applications of Binary trees page is not displayed");
			
			String applicationsOfBinaryTreesPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(applicationsOfBinaryTreesPageTitle,"Applications of Binary trees", "Applications of Binary trees page is not displayed");
			
			boolean applicationsOfBinaryTreesHeaderPresent = treePOM.getApplicationsOfBinaryTreesHeader().isDisplayed();
			
			Assert.assertTrue(applicationsOfBinaryTreesHeaderPresent, "Applications of Binary trees header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Binary Search Trees")) {
			
			String binarySearchTreesPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(binarySearchTreesPageUrl,"https://dsportalapp.herokuapp.com/tree/binary-search-trees/", "Binary Search Trees page is not displayed");
			
			String binarySearchTreesPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(binarySearchTreesPageTitle,"Binary Search Trees", "Binary Search Trees page is not displayed");
			
			boolean binarySearchTreesHeaderPresent = treePOM.getBinarySearchTreesHeader().isDisplayed();
			
			Assert.assertTrue(binarySearchTreesHeaderPresent, "Binary Search Trees header is not displayed");
			
		} else if (subModuleName.equalsIgnoreCase("Implementation Of BST")) {
			
			String implementationOfBSTPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(implementationOfBSTPageUrl,"https://dsportalapp.herokuapp.com/tree/implementation-of-bst/", "Implementation Of BST page is not displayed");
			
			String implementationOfBSTPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(implementationOfBSTPageTitle,"Implementation Of BST", "Implementation Of BST page is not displayed");
			
			boolean implementationOfBSTHeaderPresent = treePOM.getImplementationOfBSTHeader().isDisplayed();
			
			Assert.assertTrue(implementationOfBSTHeaderPresent, "Implementation Of BST header is not displayed");
		
		}  else if (subModuleName.equalsIgnoreCase("Practice Questions")) {
			
			String practiceQuestionsPageUrl = Webdriver_Manager.getDriver().getCurrentUrl();
			
			Assert.assertEquals(practiceQuestionsPageUrl,"https://dsportalapp.herokuapp.com/tree/practice", "Practice Questions page is not displayed");
			
			String practiceQuestionsPageTitle = Webdriver_Manager.getDriver().getTitle();
			
			Assert.assertEquals(practiceQuestionsPageTitle,"Practice Questions", "Practice Questions page is not displayed");
			
			Assert.assertTrue(false, "Practice Questions page is blank");
			
		} else {
			
			Assert.fail("Entering invalid page name "+subModuleName);
			
		}    
	    
	}

}
