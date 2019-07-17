package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;



public class BasePage {
	
	public static WebDriver driver;
	public static Properties prop;
        public BasePage() {
		try {
			prop= new Properties();
			System.out.println("Base Page clas constructer Called");
			FileInputStream ip = new FileInputStream("C:/Users/D-PC/eclipse-workspace/CRMAutomation/src/main/java/"
					+ "com/crm/qa/config/Config.Properties");
			
			prop.load(ip);
			System.out.println("configurtion file is loaded successfully");
			
		}

		catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public static void Intialization()
	{
		String browsername= prop.getProperty("browser");
		if(browsername.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\D-PC\\eclipse-workspace\\CRMAutomation\\Library\\chromedriver.exe");
			
			ChromeOptions option =new ChromeOptions();
			//option.addArguments("window-size=1400,800");
			//option.addArguments("headless");
			 driver= new ChromeDriver();
			 driver.get(prop.getProperty("url"));
			 
			 driver.manage().window().maximize();
			 driver.manage().deleteAllCookies();
			 
			 //driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
			 //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			 
			 
			}
	}
	

}