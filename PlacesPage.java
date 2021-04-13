package com.sightplan.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PlacesPage {
	
	static WebElement element = null;
	public static WebElement zoomin(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='places-map-controls map-zoom-controls small ']//button[@class='blank-button map-zoom-in light ']"));
	return element;
	}
    public static WebElement zoomout(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@class='places-map-controls map-zoom-controls small ']//button[@class='blank-button map-zoom-out light ']"));
	return element;
	}
    public static WebElement addplace(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='primary-button ']"));
	return element;
	}
    public static WebElement residential(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[@class='selected'][contains(text(),'Residential')]"));
	return element;
	}
    public static WebElement commercial(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='placetype-commercial']"));
	return element;
	}
    public static WebElement amenity(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//span[contains(@class,'selected')][contains(text(),'Amenity')]"));
	return element;
	}
    public static WebElement building(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='placetype-commercial-placetypedetail-building']"));
	return element;
	}
    public static WebElement placename(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//input[@id='place_name']"));
	return element;
	}
    public static WebElement accessibility(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@id='place_accessibility']"));
	return element;
	}
    public static WebElement accesible(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//li[@data-id='accessible-a']"));
	return element;
	}
    public static WebElement textarea(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//textarea[@placeholder='Brief description of the Place.']"));
   	return element;
   	}
    public static WebElement accesscontrol(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[contains(text(),'None')]"));
   	return element;
   	}
    public static WebElement codeplaceholder(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@style='padding-left: 47px']"));
   	return element;
   	}
    public static WebElement codeplaceholderfloor(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@tabindex='11']//input[@style='padding-left: 47px']"));
   	return element;
   	}
    public static WebElement alarmcode(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[@title='Alarm Code']"));
   	return element;
   	}
    public static WebElement buildingname(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@class='ember-view ember-text-field' and @tabindex='11']"));
   	return element;
   	}
    public static WebElement createplace(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit  green enabled']"));
   	return element;
   	}
    public static WebElement buildingtestplace(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='information clearfix ']//h3[text()='Building TestPlace']"));
   	return element;
   	}
    public static WebElement placetype(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Add Place']"));
   	return element;
   	}
    public static WebElement addfloor(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//input[@id='place_name']"));
   	return element;
   	}
    public static WebElement floor1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='information clearfix ']//h3[text()='Floor1']"));
   	return element;
   	}
    public static WebElement floor12(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Add Place']"));
   	return element;
   	}
    public static WebElement addunit(WebDriver driver)
   	{
   	element = driver.findElement(By.id("place_name"));
   	return element;
   	}
    public static WebElement unit1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='information clearfix ']//h3[text()='Unit1']"));
   	return element;
   	}
    public static WebElement room1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='information clearfix ']//h3[text()='Room1']"));
   	return element;
   	}
    public static WebElement reorder(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//a[@class='ember-view places-sidebar-button standardButton mainSubmit open']"));
   	return element;
   	}
    public static WebElement saveorder(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//a[@class='ember-view places-sidebar-button standardButton mainSubmit green']"));
   	return element;
   	}
    public static WebElement duplicateplace(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("/li[@class='sp-context-menu-item']//span[text()='Duplicate Place']"));
   	return element;
   	}
    public static WebElement updateplace(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit  blue enabled']"));
   	return element;
   	}
    public static WebElement delupdate(WebDriver driver)
   	{
   	element = driver.findElement(By.id("place_delete_button"));
   	return element;
   	}
    public static WebElement place_delete_input(WebDriver driver)
   	{
   	element = driver.findElement(By.id("place_delete_input"));
   	return element;
   	}
    public static WebElement place_delete_popup(WebDriver driver)
   	{
   	element = driver.findElement(By.id("place_delete_popup"));
   	return element;
   	}
    public static WebElement go(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//a[contains(text(),'GO')]"));
   	return element;
   	}
    public static WebElement leftclick(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='ember-view places-sidebar-place place-row-clickable']//h3[text()='Building TestPlace']"));
   	return element;
   	}
    public static WebElement leftclick2(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//h3[text()='Building Multisite']"));
   	return element;
   	}

    public static WebElement clickduplicate(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Duplicate Place']"));
   	return element;
   	}
    public static WebElement updatebutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton mainSubmit  blue enabled']"));
   	return element;
   	}
    public static WebElement placedeletebutton(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//a[@class='standardButton delete']"));
   	return element;
   	}
    public static WebElement bulkduplicate(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Bulk Duplicate']"));
   	return element;
   	}
    public static WebElement bulkduplicatecount(WebDriver driver)
   	{
   	element = driver.findElement(By.id("bulk_duplicate_count"));
   	return element;
   	}
    public static WebElement save(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue ']"));
   	return element;
   	}
    public static WebElement rename(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Rename Place...']"));
   	return element;
   	}
    public static WebElement placeholder(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@tabindex='1']//input[@placeholder='Name']"));
   	return element;
   	}
    public static WebElement buildingtestplace1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@class='information clearfix hasChildren']//h3[text()='Building TestPlace1']"));
   	return element;
   	}
    public static WebElement editplace(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Edit Place...']"));
   	return element;
   	}
    public static WebElement placeholder1(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[@tabindex='3']//input[@class='ember-view ember-text-field']"));
   	return element;
   	}
    public static WebElement deleteplace(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Delete Place...']"));
   	return element;
   	}
    public static WebElement deletebuildingyes(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton destructive right ']"));
   	return element;
   	}
    public static WebElement clicktag(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//div[text()='Search or pick from the list']"));
   	return element;
   	}
    public static WebElement selecttag(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//li[@data-id='tag:76024304-cd5f-4688-8e2a-7c32f43fb6b6']"));
   	return element;
   	}
    public static WebElement profileandaccount(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//span[text()='Profile & Account']"));
   	return element;
   	}
    public static WebElement signout(WebDriver driver)
   	{
   	element = driver.findElement(By.id("sign-out"));
   	return element;
   	}
    public static WebElement bulkduplicatesave(WebDriver driver)
   	{
   	element = driver.findElement(By.xpath("//button[@class='standardButton v2 blue  ']"));
   	return element;
   	}
    
    
    
    
}
