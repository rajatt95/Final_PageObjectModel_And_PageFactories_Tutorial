package com.learning.softwaretestinghelp.pages.pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class PagefactoryClass_NW {
	WebDriver driver;

	@FindBy(id = "QuoteSearch")
	WebElement Searchbox;

	@FindBy(id = "cidkeyword")
	WebElement Symbol;

	@FindBy(id = "companyName")
	WebElement pageText;

	public PagefactoryClass_NW(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void selectCurrentDerivative(String derivative) {
		Select select = new Select(Searchbox);
		select.selectByVisibleText(derivative); // "Currency Derivatives"
	}

	public void selectSymbol(String symbol) {
		Symbol.sendKeys(symbol);
	}

	public void verifytext() {
		if (pageText.getText().equalsIgnoreCase("U S Dollar-Indian Rupee - USDINR")) {
			System.out.println("Page Header is as expected");
		} else
			System.out.println("Page Header is NOT as expected");
	}
}
