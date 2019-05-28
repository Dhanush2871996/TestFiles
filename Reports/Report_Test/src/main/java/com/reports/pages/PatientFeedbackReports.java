package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientFeedbackReports
{
	
	@FindBy(xpath = "//span[text()=\"Patient Feedback Reports\"]")
	WebElement patientFeedbackReportsDropdown;
	
	@FindBy(linkText = "Patient Survey Response Details Report Builder")
	WebElement patientSurveyResponseDetailsReportBuilder;
	
	public PatientFeedbackReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPatientFeedbackReportsDropdown()
	{
		patientFeedbackReportsDropdown.click();
	}
	
	public void clickOnPatientSurveyResponseDetailsReportBuilder ()
	{
		patientSurveyResponseDetailsReportBuilder.click();
	}
}
