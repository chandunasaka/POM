package com.sightplan.testCases;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;


import com.sightplan.utilities.ReadConfig;

public class BaseClass {
	
	ReadConfig readconfig = new ReadConfig();
	
	//public String baseURL="https://phoenixapartments.alpha.sightplan.com/signin";
	public String baseURL=readconfig.getApplicationURL();
	//public String username="darren";
	public String username=readconfig.getusername();
	//public String password="Test@123";
	public String password=readconfig.getpassword();
	public String dashboard=readconfig.getdashboard();
	public String tasks=readconfig.gettask();
	public String templates=readconfig.gettemplates();
	public String repeating=readconfig.getrepeating();
	public String messages=readconfig.getmessages();
	public String messagesrepeating=readconfig.getmessagesrepeating();
	public String packages=readconfig.getpackages();
	public static WebDriver driver;
	public static Logger logger;
	
	
	
	
	
	@Parameters("browser")
	@BeforeClass
	public void setup(String br) throws InterruptedException
	{
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\Dell\\eclipse-workspace\\SightPlanPOM\\Drivers\\chromedriver.exe");
		if(br.equals("chrome"))
		{
		System.setProperty("webdriver.chrome.driver",readconfig.getchromepath());
		driver=new ChromeDriver();
		}
		else if(br.equals("firefox"))
		{
			System.setProperty("webdriver.gecko.driver",readconfig.getfirefoxpath());
			driver=new FirefoxDriver();	
		}
		driver.get(baseURL);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		//driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		 logger=Logger.getLogger("SightPlan");
		PropertyConfigurator.configure("Log4j2.properties");
		
		
	}
	
	@AfterClass
	public void teardown()
	{
	
	driver.quit();
	}
	
	//public void captureScreen(WebDriver driver, String tname) throws IOException
	//{
	//	TakesScreenshot ts = (TakesScreenshot) driver;
	//	File source = ts.getScreenshotAs(OutputType.FILE);
	//	File target = new File(System.getProperty("C:\\Users\\Dell\\eclipse-workspace\\SightPlanPOM\\Screenshots") + tname + ".png");
	//	FileUtils.copyFile(source, target);
	//	System.out.println("Screenshot taken");
	//}
	
	
	
	
}
