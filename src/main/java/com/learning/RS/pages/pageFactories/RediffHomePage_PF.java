package com.learning.RS.pages.pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RediffHomePage_PF {

	/**
	 * @FindBys : When the required WebElement objects need to match all of the
	 *          given criteria use @FindBys annotation
	 * 
	 * @FindAll : When required WebElement objects need to match at least one of the
	 *          given criteria use @FindAll annotation
	 */
	WebDriver driver;

	public RediffHomePage_PF(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "srchquery_tbox")
	public WebElement searchTextBox;

}
