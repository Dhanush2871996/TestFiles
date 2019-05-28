package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchedulerReports
{
	@FindBy(xpath = "//span[text()=\"Scheduler Reports\"]")
	WebElement schedulerReportsDropdown;
	
	@FindBy(linkText = "Scheduled Appointment Report Favourites")
	WebElement scheduledAppointmentReportFavourites;
	
	@FindBy(linkText = "Doctor Appointments Report Builder")
	WebElement doctorAppointmentsReportBuilder;
	
	@FindBy(linkText = "Tests Scheduled Report Builder")
	WebElement testsScheduledReportBuilder;
	
	@FindBy(linkText = "Services Scheduled Report Builder")
	WebElement servicesScheduledReportBuilder;
	
	@FindBy(linkText = "Surgery Appointments Report Builder")
	WebElement surgeryAppointmentsReportBuilder;
	
	@FindBy(linkText = "Consolidated Appointments Report")
	WebElement consolidatedAppointmentsReport;
	
	public SchedulerReports(WebDriver driver) 
	{
		PageFactory.initElements(driver,this );
	}
	
	public void clickOnSchedulerReportsDropdown()
	{
		schedulerReportsDropdown.click();
	}
	
	public void clickOnScheduledAppointmentReportFavourites()
	{
		scheduledAppointmentReportFavourites.click();
	}
	
	public void clickOnDoctorAppointmentsReportBuilder()
	{
		doctorAppointmentsReportBuilder.click();
	}
	
	public void clickOnTestsScheduledReportBuilder()
	{
		testsScheduledReportBuilder.click();
	}
	
	public void clickOnServicesScheduledReportBuilder()
	{
		servicesScheduledReportBuilder.click();
	}
	
	public void clickOnSurgeryAppointmentsReportBuilder()
	{
		surgeryAppointmentsReportBuilder.click();
	}
	
	public void clickOnConsolidatedAppointmentsReport()
	{
		consolidatedAppointmentsReport.click();
	}

}