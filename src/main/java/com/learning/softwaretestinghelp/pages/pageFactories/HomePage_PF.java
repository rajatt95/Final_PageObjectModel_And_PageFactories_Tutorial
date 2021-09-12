package com.learning.softwaretestinghelp.pages.pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage_PF {

	WebDriver driver;

	// Constructor
	// Gets called when object of this page is created in MainClass.java
	public HomePage_PF(WebDriver driver) {
		// "this" keyword is used here to distinguish global and local variable "driver"
		// gets driver as parameter from MainClass.java and assigns to the driver
		// instance in this class
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "email")
	private WebElement EmailAddress;

	@FindBy(name = "pass")
	private WebElement Password;

	@FindBy(xpath = "//button[normalize-space()='Log In']")
	private WebElement SignInButton;

	// Method to type EmailId
	public void typeEmailId(String Id) {
		System.out.println("Typing Email ID: " + Id);
		EmailAddress.sendKeys(Id);
	}

	// Method to type Password
	public void typePassword(String PasswordValue) {
		System.out.println("Typing password: " + PasswordValue);
		Password.sendKeys(PasswordValue);
	}

	// Method to click SignIn Button
	public void clickSignIn() {
		System.out.println("Clicking on Sign in");
		SignInButton.click();
	}

}
