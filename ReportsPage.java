package com.sightplan.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ReportsPage {
	
	static WebElement element = null;
	public static WebElement answeringservice(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Answering Service']"));
	return element;
	}
	public static WebElement updatereport(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//button[@class='primary-button ']"));
	return element;
	}

	public static WebElement UrgentPastDueTasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Urgent & Past Due Tasks']"));
	return element;
	}
	public static WebElement TasksbyAssignee(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Tasks by Assignee']"));
	return element;
	}
	public static WebElement OpenTasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Open Tasks']"));
	return element;
	}
	public static WebElement ClosedTasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Closed Tasks']"));
	return element;
	}
	public static WebElement OpenResidentTasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Open Resident Tasks']"));
	return element;
	}
	public static WebElement ClosedResidentTasks(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Closed Resident Tasks']"));
	return element;
	}
	public static WebElement PackageActivity(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Package Activity']"));
	return element;
	}
	public static WebElement PackageActivityexport(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Package Activity, Export']"));
	return element;
	}
	public static WebElement TasksByProject(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Tasks By Project']"));
	return element;
	}
	public static WebElement ComparisonInspection(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//h5[text()='Comparison Inspection']"));
	return element;
	}
	public static WebElement project1template(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@tabindex='3']//div[text()='Template:']"));
	return element;
	}
	public static WebElement project1templatedd(WebDriver driver)
	{
	element = driver.findElement(By.xpath("//div[@style='max-height: 260px;']//li[@data-id='3ba5fd45-db4a-494d-92d3-362ed9b5c4f5']"));
	return element;
	}
}
