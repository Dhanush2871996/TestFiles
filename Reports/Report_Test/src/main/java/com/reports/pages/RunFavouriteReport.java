package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

//Note: Call button of "PDF", "CSV", "text" from Builder Element page.

public class RunFavouriteReport
{
	static Select select;
	
	@FindBy(xpath = "//input [@name=\"dateRange\" and @value=\"defaultReportDate\"]")
	WebElement defaultReportDateRadioBTN;
	
	@FindBy(xpath = "//input [@name=\"dateRange\" and @value=\"useOtherDate\"]")
	WebElement otherDate;
	
	@FindBy(xpath = "//select [@id=\"_sel\"]")
	WebElement selectDateRange;
	
	@FindBy(id = "fromDate")
	WebElement fromDate;
	
	@FindBy(id = "toDate")
	WebElement toDate;
	
	public void clickOnDefaultReportDateRadioBTN()
	{
		defaultReportDateRadioBTN.click();
	}
	
	public void clickOnOtherDate()
	{
		otherDate.click();
	}
	
	public void selectDateRange(String option)
	{
		select = new Select(selectDateRange);
		select.selectByVisibleText(option);
	}
	
	public void enterFromDate(String fromDate1)
	{
		fromDate.sendKeys(fromDate1);
	}
	
	public void enterToDate(String toDate1)
	{
		toDate.sendKeys(toDate1);
	}
	
}
