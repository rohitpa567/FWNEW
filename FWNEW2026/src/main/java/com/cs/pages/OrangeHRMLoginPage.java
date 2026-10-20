package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitStrategy;

public final class OrangeHRMLoginPage extends BasePage {

	private static final By username = By.name("username");
	private static final By password = By.name("password");
	private static final By loginBtn = By.xpath("//button[@type='submit']");

	public OrangeHRMLoginPage enterUsername(String un) {

		// DriverManager.getDriver().findElement(username).sendKeys(un);
		sendKeys(username, un, WaitStrategy.PRESENCE, "username");

		return this;
	}

	public OrangeHRMLoginPage enterPassword(String pwd) {

		// DriverManager.getDriver().findElement(password).sendKeys(pwd);

		sendKeys(password, pwd, WaitStrategy.PRESENCE, "password");

		return this;
	}

	public OrangeHomePage clickOnLoginBtn() {

		// DriverManager.getDriver().findElement(loginBtn).click();
		click(loginBtn, WaitStrategy.CLICKABLE, " Login Button");

		return new OrangeHomePage();
	}

}
