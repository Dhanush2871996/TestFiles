package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditCustomReportRights 
{
	Select select;
	
	//************* Edit Report Rights start******************//
	//Note: Use Mouse Action to Left click on builder
	@FindBy(id = "allow_run_report_for_corporate_ofc")
	WebElement runReportForCorporateOffice;
	
	@FindBy(xpath = "//select[@name=\"allowed_report_duration\"]")
	WebElement selectAllowedReportDuration;
	
	@FindBy(xpath = "//input[@name=\"save_button\"]")
	WebElement saveBTN;
	
	@FindBy(xpath = "//select[@id=\"avlbListFlds\"]")
	WebElement selectAvailableUser;
	
	@FindBy(xpath = "//input[@name=\"addLstFldsButton\"]")
	WebElement addAvailUserBTN;
	
	@FindBy(linkText = "Custom Report DashBoard")
	WebElement customReportDashBoardLink;
	
	//************* Edit Report Rights end******************//
	
	

	//************* Edit Report Rights start******************//
	
	public void clickOnRunReportForCorporateOffice()
	{
		System.out.println("Before clicking : " +selectAllowedReportDuration.isEnabled());
		selectAllowedReportDuration.click();
		System.out.println("After clicking : " +selectAllowedReportDuration.isEnabled());
	}
	
	public void selectAllowedReportDuration(String month)
	{
		select = new Select(selectAllowedReportDuration);
		select.selectByValue(month);
	}
	
	public void selectAvailableUser(String userName)
	{
		select = new Select(selectAvailableUser);
		select.selectByValue(userName);
	}
	
	public void clickOnAddAvailUserBTN()
	{
		addAvailUserBTN.click();
	}
	
	public void clickOnSaveBTN()
	{
		saveBTN.click();
	}
	//************* Edit Report Rights end******************//
	
}
