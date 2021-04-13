package com.sightplan.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
	
	Properties pro;
	
	public ReadConfig()
	{

		File src = new File("C:\\Users\\Dell\\eclipse-workspace\\SightPlanPOM\\Config\\config.properties");
		try
		{
			
			FileInputStream fis = new FileInputStream(src);
			pro = new Properties();
			pro.load(fis);
		}
		catch (Exception e) {
			System.out.println("Exception is " + e.getMessage());
			
		}	
}
	public String getApplicationURL()
	{
		String url=pro.getProperty("baseURL");
		return url;
	}
	
	public String getusername()
	{
		String username=pro.getProperty("username");
		return username;
	}
	
	public String getpassword()
	{
		String password=pro.getProperty("password");
		return password;
	}
	public String getchromepath()
	{
		String chromepath=pro.getProperty("chromepath");
		return chromepath;
	}
	public String getfirefoxpath()
	{
		String firefoxpath=pro.getProperty("firefoxpath");
		return firefoxpath;
	}
	public String getdashboard()
	{
		String dashboard=pro.getProperty("dashboard");
		return dashboard;
	}
	public String gettask()
	{
		String tasks=pro.getProperty("tasks");
		return tasks;
	}
	public String gettemplates()
	{
		String templates=pro.getProperty("templates");
		return templates;
	}
	public String getrepeating()
	{
		String repeating=pro.getProperty("repeating");
		return repeating;
	}
	public String getmessages()
	{
		String messages=pro.getProperty("messages");
		return messages;
	}
	public String getmessagesrepeating()
	{
		String messagesrepeating=pro.getProperty("messagesrepeating");
		return messagesrepeating;
	}
	public String getpackages()
	{
		String packages=pro.getProperty("packages");
		return packages;
	}
	
	
}