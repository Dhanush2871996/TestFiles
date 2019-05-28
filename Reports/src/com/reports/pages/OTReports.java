package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class OTReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"OT Reports\" ]")
    WebElement oTReportsDropDown;

    @FindBy(linkText = "OT Report Favourites")
    WebElement oTReportFavourites;

    @FindBy(linkText = "OT Schedule Report Builder")
    WebElement oTScheduleReportBuilder;

    public OTReports()
    {
    	PageFactory.initElements(driver, this);
    }

    public void clickOnOTReportsDropDown()
    {
    	oTReportsDropDown.click();
    }	

    public void clickOnOTReportFavourites()
    {
    	oTReportFavourites.click();
    }

    public void clickOnOTScheduleReportBuilder()
    {
    	oTScheduleReportBuilder.click();
    }

}
