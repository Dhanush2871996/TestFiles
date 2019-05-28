package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConsultationReports
{
	
	@FindBy(xpath = "//span[text()=\"Consultation Reports\"]")
	WebElement consultationReportsDropdown;
	
	@FindBy(linkText = "Consultation Report Favourites")
	WebElement consultationReportFavourites;
	
	@FindBy(linkText = "Doctor Consultation Report Builder")
	WebElement doctorConsultationReportBuilder;
	
	@FindBy(linkText = "Prescribing Order Details Report Builder")
	WebElement prescribingOrderDetailsReportBuilder;
	
	public ConsultationReports(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
	}

	public void clickOnConsultationReportsDropdown()
	{
		 consultationReportsDropdown.click();
	}
	
	public void clickOnConsultationReportFavourites()
	{
		consultationReportFavourites.click();
	}
	
	public void clickOnDoctorConsultationReportBuilder()
	{
		doctorConsultationReportBuilder.click();
	}
	
	public void clickOnPrescribingOrderDetailsReportBuilder()
	{
		prescribingOrderDetailsReportBuilder.click();
	}

}
