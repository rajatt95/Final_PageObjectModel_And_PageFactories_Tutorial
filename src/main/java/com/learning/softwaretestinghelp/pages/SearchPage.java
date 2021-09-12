
package com.learning.softwaretestinghelp.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchPage {

	WebDriver driver;

	// Locator for Success Message
	By SuccessMessage = By.xpath("//div[contains(@id,'Message')]");

	// Method that return True or False depending on whether the message is
	// displayed

	public Boolean MessageDisplayed() {
		Boolean status = driver.findElement(SuccessMessage).isDisplayed();
		return status;
	}

	// Constructor
	// This constructor is invoked when object of this page is created in
	// MainClass.java

	public SearchPage(WebDriver driver) {
		// "this" keyword is used here to distinguish global and local variable "driver"
		// gets driver as parameter from MainClass.java and assigns to the driver
		// instance in this class

		this.driver = driver;
	}
}