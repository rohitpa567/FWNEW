package com.cs.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.cs.pages.OrangeHRMLoginPage;
import com.cs.reports.ExtentReport;

public final class OrangeHRMTests extends BaseTest {

	public OrangeHRMTests() {
	}

	@Test(dataProvider = "LoginTestData")

	public static void LoginLogoutTest(String username, String password) {
		
		
		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();
		String actTitle = ohlp.enterUsername(username).enterPassword(password).clickOnLoginBtn()
				.clickOnProfilePicArrow().clickOnLogoutOption().getPageTitle();

		String expTitle = "OrangeHRM";
		Assert.assertEquals(actTitle, expTitle, "Login Page title does not match with " + expTitle);

	}

	@DataProvider(name = "LoginTestData",parallel = true)
	public Object[][] getData() {
		return new Object[][] { { "Admin", "admin123" }, { "Admin", "admin123112" } };
	}

}
