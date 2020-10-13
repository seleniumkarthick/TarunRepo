package com.dealsiwant.admin.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.*;


import com.utils.BaseTest;

public class LoginPage{
	
	WebDriver driver;
	
	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="submit")
	WebElement submitBtn;
	
	public void clickEnterButton(){
		submitBtn.click();
	}
	
	public String getAlertMessage(){
		return driver.switchTo().alert().getText();
	}
	
}
