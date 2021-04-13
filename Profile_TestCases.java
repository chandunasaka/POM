package com.sightplan.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.sightplan.pageObjects.LoginPage;

import com.sightplan.pageObjects.ProfilePage;
import com.sightplan.pageObjects.PlacesPage;

public class Profile_TestCases extends BaseClass {
	
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
	public void Profile() throws InterruptedException{
	
		Actions actions1 = new Actions(driver);
		WebElement menuOption = PlacesPage.profileandaccount(driver);
		actions1.moveToElement(menuOption).perform();
		Thread.sleep(2000);
		ProfilePage.myprofile(driver).click();
		Thread.sleep(2000);	
		ProfilePage.profileclick(driver).click();
		Thread.sleep(2000);
}
	
	@Test(priority=3)
	public void General() throws InterruptedException{
        ProfilePage.firstname(driver).clear();
        ProfilePage.firstname(driver).sendKeys("Sammy");
        ProfilePage.lastname(driver).clear();
        ProfilePage.lastname(driver).sendKeys("Darren");
        ProfilePage.displayname(driver).clear();
        ProfilePage.displayname(driver).sendKeys("sammy d");
        ProfilePage.addtitle(driver).clear();
        ProfilePage.addtitle(driver).sendKeys("property manager");
        ProfilePage.addemail(driver).clear();
        ProfilePage.addemail(driver).sendKeys("sightplan1@protonmail.com");
        ProfilePage.addnumber(driver).clear();
        ProfilePage.addnumber(driver).sendKeys("(856) 235-6665");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        WebElement Element = ProfilePage.preferredtimezone(driver);
        js.executeScript("arguments[0].scrollIntoView();", Element);
        Thread.sleep(2000);	
        ProfilePage.timezone(driver).click();
        ProfilePage.time(driver).click();
        ProfilePage.savechanges(driver).click();
        Thread.sleep(4000);
        
        
        
        
		
}
	@Test(priority=4)
	public void notifications() throws InterruptedException{
	driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/my_profile/notifications");
	Thread.sleep(5000);

    ProfilePage.assignedtoyou(driver).click();
    ProfilePage.assignedtoyou(driver).click();
    JavascriptExecutor js1 = (JavascriptExecutor) driver;
    WebElement Element1 = ProfilePage.residenttext(driver);
    js1.executeScript("arguments[0].scrollIntoView();", Element1);
    Thread.sleep(2000);
	ProfilePage.savechanges(driver).click();
	Thread.sleep(4000);
	JavascriptExecutor js2 = (JavascriptExecutor) driver;
    WebElement Element2 = ProfilePage.custom(driver);
    js2.executeScript("arguments[0].scrollIntoView();", Element2);
    Thread.sleep(2000);
    ProfilePage.donotdisturb(driver).click();
    ProfilePage.donotdisturb(driver).click();
    ProfilePage.savechanges(driver).click();
	

	
	
	}
	@Test(priority=5)
	public void ProfilePhoto()throws InterruptedException {
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/my_profile/photo");
		
	

}
	@Test(priority=6)
	public void Security()throws InterruptedException {
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/my_profile/password");
		Thread.sleep(4000);
		ProfilePage.newpassword(driver).clear();
		ProfilePage.newpassword(driver).sendKeys("Test@123");
		ProfilePage.confirmpassword(driver).clear();
		ProfilePage.confirmpassword(driver).sendKeys("Test@123");
		ProfilePage.savechanges(driver).click();
		Thread.sleep(4000);
		
		
		
		
		
	}
	
	@Test(priority=7)
	public void Display()throws InterruptedException {
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/#/my_profile/display");
		Thread.sleep(4000);
		JavascriptExecutor js1 = (JavascriptExecutor) driver;
	    WebElement Element1 = ProfilePage.advanced(driver);
	    js1.executeScript("arguments[0].scrollIntoView();", Element1);
	    Thread.sleep(2000);
	    ProfilePage.simple(driver).click();
	    ProfilePage.advanced(driver).click();
		ProfilePage.savechanges(driver).click();
		Thread.sleep(2000);
		
		
	}	
}