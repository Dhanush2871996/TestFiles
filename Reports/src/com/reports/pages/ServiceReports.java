package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class ServiceReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Service Reports\" ]")
    WebElement serviceReportsDropDown;

    @FindBy(linkText = "Service Report Favourites")
    WebElement serviceReportFavourites;

    @FindBy(linkText = "Services Report Builder")
    WebElement servicesReportBuilder;
    
    @FindBy(linkText = "Services Prescription Ordered Report")
    WebElement servicesPrescriptionOrderedReport;

    public ServiceReports()
    {
    	PageFactory.initElements(driver, this);
    }

    public void clickOnServiceReportsDropDown()
    {
    	serviceReportsDropDown.click();
    }	

    public void clickOnServiceReportFavourites()
    {
    	serviceReportFavourites.click();
    }

    public void clickOnServicesReportBuilder()
    {
    	servicesReportBuilder.click();
    }

    public void clickOnServicesPrescriptionOrderedReport()
    {
    	servicesPrescriptionOrderedReport.click();
    }

}
