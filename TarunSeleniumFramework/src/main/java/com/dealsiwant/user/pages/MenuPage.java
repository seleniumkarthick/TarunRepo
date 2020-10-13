package com.dealsiwant.user.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.utils.BaseTest;

public class MenuPage{
	
	WebDriver driver;
	
	public MenuPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText="Home")
	WebElement homeLink;
	
	public void clickHome(){
		homeLink.click();
	}
	
	
	public void clickMenu(String val){
		driver.findElement(By.linkText(val)).click();
	}
	
}
