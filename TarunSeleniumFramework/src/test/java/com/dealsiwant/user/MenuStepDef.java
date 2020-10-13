package com.dealsiwant.user;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import com.aventstack.extentreports.Status;
import com.dealsiwant.user.pages.MenuPage;
import com.utils.BaseTest;

import cucumber.api.java.en.*;

public class MenuStepDef extends BaseTest{
	
	
	public MenuStepDef() throws Exception {
		super();
		// TODO Auto-generated constructor stub
	}

	@Given("^user loads the application url$")
	public void user_loads_the_applicatin_url(){
		driver.get(base_url);
	}
	
	@When("^user clicks home menu$")
	public void user_clicks_home_menu() {
		test = extent.createTest("click hme menu");
		menuObj.clickHome();
		test.log(Status.PASS, "home menu clicked sucessfully");
	}


	@When("^user clicks \"([^\"]*)\" menu$")
	public void user_clicks_menu(String link) throws Throwable {
		
		test = extent.createTest("test1");
	    menuObj.clickMenu(link);
	    test.log(Status.PASS, "home menu clicked sucessfully");
	}	


	
	@Then("^user should navigate to home page$")
	public void user_should_navigate_to_home_page() {
	    // Write code here that turns the phrase above into concrete actions
	   String actual=driver.getCurrentUrl();
	   Assert.assertEquals(actual, "http://localhost:81/product/index.php");
	   test.log(Status.PASS, "home menu clicked sucessfully");
	}
	
	@Then("^user should navigate to \"([^\"]*)\" page$")
	public void user_should_navigate_to_page(String expectedUrl) {
	    // Write code here that turns the phrase above into concrete actions
	   String actual=driver.getCurrentUrl();
	   Assert.assertEquals(actual, expectedUrl);
	  // test.log(Status.PASS, "home menu clicked sucessfully");
	
	}

	@Then("^i quit the driver$")
	public void i_quit_the_driver() {
		driver.quit();
		extent.flush();
	}


	
	
}
