package com.bbc.pageobject;

import org.openqa.selenium.WebDriver;
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

	@FindBy(xpath = "//div[@class='sc-49542412-2 hrGuyi']//div[@data-testid='anchor-inner-wrapper']")
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
	@FindBy(xpath = "//button[@class='sc-323fdeef-2 sc-323fdeef-3 gjScLO bkxJJx']")
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
	
	//navbar
	@FindBy(xpath = "//nav[@class='sc-f116bf72-1 xECcw']")
	WebElement navBar;
	public boolean isNavBarVisible() {

		return navBar.isDisplayed();
	}
	
	

}
