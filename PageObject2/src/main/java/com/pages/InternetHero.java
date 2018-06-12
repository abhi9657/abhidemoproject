package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InternetHero {
	
	public static WebDriver Browser;
	
	public InternetHero(WebDriver driver)
	{
		this.Browser = driver;
		PageFactory.initElements(Browser,this);
	}
	

	
	@FindBy(linkText="/frames")
	WebElement frame;
	
	public void openframe()
	{
		frame.click();
	}

}
