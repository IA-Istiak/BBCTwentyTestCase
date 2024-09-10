package com.bbc.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BbcRegisterPage {
	
WebDriver ldriver;
	
	//constructor
	public BbcRegisterPage(WebDriver rdriver) {
		
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	@FindBy(xpath="//span[normalize-space()='Register for a BBC account']")
	
	WebElement RegisterHeadingText;
	
	public String getRegisterHeadingText() {
		String headingText = RegisterHeadingText.getText();
		return headingText;
	}

}
