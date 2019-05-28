package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class BedUtilReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Bed Util Reports\" ]")
    WebElement bedUtilReportsDropDown;

    @FindBy(linkText = "Bed Util Report Favourites")
    WebElement bedUtilReportFavourites;

    @FindBy(linkText = "Current Bed Occupancy Report Builder")
    WebElement currentBedOccupancyReportBuilder;
    
    @FindBy(linkText = "Detailed Bed Occupancy Report Builder")
    WebElement detailedBedOccupancyReportBuilder;
    
    @FindBy(linkText = "Patient Bed Occupancy Report Builder")
    WebElement patientBedOccupancyReportBuilder;
    
    @FindBy(linkText = "Bed Utilization Report")
    WebElement bedUtilizationReport;
    
    @FindBy(linkText = "Luxury Tax Report Builder")
    WebElement luxuryTaxReportBuilder;

    public BedUtilReports()
    {
    	PageFactory.initElements(driver, this);
    }

    public void clickOnBedUtilReportsDropDown()
    {
    	bedUtilReportsDropDown.click();
    }	

    public void clickOnBedUtilReportFavourites()
    {
    	bedUtilReportFavourites.click();
    }

    public void clickOnCurrentBedOccupancyReportBuilder()
    {
    	currentBedOccupancyReportBuilder.click();
    }
	
    
    public void clickOnDetailedBedOccupancyReportBuilder()
    {
    	detailedBedOccupancyReportBuilder.click();
    }
    
    public void clickOnPatientBedOccupancyReportBuilder()
    {
    	patientBedOccupancyReportBuilder.click();
    }
    
    public void clickOnBedUtilizationReport()
    {
    	bedUtilizationReport.click();
    }
    
    public void clickOnLuxuryTaxReportBuilder()
    {
    	luxuryTaxReportBuilder.click();
    }
}
