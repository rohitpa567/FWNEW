package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.driver.DriverManager;
import com.cs.enums.WaitStrategy;
import com.cs.factories.ExplicitWaitFactory;

public final class AddCustomerDetails extends BasePage {

	private static final By fName = By.name("firstName");
	private static final By mName = By.name("middleName");
	private static final By lname = By.name("lastName");
	private static final By saveBtn = By.xpath("//button[@type='submit']");

	private static final By cnfMessage = By.xpath("//*[text()='Successfully Saved']");

	public AddCustomerDetails enterFname(String firstName) {

		sendKeys(fName, firstName + System.currentTimeMillis(), WaitStrategy.PRESENCE, "FIRSTNAME");
		return this ;
	}

	public AddCustomerDetails enterMname(String middleName) {

		sendKeys(mName, middleName + System.currentTimeMillis(), WaitStrategy.PRESENCE, "MIDDLENAME");
		return this ;
	}

	public AddCustomerDetails enterLname(String lastName) {

		sendKeys(lname, lastName + System.currentTimeMillis(), WaitStrategy.PRESENCE, "LASTNAME");
		return this ;
	}

	public void clickOnSaveBtn() {
		click(saveBtn, WaitStrategy.CLICKABLE, "CLICKED SAVE BUTTON ");
	}

	public String confirmationMessage() {
		
         ExplicitWaitFactory.performExplicitWait(WaitStrategy.PRESENCE, cnfMessage);

		String confirmationMessage = DriverManager.getDriver().findElement(cnfMessage).getText();

		return confirmationMessage;
	}
}
