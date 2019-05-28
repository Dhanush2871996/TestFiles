package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class InsuranceReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Insurance Reports\" ]")
	WebElement insuranceReportsDropDown;
	
	@FindBy(linkText = "Insurance Report Favourites")
	WebElement insuranceReportFavourites;
	
	@FindBy(linkText = "Insurance Claims Report Builder")
	WebElement insuranceClaimsReportBuilder;
	
	@FindBy(linkText = "Insurance Claim Details Report Builder")
	WebElement insuranceClaimDetailsReportBuilder;
	
	@FindBy(linkText = "Insurance Claim Batch Report Builder")
	WebElement insuranceClaimBatchReportBuilder;
	
	public InsuranceReports()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void clickOnInsuranceReportsDropDown()
	{
		insuranceReportsDropDown.click();
	}
	
	public void clickOnInsuranceReportFavourites()
	{
		insuranceReportFavourites.click();
	}
	
	public void clickOnInsuranceClaimsReportBuilder()
	{
		insuranceClaimsReportBuilder.click();
	}
	
	public void InsuranceClaimDetailsReportBuilder()
	{
		insuranceClaimDetailsReportBuilder.click();
	}
	
	public void InsuranceClaimBatchReportBuilder()
	{
		insuranceClaimBatchReportBuilder.click();
	}
	
}
