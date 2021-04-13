package com.sightplan.testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.sightplan.pageObjects.LoginPage;
import com.sightplan.pageObjects.tasksPage;

public class Tasks_TestCases extends BaseClass{
	
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
	//@Test(priority=2)
	public void AddSite() throws InterruptedException
	{
		tasksPage.addsite(driver).click();
		Thread.sleep(1000);
		tasksPage.sitename(driver).sendKeys("Automation Test Site");
		tasksPage.siteshortname(driver).sendKeys("ATS");
	    tasksPage.officephone(driver).sendKeys("9545220665");
	    tasksPage.address(driver).sendKeys("3000 SE 6th Ave");
	    tasksPage.city(driver).sendKeys("Fort Lauderdale");
	    tasksPage.state(driver).click();
	    tasksPage.fl(driver).click();
	    tasksPage.zip(driver).sendKeys("33316");
	    tasksPage.typeofsite(driver).click();
	    tasksPage.lowrise(driver).click();
	    tasksPage.numberofunits(driver).sendKeys("120");
	    tasksPage.locateonmap(driver).click();
	    Thread.sleep(10000);
	    tasksPage.zoomin(driver).click();
	    Thread.sleep(3000);
	    tasksPage.zoomout(driver).click();
	    Thread.sleep(3000);
	    tasksPage.create(driver).click();
	    Thread.sleep(10000);

}
	//@Test(priority=3)
	public void deleteSite() throws InterruptedException
	{
		driver.get(dashboard);
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Portfolio']")));
    	Thread.sleep(1000);
		tasksPage.addresss(driver).click();
		Thread.sleep(15000);
		//tasksPage.sites(driver).click();
		//tasksPage.ats(driver).click();
		//Thread.sleep(15000);
		//tasksPage.header(driver).click();
		tasksPage.Settings(driver).click();
		Thread.sleep(3000);
		tasksPage.deletebutton(driver).click();
		tasksPage.deletethissite(driver).sendKeys("DELETE THIS SITE");
		tasksPage.deletesite(driver).click();
		Thread.sleep(10000);
		
		
		
		
}
	//@Test(priority=4)
	public void AddaViewanddeleteview() throws InterruptedException
	{
		driver.get(tasks);
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
		Thread.sleep(1000);
    	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//header[text()='Favorite Sites']")));
    	//Thread.sleep(1000);
    	//tasksPage.tswl(driver).click();
    	//Thread.sleep(1000);
    	//tasksPage.renameviewsaveview(driver).click();
    	//Thread.sleep(3000);
    	
		tasksPage.sitesfavourite(driver).click();
		Thread.sleep(1000);
		tasksPage.tswithlinks(driver).click();
		Thread.sleep(3000);
		tasksPage.header(driver).click();
		Thread.sleep(1000);
		tasksPage.save(driver).click();
		Thread.sleep(1000);
		tasksPage.viewname(driver).sendKeys("TestView");
		Thread.sleep(1000);
		tasksPage.saveview(driver).click();
		Thread.sleep(7000);
		tasksPage.ellipse(driver).click();
		tasksPage.renameview(driver).click();
		tasksPage.renameviewplaceholder(driver).clear();
		tasksPage.renameviewplaceholder(driver).sendKeys("TestView");
		tasksPage.renameviewsaveview(driver).click();
		Thread.sleep(7000);
		tasksPage.ellipse(driver).click();
		tasksPage.deleteview(driver).click();
		tasksPage.deleteviewred(driver).click();
		Thread.sleep(7000);
		
	}
	
