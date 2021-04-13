package com.sightplan.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProfilePage {
	
	static WebElement element = null;
	public static WebElement myprofile(WebDriver driver)
	{
	element = driver.findElement(By.id("my-profile"));
	return element;
	}
	public static WebElement firstname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Add first name']"));
	return element;
	}
	public static WebElement lastname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Add last name']"));
	return element;
	}
	public static WebElement displayname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Add display name']"));
	return element;
	}
	public static WebElement addtitle(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Add title']"));
	return element;
	}
	public static WebElement addemail(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Add email']"));
	return element;
	}
	public static WebElement addnumber(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Add number']"));
	return element;
	}
	public static WebElement savechanges(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='primary-button ']"));
	return element;
	}
	public static WebElement timezone(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Time Zone:']"));
	return element;
	}
	public static WebElement time(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='America/New_York']"));
	return element;
	}
	public static WebElement taskstext(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//th[text()='Tasks']"));
	return element;
	}
	public static WebElement residenttext(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//th[text()='Residents']"));
	return element;
	}
	public static WebElement donotdisturb(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//strong[text()='Automatically enable Do Not Disturb via schedule']"));
	return element;
	}
	public static WebElement profileclick(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h1[text()='My Profile']"));
	return element;
	}
	public static WebElement preferredtimezone(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h2[text()='Preferred Time Zone']"));
	return element;
	}
	public static WebElement assignedtoyou(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//td[text()='Assigned to you']"));
	return element;
	}
	public static WebElement custom(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//strong[text()='Custom.']"));
	return element;
	}
	public static WebElement photo(WebDriver driver)
	{
	element = driver.findElement(By.id("background_image_front"));
	return element;
	}
	public static WebElement newpassword(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='New Password']"));
	return element;
	}
	public static WebElement confirmpassword(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='Confirm Password']"));
	return element;
	}
	public static WebElement advanced(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//label[text()='Advanced']"));
	return element;
	}
	public static WebElement simple(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='radio']//label[text()='Simple']"));
	return element;
	}

}
