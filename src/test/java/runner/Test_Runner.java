package runner;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import dsalgo_utilities.ConfigReader;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			plugin = {"pretty", "html:target/cucumber.html", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}, //reporting purpose
			
			monochrome = true ,  // for console output clarity
		
			
			publish= true ,
			
			tags = "@all and not @rgvalid_input", // tags from feature file
			
			features = {"src/test/resources/features"}, // location of feature files
			
			glue= {"dsalgo_stepdefinition", "dsalgo_hooks"} ) // location of step definition files
	

	public class Test_Runner extends AbstractTestNGCucumberTests{
		
	
		
		  @BeforeTest
		  
		  @Parameters ( "browser" )
		  
		  public void browserForCrossBrowserTest( @Optional("chrome") String browser) {
		  
			  ConfigReader config = new ConfigReader();
		  
			  config.setBrowser(browser);
		  
		  }
		  
		  @Override
		  
		  @DataProvider (parallel = true)
		  
		  public Object[][] scenarios() {
		  
			  return super.scenarios();
		  
		  }
		 
	 
	}
 
