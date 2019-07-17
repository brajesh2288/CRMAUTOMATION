package com.crm.qa.testpage;

import org.junit.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.BasePage;
import com.crm.qa.pages.ContactsPage;
import com.crm.qa.pages.HomePage;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.utilities.UtilityPage;

public class HomePageTest extends BasePage {

	HomePage homepage = new HomePage();
	UtilityPage utility = new UtilityPage();
	ContactsPage contactpage = new ContactsPage();

	@BeforeMethod
	public void setup() {
		Intialization();
		System.out.println("browser is Started");
		LoginPage loginpage = new LoginPage();
		loginpage.login();
	}

	@Test(priority = 1)
	public void verifytilteTest() {
		String title = homepage.verifyHomepageTitle();
		Assert.assertEquals(title, "CRMPRO");
		System.out.println("Verify titleTest is Passd");
	}

	@Test(priority = 2)
	public void verifyUserLableTest() {

		Assert.assertTrue(homepage.verifyUserLable());
		System.out.println("verifyUserLableTest is Passd");
	}

	@Test(priority = 3)

	public void clickonContactsPageTest() {
		homepage.verifyContactPage();
		System.out.println("clickonContactsPageTest() is Passd");
	}

	@Test(priority = 4)

	public void clickonDealsPageTest() {
		homepage.verifyDealsPage();
		System.out.println("clickonDealsPageTest() is Passed");
	}

	@Test(priority = 5)

	public void clickonCasesPageTest() {
		homepage.verifyCasesPage();
		System.out.println("clickonCasesPageTest() is Passed");

	}

	@Test(priority = 6)

	public void clickonEmailPageTest() {
		homepage.verifyEmailPage();
		System.out.println("clickonEmailPageTest() is Passed");

	}
	
	
	@Test(priority = 7)

	public void clickonCallPageTest() {
		homepage.verifyCallPage();
		System.out.println("clickonCallPageTest() is Passed");

	}
	

	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Browser is closed Now");
	}

}
