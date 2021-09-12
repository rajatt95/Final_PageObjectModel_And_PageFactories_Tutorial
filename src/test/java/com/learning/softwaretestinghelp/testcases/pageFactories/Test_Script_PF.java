package com.learning.softwaretestinghelp.testcases.pageFactories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.learning.softwaretestinghelp.pages.HomePage;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

//https://www.softwaretestinghelp.com/page-object-model-pom-with-pagefactory/
public class Test_Script_PF extends TestBase {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		preSetup(driver);

		navigateToURL(driver, "https://en-gb.facebook.com/");

		// Creating object of HomePage and driver instance is passed as parameter to
		// constructor of Homepage.Java
		HomePage homePage = new HomePage(driver);

		// Type EmailAddress
		homePage.typeEmailId("abc@ymail.com");
		// EmailId value is passed as parameter which in turn will be assigned to the
		// method in HomePage.Java

		// Type Password Value
		homePage.typePassword("password123");
		// Password value is passed as parameter which in turn will be assigned to the
		// method in HomePage.Java

		// Click on SignIn Button
		homePage.clickSignIn();

		// Creating an object of LoginPage and driver instance is passed as parameter to
		// constructor of SearchPage.Java
		// SearchPage searchPage = new SearchPage(driver);

		// Verify that Success Message is displayed
		// Assert.assertTrue(searchPage.MessageDisplayed());

		// Quit browser
		// driver.quit();
		quitDriver(driver);

	}
}
