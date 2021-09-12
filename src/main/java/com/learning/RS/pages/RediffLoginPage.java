package com.learning.RS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {

	WebDriver driver;

	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}

	By emailTextBox = By.id("login1");
	By passwordTextBox = By.xpath("//input[@id='password']");
	By signInButton = By.name("proceed");
	By rediffLink = By.cssSelector("a[class='f12']");

	public WebElement getEmailTextBox() {
		return driver.findElement(emailTextBox);
	}

	public WebElement getPasswordTextBox() {
		return driver.findElement(passwordTextBox);
	}

	public WebElement getSignInButton() {
		return driver.findElement(signInButton);
	}

	public WebElement getRediffLink() {
		return driver.findElement(rediffLink);
	}

}
