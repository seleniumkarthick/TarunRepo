package com.runner;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks {
	
	

	@Before
	public void setup(){
		/*System.out.println("11111111");
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        extent.attachReporter(htmlReporter);
        extent = new ExtentReports();*/
	}
	
	 @After
	 public void tearDown() {
		 System.out.println("11111111");
	    	//to write or update test information to reporter
	        
	 }

}
