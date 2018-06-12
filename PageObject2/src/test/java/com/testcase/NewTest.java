package com.testcase;

import org.testng.annotations.Test;

import com.Po2.ApplicationConstants.ApplicationConstants;
import com.Po2.ApplicationConstants.StartBrowser;
import com.pages.InternetHero;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.WebDriver;

public class NewTest {
	public static WebDriver driver;
	public InternetHero ih;
	
	@BeforeSuite 
	public void  intilise()
	{
		driver = StartBrowser.browser(ApplicationConstants.Browser.CHROME, ApplicationConstants.Application_url);
	}
	
  @Test
  public void startframe() {
	ih=new InternetHero(driver);  
	ih.openframe();
	  
  }
  

}
