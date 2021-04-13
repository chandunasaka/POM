package com.sightplan.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sightplan.pageObjects.LoginPage;
import com.sightplan.pageObjects.ReportsPage;

public class Reports_TestCases extends BaseClass{
	
	
	@Test(priority=1)
	public void loginTest() throws InterruptedException
	{
		driver.get(baseURL);
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.elementToBeClickable(By.name("commit")));
		JavascriptExecutor js= (JavascriptExecutor) driver;
        WebElement Element = driver.findElement(By.xpath("//span[text()='© SightPlan Inc. All Rights Reserved.']"));
        js.executeScript("arguments[0].scrollIntoView();", Element);
        
		LoginPage lp =new LoginPage(driver);
		lp.setUserName(username);
		lp.setPassword(password);
		
		lp.clicksubmit();
		WebDriverWait wait1 = new WebDriverWait(driver, 100);
    	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h1[text()='Portfolio']")));
    	Thread.sleep(1000);
		}
	
	@Test(priority=2)
	public void ReportsAnsweringService() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
	ReportsPage.answeringservice(driver).click();
	WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Answering Service']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);

}
	@Test(priority=3)
	public void Reportsurgentandpastduetasks() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
    ReportsPage.UrgentPastDueTasks(driver).click();
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Urgent & Past Due Tasks']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
    
    
}
	@Test(priority=4)
	public void ReportTasksbyAssignee() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
    ReportsPage.TasksbyAssignee(driver).click();
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Tasks by Assignee']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
	}
	@Test(priority=5)
	public void ReportOpenTasks() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
    ReportsPage.OpenTasks(driver).click();
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Open Tasks']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
	}
	@Test(priority=6)
	public void ReportClosedTasks() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
    ReportsPage.ClosedTasks(driver).click();
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Closed Tasks']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
    
    
	}
	@Test(priority=7)
	public void ReportOpenResidentTasks() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
    ReportsPage.OpenResidentTasks(driver).click();
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Open Resident Tasks']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
    
    
	}
	@Test(priority=8)
	public void ReportClosedResidentTasks() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
    driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/7a02bb36-35f2-4916-89b6-cb7574c33cfc/reports/completed_resident_tasks");
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Closed Resident Tasks']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
    
    
	}
	@Test(priority=9)
	public void ReportPackageActivity() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
   driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/7a02bb36-35f2-4916-89b6-cb7574c33cfc/reports/package_activity");
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Package Activity']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
    
    
	}
	@Test(priority=10)
	public void ReportPackageActivityExport() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
    driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/7a02bb36-35f2-4916-89b6-cb7574c33cfc/reports/package_activity_export");
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Package Activity, Export']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
    
    
	}
	@Test(priority=11)
	public void ReportTasksByProject() throws InterruptedException
	{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/reports_dashboard/site/2a6a1c69-90f4-40bd-a6c2-de927dd6f68e");
	WebDriverWait wait = new WebDriverWait(driver, 100);
    wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5[text()='Answering Service']")));
    driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/7a02bb36-35f2-4916-89b6-cb7574c33cfc/reports/tasks_by_project");
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Tasks by Project']")));
    Thread.sleep(1000);
    ReportsPage.updatereport(driver).click();
    Thread.sleep(10000);
    
    
	}
	//@Test(priority=12)
	public void ReportComparisonInspection() throws InterruptedException
	{
    driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/site/7a02bb36-35f2-4916-89b6-cb7574c33cfc/reports/project_comparison");
    WebDriverWait wait1 = new WebDriverWait(driver, 100);
    wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Comparison Inspection']")));
    Thread.sleep(1200);
    ReportsPage.project1template(driver).click();
    Thread.sleep(1000);
    ReportsPage.project1templatedd(driver).click();
    
	}
}
