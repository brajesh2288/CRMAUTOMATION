package com.crm.qa.pages;

import org.openqa.selenium.By;

import com.crm.qa.base.BasePage;

public class LoginPage extends BasePage {

	// Actions
	public String validateTitle() {
		return driver.getTitle();
	}

	public HomePage login() {
		driver.findElement(By.xpath(prop.getProperty("username-xpath"))).sendKeys(prop.getProperty("username"));
		driver.findElement(By.xpath(prop.getProperty("password-xpath"))).sendKeys(prop.getProperty("password"));
		driver.findElement(By.xpath(prop.getProperty("login-xpath"))).click();

		return new HomePage();

	}
	
	public boolean crmlogoTest()
	{
		return driver.findElement(By.xpath(prop.getProperty("crmlogo-xpath"))).isDisplayed();
	}

	public LoginPage homePageTest() {
		driver.findElement(By.xpath(prop.getProperty("homepagebutton-xpath"))).click();
		// driver.findElement(By.linkText("Home")).click();
		System.out.println("HomePage Button clicked suceessfully");
		return new LoginPage();
	}

	public String signupPageTest() {
		driver.findElement(By.xpath(prop.getProperty("signupbutton-xpath"))).click();
		// driver.findElement(By.xpath(prop.getProperty(key)).click();

		System.out.println("signuppage Button clicked suceessfully");
		return driver.getCurrentUrl();
	}

	public String PricingPageTest() {
		driver.findElement(By.xpath(prop.getProperty("pricingbutton-xpath"))).click();
		System.out.println("Pricing Button clicked suceessfully");
		return driver.getTitle();

	}
	
}