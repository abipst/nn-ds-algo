package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			plugin = {"pretty", "html:target/dsalgo.html"}, //reporting purpose
			
			monochrome=false,  //console output colour
			
			tags = "@valid_input", //tags from feature file
			
			features = {"src/test/resources/features/SignIn.feature"}, //location of feature files
			
			glue= "com.stepdefinitions") //location of step definition files
	
public class TestRunner extends AbstractTestNGCucumberTests{
		
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = false) public Object[][] scenarios() {
	 * 
	 * return super.scenarios(); }
	 */
	 
	
}
