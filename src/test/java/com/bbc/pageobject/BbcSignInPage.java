package com.bbc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcSignInPage {
WebDriver ldriver;
	
	//constructor
	public BbcSignInPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	//Signinbutton
	@FindBy(xpath = "//span[normalize-space()='Sign into your BBC account']")
	WebElement SigninHeadingText;
	
	public String getSigninHeadingText() {
		String headingText = SigninHeadingText.getText();
		return headingText;
	}
	
	

}
