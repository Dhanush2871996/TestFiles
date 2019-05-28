package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class MRDReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"MRD Reports\" ]")
	WebElement mRDReportsDropDown;
	
	@FindBy(linkText = "MRD Report Favourites")
	WebElement mRDReportFavourites;
	
	@FindBy(linkText = "Case File Report Builder")
	WebElement caseFileReportBuilder;
	
	public MRDReports()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMRDReportsDropDown()
	{
		mRDReportsDropDown.click();
	}
	
	public void clickOnMRDReportFavourites()
	{
		mRDReportFavourites.click();
	}
	
	public void clickOnCaseFileReportBuilder()
	{
		caseFileReportBuilder.click();
	}
	
}
