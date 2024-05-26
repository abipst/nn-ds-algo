package com.runner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

	@CucumberOptions(
			plugin = {"pretty", "html:target/dsalgo.html"}, //reporting purpose
			
			monochrome=false,  //console output colour
			
			tags = "@signin", //tags from feature file
			
			features = {"src/test/resources/features"}, //location of feature files
			
			glue= {"com.stepdefinitions", "com.hooks"} ) //location of step definition files
	
public class TestRunner extends AbstractTestNGCucumberTests{
		
	/*
	 * @Override
	 * 
	 * @DataProvider(parallel = false) public Object[][] scenarios() {
	 * 
	 * return super.scenarios(); }
	 */
	 
	
}
