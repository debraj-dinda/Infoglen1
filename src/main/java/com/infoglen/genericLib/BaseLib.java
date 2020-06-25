package com.infoglen.genericLib;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
/**
 * 
 * @author Debraj
 *
 */
public class BaseLib implements IAutoConst{
	
	public WebDriverCommonLib wlib=new WebDriverCommonLib();
	public static WebDriver driver;
	
	/**
	 * This is to open the Google Map
	 */
	@BeforeMethod
	public void openBrowser() {
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		wlib.waitForElement(driver);
		
		driver.get(GOOGLE_MAP_URL);
		
	}
	/**
	 *  This is to close the browser
	 */
	@AfterMethod
	public void closeBrowser() {
		driver.quit();
	}

}
