package com.sightplan.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PackagesPage {
	
	static WebElement element = null;
	public static WebElement packagessection(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Packages']"));
	return element;
	}
	public static WebElement receivepackage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Receive Package']"));
	return element;
	}
	public static WebElement resident(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Resident:']"));
	return element;
	}
	public static WebElement residentN(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container   open']//li[@data-id='M']"));
	return element;
	}
	public static WebElement residentD(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro-list']//li[@data-id='D']"));
	return element;
	}
	public static WebElement kumarnasaka(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Nelson Mandela / Unit 1']"));
	return element;
	}
	public static WebElement maritza(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view sp-selectro-list']//span[@title='Maritza Dominguez / Unit 115']"));
	return element;
	}
	public static WebElement trackingnumber(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@maxlength='60']"));
	return element;
	}
	public static WebElement carrier(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Carrier:']"));
	return element;
	}
	public static WebElement dhl(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='dhl']"));
	return element;
	}
	public static WebElement type(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Type:']"));
	return element;
	}
	public static WebElement bag(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='bag']"));
	return element;
	}
	public static WebElement condition(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Condition:']"));
	return element;
	}
	public static WebElement waterdamage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='water-damage']"));
	return element;
	}
	public static WebElement addnote(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@maxlength='300']"));
	return element;
	}
	public static WebElement receivepackagebutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Receive Package']"));
	return element;
	}
	public static WebElement tn(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='L7277917']"));
	return element;
	}
	public static WebElement comments(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Leave a comment']"));
	return element;
	}
	public static WebElement addcomment(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Add Comment']"));
	return element;
	}
	public static WebElement dpbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit green  primary-action']"));
	return element;
	}
	public static WebElement closemodal(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='blank-button modal-close medium']"));
	return element;
	}
	public static WebElement exportlist(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@title='Export list [E]']"));
	return element;
	}
	public static WebElement auto1234(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='AUTO1234']"));
	return element;
	}
	public static WebElement dryc(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Dry Cleaning']"));
	return element;
	}
	public static WebElement bagedit(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='bag']"));
	return element;
	}
	public static WebElement acceptbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//section[@class='detail-section clearfix']//div[@class='edit-buttons']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement placeholderedit(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement placeholdertext(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Description']"));
	return element;
	}
	public static WebElement placeholderaccept(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view objective task-inline-edit packageDescription loaded visible in-edit']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement residentedit(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Chris Reads']//span[@class='edit icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement clear(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='search-container ']//input[@class='ember-view ember-text-field']"));
	return element;
	}
	public static WebElement cancelbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='search-container ']//input[@class='ember-view ember-text-field']"));
	return element;
	}
	public static WebElement H(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='H']"));
	return element;
	}
	public static WebElement christ(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Chris Henry / Unit 5']"));
	return element;
	}
	public static WebElement residentaccept(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view task-inline-edit assignee visible loaded']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement conditiongood(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Good']//span[@class='edit-icon icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement waterdamageedit(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Water Damage']"));
	return element;
	}
	public static WebElement conditionaccept(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view inline-edit sp-detail-inline-edit clearfix style-with-header in-edit kill-edit']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement Amazon(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Amazon']//span[@class='edit-icon icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement fedex(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='FedEx']"));
	return element;
	}
	public static WebElement carrieracceptbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='detail-column']//div[@class='ember-view inline-edit sp-detail-inline-edit clearfix style-with-header in-edit kill-edit']//button[@class='blank-button accept-btn']"));
	return element;
	}
	
	public static WebElement tracknum(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='AUTO1234']//span[@class='edit-icon icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement cleartracknum(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//label[@class='ember-view sw-input']//input[@maxlength='60']"));
	return element;
	}
	public static WebElement tracknumaccept(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='ember-view inline-edit sp-detail-inline-edit clearfix style-with-header in-edit kill-edit']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement leaveacomment(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Leave a comment']"));
	return element;
	}
	public static WebElement addcomment1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[text()='Add Comment']"));
	return element;
	}
	public static WebElement auto1235(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='AUTO1235']"));
	return element;
	}
	public static WebElement bagc(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Bag']"));
	return element;
	}
	public static WebElement drycleaning(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Dry Cleaning']"));
	return element;
	}
	public static WebElement chrishenry(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Chris Henry']//span[@class='edit icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement conditionwaterdamage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Water Damage']//span[@class='edit-icon icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement goodedit(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Good']"));
	return element;
	}
	public static WebElement fedex1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='FedEx']//span[@class='edit-icon icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement amazon1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Amazon']"));
	return element;
	}
	public static WebElement tracknum1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='AUTO1235']//span[@class='edit-icon icon edit-pencil-dark']"));
	return element;
	}
	public static WebElement R(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='R']"));
	return element;
	}
	public static WebElement Reads(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Chris Reads / Unit 1']"));
	return element;
	}
	public static WebElement addcolumns(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='ember-view sp-icon plus']"));
	return element;
	}
	public static WebElement deliveredby(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Delivered By']"));
	return element;
	}
	public static WebElement save(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//a[text()='Save Edited View']"));
	return element;
	}
	public static WebElement viewname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@placeholder='View name']"));
	return element;
	}
	
	public static WebElement saveviewbutton(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton blue ']"));
	return element;
	}
	public static WebElement ellipse(WebDriver driver)
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
	public static WebElement addfilter1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@title='Add filter [F]']"));
	return element;
	}
	public static WebElement filtercarrier(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='Carrier']"));
	return element;
	}
	public static WebElement filtercarrieramazon(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container filter-mode  open']//span[@title='Amazon']"));
	return element;
	}
	public static WebElement iconremovefilter(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='list-container selectro-list-container filter-mode  open']//span[@title='Amazon']"));
	return element;
	}
	public static WebElement describethetask(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//textarea[@placeholder='Describe the task']"));
	return element;
	}
	
}
