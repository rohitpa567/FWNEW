package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitStrategy;
import com.cs.reports.ExtentLogger;
import com.cs.reports.ExtentManager;
import com.cs.reports.ExtentReport;

public final class OrangeHomePage extends BasePage {

	protected OrangeHomePage() {
	}

	private static final By profilePicArrow = By.xpath("//img[@class='oxd-userdropdown-img']");

	private static final By logoutOption = By.xpath("(//a[@role='menuitem'])[4]");
	
	private static final By pimOption = By.xpath("//div[@id='app']//ul/li[2]/a");
	
	

	public OrangeHomePage clickOnProfilePicArrow() {
		

		// DriverManager.getDriver().findElement(profilePicArrow).click();
		
		click(profilePicArrow, WaitStrategy.CLICKABLE," Profile Arrow");
		
		
		//ExtentManager.getExtentTest().pass("Profile Pic Arrow button clicked");
		
		//ExtentReport.test.pass("Profile Pic Arrow button clicked");
		return this;

	}

	public OrangeHRMLoginPage clickOnLogoutOption() {
		

		click(logoutOption, WaitStrategy.CLICKABLE," Logout Option ");
		
		//ExtentManager.getExtentTest().pass("Logout Option button clicked");
		return new OrangeHRMLoginPage();

	}
	
	public PIMPage clickOnPIMOption() {
		
		click(pimOption, WaitStrategy.CLICKABLE, "PIMOPTION");
		
		return new PIMPage();
	}

}
