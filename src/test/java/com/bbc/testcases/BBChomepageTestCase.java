package com.bbc.testcases;

import org.testng.annotations.*;

import com.bbc.pageobject.BbcHomePage;
import com.bbc.pageobject.BbcRegisterPage;
import com.bbc.pageobject.BbcSignInPage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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

	@Test
	public void verifyMoreNews() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonMoreNews();
		String expectedUrl = "https://www.bbc.com/news";
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Test
	public void verifyUsElection() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonUsElection();
		String expectedUrl = "https://www.bbc.com/news/topics/cj3ergr8209t";
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Test
	public void verifyUsElectionSection() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonUsElectionSection();
		String expectedUrl = "https://www.bbc.com/news/articles/cj4x71znwxdo";
		String actualUrl = driver.getCurrentUrl();

		Assert.assertEquals(actualUrl, expectedUrl);
	}

	@Test
	public void verifyReadExternalLinking() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonexternalLinking();
		String acturalTitle = driver.getTitle();
		String expectedTitle = "Guidance: Links and feeds";

		Assert.assertEquals(acturalTitle, expectedTitle);

	}

	@Test
	public void verifyLanguageDropdown() {
		BbcHomePage bhp = new BbcHomePage(driver);

		bhp.clickonlangDropdown();

		bhp.clickonbbcBnaglaOption();

		String actualURL = driver.getCurrentUrl();
		String expectedUrl = "https://www.bbc.com/bengali";

		if (actualURL.contentEquals(expectedUrl)) {

			Assert.assertEquals(actualURL, expectedUrl);

		}

	}

	@Test
	public void verifyTermsOfUse() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonTermUse();

		String actualTitle = driver.getTitle();
		String expectedTitle = "A few rules for us and you - Using the BBC";

		if (actualTitle.contentEquals(expectedTitle)) {

			Assert.assertEquals(actualTitle, expectedTitle);

		}

	}

	@Test
	public void verifyaboutBbc() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonAboutBbc();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Learn more about what we do";

		if (actualTitle.contentEquals(expectedTitle)) {

			Assert.assertEquals(actualTitle, expectedTitle);

		}

	}

	@Test
	public void verifyPrivacyPolicy() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonprivacyPolicy();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Keeping your info safe and sound";

		if (actualTitle.contentEquals(expectedTitle)) {

			Assert.assertEquals(actualTitle, expectedTitle);

		}

	}
	
	@Test
	public void verifyCookies() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickoncookies();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Take control of your cookies";

		if (actualTitle.contentEquals(expectedTitle)) {

			Assert.assertEquals(actualTitle, expectedTitle);

		}

	}
	
	@Test
	public void verifyaccessibilityHelp() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonaccessibilityHelp();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Accessibility - BBC";

		if (actualTitle.contentEquals(expectedTitle)) {

			Assert.assertEquals(actualTitle, expectedTitle);

		}

	}
	
	@Test
	public void verifycontactTheBbc() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickoncontactTheBbc();

		String actualTitle = driver.getTitle();
		String expectedTitle = "Contact Home | Contact the BBC";

		if (actualTitle.contentEquals(expectedTitle)) {

			Assert.assertEquals(actualTitle, expectedTitle);

		}

	}
	
	@Test
	public void verifyadvertiseWithUs() {
		BbcHomePage bhp = new BbcHomePage(driver);
		bhp.clickonadvertiseWithUs();

		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "https://www.bbc.com/advertisingcontact";

		if (actualUrl.contentEquals(expectedUrl)) {

			Assert.assertEquals(actualUrl, expectedUrl);

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
