package com.sightplan.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MessagesPage {
	
	static WebElement element = null;
	public static WebElement addmessagebutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[@class='ember-view primary-button']"));
	return element;
	}

	public static WebElement AllResidents(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[contains(text(),'All Residents')]"));
	return element;
	}
	public static WebElement subject(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@id='message_subject']"));
	return element;
	}
	public static WebElement messageplaceholder(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Message']"));
	return element;
	}
	public static WebElement reviewmessage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[contains(@class,'blue enabled')]"));
	return element;
	}
	public static WebElement sendmessage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit  green enabled']"));
	return element;
	}
	public static WebElement contentmessage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[contains(text(),'TestingMessage')]"));
	return element;
	}
	public static WebElement ellipse(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='blank-button task-menu ']"));
	return element;
	}
	public static WebElement deletemessage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='icon trash']"));
	return element;
	}
	public static WebElement deletemessagebutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton destructive right ']"));
	return element;
	}
	public static WebElement exportlist(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@title='Export list [E]']"));
	return element;
	}
	public static WebElement addcolumns(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='ember-view sp-icon plus']"));
	return element;
	}
	public static WebElement columnscontent(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='messageContent']"));
	return element;
	}
	public static WebElement save(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Save Edited View']"));
	return element;
	}
	public static WebElement placeholderviewname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='View name']"));
	return element;
	}
	public static WebElement saveviewbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton blue ']"));
	return element;
	}
	public static WebElement viewellipse(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro three-dots-horizontal']"));
	return element;
	}
	public static WebElement deleteview(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Delete View...']"));
	return element;
	}
	public static WebElement deleteviewbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton destructive right ']"));
	return element;
	}
	public static WebElement allmessages(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h1[text()='All Messages']"));
	return element;
	}
	public static WebElement senttoallresidents(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Sent to All Residents']"));
	return element;
	}
	public static WebElement schedule(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h3[text()='Schedule']"));
	return element;
	}
	public static WebElement send(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Send:']"));
	return element;
	}
	public static WebElement custom(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='custom']"));
	return element;
	}
	public static WebElement addrepeatingmessage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Add Repeating Message']"));
	return element;
	}
	public static WebElement daily(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='input-container         ']//span[text()='Daily']"));
	return element;
	}
	public static WebElement weekly(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='weekly']"));
	return element;
	}
	public static WebElement Tu(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='repeat-section flush-left weekly visible']//div[text()='We']"));
	return element;
	}
	public static WebElement weeklyvalue(WebDriver driver)
	{
	element = driver.findElement(By.id("weeklyValue"));
	return element;
	}
	public static WebElement messagetime(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='5']//span[text()='9:00 AM (EDT)']"));
	return element;
	}
	public static WebElement messagetime1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container fixed open']//li[@data-id='0930']"));
	return element;
	}
	public static WebElement saverepeatingbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Save Repeating Series']"));
	return element;
	}
	public static WebElement testrepeating(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='TestRepeatingMessage']"));
	return element;
	}
	public static WebElement pauseseries(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Pause series']"));
	return element;
	}
	public static WebElement pauserepeatingseries(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton blue right ']"));
	return element;
	}
	public static WebElement Resumeseries(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Resume series']"));
	return element;
	}
	public static WebElement resumerepeatingseries(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton blue right ']"));
	return element;
	}
	public static WebElement deleteseries(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='icon trash']"));
	return element;
	}
	public static WebElement deleterepeatseries(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton destructive right ']"));
	return element;
	}
	public static WebElement trigger(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Trigger']"));
	return element;
	}
	public static WebElement selectcondition(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro trigger-type']//span[@class='drop-down-icon']"));
	return element;
	}
	public static WebElement expiration(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='30-day lease expiration']"));
	return element;
	}
	public static WebElement immediately(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Immediately']"));
	return element;
	}
	public static WebElement sentat(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='send-at']"));
	return element;
	}
	public static WebElement saverepeat(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton blue v2 ']"));
	return element;
	}
	public static WebElement seriesrange(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[text()='Send only at this time:']"));
	return element;
	}
}
