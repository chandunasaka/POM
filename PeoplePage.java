package com.sightplan.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PeoplePage {
	static WebElement element = null;
	public static WebElement adduser(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[text()='Add User']"));
	return element;
	}
	public static WebElement firstname(WebDriver driver)
	{
	element = driver.findElement(By.id("user_first_name"));
	return element;
	}
	public static WebElement lastname(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@style='padding-left: 76px']"));
	return element;
	}
	public static WebElement email(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@style='padding-left: 49px']"));
	return element;
	}
	public static WebElement shared(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//p[@class='checkboxText']"));
	return element;
	}
	public static WebElement phone(WebDriver driver)
	{
	element = driver.findElement(By.id("phone_id"));
	return element;
	}
	public static WebElement site(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[text()='Site:']"));
	return element;
	}
	public static WebElement testsite(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@title='test site with links']"));
	return element;
	}
	public static WebElement role(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[text()='Role:']"));
	return element;
	}
	public static WebElement propertymanager(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//li[@data-id='Property Manager']"));
	return element;
	}
	public static WebElement adduseraction(WebDriver driver)
	{
	element =  driver.findElement(By.id("action-button"));
	return element;
	}
	public static WebElement current(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@class='ember-view task-filter-button']//button[text()='Current']"));
	return element;
	}
	public static WebElement pending(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[@title='Pending']"));
	return element;
	}
	public static WebElement username(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[contains(text(),'Test User8')]"));
	return element;
	}
	public static WebElement resendinvitation(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[text()='Resend Invitation...']"));
	return element;
	}
	public static WebElement resendinvitationbutton(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//button[@class='standardButton blue right ']"));
	return element;
	}
	public static WebElement removeuser(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[text()='Remove User...']"));
	return element;
	}
	public static WebElement removeuserbutton(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//button[@class='standardButton destructive']"));
	return element;
	}
	public static WebElement assignee(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[text()='Assignee:']"));
	return element;
	}
	public static WebElement csn(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[text()='chandra sekhar n']"));
	return element;
	}
	public static WebElement update(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//button[@class='standardButton blue ']"));
	return element;
	}
	public static WebElement tickbox(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@style='width:44px;height:30px;']"));
	return element;
	}
	public static WebElement deletebutton(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[@class='icon trash ready']"));
	return element;
	}
	public static WebElement closemodal(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//button[@class='blank-button modal-close medium']"));
	return element;
	}
	public static WebElement omit103(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[text()='Omit 103']"));
	return element;
	}
	public static WebElement asstpropertymanager(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//li[@data-id='Asst. Property Manager']"));
	return element;
	}
	public static WebElement testautomation(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[text()='Test Automation']"));
	return element;
	}
	public static WebElement exportlist(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//button[@title='Export list [E]']"));
	return element;
	}
	public static WebElement Role(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@class='input-container         filter-btn']//div[text()='Role']"));
	return element;
	}
	public static WebElement administrator(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//li[@data-id='administrator']"));
	return element;
	}
	public static WebElement header(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@class='ember-view sp-action-bar']"));
	return element;
	}
	public static WebElement addresident(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[text()='Add Resident']"));
	return element;
	}
	public static WebElement placeholder(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//input[@placeholder='Search by unit number, room or bed']"));
	return element;
	}
	public static WebElement residentfirstname(WebDriver driver)
	{
	element =  driver.findElement(By.id("resident_first_name"));
	return element;
	}
	public static WebElement residentlastname(WebDriver driver)
	{
	element =  driver.findElement(By.id("resident_last_name"));
	return element;
	}
	public static WebElement chrishenry(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[text()='Chris Henry']"));
	return element;
	}
	public static WebElement chrishenry2(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[text()='Chris Henry']"));
	return element;
	}
	public static WebElement residentaccept(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement buildingedit(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[text()='Unit 5']"));
	return element;
	}
	public static WebElement buildingedit2(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[@title='Unit 5 / Floor 101 / Building mickeymouse']"));
	return element;
	}
	public static WebElement buildingaccept(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//*[@class=\"ember-view inline-edit place in-edit disable-edit\"]/div[2]/div[2]/button[2]"));
	return element;
	}
	public static WebElement clickemailid(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@class='ember-view inline-edit email']"));
	return element;
	}
	public static WebElement residentemailid(WebDriver driver)
	{
	element =  driver.findElement(By.id("resident_email"));
	return element;
	}
	public static WebElement emailacceptbutton(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@class='field clearfix']//div[@class='ember-view inline-edit email in-edit disable-edit']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement mobilenumberedit(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[contains(text(),'456-1233')]"));
	return element;
	}
	public static WebElement mobilenumber(WebDriver driver)
	{
	element =  driver.findElement(By.id("resident_phone_number"));
	return element;
	}
	public static WebElement mobilenumberaccept(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@class='field-content']//div[@class='ember-view inline-edit primary_phone in-edit disable-edit']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement tags(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//li[@class='ember-view selection data-id-null-tag-76024304-cd5f-4688-8e2a-7c32f43fb6b6 cell-tag']"));
	return element;
	}
	public static WebElement resident_tags(WebDriver driver)
	{
	element =  driver.findElement(By.id("resident_tags"));
	return element;
	}
	public static WebElement tagsacceptbutton(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@class='ember-view inline-edit tags in-edit disable-edit']//button[@class='blank-button accept-btn']"));
	return element;
	}
	public static WebElement otherinfo(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//h5[text()='Other Information']"));
	return element;
	}
	public static WebElement labeltags(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//label[text()='Tags']"));
	return element;
	}
	public static WebElement residentcheckbox(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@style='width:44px;height:30px;']"));
	return element;
	}
	public static WebElement sendmessage(WebDriver driver)
	{
	element =  driver.findElement(By.id("message_bulk_residents_btn"));
	return element;
	}
	public static WebElement messagesubject(WebDriver driver)
	{
	element =  driver.findElement(By.id("message_subject"));
	return element;
	}
	public static WebElement textarea(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//textarea[@class='ember-view ember-text-area sw-textarea no-border']"));
	return element;
	}
	public static WebElement reviewmessage(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[contains(@class,'standardButton mainSubmit  blue enabled')]"));
	return element;
	}
	public static WebElement sendmessage1(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit  green enabled']"));
	return element;
	}
	public static WebElement editnotifications(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[@class='icon bulk-notification-edit']"));
	return element;
	}
	public static WebElement editnotificationsemail(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//p[text()='Email']"));
	return element;
	}
	public static WebElement editnotificationssms(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//p[text()='Email']"));
	return element;
	}
	public static WebElement savepreferences(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//button[@class='standardButton v2 blue ']"));
	return element;
	}
	public static WebElement searchbox(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//div[@class='search-box   ']"));
	return element;
	}
	public static WebElement searchboxid(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//input[@type='text']"));
	return element;
	}
	public static WebElement residen(WebDriver driver)
	{
	element =  driver.findElement(By.xpath("//span[@title='Chris Reads / Current']"));
	return element;
	}
}
