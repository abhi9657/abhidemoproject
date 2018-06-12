package com.Po2.ApplicationConstants;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


import com.Po2.ApplicationConstants.ApplicationConstants.Browser;

public class StartBrowser {

	public static WebDriver driver;
	
	public static WebDriver browser(Browser type, String url)
	{
		
		switch(type)
		{
		case CHROME:
			System.setProperty("webdriver.chrome.driver", "F:\\chromedriver.exe");
			driver = new ChromeDriver();
			break;
		
	    case FIREFOX:
		System.setProperty("webdriver.chrome.driver", "F:\\geckodriver.exe");
		driver = new FirefoxDriver();
		break;
		}
		
		driver.get(url);
		driver.manage().window().maximize();
		return driver;
	}
		
	}
		


