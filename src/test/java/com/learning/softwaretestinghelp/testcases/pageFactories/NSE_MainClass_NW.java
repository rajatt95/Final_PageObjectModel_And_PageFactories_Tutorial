
package com.learning.softwaretestinghelp.testcases.pageFactories;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.jsoup.nodes.Document.QuirksMode;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.learning.softwaretestinghelp.pages.pageFactories.PagefactoryClass_NW;

import __01_com.learning.base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;

public class NSE_MainClass_NW extends TestBase{

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		preSetup(driver);
		navigateToURL(driver,"https://www.nseindia.com/");
		
		test_Home_Page_ofNSE(driver);
		
	}

	public static void test_Home_Page_ofNSE(WebDriver driver) throws StaleElementReferenceException {
		PagefactoryClass_NW page = new PagefactoryClass_NW(driver);

		page.selectCurrentDerivative("Currency Derivatives");
		page.selectSymbol("USD");
		// List&lt;WebElement&gt;
		List<WebElement> Options = driver.findElements(By.xpath("//span[contains(.,'USD')]"));
		int count = Options.size();
		for (int i = 0; i < count; i++) {
			System.out.println(i);
			System.out.println(Options.get(i).getText());
			System.out.println("---------------------------------------");

			if (i == 3) {
				System.out.println(Options.get(3).getText() + " clicked");
				Options.get(3).click();

				break;
			}
		}
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {

			e.printStackTrace();
		}
		page.verifytext();
		
	}
}