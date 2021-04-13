package com.sightplan.utilities;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import java.util.function.Function;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class Fluentwait {
	
	
WebDriver driver;
    
//Waiting 30 seconds for an element to be present on the page, checking
// for its presence once every 5 seconds.
@SuppressWarnings("deprecation")
Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
    .withTimeout(30, TimeUnit.SECONDS)
    .pollingEvery(5, TimeUnit.SECONDS)
    .ignoring(NoSuchElementException.class);

WebElement username = wait.until(new Function<WebDriver, WebElement>() 
{
  public WebElement apply(WebDriver driver) {
    return driver.findElement(By.name("user[username]"));
  }
});

}
