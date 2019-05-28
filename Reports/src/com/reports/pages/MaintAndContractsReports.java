package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class MaintAndContractsReports extends BaseTest{

	@FindBy(xpath = "//span[text() =\"Maint. & Contracts Reports\" ]")
	WebElement maintAndContractsReportsDropDown;
	
	@FindBy(linkText = "Maintenance Schedule Report Builder")
	WebElement maintenanceScheduleReportBuilder;
	
	@FindBy(linkText = "Maintenance Activity Report Builder")
	WebElement maintenanceActivityReportBuilder;
	
	@FindBy(linkText = "Complaints Report Builder")
	WebElement complaintsReportBuilder;
	
	@FindBy(linkText = "Contract Report Builder")
	WebElement contractReportBuilder;
	
	@FindBy(linkText = "License Report Builder")
	WebElement licenseReportBuilder;
	
	public MaintAndContractsReports()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnMaintAndContractsReportsDropDown()
	{
		maintAndContractsReportsDropDown.click();
	}
	
	public void clickOnMaintenanceScheduleReportBuilder()
	{
		maintenanceScheduleReportBuilder.click();
	}
	
	public void clickOnMaintenanceActivityReportBuilder()
	{
		maintenanceActivityReportBuilder.click();
	}
	
	public void clickOnComplaintsReportBuilder()
	{
		complaintsReportBuilder.click();
	}
	
	public void clickOnContractReportBuilder()
	{
		contractReportBuilder.click();
	}
	
	public void clickOnLicenseReportBuilder()
	{
		licenseReportBuilder.click();
	}
}
