package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class ClinicalDataReports extends BaseTest{

    @FindBy(xpath = "//span[text() =\"Clinical Data Reports\" ]")
    WebElement clinicalDataReportsDropDown;

    @FindBy(linkText = "Clinical Data Report Favourites")
    WebElement clinicalDataReportFavourites;

    @FindBy(linkText = "Lab Test Results Report Builder")
    WebElement labTestResultsReportBuilder;

    @FindBy(linkText = "Clinical Lab Test Results Report Builder")
    WebElement clinicalLabTestResultsReportBuilder;
    
    @FindBy(linkText = "Diagnosis Codes Report Builder")
    WebElement diagnosisCodesReportBuilder;
    
    @FindBy(linkText = "Procedure Codes Report Builder")
    WebElement procedureCodesReportBuilder;
    
    public ClinicalDataReports()
    {
    	PageFactory.initElements(driver, this);
    }

    public void clickOnClinicalDataReportsDropDown()
    {
    	clinicalDataReportsDropDown.click();
    }	

    public void clickOnClinicalDataReportFavourites()
    {
    	clinicalDataReportFavourites.click();
    }

    public void clickOnLabTestResultsReportBuilder()
    {
    	labTestResultsReportBuilder.click();
    }
    

    public void clickOnClinicalLabTestResultsReportBuilder()
    {
    	clinicalLabTestResultsReportBuilder.click();
    }
    
    public void clickOnDiagnosisCodesReportBuilder()
    {
    	diagnosisCodesReportBuilder.click();
    }
    
    public void clickOnProcedureCodesReportBuilder()
    {
    	procedureCodesReportBuilder.click();
    }
}
