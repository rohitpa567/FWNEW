package com.cs.pages;

import org.openqa.selenium.By;

import com.cs.enums.WaitStrategy;

public final class PIMPage  extends BasePage{
  
	public PIMPage() {}
	
	private static final By addOtn = By.xpath("//div[@id=\"app\"]//div[2]/div[1]/button");
	
	 
	 public PIMPage clickOnAddBtn() {
		 
		 click(addOtn, WaitStrategy.CLICKABLE, "Add Button");
		 
		 return this;
	 }
	
}
