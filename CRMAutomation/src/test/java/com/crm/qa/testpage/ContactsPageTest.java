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


public class ContactsPageTest extends BasePage {
	
	HomePage homepage = new HomePage();
	UtilityPage utility = new UtilityPage();
	ContactsPage contactpage = new ContactsPage();
	
	@BeforeMethod
	public void setup() {
		Intialization();
		System.out.println("browser is Started");
		LoginPage loginpage = new LoginPage();
		loginpage.login();
		homepage.verifyContactPage();
	}

	@Test(priority= 1)
	
	public void verifyContactLabelTest()
	{
		Assert.assertTrue(contactpage.verifyContactLabel());
	}
	
	@Test(priority= 2)
	
	public void selectContactsByNameTest()
	{
		contactpage.selectContactsByName("Rahul Gupta");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.close();
		System.out.println("Browser is closed Now");
	}
}
