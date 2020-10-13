package com.dealsiwant.admin;



import org.junit.Assert;

import com.utils.BaseTest;

import cucumber.api.java.en.*;

public class LoginStepDef extends BaseTest {
	

	public LoginStepDef() throws Exception {
		super();
	}

	@Given("^user loads the admin url$")
	public void user_loads_the_admin_url() throws Throwable {
		driver.get(admin_url);
	}
	
	@When("^user clicks enter button$")
	public void user_clicks_enter_button() throws Throwable {
		adminLoginObj.clickEnterButton();
	}
	
	@Then("^user should validate alert message$")
	public void user_should_validate_alert_message() throws Throwable {
		String actual=adminLoginObj.getAlertMessage();
		Assert.assertEquals(actual, "Please enter admin Username.");
	}



}
