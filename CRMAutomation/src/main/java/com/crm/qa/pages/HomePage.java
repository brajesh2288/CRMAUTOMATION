package com.crm.qa.pages;

import org.openqa.selenium.By;

import com.crm.qa.base.BasePage;
import com.crm.qa.utilities.UtilityPage;

public class HomePage extends BasePage {
	
	UtilityPage utility = new UtilityPage();
	public HomePage()
	{
		super();
	}
	
	
	public String verifyHomepageTitle()
	{
		return driver.getTitle();
	}
	
	public boolean verifyUserLable()
	{
		utility.switchtoFrame();
	  return driver.findElement(By.xpath(prop.getProperty("usernamelabel"))).isDisplayed();
		
	}
	
	public ContactsPage verifyContactPage()
	{   
		utility.switchtoFrame();
		driver.findElement(By.xpath(prop.getProperty("contactlink"))).click();
		return new ContactsPage();
	}
	
	
	public CasesPage verifyCasesPage()
	{   
		utility.switchtoFrame();
		driver.findElement(By.xpath(prop.getProperty("caseslink"))).click();
		return new CasesPage();
	}
	
	public DealsPage verifyDealsPage()
	{   
		utility.switchtoFrame();
		driver.findElement(By.xpath(prop.getProperty("dealslink"))).click();
		return new DealsPage();
	}
	
	public EmailPage verifyEmailPage()
	{   
		utility.switchtoFrame();
		driver.findElement(By.xpath(prop.getProperty("emaillink"))).click();
		return new EmailPage();
	}
	
	public CallPage verifyCallPage()
	{   
		utility.switchtoFrame();
		driver.findElement(By.xpath(prop.getProperty("calllink"))).click();
		return new CallPage();
	}
}
