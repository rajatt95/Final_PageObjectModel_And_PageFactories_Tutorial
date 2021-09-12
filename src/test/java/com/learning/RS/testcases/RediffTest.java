package com.learning.RS.testcases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.learning.RS.pages.RediffHomePage;
import com.learning.RS.pages.RediffLoginPage;
import com.learning.utilities.Custom_Utilties;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RediffTest {

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

		RediffLoginPage loginPage = new RediffLoginPage(driver);

		System.out.println("Entering " + EMAIL_TEXT + " in Email field");
		loginPage.getEmailTextBox().sendKeys(EMAIL_TEXT);

		System.out.println("Entering " + PASSWORD_TEXT + " in Password field");
		loginPage.getPasswordTextBox().sendKeys(PASSWORD_TEXT);

		System.out.println("Clicking on Sign Button");
		loginPage.getSignInButton().click();

		System.out.println("Validate that the Invalid Login message is present");
		WebElement error_Message_Wrong_Username_Password = driver.findElement(By.id("div_login_error"));
		Assert.assertTrue(error_Message_Wrong_Username_Password.isDisplayed(),
				"Valiation for error_Message_Wrong_Username_Password.");
		System.out.println("----------------------------");
		System.out.println("Clicking on Rediff link");
		loginPage.getRediffLink().click();

		Custom_Utilties.holdScript(3);
		System.out.println("Now, Title: " + driver.getTitle());

		RediffHomePage homePage = new RediffHomePage(driver);

		System.out.println("Entering " + SEARCH_TEXT + " in search textbox");
		homePage.getSearchTextBox().sendKeys(SEARCH_TEXT);

		Custom_Utilties.holdScript(3);
		System.out.println("Success");

		driver.quit();

	}

}
