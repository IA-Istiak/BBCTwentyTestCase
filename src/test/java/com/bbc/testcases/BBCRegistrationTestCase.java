package com.bbc.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bbc.pageobject.BbcHomePage;
import com.bbc.pageobject.BbcRegisterPage;

public class BBCRegistrationTestCase extends BaseClass {
	
	@Test(priority = 2)
	public void verifyRegisterButton() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonRegisterBtn();

		BbcRegisterPage brp = new BbcRegisterPage(driver);
		String actualHeading = brp.getRegisterHeadingText();
		String expectedHeading = "Register for a BBC account";
		Assert.assertEquals(actualHeading, expectedHeading);
		
		

	}

}
