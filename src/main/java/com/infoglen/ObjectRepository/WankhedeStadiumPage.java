package com.infoglen.ObjectRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
/**
 * 
 * @author Debraj
 *
 */
public class WankhedeStadiumPage {
	
	/**
	 * Identify the element using @FindBy and make them private
	 */
	@FindBy(xpath="//input[@autofocus='autofocus']") private WebElement searchTextField;
	@FindBy(xpath="//button[@id='searchbox-searchbutton']") private WebElement searchBtn;
	
	

/**
 * Provide only getter methods to access private element
 * @return
 */

public WebElement getSearchTextField() {
	return searchTextField;
}

public WebElement getSearchBtn() {
	return searchBtn;
}
/**
 * Create reusable method
 */
public void searchWankhedeStadium() {
	searchTextField.sendKeys("Wankhede Stadium");
}
public void clickSearchBtn() {
	searchBtn.click();
}

/**
 * Provide constructor
 */
public WankhedeStadiumPage(WebDriver driver) {
	PageFactory.initElements(driver, this);
}

}