package com.cs.tests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;

import com.cs.pages.AddCustomerDetails;
import com.cs.pages.OrangeHRMLoginPage;
import com.cs.pages.OrangeHomePage;
import com.cs.pages.PIMPage;

public class CustomerTests extends BaseTest {

	@Test

	public void addCustomerTest() {

		OrangeHRMLoginPage ohlp = new OrangeHRMLoginPage();

		OrangeHomePage ohhp = ohlp.enterUsername("Admin").enterPassword("admin123").clickOnLoginBtn();
		ohhp.clickOnPIMOption().clickOnAddBtn();

		AddCustomerDetails acd = new AddCustomerDetails();

		acd.enterFname("rohit").enterMname("g").enterLname("patil").clickOnSaveBtn();

		String expMsg = "Successfully Saved";
		String actMsg = acd.confirmationMessage();

		System.out.println(actMsg);

		assertEquals(expMsg, actMsg, "Customer did not saved");

	}

}
