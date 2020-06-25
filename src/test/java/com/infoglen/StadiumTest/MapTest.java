package com.infoglen.StadiumTest;

import java.io.IOException;

import org.testng.annotations.Test;

import com.infoglen.ObjectRepository.WankhedeStadiumPage;
import com.infoglen.genericLib.BaseLib;

/**
 * 
 * @author Debraj
 *
 */
public class MapTest extends BaseLib{
	
	@Test
	public void wankhedeTest() throws IOException {
		wlib.waitForElement(driver);
		WankhedeStadiumPage wp=new WankhedeStadiumPage(driver);
		wp.searchWankhedeStadium();
		wp.clickSearchBtn();
		
		wlib.screenShot(driver);
		
		String actualTitle = driver.getTitle();
		String expectedTitle="Wankhede Stadium - Google Maps";
		wlib.verifyPageTitle(driver, expectedTitle);
		
		
	//	  String text = driver.getPageSource();
		//wlib.verifyText(act, exp, msg);
	}

}