	//@Test(priority=5)
	public void ViewsLibrary() throws InterruptedException
	{
		driver.get(tasks);
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
    	Thread.sleep(1000);
		tasksPage.sitesfavourite(driver).click();
		Thread.sleep(1000);
		tasksPage.tswithlinks(driver).click();
		Thread.sleep(7000);
		tasksPage.header(driver).click();
		Thread.sleep(1000);
		tasksPage.opentasks(driver).click();
		Thread.sleep(2000);
		
		tasksPage.openresidentreportedtasks(driver).click();
		Thread.sleep(3000);
		tasksPage.discardchanges(driver).click();
		Thread.sleep(2000);
		tasksPage.openresidentreportedtasksh1(driver).click();
		Thread.sleep(3000);
		tasksPage.openenteranytimetasks(driver).click();
		Thread.sleep(3000);
		tasksPage.OpenEnterAnyTimeTasksh1(driver).click();
		Thread.sleep(3000);
		tasksPage.OpenContactMeFirstTasks(driver).click();
		Thread.sleep(3000);
		tasksPage.OpenContactMeFirstTasksh1(driver).click();
		Thread.sleep(3000);
		tasksPage.ResidentRatedTasksthisMonth(driver).click();
		Thread.sleep(3000);
	}
	//@Test(priority=6)
	public void exportlistandprintall() throws InterruptedException
	{
		driver.get(tasks);
		WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
        Thread.sleep(1000);
		tasksPage.sitesfavourite(driver).click();
		Thread.sleep(1000);
		tasksPage.tswithlinks(driver).click();
		Thread.sleep(2000);
		tasksPage.header(driver).click();
		Thread.sleep(1000);
		tasksPage.exportlist(driver).click();
		Thread.sleep(10000);
		tasksPage.printall(driver).click();
		tasksPage.printtasksbutton(driver).click();
		Thread.sleep(3000);
		String winHandleBefore = driver.getWindowHandle();
  		for(String winHandle : driver.getWindowHandles()){
  		   driver.switchTo().window(winHandle);
	}
  		driver.close();
  		driver.switchTo().window(winHandleBefore);
  		Thread.sleep(4000);
	}
	@Test(priority=7)
	public void createtask() throws InterruptedException
	{
		driver.get(tasks);
		WebDriverWait wait = new WebDriverWait(driver, 100);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
        Thread.sleep(2000);
		tasksPage.sitesfavourite(driver).click();
		Thread.sleep(1000);
		tasksPage.tswithlinks(driver).click();
		Thread.sleep(4000);
		tasksPage.header(driver).click();
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
        wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Page Load Time']")));
        WebDriverWait wait2 = new WebDriverWait(driver, 100);
        wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Add a new task [N]']")));
		tasksPage.addanewtask(driver).click();
		Thread.sleep(10000);
		
		tasksPage.category(driver).click();
		Thread.sleep(2000);
		tasksPage.worktypeappliances(driver).click();
		Thread.sleep(2000);
		tasksPage.dishwasher(driver).click();
		Thread.sleep(2000);
		tasksPage.textarea(driver).sendKeys("Creation of Task");
		Thread.sleep(2000);
		tasksPage.residentreported(driver).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
	    WebElement Element = tasksPage.residentreported(driver);	
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(2000);	
	    tasksPage.resident(driver).click();
	    Thread.sleep(2000);
	    tasksPage.residentj(driver).click();
	    Thread.sleep(2000);
	    tasksPage.mj(driver).click();
	    Thread.sleep(2000);
	    tasksPage.contactresidentfirst(driver).click();
	    Thread.sleep(1000);
	    tasksPage.textarea1(driver).sendKeys("Testing PTE");
	    Thread.sleep(1000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;     		
	    WebElement Element1 = tasksPage.entryinstructions(driver);	
	    js1.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(1000);	
	    tasksPage.urgent(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.assignee(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.csn(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.documentation(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.note(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.tags(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.tagcovid19(driver).click();
	    Thread.sleep(1000);
	    tasksPage.createtaskbutton(driver).click();
	    Thread.sleep(10000);
	    WebDriverWait wait3 = new WebDriverWait(driver, 100);
        wait3.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[text()='Add Filter']")));
        Thread.sleep(1000);
	    tasksPage.addfilter(driver).click();
	    Thread.sleep(1000);
	    tasksPage.createddate(driver).click();
	    Thread.sleep(1000);
	    tasksPage.createdtoday(driver).click();
	    Thread.sleep(5000);
	    if(driver.getPageSource().contains("Creation of Task"))
	    {
	    	System.out.println("Add Task test case passed");
	    }
	    else {
	    	System.out.println("Creation of task not done");
	    }
	}
	
	    @Test(priority=8)
		public void addtasktoprojectconversion() throws InterruptedException
		{
	    	driver.get(tasks);
	    	WebDriverWait wait = new WebDriverWait(driver, 100);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
	    	Thread.sleep(1000);
			tasksPage.sitesfavourite(driver).click();
			Thread.sleep(1000);
			tasksPage.tswithlinks(driver).click();
			Thread.sleep(1000);
			tasksPage.header(driver).click();
			Thread.sleep(1000);
			WebDriverWait wait1 = new WebDriverWait(driver, 100);
	    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Page Load Time']")));
	    	Thread.sleep(1000);
			tasksPage.addfilter(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createddate(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createdtoday(driver).click();
		    Thread.sleep(5000);
		    tasksPage.text(driver).click();
			Thread.sleep(2000);
			//tasksPage.claim(driver).click();
			//Thread.sleep(2000);
			tasksPage.ellipse1(driver).click();
			Thread.sleep(2000);
			
			tasksPage.converttoproject(driver).click();
			Thread.sleep(7000);
			tasksPage.placeholder(driver).sendKeys("task conversion to project");
			Thread.sleep(1000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;     		
		    WebElement Element1 = tasksPage.tags(driver);	
		    js1.executeScript("arguments[0].scrollIntoView();", Element1);
		    Thread.sleep(1000);	
		    tasksPage.tags(driver).click();
		    Thread.sleep(1000);
		    tasksPage.tagcovid19(driver).click();
		    Thread.sleep(1000);
		    tasksPage.addprojecttasks(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createproject(driver).click();
		    Thread.sleep(6000);
		    if(driver.getPageSource().contains("task conversion to project"))
		    {
		    	System.out.println("successfully a task is converted to project");
		    }
		    else {
		    	System.out.println("task to project not done");
		    }
		}
		@Test(priority=9)
		public void addproject() throws InterruptedException
		{
			driver.get(tasks);
	    	WebDriverWait wait = new WebDriverWait(driver, 100);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
	    	Thread.sleep(2000);
			tasksPage.sitesfavourite(driver).click();
			Thread.sleep(1000);
			
			tasksPage.tswithlinks(driver).click();
			Thread.sleep(1000);
			WebDriverWait wait1 = new WebDriverWait(driver, 100);
	    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Page Load Time']")));
	    	Thread.sleep(1000);
			tasksPage.addprojectdropdown(driver).click();
			Thread.sleep(2000);
			tasksPage.addproject(driver).click();
			Thread.sleep(15000);
			WebDriverWait wait2 = new WebDriverWait(driver, 200);
	    	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@style='padding-left: 90px']")));
			tasksPage.projectname(driver).sendKeys("Automation Test");
			Thread.sleep(1000);
			tasksPage.placeholder(driver).sendKeys("Creation of project");
			Thread.sleep(1000);
			tasksPage.place(driver).click();
			Thread.sleep(1000);
			tasksPage.buildingquadrient(driver).click();
			Thread.sleep(2000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;     		
		    WebElement Element1 = tasksPage.tags(driver);	
		    js1.executeScript("arguments[0].scrollIntoView();", Element1);
		    Thread.sleep(1000);	
			tasksPage.urgent(driver).click();
			Thread.sleep(1000);
			tasksPage.tags(driver).click();
			Thread.sleep(1000);
		    tasksPage.tagcovid19(driver).click();
		    Thread.sleep(1000);
		    tasksPage.addprojecttasks1(driver).click();
		    Thread.sleep(1000);
		    tasksPage.addprojecttask(driver).click();
		    Thread.sleep(1000);
		    tasksPage.category(driver).click();
			Thread.sleep(2000);
			tasksPage.worktypeappliances(driver).click();
			Thread.sleep(2000);
			tasksPage.dishwasher(driver).click();
			Thread.sleep(2000);
			tasksPage.textarea(driver).sendKeys("Creation of Task");
			Thread.sleep(2000);
			tasksPage.residentreported(driver).click();
			Thread.sleep(2000);
			JavascriptExecutor js = (JavascriptExecutor) driver;
		    WebElement Element = tasksPage.residentreported(driver);	
		    js.executeScript("arguments[0].scrollIntoView();", Element);
		    Thread.sleep(2000);	
		    tasksPage.resident(driver).click();
		    Thread.sleep(2000);
		    tasksPage.residentj(driver).click();
		    Thread.sleep(2000);
		    tasksPage.mj(driver).click();
		    Thread.sleep(2000);  
		    
		    tasksPage.assignee2(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.csn(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.closewith(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.note2(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.tags1(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.tagcovid19(driver).click();
		    Thread.sleep(1000);
		    tasksPage.addprojecttask2(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createproject(driver).click();
		    Thread.sleep(6000);
		    tasksPage.addfilter(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createddate(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createdtoday(driver).click();
		    Thread.sleep(5000);
		    if(driver.getPageSource().contains("Creation of project"))
		    {
		    	System.out.println("successfully a project is created");
		    }
		    else {
		    	System.out.println("project is not created");
		    }
		}
		//@Test(priority=10)
		public void createcustomtask() throws InterruptedException
		{
			driver.get(tasks);
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
			Thread.sleep(2000);
			tasksPage.sitesfavourite(driver).click();
			Thread.sleep(1000);
			
			tasksPage.tswithlinks(driver).click();
			Thread.sleep(5000);
			
			tasksPage.addanewtask(driver).click();
			Thread.sleep(10000);
			tasksPage.category(driver).click();
			Thread.sleep(2000);
			tasksPage.appliances(driver).click();
			Thread.sleep(2000);
			tasksPage.dtt(driver).sendKeys("Create custom Task");
			Thread.sleep(2000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;     		
		    WebElement Element1 = tasksPage.text3(driver);
		    js1.executeScript("arguments[0].scrollIntoView();", Element1);
		    Thread.sleep(1000);	
		    tasksPage.place2(driver).click();
		    Thread.sleep(1000);
		    tasksPage.buildingquadrient(driver).click();
			Thread.sleep(2000);	
			tasksPage.schedule(driver).click();
			Thread.sleep(1000);
			tasksPage.custom(driver).click();
			Thread.sleep(1000);
			tasksPage.datepicker(driver).click();
			Thread.sleep(1000);
		    tasksPage.urgent(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.assignee(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.csn(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.documentation(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.note(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.tags(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.tagcovid19(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createtaskbutton(driver).click();
		    Thread.sleep(10000);
		    tasksPage.addfilter(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createddate(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createdtoday(driver).click();
		    Thread.sleep(5000);
		    if(driver.getPageSource().contains("Create custom Task"))
		    {
		    	System.out.println("create custom task passed");
		    }
		    else {
		    	System.out.println("Creation of custom task not done");
		    }
		
		
		
		
		

}
		
		//@Test(priority=11)
		public void createtaskrepeating() throws InterruptedException
		{
			driver.get(tasks);
			WebDriverWait wait = new WebDriverWait(driver, 500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
			Thread.sleep(2000);
			tasksPage.sitesfavourite(driver).click();
			Thread.sleep(1000);
			
			tasksPage.tswithlinks(driver).click();
			Thread.sleep(5000);
			tasksPage.addanewtask(driver).click();
			Thread.sleep(10000);
			tasksPage.category(driver).click();
			Thread.sleep(2000);
			tasksPage.appliances(driver).click();
			Thread.sleep(2000);
			tasksPage.dtt(driver).sendKeys("Create Repeating Task");
			Thread.sleep(2000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;     		
		    WebElement Element1 = tasksPage.text3(driver);
		    js1.executeScript("arguments[0].scrollIntoView();", Element1);
		    Thread.sleep(1000);	
		    tasksPage.place2(driver).click();
		    Thread.sleep(1000);
		    tasksPage.buildingquadrient(driver).click();
			Thread.sleep(2000);	
			tasksPage.schedule(driver).click();
			Thread.sleep(1000);
			tasksPage.repeating(driver).click();
			Thread.sleep(1000);
			tasksPage.repeatingdaily(driver).click();
			Thread.sleep(1000);
			tasksPage.repeatingweekly(driver).click();
			Thread.sleep(1000);
			tasksPage.saverepeatingseries(driver).click();
			Thread.sleep(1000);
		    tasksPage.urgent(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.assignee(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.csn(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.documentation(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.note(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.tags(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.tagcovid19(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createtaskbutton(driver).click();
		    Thread.sleep(10000);
		    tasksPage.addfilter(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createddate(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createdtoday(driver).click();
		    Thread.sleep(5000);
		   
		    if(driver.getPageSource().contains("Create Repeating Task"))
		    {
		    	System.out.println("create repeating task passed");
		    }
		    else {
		    	System.out.println("Creation of repeating task not done");
		    }



}
		//@Test(priority=12)
		public void createtaskwithpinnedlocation() throws InterruptedException
		{
			driver.get(tasks);
			WebDriverWait wait = new WebDriverWait(driver, 500);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
			Thread.sleep(2000);
			tasksPage.sitesfavourite(driver).click();
			Thread.sleep(1000);
			tasksPage.tswithlinks(driver).click();
			Thread.sleep(5000);
			tasksPage.mapview(driver).click();
			Thread.sleep(2000);
			tasksPage.addanewtask(driver).click();
			Thread.sleep(6000);
			tasksPage.category(driver).click();
			Thread.sleep(2000);
			tasksPage.appliances(driver).click();
			Thread.sleep(2000);
			tasksPage.dtt(driver).sendKeys("Create Pinned Location Task");
			Thread.sleep(2000);
			JavascriptExecutor js1 = (JavascriptExecutor) driver;     		
		    WebElement Element1 = tasksPage.text3(driver);
		    js1.executeScript("arguments[0].scrollIntoView();", Element1);
		    Thread.sleep(1000);	
		    tasksPage.place2(driver).click();
		    Thread.sleep(1000);
		    tasksPage.mapclick(driver).click();
		    Thread.sleep(3000);
		    tasksPage.header3(driver).click();
		    Thread.sleep(3000);
            tasksPage.createtaskbutton(driver).click();
		    Thread.sleep(10000);
		    tasksPage.addfilter(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createddate(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createdtoday(driver).click();
		    Thread.sleep(5000);
		    if(driver.getPageSource().contains("Create Pinned Location Task"))
		    {
		    	System.out.println("Creation of pinned location task passed");
		    }
		    else {
		    	System.out.println("Creation of pinned location task passed not done");
		    }
		
		
		
		
		}
		//@Test(priority=13)
		public void closetaskwithdocumentation() throws InterruptedException
		{
			driver.get(tasks);
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
			Thread.sleep(2000);
			tasksPage.sitesfavourite(driver).click();
			Thread.sleep(1200);
			tasksPage.tswithlinks(driver).click();
			Thread.sleep(5000);
			tasksPage.header(driver).click();
			Thread.sleep(1000);
	    	tasksPage.testdocumentation(driver).click();
	    	Thread.sleep(4000);
	    	tasksPage.closetask(driver).click();
	    	Thread.sleep(4000);
	    	tasksPage.reopentask(driver).click();
	    	Thread.sleep(4000);
	    	tasksPage.ellipse1(driver).click();
	    	Thread.sleep(2000);
	    	tasksPage.editdocumentation(driver).click();
	    	Thread.sleep(4000);
	    	tasksPage.closeit(driver).click();
	    	Thread.sleep(2000);
	    	tasksPage.note1(driver).click();
	    	Thread.sleep(4000);
	    	tasksPage.changedocumentation(driver).click();
	    	Thread.sleep(2000);
	    	tasksPage.closetask(driver).click();
	    	Thread.sleep(3000);
	    	tasksPage.notehere(driver).sendKeys("Close the Task");
	    	Thread.sleep(1000);
	    	tasksPage.closetaskbutton(driver).click();
	    	Thread.sleep(3000);
	    	tasksPage.reopentask(driver).click();
	    	Thread.sleep(3000);
	    	tasksPage.ellipse1(driver).click();
	    	Thread.sleep(2000);
	    	tasksPage.editdocumentation(driver).click();
	    	Thread.sleep(4000);
	    	tasksPage.closeit(driver).click();
	    	Thread.sleep(2000);
	    	tasksPage.checkmark(driver).click();
	    	Thread.sleep(2000);
	    	tasksPage.changedocumentation(driver).click();
	    	Thread.sleep(2000);
	    	
	    	
	    	
	    	
	    	
	    	
	    	
}
		
		//@Test(priority=14)
		public void Addprojectfromtemplate() throws InterruptedException
		{
			driver.get(tasks);
			WebDriverWait wait = new WebDriverWait(driver, 100);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@title='Add a new task [N]']")));
			Thread.sleep(2000);
			tasksPage.sitesfavourite(driver).click();
			Thread.sleep(2000);
			tasksPage.tswithlinks(driver).click();
			Thread.sleep(5000);
			tasksPage.addprojectdropdown(driver).click();
			Thread.sleep(5000);
			tasksPage.sitemplate(driver).click();
			Thread.sleep(5000);
			tasksPage.projectnameph(driver).sendKeys("Test rennovation 2");
			JavascriptExecutor js = (JavascriptExecutor) driver;     		
		    WebElement Element = tasksPage.selectplace(driver);
		    js.executeScript("arguments[0].scrollIntoView();", Element);
		    Thread.sleep(2000);	
		    tasksPage.shoptobeinspected(driver).click();
		    Thread.sleep(1000);
		    tasksPage.buildingquadrient(driver).click();
		    Thread.sleep(2000);
		    tasksPage.createproject1(driver).click();
		    Thread.sleep(5000);
		    tasksPage.addfilter(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createddate(driver).click();
		    Thread.sleep(1000);
		    tasksPage.createdtoday(driver).click();
		    Thread.sleep(5000);
		    
		    if(driver.getPageSource().contains("Test rennovation 2"))
		    {
		    	System.out.println("A Project From Template is created");
		    }
		    else {
		    	System.out.println("A Project From Template is not created");
		    }
	    	
	    	
	    	
	    	
	    	
	    	
}
		//@Test(priority=15)
		public void AddProjectTemplate() throws InterruptedException
		{
			driver.get(templates);
			WebDriverWait wait = new WebDriverWait(driver, 500);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Project Template']")));
	    	tasksPage.addprojecttemplate(driver).click();
	    	Thread.sleep(10000);
	    	tasksPage.workspace(driver).click();
	    	Thread.sleep(1000);
	    	tasksPage.maintenance(driver).click();
	    	Thread.sleep(1000);
	    	tasksPage.projectname(driver).sendKeys("Test Project Template");
	    	Thread.sleep(1000);
	    	tasksPage.placeholder(driver).sendKeys("Testing project template");
	    	Thread.sleep(1000);
	    	tasksPage.place(driver).click();
	    	tasksPage.buildingquadrient(driver).click();
	    	Thread.sleep(2000);
	    	JavascriptExecutor js = (JavascriptExecutor) driver;     		
		    WebElement Element = tasksPage.text1(driver);
		    js.executeScript("arguments[0].scrollIntoView();", Element);
		    Thread.sleep(1000);	
		    JavascriptExecutor js1 = (JavascriptExecutor) driver;     		
		    WebElement Element1 = tasksPage.projectcomparison(driver);
		    js1.executeScript("arguments[0].scrollIntoView();", Element1);
		    Thread.sleep(1000);
		    tasksPage.include(driver).click();
		    Thread.sleep(1000);
		    tasksPage.rapidmode(driver).click();
		    Thread.sleep(1000);
		    tasksPage.addprojecttasks1(driver).click();
		    Thread.sleep(2000);
		    tasksPage.addprojecttask(driver).click();
		    Thread.sleep(2000);
		    tasksPage.category(driver).click();
		    Thread.sleep(1000);
		    tasksPage.appliances(driver).click();
		    Thread.sleep(1000);
		    tasksPage.dtt(driver).sendKeys("Adding Project Template");
		    Thread.sleep(1000);
		    JavascriptExecutor js2 = (JavascriptExecutor) driver;     		
		    WebElement Element2 = tasksPage.residentreported(driver);
		    js2.executeScript("arguments[0].scrollIntoView();", Element2);
		    Thread.sleep(1000);	
		    tasksPage.residentreported(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.resident(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.residentj(driver).click();
		    Thread.sleep(2000);	
		    tasksPage.mj(driver).click();
		    Thread.sleep(4000);	
		    tasksPage.blue(driver).click();
		    Thread.sleep(3000);	
		    tasksPage.addprojecttasksgreen(driver).click();
		    Thread.sleep(10000);
		    if(driver.getPageSource().contains("Shop Inspection Template"))
		    {
		    	System.out.println("add project template created");
		    }
		    else {
		    	System.out.println("add project template not created");
		    }
		    tasksPage.testprojecttemplate(driver).click();
		    Thread.sleep(3000);	
		    tasksPage.ellipse1(driver).click();
		    Thread.sleep(1000);
		    tasksPage.deletetemplate(driver).click();
		    Thread.sleep(1000);
		    tasksPage.deletetemplatebutton(driver).click();
		    Thread.sleep(5000);
		    
	    	
	    	
	    	
	    	
	    	
}
		//@Test(priority=16)
		public void RepeatingTasksSchedule() throws InterruptedException
		{
			driver.get(repeating);
			WebDriverWait wait = new WebDriverWait(driver, 500);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=' Repeating Tasks']")));
	    	Thread.sleep(2000);
	    	tasksPage.addrepeatingtask(driver).click();
	    	Thread.sleep(4000);
	    	tasksPage.category(driver).click();
	    	Thread.sleep(2000);
	    	tasksPage.cptappliances(driver).click();
	    	Thread.sleep(2000);
	    	tasksPage.textarea(driver).sendKeys("Test Repeating Schedule");
	    	Thread.sleep(2000);
	    	JavascriptExecutor js2 = (JavascriptExecutor) driver;     		
		    WebElement Element2 = tasksPage.residentreported(driver);
		    js2.executeScript("arguments[0].scrollIntoView();", Element2);
		    Thread.sleep(2000);	
		    tasksPage.residentreported(driver).click();
		    Thread.sleep(2000);		
		    tasksPage.resident(driver).click();
		    Thread.sleep(2000);	
		    tasksPage.residentj(driver).click();
		    Thread.sleep(2000);	
		    tasksPage.mj(driver).click();
		    Thread.sleep(4000);	
		    JavascriptExecutor js = (JavascriptExecutor) driver;		         		
		    WebElement Element = tasksPage.textycplom(driver);
		    js.executeScript("arguments[0].scrollIntoView();", Element);
		    Thread.sleep(2000);		
	    	tasksPage.schedule(driver).click();
	    	Thread.sleep(2000);	
	    	tasksPage.saverepeatingseries(driver).click();
	    	Thread.sleep(2000);	
	    	tasksPage.urgent(driver).click();
	    	Thread.sleep(1000);	
	    	tasksPage.createtaskbutton(driver).click();
	    	Thread.sleep(5000);	
	    	if(driver.getPageSource().contains("Test Repeating Schedule"))
		    {
		    	System.out.println("repeating task schedule had been created");
		    }
		    else {
		    	System.out.println("repeating task schedule not created");
		    }
	    	tasksPage.texttps(driver).click();
	    	Thread.sleep(2000);		
	    	tasksPage.ellipse1(driver).click();
	    	Thread.sleep(2000);	
	    	tasksPage.deleterepeating(driver).click();
	    	Thread.sleep(2000);	
	    	tasksPage.deleterepeatingbutton(driver).click();
	    	Thread.sleep(10000);
	    	
	    	
	    	
}
		//@Test(priority=17)
		public void RepeatingTasksTrigger() throws InterruptedException
		{
			driver.get(repeating);
			WebDriverWait wait = new WebDriverWait(driver, 500);
	    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=' Repeating Tasks']")));
	    	tasksPage.addrepeatingtask(driver).click();
	    	Thread.sleep(4000);
	    	tasksPage.category(driver).click();
	    	Thread.sleep(1000);
	    	tasksPage.cptappliances(driver).click();
	    	Thread.sleep(1000);
	    	tasksPage.textarea(driver).sendKeys("Test Repeating Trigger");
	    	Thread.sleep(1000);
	    	JavascriptExecutor js2 = (JavascriptExecutor) driver;     		
		    WebElement Element2 = tasksPage.residentreported(driver);
		    js2.executeScript("arguments[0].scrollIntoView();", Element2);
		    Thread.sleep(1000);	
		    tasksPage.residentreported(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.resident(driver).click();
		    Thread.sleep(1000);	
		    tasksPage.residentj(driver).click();
		    Thread.sleep(2000);	
		    tasksPage.mj(driver).click();
		    Thread.sleep(4000);	
		    JavascriptExecutor js = (JavascriptExecutor) driver;		         		
		    WebElement Element = tasksPage.textycplom(driver);
		    js.executeScript("arguments[0].scrollIntoView();", Element);
		    Thread.sleep(1000);	
	    	tasksPage.schedule(driver).click();
	    	Thread.sleep(1000);	
	    	tasksPage.trigger(driver).click();
	    	tasksPage.selectcondition(driver).click();
	    	tasksPage.daylease(driver).click();
	    	tasksPage.triggerdelayvalue(driver).clear();
	    	tasksPage.triggerdelayvalue(driver).sendKeys("3");
	    	tasksPage.triggerdelayvaluedays(driver).click();
	    	tasksPage.triggerdelayvalueweeks(driver).click();
	    	tasksPage.saverepeatingseries(driver).click();
	    	Thread.sleep(2000);	
	    	tasksPage.urgent(driver).click();
	    	Thread.sleep(1000);	
	    	tasksPage.createtaskbutton(driver).click();
	    	Thread.sleep(5000);	
	    	if(driver.getPageSource().contains("Test Repeating Trigger"))
		    {
		    	System.out.println("repeating task Trigger had been created");
		    }
		    else {
		    	System.out.println("repeating task Trigger not created");
		    }
	    	tasksPage.texttpr(driver).click();
	    	Thread.sleep(2000);	
	    	tasksPage.ellipse1(driver).click();
	    	Thread.sleep(1000);
	    	tasksPage.deleterepeating(driver).click();
	    	tasksPage.deleterepeatingbutton(driver).click();
	    	Thread.sleep(10000);
	    	
		
		
		
}
		//@Test(priority=18)
		public void RepeatingProject() throws InterruptedException
		{
		driver.get(repeating);
		WebDriverWait wait = new WebDriverWait(driver, 500);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()=' Repeating Tasks']")));
	    tasksPage.addprojectdropdown(driver).click();
	    Thread.sleep(2000);
	    tasksPage.addrepeatingproject(driver).click();
	    Thread.sleep(5000);
	    tasksPage.projectnameph(driver).sendKeys("Add Repeating Project");
		tasksPage.placeholder(driver).sendKeys("Test the repeat project");
		tasksPage.place(driver).click();
		Thread.sleep(1000);
		tasksPage.buildingquadrient(driver).click();
		Thread.sleep(2000);
		JavascriptExecutor js = (JavascriptExecutor) driver;		         		
	    WebElement Element = tasksPage.text4(driver);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);	
	    tasksPage.schedule1(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.saverepeatingseries(driver).click();
	    Thread.sleep(2000);	
	    tasksPage.urgent(driver).click();
	    tasksPage.apt(driver).click();
	    Thread.sleep(2000);	
	    tasksPage.addprojecttask(driver).click();
	    Thread.sleep(2000);	
	    tasksPage.category(driver).click();
	    Thread.sleep(2000);
	    tasksPage.appliances2(driver).click();
	    Thread.sleep(2000);
	    tasksPage.textarea(driver).sendKeys("Repeating Project");
	    Thread.sleep(1000);
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;     		
	    WebElement Element2 = tasksPage.residentreported(driver);
	    js2.executeScript("arguments[0].scrollIntoView();", Element2);
	    Thread.sleep(1000);	
	    tasksPage.residentreported(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.resident(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.residentj(driver).click();
	    Thread.sleep(2000);	
	    tasksPage.mj(driver).click();
	    Thread.sleep(4000);	
	    tasksPage.addprojecttask2(driver).click();
	    Thread.sleep(2000);	
	    tasksPage.addprojecttasksgreen(driver).click();
	    Thread.sleep(8000);	
	    
	    if(driver.getPageSource().contains("Test the repeat project"))
	    {
	    	System.out.println("A Repeating Project is created");
	    }
	    else {
	    	System.out.println("A Repeating Project is not created");
	    }
	    tasksPage.text5(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.ellipse1(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.deleterepeating(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.deleterepeatingproject(driver).click();
	    Thread.sleep(3000);	
    	
    	
    	
	    
		}
		//@Test(priority=19)
		public void edittask() throws InterruptedException
		{
		driver.get(tasks);
		WebDriverWait wait = new WebDriverWait(driver, 500);
	    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
	    Thread.sleep(1000);
		tasksPage.sitesfavourite(driver).click();
		Thread.sleep(1000);
		tasksPage.tswithlinks(driver).click();
		Thread.sleep(2000);
		tasksPage.header(driver).click();
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver, 500);
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'GFCI')]")));
		tasksPage.GFCI(driver).click();
		Thread.sleep(5000);
		//tasksPage.ellipse1(driver).click();
		//Thread.sleep(2000);
		//tasksPage.noturgent(driver).click();
		//Thread.sleep(1000);
		//tasksPage.ellipse1(driver).click();
		//Thread.sleep(1000);
		//tasksPage.makeurgent(driver).click();
		//Thread.sleep(1000);
		//tasksPage.ellipse1(driver).click();
		//Thread.sleep(1000);
		//tasksPage.converttoproject1(driver).click();
		//Thread.sleep(3000);
		//tasksPage.closemodal(driver).click();
		//Thread.sleep(1000);
		
		//WebDriverWait wait2 = new WebDriverWait(driver, 500);
	    //wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(text(),'GFCI')]")));
	    //Thread.sleep(1000);
//	    tasksPage.GFCI(driver).click();
//		Thread.sleep(2000);
//	    tasksPage.ellipse1(driver).click();
//		Thread.sleep(1000);
//		tasksPage.editdoc(driver).click();
//		Thread.sleep(2000);
//		tasksPage.changedocumentation(driver).click();
//		Thread.sleep(4000);
//		tasksPage.ellipse1(driver).click();
//		Thread.sleep(1000);
//		tasksPage.printtask1(driver).click();
//		tasksPage.printtaskbutton(driver).click();
//		Thread.sleep(2000);
		 //Open in new window and then close the window//
 //       String winHandleBefore = driver.getWindowHandle();
 //		for(String winHandle : driver.getWindowHandles()){
 //		   driver.switchTo().window(winHandle);
//	}
 //		driver.close();
 //		driver.switchTo().window(winHandleBefore);
 //		Thread.sleep(8000);
 		
 		//Open in new window and then close the window//
 //       String winHandleBefore1 = driver.getWindowHandle();
 //		for(String winHandle : driver.getWindowHandles()){
 //		   driver.switchTo().window(winHandle);
//	}
 //		driver.close();
 //		driver.switchTo().window(winHandleBefore1);
 //		Thread.sleep(8000);
 //	tasksPage.descriptionedit(driver).click();
 //	tasksPage.textarea(driver).clear();
 //	tasksPage.textarea(driver).sendKeys("This is for the Automation Testing purpose");
 //	Thread.sleep(1000);
 //	tasksPage.editaccept(driver).click();
 //	Thread.sleep(2000);
 	tasksPage.gfci(driver).click();
 	Thread.sleep(3000);
 	tasksPage.header1(driver).click();
 	Thread.sleep(2000);
 	tasksPage.editaccept1(driver).click();
 	Thread.sleep(3000);
 	tasksPage.csn1(driver).click();
 	Thread.sleep(3000);
 	tasksPage.csn2(driver).click();
 	Thread.sleep(3000);
 	tasksPage.assignedtoaccept(driver).click();
 	Thread.sleep(3000);
 	tasksPage.place1(driver).click();
 	Thread.sleep(3000);
 	tasksPage.place3(driver).click();
 	Thread.sleep(1500);
 	tasksPage.placeaccept(driver).click();
 	Thread.sleep(2000);
 	tasksPage.place12(driver).click();
 	Thread.sleep(2000);
 	tasksPage.place13(driver).click();
 	Thread.sleep(1000);
 	tasksPage.placeaccept(driver).click();
 	Thread.sleep(2000);
 	
		
		
		
		
		
}
		//@Test(priority=20)
		public void EditAlreadyCreatedTaskWithPTE() throws InterruptedException
		{
		driver.get(tasks);
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//em[text()='Tasks']")));
  		tasksPage.sitesfavourite(driver).click();
		Thread.sleep(1000);
		tasksPage.tswithlinks(driver).click();
		Thread.sleep(7000);
		tasksPage.header(driver).click();
		Thread.sleep(1000);
		WebDriverWait wait1 = new WebDriverWait(driver, 500);
	    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='PTE Test Edit']")));
	    Thread.sleep(1000);
	    tasksPage.Pte(driver).click();
	    Thread.sleep(3000);
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    //Find element by link text and store in variable "Element"        		
	    WebElement Element1 = driver.findElement(By.xpath("//h4[text()='Tags']"));
	    //This will scroll the page till the element is found		
	    js1.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(2000);	
	    tasksPage.entrypreferenceedit(driver).click();
	    Thread.sleep(2000);	
	    tasksPage.ptecontactresidentfirst(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.renameviewsaveview(driver).click();
	    Thread.sleep(5000);	
	    tasksPage.entrypreferenceedit(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.pteEnteranytime(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.renameviewsaveview(driver).click();
	    Thread.sleep(5000);	
	    
}
		//@Test(priority=21)
		public void CreateProjectTemplateWithPriorDocEnabled() throws InterruptedException
		{
		driver.get(templates);
		WebDriverWait wait = new WebDriverWait(driver, 100);
    	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Add Project Template']")));
    	tasksPage.addprojecttemplate(driver).click();
    	Thread.sleep(10000);
    	tasksPage.workspace(driver).click();
    	Thread.sleep(1000);
    	tasksPage.maintenance(driver).click();
    	Thread.sleep(1000);
    	tasksPage.projectname(driver).sendKeys("Test Project Template");
    	Thread.sleep(1000);
    	tasksPage.placeholder(driver).sendKeys("Testing project template");
    	Thread.sleep(1000);
    	tasksPage.place(driver).click();
    	tasksPage.buildingquadrient(driver).click();
    	Thread.sleep(2000);
    	JavascriptExecutor js = (JavascriptExecutor) driver;     		
	    WebElement Element = tasksPage.text1(driver);
	    js.executeScript("arguments[0].scrollIntoView();", Element);
	    Thread.sleep(1000);	
	    JavascriptExecutor js1 = (JavascriptExecutor) driver;     		
	    WebElement Element1 = tasksPage.projectcomparison(driver);
	    js1.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(1000);
	    tasksPage.priordoc(driver).click();
	    Thread.sleep(1000);
	    tasksPage.include(driver).click();
	    Thread.sleep(1000);
	    JavascriptExecutor js2 = (JavascriptExecutor) driver;     		
	    WebElement Element2 = driver.findElement(By.xpath("//h3[text()='Rapid Mode']"));
	    js2.executeScript("arguments[0].scrollIntoView();", Element2);
	    Thread.sleep(1000);
	    tasksPage.rapidmode(driver).click();
	    Thread.sleep(1000);
	    tasksPage.addprojecttasks1(driver).click();
	    Thread.sleep(2000);
	    tasksPage.addprojecttask(driver).click();
	    Thread.sleep(2000);
	    tasksPage.category(driver).click();
	    Thread.sleep(1000);
	    tasksPage.appliances(driver).click();
	    Thread.sleep(1000);
	    tasksPage.dtt(driver).sendKeys("Adding Project Template");
	    Thread.sleep(1000);
	    JavascriptExecutor js3 = (JavascriptExecutor) driver;     		
	    WebElement Element3 = tasksPage.residentreported(driver);
	    js3.executeScript("arguments[0].scrollIntoView();", Element3);
	    Thread.sleep(1000);	
	    tasksPage.residentreported(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.resident(driver).click();
	    Thread.sleep(1000);	
	    tasksPage.residentj(driver).click();
	    Thread.sleep(2000);	
	    tasksPage.mj(driver).click();
	    Thread.sleep(4000);	
	    tasksPage.blue(driver).click();
	    Thread.sleep(3000);	
	    tasksPage.addprojecttasksgreen(driver).click();
	    Thread.sleep(10000);
	    if(driver.getPageSource().contains("Shop Inspection Template"))
	    {
	    	System.out.println("add project template created");
	    }
	    else {
	    	System.out.println("add project template not created");
	    }
	    tasksPage.testprojecttemplate(driver).click();
	    Thread.sleep(3000);	
	    tasksPage.ellipse1(driver).click();
	    Thread.sleep(1000);
	    tasksPage.deletetemplate(driver).click();
	    Thread.sleep(1000);
	    tasksPage.deletetemplatebutton(driver).click();
	    Thread.sleep(5000);
	    
		
		
		
		
		
}
}