package com.crm.qa.testpage;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends BasePage {

	public LoginPageTest() {
		super();
	}

	LoginPage loginpage = new LoginPage();

	@BeforeMethod

	public void setup() {
		Intialization();
		System.out.println("browser is Started");

	}
	


	@Test(priority = 2)
	public void loginTest() {

		loginpage.login();

		if (driver.getTitle().equals("CRMPRO"))
			System.out.println("login test is passed successfully");
		else
			System.out.println("login test is Failed");
	}

	@Test(priority = 1)

	public void validateTitlePageTest() {

		String title = loginpage.validateTitle();
		/*
		 * if(title.
		 * equals("CRMPRO - CRM Software for customer relationship management, sales and support."
		 * )) { System.out.println("LoginPageTitle Test is passed successfully"); }
		 */
		Assert.assertEquals(title, "CRMPRO - CRM software for customer relationship management, sales, and support.");

	}

	@Test(priority = 3)
	public void ValidateHomepageTest() {
		loginpage.homePageTest();
		if (driver.getTitle()
				.equals("CRMPRO - CRM software for customer relationship management, sales, and support.")) {
			System.out.println("Home page Button  working Successfully");
		} else
			System.out.println("Home page Button not  working ");
	}

	@Test(priority = 4)

	public void validateSignupbuttonTest() {
		String url = loginpage.signupPageTest();
		Assert.assertEquals(url, "https://www.crmpro.com/register/");

		System.out.println("Signup button clicked");
	}

	@Test(priority = 5)

	public void validatePricingbuttonTest() {
		String url = loginpage.PricingPageTest();
		Assert.assertEquals(url, "CRMPRO PRICING");
		System.out.println("Pricing button clicked");
	}

	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Browser is closed Now");
	}

}
