package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class DentalReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Dental Reports\" ]")
	WebElement dentalReportsDropDown;
	
	@FindBy(linkText = "Dental Treatment Details Report Builder")
	WebElement dentalTreatmentDetailsReportBuilder;
	
	@FindBy(linkText = "Dental Supplies Report Builder")
	WebElement dentalSuppliesReportBuilder;
	
	public DentalReports()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnDentalReportsDropDown()
	{
		dentalReportsDropDown.click();
	}
	
	public void clickOnDentalTreatmentDetailsReportBuilder()
	{
		dentalTreatmentDetailsReportBuilder.click();
	}
	
	public void clickOnDentalSuppliesReportBuilder()
	{
		dentalSuppliesReportBuilder.click();
	}
}
