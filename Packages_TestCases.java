package com.sightplan.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import com.sightplan.pageObjects.tasksPage;
import com.sightplan.pageObjects.LoginPage;
import com.sightplan.pageObjects.PackagesPage;
public class Packages_TestCases extends BaseClass{
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("commit")));
    	Thread.sleep(1000);
    	JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement Element = tasksPage.sightplaninc(driver);
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
	public void ReceivePackage() throws InterruptedException{
	driver.get(packages);
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receive Package']")));
	Thread.sleep(1000);
	
	PackagesPage.receivepackage(driver).click();
	Thread.sleep(1000);
	PackagesPage.resident(driver).click();
	Thread.sleep(1000);
	PackagesPage.residentN(driver).click();
	Thread.sleep(4000);
	PackagesPage.kumarnasaka(driver).click();
	Thread.sleep(1000);
	PackagesPage.trackingnumber(driver).sendKeys("L7277917");
	Thread.sleep(1000);
	PackagesPage.carrier(driver).click();
	Thread.sleep(1000);
	PackagesPage.dhl(driver).click();
	Thread.sleep(1000);
	PackagesPage.type(driver).click();
	Thread.sleep(1000);
	PackagesPage.bag(driver).click();
	Thread.sleep(1000);
	PackagesPage.condition(driver).click();
	Thread.sleep(1000);
	PackagesPage.waterdamage(driver).click();
	Thread.sleep(1000);
	PackagesPage.addnote(driver).sendKeys("This is for Automation Purpose");
	Thread.sleep(1000);
	PackagesPage.receivepackagebutton(driver).click();
	Thread.sleep(10000);
	
	
	
}
	
	@Test(priority=3)
	public void DeliverPackage() throws InterruptedException{
    driver.get(packages);
    WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receive Package']")));
	Thread.sleep(1000);
    PackagesPage.tn(driver).click();
    Thread.sleep(1000);
    PackagesPage.dpbutton(driver).click();
    Thread.sleep(2000);
    PackagesPage.closemodal(driver).click();
    Thread.sleep(1000);
    
    
		
}
	@Test(priority=4)
	public void exportlist() throws InterruptedException{
		driver.get(packages);
	    WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receive Package']")));
		Thread.sleep(1000);
		PackagesPage.exportlist(driver).click();
		Thread.sleep(10000);
		
		
		
	}
	@Test(priority=5)
	public void editpackage() throws InterruptedException{
		driver.get(packages);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receive Package']")));
		Thread.sleep(1000);
		PackagesPage.auto1234(driver).click();
		logger.info("Click on the Text AUTO1234");
		Thread.sleep(2000);
		PackagesPage.dryc(driver).click();
		logger.info("Click on the dry cleaner");
		Thread.sleep(1000);
		PackagesPage.bagedit(driver).click();
		logger.info("Click on the bag in the dropdown");
		Thread.sleep(2000);
		PackagesPage.acceptbutton(driver).click();
		logger.info("Click on the accept button in the bag dropdown");
		Thread.sleep(2000);
		PackagesPage.placeholderedit(driver).click();
		logger.info("Click on the placeholder to edit");
		Thread.sleep(1000);
		PackagesPage.describethetask(driver).clear();
		logger.info("Click on the clear the placeholder");
		PackagesPage.describethetask(driver).sendKeys("This is for Automation Test");
		logger.info("Click on the re enter in the placeholder");
		Thread.sleep(1000);
		PackagesPage.placeholderaccept(driver).click();
		logger.info("Click on the re enter in the placeholder");
		Thread.sleep(1000);
		PackagesPage.residentedit(driver).click();
		logger.info("Click on the resdent chris reads");
		Thread.sleep(2000);
		PackagesPage.clear(driver).clear();
		logger.info("Click on the resdent chris henry");
		Thread.sleep(2000);
		PackagesPage.cancelbutton(driver).click();
		Thread.sleep(2000);
		PackagesPage.H(driver).click();
		Thread.sleep(2000);
		PackagesPage.christ(driver).click();
		Thread.sleep(2000);
		PackagesPage.residentaccept(driver).click();
		Thread.sleep(2000);
		//Condition//
		PackagesPage.conditiongood(driver).click();
		Thread.sleep(1000);
		PackagesPage.waterdamageedit(driver).click();
		Thread.sleep(1000);
		PackagesPage.conditionaccept(driver).click();
		Thread.sleep(3000);
		//Carrier//
		PackagesPage.Amazon(driver).click();
		Thread.sleep(3000);
		PackagesPage.fedex(driver).click();
		Thread.sleep(2000);
		PackagesPage.carrieracceptbutton(driver).click();
		Thread.sleep(2000);
		//Edit the Tracking number//
		PackagesPage.tracknum(driver).click();
		Thread.sleep(2000);
		PackagesPage.cleartracknum(driver).clear();
		Thread.sleep(1000);
		PackagesPage.cleartracknum(driver).sendKeys("AUTO1235");
		Thread.sleep(1000);
		PackagesPage.tracknumaccept(driver).click();
		Thread.sleep(2000);
		//PackagesPage.leaveacomment(driver).sendKeys("Test");
		//Thread.sleep(1000);
		//PackagesPage.addcomment1(driver).click();
		//Thread.sleep(1000);
		PackagesPage.closemodal(driver).click();
		Thread.sleep(3000);
		
		//Back to normal//
		PackagesPage.auto1235(driver).click();
		Thread.sleep(2000);
		PackagesPage.bagc(driver).click();
		Thread.sleep(1000);
		PackagesPage.drycleaning(driver).click();
		Thread.sleep(1000);
		PackagesPage.acceptbutton(driver).click();
		Thread.sleep(2000);
		PackagesPage.chrishenry(driver).click();
		Thread.sleep(4000);
		PackagesPage.clear(driver).clear();
		PackagesPage.cancelbutton(driver).click();
		Thread.sleep(2000);
		PackagesPage.R(driver).click();
		Thread.sleep(2000);
		PackagesPage.Reads(driver).click();
		Thread.sleep(2000);
		
		PackagesPage.residentaccept(driver).click();
		Thread.sleep(2000);
		PackagesPage.conditionwaterdamage(driver).click();
		Thread.sleep(2000);
		PackagesPage.goodedit(driver).click();
		Thread.sleep(2000);
		PackagesPage.conditionaccept(driver).click();
		Thread.sleep(2000);
		PackagesPage.fedex1(driver).click();
		Thread.sleep(3000);
		PackagesPage.amazon1(driver).click();
		Thread.sleep(3000);
		PackagesPage.carrieracceptbutton(driver).click();
		Thread.sleep(2000);
		PackagesPage.tracknum1(driver).click();
		Thread.sleep(1000);
		PackagesPage.cleartracknum(driver).clear();
		Thread.sleep(1000);
		PackagesPage.cleartracknum(driver).sendKeys("AUTO1234");
		Thread.sleep(1000);
		PackagesPage.tracknumaccept(driver).click();
		Thread.sleep(2000);
	}
	@Test(priority=6)
	public void Saveview() throws InterruptedException{
		driver.get(packages);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receive Package']")));
		Thread.sleep(1000);
		PackagesPage.addcolumns(driver).click();
		Thread.sleep(2000);
		PackagesPage.deliveredby(driver).click();
		Thread.sleep(1000);
		PackagesPage.save(driver).click();
		Thread.sleep(1000);
		PackagesPage.viewname(driver).sendKeys("View1");
		Thread.sleep(1000);
		PackagesPage.saveviewbutton(driver).click();
		Thread.sleep(7000);
		PackagesPage.ellipse(driver).click();
		Thread.sleep(2000);
		PackagesPage.deleteview(driver).click();
		Thread.sleep(2000);
		PackagesPage.deleteviewbutton(driver).click();
		Thread.sleep(2000);
		
		
		
		
	}
	@Test(priority=7)
	public void addfilter() throws InterruptedException{
		driver.get(packages);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receive Package']")));
		Thread.sleep(1000);
		PackagesPage.addfilter1(driver).click();
		Thread.sleep(2000);
		PackagesPage.filtercarrier(driver).click();
		Thread.sleep(2000);
		PackagesPage.filtercarrieramazon(driver).click();
		Thread.sleep(3000);
		PackagesPage.filtercarrieramazon(driver).click();
		Thread.sleep(2000);
		PackagesPage.iconremovefilter(driver).click();
		Thread.sleep(2000);
		
	
}
	@Test(priority=8)
	public void ReceivePackageinanothersite() throws InterruptedException{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/7a02bb36-35f2-4916-89b6-cb7574c33cfc/packages");
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Receive Package']")));
		Thread.sleep(1000);
		PackagesPage.receivepackage(driver).click();
		Thread.sleep(1000);
		PackagesPage.resident(driver).click();
		Thread.sleep(1000);
		PackagesPage.residentD(driver).click();
		Thread.sleep(4000);
		PackagesPage.maritza(driver).click();
		Thread.sleep(2000);
		PackagesPage.trackingnumber(driver).sendKeys("L7277917");
		Thread.sleep(1000);
		PackagesPage.carrier(driver).click();
		Thread.sleep(1000);
		PackagesPage.dhl(driver).click();
		Thread.sleep(1000);
		PackagesPage.type(driver).click();
		Thread.sleep(1000);
		PackagesPage.bag(driver).click();
		Thread.sleep(1000);
		PackagesPage.condition(driver).click();
		Thread.sleep(1000);
		PackagesPage.waterdamage(driver).click();
		Thread.sleep(1000);
		PackagesPage.addnote(driver).sendKeys("This is for Automation Purpose");
		Thread.sleep(1000);
		PackagesPage.receivepackagebutton(driver).click();
		Thread.sleep(10000);
		
		
		
		
		
	
}
}