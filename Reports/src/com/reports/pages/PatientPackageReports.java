package com.reports.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.reports.generics.BaseTest;

public class PatientPackageReports extends BaseTest{

    @FindBy(xpath = "Patient Package Reports")
    WebElement patientPackageReportsDropDown;

    @FindBy(linkText = "Patient Packages")
    WebElement patientPackages;


    public PatientPackageReports()
    {
    	PageFactory.initElements(driver, this);
    }




    public void clickOnPatientPackageReportsDropDown()
    {
    	patientPackageReportsDropDown.click();
    }	

    public void clickOnPatientPackages()
    {
    	patientPackages.click();
    }
}
