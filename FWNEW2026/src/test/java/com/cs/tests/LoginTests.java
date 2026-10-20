package com.cs.tests;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import com.cs.driver.DriverManager;

final class LoginTests extends BaseTest {

	private LoginTests() {}

	@Test

	public void test1() throws InterruptedException {

	DriverManager.getDriver().findElement(By.name("q")).sendKeys("Cyber Success", Keys.ENTER);

		Thread.sleep(10000l);

	}

	@Test

	public void test2() throws InterruptedException {

		DriverManager.getDriver().findElement(By.name("q")).sendKeys("Best Java Classes In Pune", Keys.ENTER);

		Thread.sleep(10000l);

	}

}
