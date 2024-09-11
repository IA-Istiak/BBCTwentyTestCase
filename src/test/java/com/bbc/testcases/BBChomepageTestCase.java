package com.bbc.testcases;

import org.testng.annotations.*;

import com.bbc.pageobject.BbcHomePage;
import com.bbc.pageobject.BbcRegisterPage;
import com.bbc.pageobject.BbcSignInPage;

import org.testng.Assert;

public class BBChomepageTestCase extends BaseClass {

	@Test
	public void verifyLogo() {
		BbcHomePage bhp = new BbcHomePage(driver);
		if (bhp.isLogoVisible()) {
			bhp.clickonLogo();
			String actualUrl = driver.getCurrentUrl();
			String expectedUrl = "https://www.bbc.com/";

			Assert.assertEquals(actualUrl, expectedUrl);

		} else {
			System.out.println("logo is not visible");
		}
	}

	@Test
	public void verifyRegisterButton() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonRegisterBtn();

		BbcRegisterPage brp = new BbcRegisterPage(driver);
		String actualHeading = brp.getRegisterHeadingText();
		String expectedHeading = "Register for a BBC account";
		Assert.assertEquals(actualHeading, expectedHeading);

	}

	@Test
	public void verifySignInButton() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonSigninButton();

		BbcSignInPage bsp = new BbcSignInPage(driver);
		String actualHeading = bsp.getSigninHeadingText();
		String expectedHeading = "Sign into your BBC account";
		Assert.assertEquals(actualHeading, expectedHeading);

	}

	@Test
	public void verifySearchIcon() {
		BbcHomePage bhp = new BbcHomePage(driver);

		if (bhp.isSearchIconVisible()) {
			bhp.clickonSearchIcon();
			boolean sidebarPresent = bhp.isSideBarVisible();

			Assert.assertTrue(sidebarPresent, "The element is not visible.");
		}
	}

	@Test
	public void verifySearchField() {
		BbcHomePage bhp = new BbcHomePage(driver);
		clickonSearchinconMethod();
		if (bhp.isSearchInputVisible()) {
			bhp.searchInputFieldText();
			bhp.clickonSearchbutton();

			String acturalTitle = driver.getTitle();
			String expectedTitle = "BBC";

			Assert.assertEquals(acturalTitle, expectedTitle);
		}
	}
	
	@Test

	public void verifyHamburgerIcon() {
		BbcHomePage bhp = new BbcHomePage(driver);

		if (bhp.isSearchIconVisible()) {
			bhp.clickonSearchIcon();

			boolean sidemenuTrue = bhp.isSideBarVisible();

			Assert.assertTrue(sidemenuTrue);
			bhp.clickonCloseIcon();

		}
	}

	// preconditon method
	public void clickonSearchinconMethod() {
		BbcHomePage bhp = new BbcHomePage(driver);

		if (bhp.isSearchIconVisible()) {
			bhp.clickonSearchIcon();
		}
	}

}
