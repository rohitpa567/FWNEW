package com.cs.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.cs.driver.Driver;
import com.cs.reports.ExtentReport;

public class BaseTest {

	protected BaseTest() {
	}

	@BeforeMethod

	public void setUp() throws Exception {

		Driver.initDriver();
	}

	@AfterMethod

	public void tearDown() {

		Driver.quitDriver();

	}

}
