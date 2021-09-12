package com.learning.RS.testcases.pageFactories;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learning.RS.pages.pageFactories.RediffHomePage_PF;
import com.learning.RS.pages.pageFactories.RediffLoginPage_PF;
import com.learning.utilities.Custom_Utilties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffTest_PF {

	private static final String SEARCH_TEXT = "Hi Shera";
	private static final String APPLICATION_URL = "https://mail.rediff.com/cgi-bin/login.cgi";
	private static final String PASSWORD_TEXT = "abcd123654";
	private static final String EMAIL_TEXT = "Full Stack Automation Test Engineer";

	@Test
	public void Login() {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		System.out.println("Navigating to: " + APPLICATION_URL);
		driver.get(APPLICATION_URL);

		System.out.println("Title: " + driver.getTitle());
		RediffLoginPage_PF loginPage = new RediffLoginPage_PF(driver);

		// Ways to access the WebElement
		// 1 - Calling method (to get some logs, if you want)
		System.out.println("Entering " + EMAIL_TEXT + " in Email field");
		loginPage.emailTextBox().sendKeys(EMAIL_TEXT);

		// 2 - Calling webelement directly
		System.out.println("Entering " + PASSWORD_TEXT + " in Password field");
		loginPage.passwordTextBox.sendKeys(PASSWORD_TEXT);

		System.out.println("Clicking on Sign Button");
		loginPage.signInButton.click();

		System.out.println("Validate that the Invalid Login message is present");
		WebElement error_Message_Wrong_Username_Password = driver.findElement(By.id("div_login_error"));
		Assert.assertTrue(error_Message_Wrong_Username_Password.isDisplayed(),
				"Valiation for error_Message_Wrong_Username_Password.");
		System.out.println("----------------------------");
		System.out.println("Clicking on Rediff link");

		loginPage.rediffLink.click();

		Custom_Utilties.holdScript(3);

		System.out.println("Now, Title: " + driver.getTitle());
		System.out.println(driver.getTitle());

		RediffHomePage_PF homePage = new RediffHomePage_PF(driver);

		System.out.println("Entering " + SEARCH_TEXT + " in search textbox");
		homePage.searchTextBox.sendKeys(SEARCH_TEXT);

		Custom_Utilties.holdScript(3);
		System.out.println("Success");

		driver.quit();

	}

}
