package com.sightplan.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver ldriver;
	
	public LoginPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(id="user_username")
	@CacheLookup
	WebElement txtUserName;
	
	@FindBy(id="user_password")
	@CacheLookup
	WebElement txtPassWord;
	
	@FindBy(id="signin_submit")
	@CacheLookup
	WebElement Submit;
	
	public void setUserName(String uname)
	{
		txtUserName.sendKeys(uname);
		
	}
	
	public void setPassword(String pwd)
	{
		txtPassWord.sendKeys(pwd);
	}
	
	public void clicksubmit() throws InterruptedException
	{
		Submit.click();
		
	}
	
	
	
	}


