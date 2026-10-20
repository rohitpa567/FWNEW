package com.cs.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.cs.driver.DriverManager;
import com.cs.enums.WaitStrategy;
import com.cs.factories.ExplicitWaitFactory;
import com.cs.reports.ExtentLogger;

public class BasePage {

	protected void click(By by, WaitStrategy waitStrategy, String elementName) {

		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.click();
		
		ExtentLogger.pass(elementName + " clicked");
	}

	protected void sendKeys(By by, String value, WaitStrategy waitStrategy,String elementName) {

		WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, by);
		element.sendKeys(value);
		
		ExtentLogger.pass(value + " is entered successfully in "+ elementName);
	}

	public String getPageTitle() {

		return DriverManager.getDriver().getTitle();

	}

}