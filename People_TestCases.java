package com.sightplan.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sightplan.pageObjects.LoginPage;
import com.sightplan.pageObjects.PeoplePage;
public class People_TestCases extends BaseClass{
	
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
	public void adduser() throws InterruptedException
	{
		//Change the test data every time//
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/users/list");
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
    	Thread.sleep(1000);
		PeoplePage.adduser(driver).click();
		Thread.sleep(1000);
		PeoplePage.firstname(driver).sendKeys("Test");
		PeoplePage.lastname(driver).sendKeys("User8");
		PeoplePage.email(driver).sendKeys("Testuser8@yahoo.com");
		PeoplePage.shared(driver).click();
		PeoplePage.phone(driver).sendKeys("5613980327");
		PeoplePage.site(driver).click();
		PeoplePage.testsite(driver).click();
		PeoplePage.role(driver).click();
		PeoplePage.propertymanager(driver).click();
		PeoplePage.adduseraction(driver).click();
		Thread.sleep(10000);
		
		
		
		
}
	@Test(priority=3)
	public void deleteuser() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/users/list");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
    Thread.sleep(1000);
	PeoplePage.current(driver).click();
	Thread.sleep(1000);
	PeoplePage.pending(driver).click();
	Thread.sleep(1000);
	Actions actions = new Actions(driver);
	WebElement elementLocator = PeoplePage.username(driver);
	actions.contextClick(elementLocator).perform();
	Thread.sleep(1000);
	PeoplePage.resendinvitation(driver).click();
	Thread.sleep(1000);
	PeoplePage.resendinvitationbutton(driver).click();
	Thread.sleep(2000);
	Actions actions1 = new Actions(driver);
	WebElement elementLocator1 = PeoplePage.username(driver);
	actions1.contextClick(elementLocator1).perform();
	Thread.sleep(1000);
	PeoplePage.removeuser(driver).click();
	Thread.sleep(1000);
	PeoplePage.removeuserbutton(driver).click();
	Thread.sleep(1000);
	PeoplePage.assignee(driver).click();
	PeoplePage.csn(driver).click();
	PeoplePage.update(driver).click();
	Thread.sleep(5000);
		
		
	}
	@Test(priority=4)
	public void removeuser() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/users/list");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
    Thread.sleep(1000);
	PeoplePage.tickbox(driver).click();
	PeoplePage.deletebutton(driver).click();
	PeoplePage.removeuserbutton(driver).click();
	PeoplePage.closemodal(driver).click();
	Thread.sleep(1000);
	PeoplePage.tickbox(driver).click();
	
	

}
	
	@Test(priority=5)
	public void edituser() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/users/list");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
    Thread.sleep(1000);
	PeoplePage.omit103(driver).click();
	Thread.sleep(1000);
	PeoplePage.firstname(driver).clear();
	PeoplePage.firstname(driver).sendKeys("test");
	PeoplePage.lastname(driver).clear();
	PeoplePage.lastname(driver).sendKeys("automation");
	PeoplePage.email(driver).clear();
	PeoplePage.email(driver).sendKeys("omit109@protonmail.com");
	PeoplePage.shared(driver).click();
	PeoplePage.phone(driver).clear();
	PeoplePage.phone(driver).sendKeys("8885550004");
	PeoplePage.role(driver).click();
	PeoplePage.asstpropertymanager(driver).click();
	PeoplePage.adduseraction(driver).click();
	Thread.sleep(7000);
	//Back to original//
	PeoplePage.testautomation(driver).click();
	Thread.sleep(1000);
	PeoplePage.firstname(driver).clear();
	PeoplePage.firstname(driver).sendKeys("Omit");
	PeoplePage.lastname(driver).clear();
	PeoplePage.lastname(driver).sendKeys("103");
	PeoplePage.email(driver).clear();
	PeoplePage.email(driver).sendKeys("omit103@protonmail.com");
	PeoplePage.shared(driver).click();
	PeoplePage.phone(driver).clear();
	PeoplePage.phone(driver).sendKeys("8885557639");
	PeoplePage.role(driver).click();
	PeoplePage.asstpropertymanager(driver).click();
	PeoplePage.adduseraction(driver).click();
	Thread.sleep(10000);
	
	
	
	}
	@Test(priority=6)
	public void exportlist() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/users/list");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
    Thread.sleep(1000);
	PeoplePage.exportlist(driver).click();
	Thread.sleep(10000);
	//Add filter//
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/users/list");
	WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
    Thread.sleep(1000);
	PeoplePage.Role(driver).click();
	Thread.sleep(1000);
	PeoplePage.administrator(driver).click();
	Thread.sleep(1000);
	PeoplePage.header(driver).click();
	}
	@Test(priority=7)
	public void oncall() throws InterruptedException
	{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/users/on_call");
		WebDriverWait wait = new WebDriverWait(driver, 100);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
	    Thread.sleep(1000);
	PeoplePage.exportlist(driver).click();
	Thread.sleep(10000);
	
	
	}
	//@Test(priority=8)
	public void addresident() throws InterruptedException
	{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/residents");
		WebDriverWait wait = new WebDriverWait(driver, 100);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
	    Thread.sleep(1000);
	PeoplePage.addresident(driver).click();
	Thread.sleep(1000);
	PeoplePage.residentfirstname(driver).sendKeys("Ram");
	PeoplePage.residentlastname(driver).sendKeys("Robert");
	Thread.sleep(1000);
	PeoplePage.placeholder(driver).click();
	Thread.sleep(1000);
	PeoplePage.placeholder(driver).sendKeys("Unit 5");
	Thread.sleep(15000);
	
}
	@Test(priority=9)
	public void Editresident() throws InterruptedException
	{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/residents");
		WebDriverWait wait = new WebDriverWait(driver, 100);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Resident']")));
	    Thread.sleep(1000);
		PeoplePage.chrishenry(driver).click();
		Thread.sleep(1000);
		PeoplePage.chrishenry2(driver).click();
		Thread.sleep(1000);
		PeoplePage.residentfirstname(driver).clear();
		PeoplePage.residentfirstname(driver).sendKeys("Christ");
		Thread.sleep(1000);
		PeoplePage.residentlastname(driver).clear();
		PeoplePage.residentlastname(driver).sendKeys("Henner");
		Thread.sleep(1000);
		PeoplePage.residentaccept(driver).click();
		Thread.sleep(2000);
		PeoplePage.buildingedit(driver).click();
		Thread.sleep(2000);
		PeoplePage.buildingedit2(driver).click();
		Thread.sleep(2000);
		PeoplePage.buildingaccept(driver).click();
		Thread.sleep(2000);
		PeoplePage.clickemailid(driver).click();
		Thread.sleep(2000);
		PeoplePage.residentemailid(driver).clear();
		Thread.sleep(2000);
		PeoplePage.residentemailid(driver).sendKeys("omit106@protonmail.com");
		Thread.sleep(1000);
		PeoplePage.emailacceptbutton(driver).click();
		Thread.sleep(2000);
		PeoplePage.mobilenumberedit(driver).click();
		Thread.sleep(2000);
		PeoplePage.mobilenumber(driver).clear();
		PeoplePage.mobilenumber(driver).sendKeys("5554561234");
		Thread.sleep(1000);
		PeoplePage.mobilenumberaccept(driver).click();
		Thread.sleep(2000);
		JavascriptExecutor js0 = (JavascriptExecutor) driver;
	    WebElement Element0 = PeoplePage.otherinfo(driver);
	    js0.executeScript("arguments[0].scrollIntoView();", Element0);
	    Thread.sleep(1000);	
		PeoplePage.tags(driver).click();
		Thread.sleep(1000);
		PeoplePage.resident_tags(driver).sendKeys("20");
		Thread.sleep(1000);
		PeoplePage.labeltags(driver).click();
		Thread.sleep(1000);
		PeoplePage.tagsacceptbutton(driver).click();
		Thread.sleep(1000);
		
		
}
	@Test(priority=10)
	public void sendmessage() throws InterruptedException
	{
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/residents");
		WebDriverWait wait = new WebDriverWait(driver, 100);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
	    Thread.sleep(1000);
		PeoplePage.residentcheckbox(driver).click();
		PeoplePage.sendmessage(driver).click();
		PeoplePage.messagesubject(driver).sendKeys("Test");
		PeoplePage.textarea(driver).sendKeys("Automation at its best");
		Thread.sleep(1000);
		PeoplePage.reviewmessage(driver).click();
		Thread.sleep(1000);
		PeoplePage.sendmessage1(driver).click();
		Thread.sleep(3000);
		
	}
		@Test(priority=11)
		public void editnotificationpreference() throws InterruptedException
		{	
		PeoplePage.editnotifications(driver).click();
		Thread.sleep(1000);
		PeoplePage.editnotificationsemail(driver).click();
		Thread.sleep(1000);
		PeoplePage.editnotificationssms(driver).click();
		Thread.sleep(1000);
		PeoplePage.savepreferences(driver).click();
		Thread.sleep(5000);
		
		}
		@Test(priority=12)
		public void residentfilter() throws InterruptedException
		{	
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e/people/residents");
		WebDriverWait wait = new WebDriverWait(driver, 100);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='People ']")));
	    Thread.sleep(1000);
		PeoplePage.searchbox(driver).click();
		Thread.sleep(1000);
		PeoplePage.searchboxid(driver).sendKeys("Chris Reads");
		Thread.sleep(2000);
		PeoplePage.residen(driver).click();
		Thread.sleep(5000);
		
		
		
		
	}
}