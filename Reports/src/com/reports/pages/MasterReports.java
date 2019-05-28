package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.reports.generics.BaseTest;

public class MasterReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Master Reports\" ]")
	WebElement masterReportsDropDown;
	
	@FindBy(linkText = "Master Report Favourites")
	WebElement masterReportFavourites;
	
	@FindBy(linkText = "Rate Master Report Builder")
	WebElement rateMasterRportBuilder;
	
	public MasterReports()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMasterReportsDropDown()
	{
		masterReportsDropDown.click();
	}
	
	public void clickOnMasterReportFavourites()
	{
		masterReportFavourites.click();
	}
	
	public void clickOnRateMasterReportBuilder()
	{
		rateMasterRportBuilder.click();
	}
}
