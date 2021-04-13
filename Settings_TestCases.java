package com.sightplan.testCases;

import org.openqa.selenium.By;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import com.sightplan.pageObjects.LoginPage;

import com.sightplan.pageObjects.SettingsPage;


public class Settings_TestCases extends BaseClass{
	
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
		WebDriverWait wait1 = new WebDriverWait(driver, 500);
    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Portfolio']")));
    	Thread.sleep(1000);
		
		}
	 @Test(priority=2) 
		public void profile() throws InterruptedException
		{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings");	
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Settings ']")));
    	Thread.sleep(1000);
		SettingsPage.locationname(driver).clear();
		SettingsPage.locationname(driver).sendKeys("test site with links");
		SettingsPage.locationshortname(driver).clear();
		SettingsPage.locationshortname(driver).sendKeys("ts with links");
		SettingsPage.addressstreet(driver).clear();
		SettingsPage.addressstreet(driver).sendKeys("351 S Studio Dr");
		SettingsPage.addresscity(driver).clear();
		SettingsPage.addresscity(driver).sendKeys("Lake Buena Vista");
		SettingsPage.addresszip(driver).clear();
		SettingsPage.addresszip(driver).sendKeys("32830");
		SettingsPage.locateonmap(driver).click();
		Thread.sleep(3000);
		SettingsPage.save(driver).click();
		Thread.sleep(2000);
		SettingsPage.sitetype(driver).click();
		Thread.sleep(1000);
		SettingsPage.lowrise(driver).click();
		Thread.sleep(1000);
		SettingsPage.addressunitcount(driver).clear();
		SettingsPage.addressunitcount(driver).sendKeys("50");
		 SettingsPage.siteclass(driver).click();
		 SettingsPage.A(driver).click();
		 SettingsPage.conventional(driver).click();
		 SettingsPage.conventional(driver).click();
		 SettingsPage.savesettings(driver).click();
		 Thread.sleep(10000);
	
	
	
		}
	 @Test(priority=3) 
		public void AddRatingGroup() throws InterruptedException
		{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/ratings");	
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Rating Group']")));
    	Thread.sleep(1000);
		SettingsPage.addratinggroup(driver).click();
		Thread.sleep(1000);
		SettingsPage.ratinggroupname(driver).sendKeys("Automation Group");
		Thread.sleep(1000);
		SettingsPage.addscoringvalue(driver).click();
		Thread.sleep(1000);
		SettingsPage.ratingname(driver).sendKeys("Rating1");
		Thread.sleep(1000);
		SettingsPage.colourpalette(driver).click();
		Thread.sleep(1000);
		SettingsPage.colour(driver).click();
		Thread.sleep(1000);
		SettingsPage.number(driver).clear();
		Thread.sleep(1000);
		SettingsPage.number(driver).sendKeys("10");
		Thread.sleep(1000);
		SettingsPage.requestadditionaldetails(driver).click();
		Thread.sleep(1000);
		SettingsPage.photo(driver).click();
		Thread.sleep(1000);
		SettingsPage.required(driver).click();
		Thread.sleep(1000);
		SettingsPage.iconcompletionnote(driver).click();
		Thread.sleep(1000);
		SettingsPage.iconcompletionnote(driver).click();
		Thread.sleep(1000);
		SettingsPage.togglecontainercost(driver).click();
		Thread.sleep(1000);
		SettingsPage.savedetails(driver).click();
		Thread.sleep(1000);
		SettingsPage.ratingname2(driver).sendKeys("Rating2");
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = SettingsPage.clickanddragratings(driver);	
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    SettingsPage.submit(driver).click();
	    Thread.sleep(10000);
		}
	 @Test(priority=4) 
		public void editRatingGroup() throws InterruptedException
		{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/ratings");	
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Rating Group']")));
    	Thread.sleep(1000);
		SettingsPage.autogroup(driver).click();
		Thread.sleep(1000);
		SettingsPage.editautogroup(driver).clear();
		SettingsPage.editautogroup(driver).sendKeys("Automation Group");
		Thread.sleep(1000);
		SettingsPage.addscoringvalue(driver).click();
		Thread.sleep(1000);
		SettingsPage.addscoringvalue(driver).click();
		Thread.sleep(1000);
		SettingsPage.rating12(driver).clear();
		SettingsPage.rating12(driver).sendKeys("rating12");
		Thread.sleep(1000);
		SettingsPage.bgcolor(driver).click();
		Thread.sleep(1000);
		SettingsPage.anothercolor(driver).click();
		Thread.sleep(1000);
		SettingsPage.score(driver).clear();
		SettingsPage.score(driver).sendKeys("20");
		Thread.sleep(1000);
		SettingsPage.iconrightactive(driver).click();
		Thread.sleep(1000);
		SettingsPage.save1(driver).click();
		Thread.sleep(2000);
		SettingsPage.save12(driver).click();
		Thread.sleep(10000);
		}
		@Test(priority=5) 
		public void DeleteRatingGroup() throws InterruptedException
		{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/ratings");	
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Settings ']")));
    	Thread.sleep(1000);
		SettingsPage.autogroup(driver).click();
		Thread.sleep(1000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = SettingsPage.clickanddragratings(driver);	
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    SettingsPage.drg(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.dg(driver).click();
	    Thread.sleep(10000);
		}
		@Test(priority=6) 
		public void Automation() throws InterruptedException
		{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/automation");	
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Settings ']")));
    	Thread.sleep(1000);
		SettingsPage.switchknob(driver).click();
		Thread.sleep(1000);
		SettingsPage.enableautoclose(driver).clear();
		SettingsPage.enableautoclose(driver).sendKeys("12");
		SettingsPage.enableautoclosebutton(driver).click();
		Thread.sleep(5000);
		SettingsPage.switchknob2(driver).click();
		Thread.sleep(3000);
		}
	@Test(priority=7) 
	public void addcategory() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/categories");	
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Category']")));
	Thread.sleep(2000);
	SettingsPage.addcategory(driver).click();
	Thread.sleep(1000);
	SettingsPage.placeholder(driver).sendKeys("Auto Test");
	Thread.sleep(1000);
	SettingsPage.workspace(driver).click();
	
	SettingsPage.residentissue(driver).click();
	SettingsPage.editbutton(driver).click();
	SettingsPage.administration(driver).click();
	SettingsPage.enablecategory(driver).click();
	SettingsPage.enablecategory(driver).click();
	SettingsPage.categorydescription(driver).sendKeys("This is for Automation Testing");
	JavascriptExecutor js0 = (JavascriptExecutor) driver;       		
    WebElement Element0 = SettingsPage.description(driver);	
    js0.executeScript("arguments[0].scrollIntoView();", Element0);
    Thread.sleep(1000);
    SettingsPage.tags(driver).click();
    SettingsPage.categorytags(driver).click();
    SettingsPage.categorytagstooltip(driver).click();
    SettingsPage.addasynomyn(driver).sendKeys("Automation");
    JavascriptExecutor js = (JavascriptExecutor) driver;        		
    WebElement Element = SettingsPage.sightplan(driver);	
    js.executeScript("arguments[0].scrollIntoView();", Element);
    Thread.sleep(1000);	
    SettingsPage.category(driver).click();
    Thread.sleep(1000);	
    SettingsPage.worktype(driver).click();
    Thread.sleep(1000);	
    SettingsPage.addresource(driver).click();
    Thread.sleep(1000);	
    SettingsPage.uploadbutton(driver).click();
    Thread.sleep(1000);
    SettingsPage.addlink(driver).click();
    Thread.sleep(1000);	
    SettingsPage.weburl(driver).sendKeys("https://www.sightplan.com/");
    Thread.sleep(1000);	
    SettingsPage.label(driver).sendKeys("SightPlan");
    Thread.sleep(1000);	
    SettingsPage.addlinkbutton(driver).click();
    Thread.sleep(2000);	
    SettingsPage.placeholder2(driver).sendKeys("A multi-family resident service");
    Thread.sleep(1000);	
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    WebElement Element1 = SettingsPage.requireresource(driver);
    js1.executeScript("arguments[0].scrollIntoView();", Element1);
    Thread.sleep(1000);	
    SettingsPage.requireresource(driver).click();
    Thread.sleep(1000);	
    JavascriptExecutor js2 = (JavascriptExecutor) driver;
    WebElement Element2 = SettingsPage.requireforeverytask(driver);
    js2.executeScript("arguments[0].scrollIntoView();", Element2);
    Thread.sleep(1000);
    SettingsPage.requireforeverytask(driver).click();
    Thread.sleep(1000);
    SettingsPage.viewtaskdetails(driver).click();
    Thread.sleep(1000);
    SettingsPage.closetask(driver).click();
    Thread.sleep(1000);
    SettingsPage.Requiredforeverytask(driver).click();
    Thread.sleep(1000);
    SettingsPage.onlyrequiredonetime(driver).click();
    Thread.sleep(1000);
    SettingsPage.submit3(driver).click();
    Thread.sleep(2000);
    SettingsPage.tasks(driver).click();
    Thread.sleep(1000);
    SettingsPage.setdocumentationbycategory(driver).click();
    Thread.sleep(1000);
    JavascriptExecutor js3 = (JavascriptExecutor) driver;
    WebElement Element3 = SettingsPage.taskdocumentation(driver);
    js3.executeScript("arguments[0].scrollIntoView();", Element3);
    Thread.sleep(1000);
    SettingsPage.documentation(driver).click();
    Thread.sleep(1000);
    SettingsPage.checkmark(driver).click();
    Thread.sleep(1000);
    SettingsPage.settaskasurgent(driver).click();
    Thread.sleep(1000);
    SettingsPage.availabletoresidents(driver).click();
    Thread.sleep(1000);
    SettingsPage.placeholder1(driver).sendKeys("Stay home#Stay Safe# Covid-19 Alert");
    Thread.sleep(1000);
    
    JavascriptExecutor js4 = (JavascriptExecutor) driver;
	WebElement Element4 = SettingsPage.textsometimes(driver);
	js4.executeScript("arguments[0].scrollIntoView();", Element4);
	Thread.sleep(1000);
	SettingsPage.button(driver).click();
	Thread.sleep(1000);
	SettingsPage.placeholder3(driver).sendKeys("Stay home#Stay Safe# Covid-19 Alert");
	Thread.sleep(1000);
	JavascriptExecutor js5 = (JavascriptExecutor) driver;
	WebElement Element5 = SettingsPage.requiresubcategory(driver);
	js5.executeScript("arguments[0].scrollIntoView();", Element5);
	Thread.sleep(1000);
	SettingsPage.requiresubcategory(driver).click();
	Thread.sleep(1000);
	SettingsPage.save2(driver).click();
	Thread.sleep(20000);
	}
	@Test(priority=8)
	  public void AddSubCategory()throws InterruptedException {
	  driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/categories");
	  WebDriverWait wait = new WebDriverWait(driver, 100);
  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Category']")));
  	Thread.sleep(1000);
	  Actions actions = new Actions(driver);
	  WebElement elementLocator = SettingsPage.Autotest(driver);
	  actions.contextClick(elementLocator).perform();
	  Thread.sleep(1000);
	  SettingsPage.addsubcategory(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.addsubcategoryplaceholder(driver).sendKeys("Auto Test1");
	  Thread.sleep(1000);
	  SettingsPage.addsubcategorytextarea(driver).sendKeys("This is for Automation Testing Purpose");
	  Thread.sleep(1000);
	  SettingsPage.addasynomyn(driver).sendKeys("Automation");
	  Thread.sleep(1000);
	  JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement Element1 = SettingsPage.sightplan(driver);	
	    js1.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(1000);
	    SettingsPage.category(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.sightplan(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.addresourcebutton(driver).click();
	     Thread.sleep(1000);
	    SettingsPage.uploadbutton(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.addlink(driver).click();
	    Thread.sleep(1000);	
	    SettingsPage.weburl(driver).sendKeys("www.outlook.com");
	    Thread.sleep(1000);	
	    SettingsPage.label(driver).sendKeys("Outlook");
	    Thread.sleep(1000);	
	   SettingsPage.addlbutton(driver).click();
	   Thread.sleep(1000);	
	   SettingsPage.placeholder2(driver).sendKeys("This is for Automation Testing");
	   Thread.sleep(1000);
	   JavascriptExecutor js2 = (JavascriptExecutor) driver;
	    WebElement Element2 = SettingsPage.text(driver);
	    js2.executeScript("arguments[0].scrollIntoView();", Element2);
	    Thread.sleep(1000);
	    SettingsPage.requireresource(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = SettingsPage.requireforeverytask(driver);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    SettingsPage.requireforeverytask(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.addtasksettings(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.tasks(driver).click();
	    Thread.sleep(1000);
	    
	    SettingsPage.setdocumentationbysubcategory(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js3 = (JavascriptExecutor) driver;
	    WebElement Element3 = SettingsPage.taskdocumentation(driver);
	    js3.executeScript("arguments[0].scrollIntoView();", Element3);
	    Thread.sleep(1000);
	    SettingsPage.documentation(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.checkmark(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.settaskasurgent(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.availabletoresidents(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js0 = (JavascriptExecutor) driver;
		WebElement Element0 = SettingsPage.instructionsforresidents(driver);
		js0.executeScript("arguments[0].scrollIntoView();", Element0);
		Thread.sleep(1000);
	    SettingsPage.ph(driver).sendKeys("Stay home#Stay Safe# Covid-19 Alert");
	    Thread.sleep(1000);
	    SettingsPage.confirmationquestion(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js5 = (JavascriptExecutor) driver;
		WebElement Element5 = SettingsPage.qualifierquestion(driver);
		js5.executeScript("arguments[0].scrollIntoView();", Element5);
		Thread.sleep(1000);
		SettingsPage.ph2(driver).sendKeys("Meet Me");
		Thread.sleep(1000);
	    
		SettingsPage.greenbutton(driver).click();
		Thread.sleep(20000);
		}
	  @Test(priority=9)
	  public void DisableCategory()throws InterruptedException {
	  driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/categories");
	  WebDriverWait wait = new WebDriverWait(driver, 100);
  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Settings ']")));
  	Thread.sleep(2000);
	  Actions actions = new Actions(driver);
	  WebElement elementLocator = SettingsPage.Autotest(driver);
	  actions.contextClick(elementLocator).perform();
	  Thread.sleep(1000);
	  SettingsPage.disablecategory(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.disablecategorybutton(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.updatecategory(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.headerupdateopentasks(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.updatecategory(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.worktypevoicemail(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.updatetasksbutton(driver).click();
	  Thread.sleep(20000);
	  }
	  @Test(priority=10)
	  public void enableCategory()throws InterruptedException {
	  driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/categories");
	  WebDriverWait wait = new WebDriverWait(driver, 100);
  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Settings ']")));
  	Thread.sleep(2000);
	  Actions actions = new Actions(driver);
	  WebElement elementLocator = SettingsPage.Autotest(driver);
	  actions.contextClick(elementLocator).perform();
	  Thread.sleep(1000);
	  SettingsPage.enablecategory1(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.enablecategorybutton(driver).click();
	  Thread.sleep(20000);
	  }
	  @Test(priority=11)
	  public void DeleteCategory()throws InterruptedException {
	  driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/categories");
	  WebDriverWait wait = new WebDriverWait(driver, 100);
  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Auto Test']")));
  	Thread.sleep(2000);
	  Actions actions = new Actions(driver);
	  WebElement elementLocator = SettingsPage.Autotest(driver);
	  actions.contextClick(elementLocator).perform();
	  Thread.sleep(1000);
	  SettingsPage.deletecategory(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.deletecategorybutton(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.updatecategory(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.worktypevoicemail(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.updatetasksbutton(driver).click();
	  Thread.sleep(20000);
	  }
	  @Test(priority=12)
	  public void Notifications()throws InterruptedException {
	  driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/notifications");
	  WebDriverWait wait = new WebDriverWait(driver, 100);
  	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Settings ']")));
  	  Thread.sleep(1000);
	  SettingsPage.selectday(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.sunday(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.selectday2(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.friday(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.nineam(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.nineam2(driver).click();
	  Thread.sleep(1000);
	  //SettingsPage.five(driver).click();
	  //Thread.sleep(2000);
	  //SettingsPage.five2(driver).click();
	  //Thread.sleep(1000);
	  SettingsPage.leasingoffice(driver).clear();
	  SettingsPage.leasingoffice(driver).sendKeys("Leasing Office");
	  Thread.sleep(1000);
	  SettingsPage.phonenumber(driver).clear();
	  SettingsPage.phonenumber(driver).sendKeys("7894561213");
	  Thread.sleep(1000);
	  SettingsPage.email(driver).clear();
	  SettingsPage.email(driver).sendKeys("chandunasaka@gmail.com");
	  Thread.sleep(2000);
	  JavascriptExecutor js7 = (JavascriptExecutor) driver;
	    WebElement Element7 = SettingsPage.schedulednotifications(driver);	
	    js7.executeScript("arguments[0].scrollIntoView();", Element7);
	    Thread.sleep(1000);
	    SettingsPage.sendnotificationsat(driver).click();
	    SettingsPage.nine(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = SettingsPage.siteactivitydigestemail(driver);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    SettingsPage.daily(driver).click();
	    SettingsPage.weekly(driver).click();
	    SettingsPage.save3(driver).click();
	    Thread.sleep(10000);
	    driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/notifications");
		  WebDriverWait wait1 = new WebDriverWait(driver, 100);
	  	  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class='blank-button remove']")));
	  	  Thread.sleep(1000);
	  	  SettingsPage.remove(driver).click();
	  	Thread.sleep(1000);
	  	SettingsPage.save3(driver).click();
	  	Thread.sleep(5000);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
	  @Test(priority=13)
	  public void residentservicebranding()throws InterruptedException {
	  driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/residents/branding");
	  WebDriverWait wait = new WebDriverWait(driver, 100);
  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Settings ']")));
  	Thread.sleep(1000);
	  JavascriptExecutor js1= (JavascriptExecutor) driver;
	    WebElement Element1 = SettingsPage.brandcolor(driver);	
	    js1.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(1000);
	    SettingsPage.color(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.color1(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.resettodefault(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js= (JavascriptExecutor) driver;
	    WebElement Element = SettingsPage.residentportaldomain(driver);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    SettingsPage.choosename(driver).clear();
	    SettingsPage.choosename(driver).sendKeys("test-site-with-links");
	    Thread.sleep(1000);
	    JavascriptExecutor js2= (JavascriptExecutor) driver;
	    WebElement Element2 = SettingsPage.residentserviceintegrations(driver);	
	    js2.executeScript("arguments[0].scrollIntoView();", Element2);
	   Thread.sleep(1000);
	    SettingsPage.onlinerentpayment(driver).click();
	    Thread.sleep(1000);
	    SettingsPage.onlinerentpaymentph(driver).clear();
	    SettingsPage.onlinerentpaymentph(driver).sendKeys("https://paytm.com");
	    JavascriptExecutor js3= (JavascriptExecutor) driver;
	    WebElement Element3 = SettingsPage.marketingintegrations(driver);
	    js3.executeScript("arguments[0].scrollIntoView();", Element3);
	    Thread.sleep(1000);
	    SettingsPage.websiteurl(driver).clear();
	    SettingsPage.websiteurl(driver).sendKeys("http://www.myntra.com");
	    Thread.sleep(3000);
	    
		
		
		
}		
	  @Test(priority=14)
	  public void residentservicetasks()throws InterruptedException {
	  SettingsPage.residentservicetasks(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.reopeningtasks(driver).click();
	  Thread.sleep(2000);
	  SettingsPage.reopeningtasksph(driver).clear();
	  SettingsPage.reopeningtasksph(driver).sendKeys("30");
	  Thread.sleep(1000);
	  SettingsPage.residentservicesave(driver).click();
	  Thread.sleep(5000);
	  SettingsPage.reopeningtasks(driver).click();
	  Thread.sleep(2000);
	  SettingsPage.residentservicesave(driver).click();
	  Thread.sleep(5000);
	  }
	  @Test(priority=15)
	  public void residentservicemarketplace()throws InterruptedException {
	  driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/residents/marketplace");
	  WebDriverWait wait = new WebDriverWait(driver, 100);
  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Business']")));
  	Thread.sleep(1000);
	  //SettingsPage.residentservicemarketplace(driver).click();
	  //Thread.sleep(5000);
	  SettingsPage.configure(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.enableyelp(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.disableyelp(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.enableyelp(driver).click();
	  Thread.sleep(1000);
	  //SettingsPage.distanceradius(driver).click();
	  //Thread.sleep(2000);
	  //JavascriptExecutor js4= (JavascriptExecutor) driver;
	  //WebElement Element4 = SettingsPage.miles4(driver);	
	 // js4.executeScript("arguments[0].scrollIntoView();", Element4);
	 // Thread.sleep(1000);
	  //SettingsPage.miles5(driver).click();
	  //Thread.sleep(1000);
	  SettingsPage.residentservicesave(driver).click();
      Thread.sleep(5000);
      SettingsPage.businesses(driver).click();
      Thread.sleep(4000);
      SettingsPage.addbusiness(driver).click();
      Thread.sleep(1000);
      SettingsPage.addbusinessph(driver).sendKeys("Triple H Gym");
      Thread.sleep(1000);
      SettingsPage.addbusinesscategory(driver).click();
      Thread.sleep(1000);
      SettingsPage.activelife(driver).click();
      Thread.sleep(1000);
      SettingsPage.visibletoresidents(driver).click();
      Thread.sleep(1000);
      SettingsPage.address(driver).sendKeys("8113 Resort Village Drive");
      Thread.sleep(1000);
      SettingsPage.address2(driver).sendKeys("2114 leone");
      Thread.sleep(1000);
      SettingsPage.phone(driver).sendKeys("8456462323");
      Thread.sleep(1000);
      JavascriptExecutor js= (JavascriptExecutor) driver;
      WebElement Element = SettingsPage.description1(driver);
      js.executeScript("arguments[0].scrollIntoView();", Element);
      Thread.sleep(1000);
      SettingsPage.descriptionph(driver).sendKeys("This is for Automation");
      Thread.sleep(1000);
      SettingsPage.dropfiletoattach(driver).sendKeys("E:\\joaquin-phoenix-joker-759.jpg");
      Thread.sleep(1000);
      SettingsPage.offer(driver).click();
      Thread.sleep(1000);
      SettingsPage.offertitle(driver).sendKeys("$5 Deal");
      Thread.sleep(1000);
      SettingsPage.weburl1(driver).sendKeys("www.myntra.com");
      Thread.sleep(1000);
      SettingsPage.placeholder4(driver).sendKeys("This is for Automation Testing Purpose");
      Thread.sleep(1000);
      JavascriptExecutor js1= (JavascriptExecutor) driver;
      WebElement Element1 = SettingsPage.daterange(driver);	
      js1.executeScript("arguments[0].scrollIntoView();", Element1);
      Thread.sleep(1000);
      SettingsPage.startdate(driver).click();
      Thread.sleep(1000);
      SettingsPage.date(driver).click();
      Thread.sleep(1000);
      SettingsPage.createbusiness(driver).click();
      Thread.sleep(10000);
      SettingsPage.createdby(driver).click();
      Thread.sleep(1000);
      SettingsPage.sammyd(driver).click();
      Thread.sleep(3000);
      SettingsPage.header(driver).click();
      Thread.sleep(1000);
      Actions actions = new Actions(driver);
  	WebElement elementLocator = SettingsPage.triple(driver);
  	actions.contextClick(elementLocator).perform();
  	Thread.sleep(1000);
  	SettingsPage.deletebusiness(driver).click();
  	Thread.sleep(1000);
  	SettingsPage.deletebusinessbutton(driver).click();
  	Thread.sleep(7000);
	  }
	  
	  @Test(priority=16)
	  public void customcontent()throws InterruptedException {
		  SettingsPage.customcontentlink(driver).click();
		  Thread.sleep(4000);
		  SettingsPage.addsection(driver).click();
		  Thread.sleep(1000);
		  SettingsPage.sectionname(driver).sendKeys("Automation");
		  Thread.sleep(1000);
		  SettingsPage.ph4(driver).sendKeys("This is for Automation Testing Purpose");
		  Thread.sleep(1000);
		  SettingsPage.createsection(driver).click();
		  Thread.sleep(4000);
		  Actions actions1 = new Actions(driver);
			WebElement elementLocator1 = SettingsPage.automation(driver);
			actions1.contextClick(elementLocator1).perform();
			Thread.sleep(1000);
			SettingsPage.addsubsection(driver).click();
			Thread.sleep(1000);
			SettingsPage.subsectionname(driver).sendKeys("subsection");
			Thread.sleep(1000);
			SettingsPage.contenttype(driver).click();
			Thread.sleep(1000);
			SettingsPage.subsectionweburl(driver).click();
			Thread.sleep(1000);
			SettingsPage.weburlplaceholder(driver).sendKeys("https://www.who.int/");
			Thread.sleep(1000);
			SettingsPage.createsubsection(driver).click();
			Thread.sleep(6000);
			Actions actions2 = new Actions(driver);
			WebElement elementLocator2 = SettingsPage.automation(driver);
			actions2.contextClick(elementLocator2).perform();
			Thread.sleep(1000);
			SettingsPage.deletesection(driver).click();
			Thread.sleep(1000);
			SettingsPage.deletesectionbutton(driver).click();
			Thread.sleep(5000);
	   }
	  @Test(priority=17)
	  public void Announcements()throws InterruptedException {
	  driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/settings/residents/announcements");
	  WebDriverWait wait = new WebDriverWait(driver, 100);
  	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@title='Add an announcement [N]']")));
  	Thread.sleep(1000);
	  SettingsPage.addannouncement(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.business(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.businessdropdown(driver).click();
	  Thread.sleep(1000);
	  SettingsPage.createannouncement(driver).click();
	  Thread.sleep(3000);
	  Actions actions2 = new Actions(driver);
		WebElement elementLocator2 = SettingsPage.a3(driver);
		actions2.contextClick(elementLocator2).perform();
		Thread.sleep(1000);
		SettingsPage.deleteannouncement(driver).click();
		Thread.sleep(1000);
		SettingsPage.deleteannouncementbutton(driver).click();
		Thread.sleep(10000);
	  
	  
}		
	  
	 
	  
	  
	  
	  
	  
	  
	  
		
}







		
	


