package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PatientStatsReports 
{
	
	@FindBy(xpath = "//span[text()=\"Patient Stats Reports\"]")
	WebElement patientStatsReportsDropdown;
	
	@FindBy(linkText = "Patient Stats Report Favourites")
	WebElement patientStatsReportFavourites;
	
	@FindBy(linkText = "Patient Details Builder")
	WebElement patientDetailsBuilder;
	
	@FindBy(linkText = "Visit Details Report Builder")
	WebElement visitDetailsReportBuilder;
	
	@FindBy(linkText = "Patient Vitals Report Builder")
	WebElement patientVitalsReportBuilder;
	
	@FindBy(linkText = "Patient Stats Tabular Report Builder")
	WebElement patientStatsTabularReportBuilder;
	
	@FindBy(linkText = "Patient Stats Trend Report Builder")
	WebElement patientStatsTrendReportBuilder;
	
	@FindBy(linkText = "Patient Visit Stats Trend Report Builder")
	WebElement patientVisitStatsTrendReportBuilder;
	
	@FindBy(linkText = "Patient Admit Discharge Trend Report Builder")
	WebElement patientAdmitDischargeTrendReportBuilder;

	@FindBy(linkText = "In Patient Report Builder")
	WebElement inPatientReportBuilder;

	@FindBy(linkText = "IP Statistics Report")
	WebElement iPStatisticsReport;

	@FindBy(linkText = "IP/OP Statistics Report")
	WebElement iP_OPStatisticsReport;

	@FindBy(linkText = "Birth Details Report Builder")
	WebElement birthDetailsReportBuilder;

	@FindBy(linkText = "IP Stats/Bed Occupancy Report Builder")
	WebElement iPStats_BedOccupancyReportBuilder;

	@FindBy(linkText = "Patient Duplicates Report Builder")
	WebElement patientDuplicatesReportBuilder;
	
	
	public PatientStatsReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnPatientStatsReportsDropdown()
	{
		patientStatsReportsDropdown.click();
	}
	
	public void clickOnPatientStatsReportFavourites()
	{
		patientStatsReportFavourites.click();
	}
	
	public void clickOnPatientDetailsBuilder()
	{
		patientDetailsBuilder.click();
	}
	
	public void clickOnVisitDetailsReportBuilder()
	{
		visitDetailsReportBuilder.click();
	}
	
	public void clickOnPatientVitalsReportBuilder()
	{
		patientVitalsReportBuilder.click();
	}
	
	public void clickOnPatientStatsTabularReportBuilder()
	{
		patientStatsTabularReportBuilder.click();
	}
	
	public void clickOnPatientStatsTrendReportBuilder()
	{
		patientStatsTrendReportBuilder.click();
	}
	
	public void clickOnPatientVisitStatsTrendReportBuilder()
	{
		patientVisitStatsTrendReportBuilder.click();
	}
	
	public void clickOnPatientAdmitDischargeTrendReportBuilder()
	{
		patientAdmitDischargeTrendReportBuilder.click();
	}
	
	public void clickOnInPatientReportBuilder()
	{
		inPatientReportBuilder.click();
	}
	
	public void clickOnIPStatisticsReport()
	{
		iPStatisticsReport.click();
	}
	
	public void clickOniP_OPStatisticsReport()
	{
		iP_OPStatisticsReport.click();
	}
	
	public void clickOnBirthDetailsReportBuilder()
	{
		birthDetailsReportBuilder.click();
	}
	
	public void clickOnIPStats_BedOccupancyReportBuilder()
	{
		iPStats_BedOccupancyReportBuilder.click();
	}
	
	public void clickOnPatientDuplicatesReportBuilder()
	{
		patientDuplicatesReportBuilder.click();
	}

}
