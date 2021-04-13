package com.sightplan.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sightplan.pageObjects.LoginPage;
import com.sightplan.pageObjects.MessagesPage;
import com.sightplan.pageObjects.tasksPage;
import com.sightplan.utilities.Fluentwait;
public class Messages_TestCases extends BaseClass {
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		Fluentwait fluentwait = new Fluentwait();
    	JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement Element = tasksPage.sightplaninc(driver);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(1000);
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clicksubmit();
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Portfolio']")));
    	Thread.sleep(5000);
		
		}
	
	@Test(priority=2)
	public void AddmessageandDeleteMessage() throws InterruptedException
	{
	driver.get(messages);
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Message']")));
	Thread.sleep(1000);
	MessagesPage.addmessagebutton(driver).click();
	Thread.sleep(1000);
	MessagesPage.AllResidents(driver).click();
	MessagesPage.subject(driver).sendKeys("TestingMessage");
	MessagesPage.messageplaceholder(driver).sendKeys("This is for Automation");
	JavascriptExecutor js= (JavascriptExecutor) driver;
    WebElement Element = MessagesPage.schedule(driver);
    js.executeScript("arguments[0].scrollIntoView();", Element);
    Thread.sleep(1000);
    MessagesPage.send(driver).click();
    Thread.sleep(1000);
    MessagesPage.custom(driver).click();
    Thread.sleep(1000);
	MessagesPage.reviewmessage(driver).click();
	MessagesPage.sendmessage(driver).click();
	Thread.sleep(2000);
	MessagesPage.contentmessage(driver).click();
	MessagesPage.ellipse(driver).click();
	MessagesPage.deletemessage(driver).click();
	MessagesPage.deletemessagebutton(driver).click();
	Thread.sleep(2000);
	
		
		
		

}
	@Test(priority=3)
	public void exportlist() throws InterruptedException
	{
	driver.get(messages);
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Message']")));
	Thread.sleep(1000);
	MessagesPage.exportlist(driver).click();
	Thread.sleep(10000);
	
}
	@Test(priority=4)
	public void Addviewanddelete() throws InterruptedException
	{
		driver.get(messages);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Message']")));
		Thread.sleep(1000);
		MessagesPage.addcolumns(driver).click();
		Thread.sleep(1000);
		MessagesPage.columnscontent(driver).click();
		Thread.sleep(1000);
		MessagesPage.save(driver).click();
		Thread.sleep(1000);
		MessagesPage.placeholderviewname(driver).sendKeys("View1");
		Thread.sleep(1000);
		MessagesPage.saveviewbutton(driver).click();
		Thread.sleep(7000);
		MessagesPage.viewellipse(driver).click();
		Thread.sleep(1000);
		MessagesPage.deleteview(driver).click();
		Thread.sleep(1000);
		MessagesPage.deleteviewbutton(driver).click();
		Thread.sleep(4000);
		
		
		
	
	}
	
	@Test(priority=5)
	public void MessagesLibrary() throws InterruptedException{
	driver.get(messages);
	WebDriverWait wait = new WebDriverWait(driver, 100);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Message']")));
	Thread.sleep(1000);
	MessagesPage.allmessages(driver).click();
	Thread.sleep(1000);
	MessagesPage.senttoallresidents(driver).click();
	Thread.sleep(3000);
		
	}	
	@Test(priority=6)
	public void addrepeatingmessagesschedule() throws InterruptedException{	
		driver.get(messagesrepeating);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Repeating']")));
		Thread.sleep(1000);
		MessagesPage.addrepeatingmessage(driver).click();
		Thread.sleep(1000);
		MessagesPage.AllResidents(driver).click();
		MessagesPage.subject(driver).sendKeys("TestRepeatingMessage");
		MessagesPage.messageplaceholder(driver).sendKeys("This is for Automation");
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    WebElement Element = MessagesPage.schedule(driver);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    MessagesPage.send(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.daily(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.weekly(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.Tu(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.weeklyvalue(driver).clear();
	    Thread.sleep(1000);
	    MessagesPage.weeklyvalue(driver).sendKeys("2");
	    Thread.sleep(1000);
	    MessagesPage.messagetime(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.saverepeatingbutton(driver).click();
	    Thread.sleep(3000);
	    MessagesPage.reviewmessage(driver).click();
		MessagesPage.sendmessage(driver).click();
		Thread.sleep(5000);
		MessagesPage.testrepeating(driver).click();
		Thread.sleep(1000);
		MessagesPage.ellipse(driver).click();
		Thread.sleep(1000);
		MessagesPage.pauseseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.pauserepeatingseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.ellipse(driver).click();
		Thread.sleep(1000);
		MessagesPage.Resumeseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.pauserepeatingseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.ellipse(driver).click();
		Thread.sleep(1000);
		MessagesPage.deleteseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.deleterepeatseries(driver).click();
		
		
	}
	@Test(priority=7)
	public void addrepeatingmessagestrigger() throws InterruptedException{	
        driver.get(messagesrepeating);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Repeating Message']")));
		Thread.sleep(1000);
		MessagesPage.addrepeatingmessage(driver).click();
		Thread.sleep(1000);
		MessagesPage.AllResidents(driver).click();
		Thread.sleep(1000);
		MessagesPage.subject(driver).sendKeys("TestRepeatingMessage");
		Thread.sleep(1000);
		MessagesPage.messageplaceholder(driver).sendKeys("This is for Automation");
		Thread.sleep(1000);
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    WebElement Element = MessagesPage.schedule(driver);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    MessagesPage.send(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.trigger(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.selectcondition(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.expiration(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js1= (JavascriptExecutor) driver;
	    WebElement Element1 = MessagesPage.seriesrange(driver);
	    js1.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(1000);
	    MessagesPage.immediately(driver).click();
	    Thread.sleep(1000);
	    
	    MessagesPage.sentat(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.saverepeat(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.reviewmessage(driver).click();
		MessagesPage.sendmessage(driver).click();
		Thread.sleep(5000);
		MessagesPage.testrepeating(driver).click();
		Thread.sleep(1000);
		MessagesPage.ellipse(driver).click();
		Thread.sleep(1000);
		MessagesPage.pauseseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.pauserepeatingseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.ellipse(driver).click();
		Thread.sleep(1000);
		MessagesPage.Resumeseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.pauserepeatingseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.ellipse(driver).click();
		Thread.sleep(1000);
		MessagesPage.deleteseries(driver).click();
		Thread.sleep(1000);
		MessagesPage.deleterepeatseries(driver).click();
		Thread.sleep(5000);
	    
	    
	    
	    
	    
}
	@Test(priority=8)
	public void AddMessageInAnotherSite() throws InterruptedException{	
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/7a02bb36-35f2-4916-89b6-cb7574c33cfc/messages/list");
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Message']")));
		Thread.sleep(1000);
		MessagesPage.addmessagebutton(driver).click();
		Thread.sleep(1000);
		MessagesPage.AllResidents(driver).click();
		MessagesPage.subject(driver).sendKeys("TestingMessage");
		MessagesPage.messageplaceholder(driver).sendKeys("This is for Automation");
		JavascriptExecutor js= (JavascriptExecutor) driver;
	    WebElement Element = MessagesPage.schedule(driver);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);
	    MessagesPage.send(driver).click();
	    Thread.sleep(1000);
	    MessagesPage.custom(driver).click();
	    Thread.sleep(1000);
		MessagesPage.reviewmessage(driver).click();
		MessagesPage.sendmessage(driver).click();
		Thread.sleep(2000);
		MessagesPage.contentmessage(driver).click();
		MessagesPage.ellipse(driver).click();
		MessagesPage.deletemessage(driver).click();
		MessagesPage.deletemessagebutton(driver).click();
		Thread.sleep(2000);
	
}
}