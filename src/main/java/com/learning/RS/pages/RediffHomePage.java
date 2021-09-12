package com.learning.RS.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffHomePage {

	WebDriver driver;

	public RediffHomePage(WebDriver driver) {
		this.driver = driver;
	}

	By searchTextBox = By.id("srchquery_tbox");

	public WebElement getSearchTextBox() {
		return driver.findElement(searchTextBox);
	}

}
