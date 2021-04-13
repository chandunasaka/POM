package com.sightplan.testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Miscellaneous_TestCases extends BaseClass {
	
	@Test(priority=1)
	public void loginPage() throws InterruptedException
	{
		driver.get(baseURL);
		WebDriverWait wait = new WebDriverWait(driver, 500);
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@alt='Spwebfull']")));
	}
	@Test(priority=2)
	public void TermsOfService() throws InterruptedException
	{
		driver.findElement(By.linkText("Terms of Service")).click();
		Thread.sleep(4000);
		String winHandleBefore = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		driver.close();
		driver.switchTo().window(winHandleBefore);
		Thread.sleep(2000);
	}
		@Test(priority=3)
		public void PrivacyPolicy() throws InterruptedException
		{	
		
		//Clicking the Privacy Policy link//
		driver.findElement(By.linkText("Privacy Policy")).click();
		Thread.sleep(4000);
		String winHandleBefore2 = driver.getWindowHandle();
		for(String winHandle : driver.getWindowHandles()){
		    driver.switchTo().window(winHandle);
		}
		driver.close();
		driver.switchTo().window(winHandleBefore2);
		Thread.sleep(2000);
		}
		@Test(priority=4)
		public void ForgetUsernameandPassword() throws InterruptedException
		{	

		driver.findElement(By.linkText("username")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("usernameRecover_email")).sendKeys("chandrasekhar.nasaka@sightplan.com");
		Thread.sleep(2000);
		driver.findElement(By.id("usernameRecover_phoneNumber")).sendKeys("9553090030");
		Thread.sleep(2000);
		driver.findElement(By.id("signin_submit")).click();
		Thread.sleep(3000);
		WebElement titlevalidation = driver.findElement(By.xpath("//h1[contains(text(),'Username Sent')]"));
				if(titlevalidation.isDisplayed())
				{
					System.out.println("Username is sent");
				}
				else
				{
					System.out.println("Username is not sent");
			}
				
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/signin");
		Thread.sleep(5000);
		driver.findElement(By.linkText("username")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("usernameRecover_email")).sendKeys("sv@dhkjn.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send Username']")).click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("We could not find a user associated with that email address or telephone number, please try again."))
	    {
	    	System.out.println("Invalid Email Id test pass");
	    }
	    else {
	    	System.out.println("Invalid Email Id test failed");
	    }
		driver.navigate().to("https://phoenixapartments.alpha.sightplan.com/signin");
		Thread.sleep(5000);
		driver.findElement(By.linkText("username")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("usernameRecover_phoneNumber")).sendKeys("4073333399");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Send Username']")).click();
		Thread.sleep(2000);
		if(driver.getPageSource().contains("We could not find a user associated with that email address or telephone number, please try again."))
	    {
	    	System.out.println("Invalid Telephone number test pass");
	    }
	    else {
	    	System.out.println("Invalid Telephone number test failed");
	    }
		
		driver.navigate().back();
		Thread.sleep(2000);
		
       	driver.findElement(By.linkText("Sign in")).click();
		Thread.sleep(2000);
		driver.findElement(By.linkText("password")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("user_username")).sendKeys("darren");
		Thread.sleep(2000);
		driver.findElement(By.id("signin_submit")).click();
		Thread.sleep(2000);
    	WebElement titlevalidation2 = driver.findElement(By.xpath("//h1[contains(text(),'Password Reset Instructions Sent')]"));
		if(titlevalidation2.isDisplayed())
		{
			System.out.println("Password Reset Instructions Sent");
		}	else
      {
			System.out.println("Password Reset Instructions not Sent");
		}
		driver.findElement(By.linkText("Sign In")).click();
		Thread.sleep(2000);
		
		
	

}
}
