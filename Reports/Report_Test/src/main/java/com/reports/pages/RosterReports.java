package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RosterReports
{
	@FindBy(xpath = "//span[text()=\"Roster Reports\"]")
	WebElement rosterReportsDropdown;
	
	@FindBy(linkText = "Duty Roster Report Builder")
	WebElement dutyRosterReportBuilder;
	
	public RosterReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void clickOnRosterReportsDropdown()
	{
		rosterReportsDropdown.click();
	}
	
	public void clickOnDutyRosterReportBuilder ()
	{
		dutyRosterReportBuilder.click();
	}

}
