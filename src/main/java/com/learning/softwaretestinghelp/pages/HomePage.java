package com.learning.softwaretestinghelp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {

	WebDriver driver;

	// Locator for Email Address
	By EmailAddress = By.id("email");

	// Locator for Password field
	By Password = By.name("pass");

	// Locator for SignIn Button
	By SignInButton = By.xpath("//button[normalize-space()='Log In']");

	// Method to type EmailId
	public void typeEmailId(String Id) {
		System.out.println("Typing Email ID: " + Id);
		driver.findElement(EmailAddress).sendKeys(Id);
	}

	// Method to type Password
	public void typePassword(String PasswordValue) {
		System.out.println("Typing password: " + PasswordValue);
		driver.findElement(Password).sendKeys(PasswordValue);
	}

	// Method to click SignIn Button
	public void clickSignIn() {
		System.out.println("Clicking on Sign in");
		driver.findElement(SignInButton).click();
	}

	// Constructor
	// Gets called when object of this page is created in MainClass.java
	public HomePage(WebDriver driver) {
		// "this" keyword is used here to distinguish global and local variable "driver"
		// gets driver as parameter from MainClass.java and assigns to the driver
		// instance in this class
		this.driver = driver;

	}
}
