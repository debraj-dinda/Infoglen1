package com.infoglen.genericLib;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.Reporter;

import com.google.common.io.Files;

/**
 * 
 * @author Debraj
 *
 */
public class WebDriverCommonLib extends BaseLib{
	
	/**
	 * Wait for element method
	 * @param driver
	 * @param element
	 */
	public void waitForElement(WebDriver driver) {
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	/**
	 * To take screenshot
	 * @param driver
	 * @throws IOException
	 */
	public void screenShot(WebDriver driver) throws IOException {
		RemoteWebDriver r=(RemoteWebDriver)driver;
		File src = r.getScreenshotAs(OutputType.FILE);
		File dest=new File("./screenshot/wankhedeStadium/.png");
		Files.copy(src, dest);
	}
	/**
	 * To verify text
	 * @param act
	 * @param exp
	 * @param msg
	 */
	public void verifyText(String act, String exp,String msg) {
		Assert.assertEquals(act, exp);
		Reporter.log(msg+ "Test Passed"+ true);
	}
	/**
	 * To verify page by title
	 * @param act
	 * @param exp
	 * @param msg
	 */
	public void verifyPageTitle(WebDriver driver, String title) {
		String ActualTitle=driver.getTitle();
		if(ActualTitle.equals(title)) {
			Reporter.log("Pass",true);
		}
		else {
			Reporter.log("Fail",true);
		}
		
	}
	

}






