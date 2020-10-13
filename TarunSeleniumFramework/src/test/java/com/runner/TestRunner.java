package com.runner;


import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.utils.BaseTest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

	
	@RunWith(Cucumber.class)
	@CucumberOptions( tags="@menu_test1",
	 features = "src/test/resources",glue={"com.dealsiwant.user","com.dealsiwant.admin"}
	 )
	 
	public class TestRunner  {
	 
	
	

	}
	
