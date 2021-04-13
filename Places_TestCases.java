package com.sightplan.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sightplan.pageObjects.LoginPage;
import com.sightplan.pageObjects.PlacesPage;
import com.sightplan.pageObjects.tasksPage;

public class Places_TestCases extends BaseClass{
	
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("commit")));
    	Thread.sleep(1000);
    	JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//span[text()='© SightPlan Inc. All Rights Reserved.']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(1000);
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clicksubmit();
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Portfolio']")));
    	Thread.sleep(1000);
		
		}
	
	@Test(priority=2)
	public void zoominzoomouttest() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/places");
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='places-map-controls map-zoom-controls small ']//button[@class='blank-button map-zoom-in light ']")));
	Thread.sleep(1000);
	PlacesPage.zoomin(driver).click();
	Thread.sleep(2000);
	PlacesPage.zoomout(driver).click();
	Thread.sleep(6000);
	}
	@Test(priority=3)
	public void addplacebuilding() throws InterruptedException
	{
	PlacesPage.addplace(driver).click();
	Thread.sleep(2000);
	PlacesPage.residential(driver).click();
	Thread.sleep(2000);
	PlacesPage.commercial(driver).click();
	Thread.sleep(2000);
	PlacesPage.amenity(driver).click();
	Thread.sleep(2000);
	PlacesPage.building(driver).click();
	Thread.sleep(2000);
	PlacesPage.placename(driver).sendKeys("TestPlace");
	Thread.sleep(2000);
	PlacesPage.accessibility(driver).click();
	Thread.sleep(2000);
	PlacesPage.accesible(driver).click();
	Thread.sleep(2000);
	PlacesPage.textarea(driver).sendKeys("This is for Automation Testing Purpose");
	Thread.sleep(2000);
	
    PlacesPage.accesscontrol(driver).click();
	Thread.sleep(2000);
	PlacesPage.alarmcode(driver).click();
	Thread.sleep(2000);
	PlacesPage.codeplaceholder(driver).sendKeys("216");
	Thread.sleep(2000);
	PlacesPage.clicktag(driver).click();
	Thread.sleep(2000);
	PlacesPage.selecttag(driver).click();
	Thread.sleep(2000);
	PlacesPage.createplace(driver).click();
	Thread.sleep(10000);
		
	}
	@Test(priority=4)
	public void addfloor() throws InterruptedException
	{
		
		
		PlacesPage.buildingtestplace(driver).click();
		Thread.sleep(2000);
		PlacesPage.placetype(driver).click();
		Thread.sleep(2000);
		PlacesPage.addfloor(driver).sendKeys("Floor1");
		Thread.sleep(1000);
		PlacesPage.accessibility(driver).click();
		Thread.sleep(1000);
		PlacesPage.accesible(driver).click();
		Thread.sleep(1000);
		PlacesPage.textarea(driver).sendKeys("This is for Adding floor1");
		Thread.sleep(1000);
		PlacesPage.accesscontrol(driver).click();
		Thread.sleep(1000);
		PlacesPage.alarmcode(driver).click();
		Thread.sleep(1000);
		PlacesPage.codeplaceholderfloor(driver).sendKeys("216");
		Thread.sleep(2000);
		PlacesPage.createplace(driver).click();
		Thread.sleep(10000);
	}
	@Test(priority=5)
	public void addunit() throws InterruptedException
	{
	
	PlacesPage.floor1(driver).click();
	Thread.sleep(2000);
	PlacesPage.floor12(driver).click();
	Thread.sleep(2000);
	PlacesPage.addunit(driver).sendKeys("Unit1");
	Thread.sleep(1000);
	PlacesPage.accessibility(driver).click();
	Thread.sleep(1000);
	PlacesPage.accesible(driver).click();
	Thread.sleep(1000);
	PlacesPage.textarea(driver).sendKeys("This is for Adding Unit1");
	Thread.sleep(1000);
	PlacesPage.accesscontrol(driver).click();
	Thread.sleep(1000);
	PlacesPage.alarmcode(driver).click();
	Thread.sleep(1000);
	PlacesPage.codeplaceholder(driver).sendKeys("216");
	Thread.sleep(2000);
	PlacesPage.createplace(driver).click();
	Thread.sleep(10000);
	}
	
	@Test(priority=6)
	public void addroom() throws InterruptedException
	{
	
	PlacesPage.unit1(driver).click();
	Thread.sleep(2000);
	PlacesPage.addplace(driver).click();
	Thread.sleep(2000);
	PlacesPage.placename(driver).sendKeys("Room1");
	Thread.sleep(1000);
	PlacesPage.accessibility(driver).click();
	Thread.sleep(1000);
	PlacesPage.accesible(driver).click();
	Thread.sleep(1000);
	PlacesPage.textarea(driver).sendKeys("This is for Adding Unit");
	Thread.sleep(1000);
	PlacesPage.accesscontrol(driver).click();
	Thread.sleep(1000);
	PlacesPage.alarmcode(driver).click();
	Thread.sleep(1000);
	PlacesPage.codeplaceholder(driver).sendKeys("216");
	Thread.sleep(2000);
	PlacesPage.createplace(driver).click();
	Thread.sleep(10000);
	
	}
	
	@Test(priority=7)
	public void addbed() throws InterruptedException
	{
	
	PlacesPage.room1(driver).click();
	Thread.sleep(2000);
	PlacesPage.addplace(driver).click();
	Thread.sleep(2000);
	PlacesPage.placename(driver).sendKeys("Bed1");
	Thread.sleep(1000);
	PlacesPage.accessibility(driver).click();
	Thread.sleep(1000);
	PlacesPage.accesible(driver).click();
	Thread.sleep(1000);
	PlacesPage.textarea(driver).sendKeys("This is for Adding bed1");
	Thread.sleep(1000);
	PlacesPage.accesscontrol(driver).click();
	Thread.sleep(1000);
	PlacesPage.alarmcode(driver).click();
	Thread.sleep(1000);
	PlacesPage.codeplaceholder(driver).sendKeys("216");
	Thread.sleep(2000);
	PlacesPage.createplace(driver).click();
	Thread.sleep(10000);
	
	}
	@Test(priority=8)
	public void reorderplaces() throws InterruptedException
	{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/places");
		Thread.sleep(20000);	
		PlacesPage.reorder(driver).click();
		Thread.sleep(1000);
		PlacesPage.saveorder(driver).click();
		Thread.sleep(1000);
	}
	@Test(priority=9)
	public void DuplicatePlace()throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = PlacesPage.leftclick(driver);
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
		PlacesPage.clickduplicate(driver).click();
		Thread.sleep(4000);
		PlacesPage.updatebutton(driver).click();
		Thread.sleep(4000);
		
		PlacesPage.placedeletebutton(driver).click();
		Thread.sleep(1000);
		PlacesPage.place_delete_input(driver).sendKeys("DELETE");
		Thread.sleep(1000);
		PlacesPage.place_delete_popup(driver).click();
		Thread.sleep(1000);
		PlacesPage.go(driver).click();
		Thread.sleep(10000);
		
	}
	@Test(priority=10)
	public void bulkDuplicatePlace()throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = PlacesPage.leftclick(driver);
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
		PlacesPage.bulkduplicate(driver).click();
		Thread.sleep(1000);
		PlacesPage.bulkduplicatecount(driver).sendKeys("1");
		Thread.sleep(1000);
		PlacesPage.bulkduplicatesave(driver).click();
		Thread.sleep(8000);
		
		
		
	}
	
	@Test(priority=11)
	public void renameplace()throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = PlacesPage.leftclick(driver);
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
		PlacesPage.rename(driver).click();
		Thread.sleep(1000);
		PlacesPage.placeholder(driver).clear();
		PlacesPage.placeholder(driver).sendKeys("TestPlace1");
		PlacesPage.save(driver).click();
		Thread.sleep(8000);
		Actions actions1 = new Actions(driver);
		WebElement elementLocator1 = PlacesPage.buildingtestplace1(driver);
		actions1.contextClick(elementLocator1).perform();
		Thread.sleep(1000);
		PlacesPage.rename(driver).click();
		Thread.sleep(1000);
		PlacesPage.placeholder(driver).clear();
		PlacesPage.placeholder(driver).sendKeys("TestPlace");
		PlacesPage.save(driver).click();
		Thread.sleep(8000);
}
	@Test(priority=12)
	public void EditPlace()throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = PlacesPage.leftclick(driver);
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
		PlacesPage.editplace(driver).click();
		Thread.sleep(1000);
		PlacesPage.placeholder1(driver).clear();
		PlacesPage.placeholder1(driver).sendKeys("TestPlace");
		PlacesPage.updatebutton(driver).click();
		Thread.sleep(8000);
	}
	@Test(priority=13)
	public void DeletePlace()throws InterruptedException {
		Actions actions = new Actions(driver);
		WebElement elementLocator = PlacesPage.leftclick(driver);
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
		PlacesPage.deleteplace(driver).click();
		Thread.sleep(1000);
		PlacesPage.deletebuildingyes(driver).click();
		Thread.sleep(8000);
	}	
	
	@Test(priority=14)
	public void Addbuildinginanothersite() throws InterruptedException {
		
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/7a02bb36-35f2-4916-89b6-cb7574c33cfc/places");
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='primary-button ']")));
    	Thread.sleep(1000);
		PlacesPage.addplace(driver).click();
		Thread.sleep(2000);
		PlacesPage.residential(driver).click();
		Thread.sleep(2000);
		PlacesPage.commercial(driver).click();
		Thread.sleep(1000);
		PlacesPage.amenity(driver).click();
		Thread.sleep(1000);
		PlacesPage.building(driver).click();
		Thread.sleep(1000);
		PlacesPage.placename(driver).sendKeys("Multisite");
		Thread.sleep(1000);
		PlacesPage.accessibility(driver).click();
		Thread.sleep(1000);
		PlacesPage.accesible(driver).click();
		Thread.sleep(1000);
		PlacesPage.textarea(driver).sendKeys("This is for Automation Testing Purpose");
		Thread.sleep(1000);
		PlacesPage.accesscontrol(driver).click();
		Thread.sleep(1000);
		PlacesPage.alarmcode(driver).click();
		Thread.sleep(1000);
		PlacesPage.codeplaceholder(driver).sendKeys("216");
		Thread.sleep(2000);
		PlacesPage.createplace(driver).click();
		Thread.sleep(6000);
		Actions actions = new Actions(driver);
		WebElement elementLocator = PlacesPage.leftclick2(driver);
		actions.contextClick(elementLocator).perform();
		Thread.sleep(1000);
		PlacesPage.deleteplace(driver).click();
		Thread.sleep(1000);
		PlacesPage.deletebuildingyes(driver).click();
		Thread.sleep(8000);
		
		
		
	}
	
	
}

