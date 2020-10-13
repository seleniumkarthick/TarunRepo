package com.utils;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.Properties;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.dealsiwant.admin.pages.LoginPage;
import com.dealsiwant.user.pages.MenuPage;

import cucumber.api.java.After;
import cucumber.api.java.Before;



public class BaseTest  {
	
	public WebDriver driver;
	public MenuPage menuObj;
	public LoginPage adminLoginObj;
	
	public String base_url;
	public String admin_url;
	
	Properties prob;
	
 
	public ExtentHtmlReporter htmlReporter;
	
	public ExtentReports extent;
	
	//helps to generate the logs in test report.
	public ExtentTest test;
	
	
	
	public BaseTest() throws Exception{
		
		
		extent = new ExtentReports();
		htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/testReport.html");
        extent.attachReporter(htmlReporter);
        
		
		
		String env="UAT";
		
		prob=new Properties();
		String filepath="E:\\SeleniumAutomation\\2020\\TarunSeleniumFramework\\src\\test\\resources\\TestData\\"+env+"\\data.properties";
		FileInputStream path=new FileInputStream(filepath);
		prob.load(path);
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Karthick Kumar\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		driver=new ChromeDriver();
		
		base_url=prob.getProperty("URL");
		admin_url=prob.getProperty("ADMIN_URL");
		
		driver.get(prob.getProperty("URL"));
		
		
		menuObj=new MenuPage(driver);
		adminLoginObj=new LoginPage(driver);
		
	}
	

}
