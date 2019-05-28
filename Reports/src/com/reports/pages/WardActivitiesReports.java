package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.reports.generics.BaseTest;

public class WardActivitiesReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Ward Activities Reports\" ]")
	WebElement wardActivitiesReportsDropDown;
	
	
	@FindBy(linkText = "Patient Activities Report Builder")
	WebElement patientActivitiesReportBuilder;
	
	@FindBy(linkText = "Doctor Order Report Builder")
	WebElement doctorOrderReportBuilder;
	
	public WardActivitiesReports()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnWardActivitiesReportsDropDown()
	{
		wardActivitiesReportsDropDown.click();
	}
	
	public void clickOnPatientActivitiesReportBuilder()
	{
		patientActivitiesReportBuilder.click();
	}
	
	public void clickOnDoctorOrderReportBuilder()
	{
		doctorOrderReportBuilder.click();
	}
}
