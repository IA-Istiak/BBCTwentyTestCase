package com.bbc.testcases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.bbc.pageobject.BbcHomePage;
import com.bbc.pageobject.BbcSignInPage;

public class BBCSignInTestCase extends BaseClass {
	
	@Test(priority = 3)
	public void verifySignInButton() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonSigninButton();

		BbcSignInPage bsp = new BbcSignInPage(driver);
		String actualHeading = bsp.getSigninHeadingText();
		String expectedHeading = "Sign into your BBC account";
		Assert.assertEquals(actualHeading, expectedHeading);
		


	}


}
