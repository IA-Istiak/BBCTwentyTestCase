package com.bbc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class BbcHomePage {
	// create object of web driver
	WebDriver ldriver;

	// constructor
	public BbcHomePage(WebDriver rdriver) {

		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	// identify web element in pom page factory

	@FindBy(xpath = "(//div[@data-testid='anchor-inner-wrapper'])[1]")
	WebElement logo;

	// Method to check if the button is displayed

	// logo
	public boolean isLogoVisible() {
		return logo.isDisplayed();
	}

	public void clickonLogo() {
		logo.click();
	}

	// Registerbutton
	@FindBy(xpath = "//button[@class='sc-a8bd19ef-2 sc-a8bd19ef-3 eWRqKu kASdSb']")
	WebElement RegisterButton;

	public void clickonRegisterBtn() {
		RegisterButton.click();
	}

	// SignINbutton
	@FindBy(xpath = "//button[@class='sc-a8bd19ef-2 sc-a8bd19ef-5 eWRqKu llOrAy']")
	WebElement SignInButton;

	public void clickonSigninButton() {
		SignInButton.click();
	}

	// SearchIcon

	@FindBy(xpath = "//button[@aria-label='Search BBC']")
	WebElement searchIcon;

	public boolean isSearchIconVisible() {

		return searchIcon.isDisplayed();
	}
	
	public void clickonSearchIcon() {
		searchIcon.click();
	}
	

// search input field
	@FindBy(xpath = "//input[@placeholder='Search news, topics and more']")
	WebElement searchInput;

	public boolean isSearchInputVisible() {

		return searchInput.isDisplayed();
	}

	public void searchInputFieldText() {
		searchInput.sendKeys("news");
	}

//searchbuttononsidemenu
	@FindBy(xpath = "//button[contains(@data-testid,'search-input-search-button')]")
	WebElement searchbtn;

	public void clickonSearchbutton() {
		searchbtn.click();
	}

	
	
	//hamburgericon
	@FindBy(xpath="//button[@aria-label='Open menu']")
	WebElement HamburgerIcon;
	
	public void clickonHambugerIcon() {
		HamburgerIcon.click();
	}
	
	@FindBy(xpath="//button[@aria-label='Close menu']")
	WebElement closeIcon;
	
	public void clickonCloseIcon() {
		closeIcon.click();
	}
	
	//sidebar
	@FindBy(xpath="//div[@class='sc-6a850d44-0 cZdFDR']")
	WebElement sideBar;
	
	public boolean isSideBarVisible() {

		return sideBar.isDisplayed();
	}
	
	//more news link
	@FindBy(xpath = "//a[@href='https://www.bbc.com/news']")
	WebElement moreNewsl;
	
	public void clickonMoreNews() {
		moreNewsl.click();
	}
	
	//us election highlight
	@FindBy(xpath = "//a[@href='https://www.bbc.com/news']")
	WebElement usElection;
	
	public void clickonUsElection() {
		usElection.click();
	}
	//us election section 
	@FindBy(xpath = "//section[@data-analytics_group_name='US election']//div[@class='sc-ceaf77c0-2 dxUpSs']")
	WebElement usElectionSection;
	
	public void clickonUsElectionSection() {
		usElectionSection.click();
	}
	
	//us election section heading
	
	@FindBy(xpath = "//h2[normalize-space()='US election polls: Who is ahead - Harris or Trump?']")
	WebElement usElectionSectionHeading;
	
	public String usElcHeadText() {
		return usElectionSectionHeading.getText();
	}
	
	public void clickonUsElectionSectionHeading() {
		usElectionSectionHeading.click();
	}
	
	//h2[normalize-space()='US election polls: Who is ahead - Harris or Trump?']
	
	//navbar
	@FindBy(xpath = "//nav[@class='sc-f116bf72-1 xECcw']")
	WebElement navBar;
	public boolean isNavBarVisible() {

		return navBar.isDisplayed();
	}
	
	//Read about our approach to external linking.
	
	@FindBy(xpath = "//a[@class='sc-c9299ecf-0 bZUiKB']")
	WebElement atExLink;
	
	public void clickonexternalLinking() {
		atExLink.click();
	}
	
	//language dropdown
	@FindBy(xpath = "//button[normalize-space()='BBC in other languages']")
	WebElement ldropdown;
	public void clickonlangDropdown() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", ldropdown );
		ldropdown.click();
	}
	
	//bbcBangla
	@FindBy(xpath ="//section[@class='sc-b310c64c-0 cUeFDY']//div[5]")
	WebElement bbcBnaglaop;
	
	public void clickonbbcBnaglaOption() {
		
		bbcBnaglaop.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Terms of Use']")
	WebElement TermsUse;
	public void clickonTermUse() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", TermsUse );
        TermsUse.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='About the BBC']")
	WebElement aboutBbc;
	public void clickonAboutBbc() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", aboutBbc );
        aboutBbc.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Privacy Policy']")
	WebElement privacyPolicy;
	public void clickonprivacyPolicy() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", privacyPolicy );
        privacyPolicy.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Cookies']")
	WebElement cookies;
	public void clickoncookies() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", cookies );
        cookies.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Accessibility Help']")
	WebElement accessibilityHelp;
	public void clickonaccessibilityHelp() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", accessibilityHelp );
        accessibilityHelp.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Contact the BBC']")
	WebElement contactTheBbc;
	public void clickoncontactTheBbc() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", contactTheBbc );
        contactTheBbc.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Advertise with us']")
	WebElement advertiseWithUs;
	public void clickonadvertiseWithUs() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", advertiseWithUs );
        advertiseWithUs.click();
	}
	
	@FindBy(xpath = "//a[normalize-space()='Contact technical support']")
	WebElement contactTechnicalSupport;
	public void clickoncontactTechnicalSupport() {
		// Use JavaScriptExecutor to scroll to the element
        JavascriptExecutor js = (JavascriptExecutor) ldriver;
        js.executeScript("arguments[0].scrollIntoView(true);", contactTechnicalSupport );
        contactTechnicalSupport.click();
	}
	


	

}
