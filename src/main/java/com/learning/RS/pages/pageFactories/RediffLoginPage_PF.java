package com.learning.RS.pages.pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffLoginPage_PF {

	WebDriver driver;

	public RediffLoginPage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(id = "login1")
	private WebElement emailTextBox;

	@FindBy(xpath = "//input[@id='password']")
	public WebElement passwordTextBox;

	@FindBy(name = "proceed")
	public WebElement signInButton;

	@FindBy(css = "a[class='f12']")
	public WebElement rediffLink;

	public WebElement emailTextBox() {
		return emailTextBox;
	}

	/*
	 * By emailTextBox = By.id("login1"); By passwordTextBox =
	 * By.xpath("//input[@id='password']"); By signInButton = By.name("proceed");
	 * 
	 * By rediffLink = By.cssSelector("a[class='f12']");
	 * 
	 * public RediffLoginPage(WebDriver driver) { this.driver = driver; }
	 * 
	 * public WebElement emailTextBox() { return driver.findElement(emailTextBox); }
	 * 
	 * public WebElement passwordTextBox() { return
	 * driver.findElement(passwordTextBox); }
	 * 
	 * public WebElement signInButton() { return driver.findElement(signInButton); }
	 * 
	 * public WebElement rediffLink() { return driver.findElement(rediffLink); }
	 */
}
