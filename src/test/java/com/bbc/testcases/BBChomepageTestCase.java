package com.bbc.testcases;

import org.testng.annotations.*;

import com.bbc.pageobject.BbcHomePage;

import junit.framework.Assert;

public class BBChomepageTestCase extends BaseClass {
	
	@Test
	public void verifyLogo() {
		BbcHomePage bhp = new BbcHomePage(driver);
		if(bhp.isLogoVisible()) {
			bhp.clickonLogo();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.bbc.com/";
			
			Assert.assertEquals(actualUrl, expectedUrl);
			
		}
		else {
			System.out.println("logo is not visible");
		}
	}

}
