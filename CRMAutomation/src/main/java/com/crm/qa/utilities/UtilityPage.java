package com.crm.qa.utilities;

import com.crm.qa.base.BasePage;

public class UtilityPage extends BasePage {
	
	public void switchtoFrame()
	{
	driver.switchTo().frame("mainpanel");
	}

}
