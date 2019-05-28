package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SalesAndIssuesReports 
{	
	@FindBy(xpath = "//span[text()=\"Sales/Issues Reports\"]")
	WebElement sales_IssuesReportsDropdown;
	
	@FindBy(linkText ="Sales/Issues Report Favourites")
	WebElement sales_IssuesReportFavourites;//in place of "/"(forward slash i substituted as "_"(underscore)
	
	@FindBy(linkText = "Sales Bills Builder")
	WebElement salesBillsBuilder;
	
	@FindBy(linkText = "Sale Items Builder")
	WebElement saleItemsBuilder;
	
	@FindBy(linkText = "Dues Report")
	WebElement duesReport;
	
	@FindBy(linkText = "Doctor Wise Prescribed vs Sold Report")
	WebElement doctorWisePrescribedvsSoldReport;
	
	@FindBy(linkText = "Controlled Drug Sales Report")
	WebElement controlledDrugSalesReport;
	
	@FindBy(linkText = "Sale Items VAT Report")
	WebElement saleItemsVATReport;
	
	@FindBy(linkText = "Prescription Lead Time Builder")
	WebElement prescriptionLeadTimeBuilder;
	
	@FindBy(linkText = "Markup Rates Report")
	WebElement markupRatesReport;
	
	@FindBy(linkText = "Stock Consumption Report Builder")
	WebElement stockConsumptionReportBuilder;
	
	@FindBy(linkText = "Stock Issues Builder")
	WebElement stockIssuesBuilder;
	
	@FindBy(linkText = "Sales/Issues ABC Analysis Report Builder")
	WebElement sales_IssuesABCAnalysisReportBuilder;
	
	@FindBy(linkText = "Patient Indent Items Builder")
	WebElement patientIndentItemsBuilder;
	
	@FindBy(linkText = "Karnataka Sales Tax Report")
	WebElement karnatakaSalesTaxReport;
	
	public SalesAndIssuesReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSales_IssuesReportsDropdown()
	{
		sales_IssuesReportsDropdown.click();
	}
	
	public void clickOnSales_IssuesReportFavourites()
	{
		sales_IssuesReportFavourites.click();
	}
	
	public void clickOnSalesBillsBuilder()
	{
		salesBillsBuilder.click();
	}
	
	public void clickOnSaleItemsBuilder()
	{
		saleItemsBuilder.click();
	}
	
	public void clickOnDuesReport()
	{
		duesReport.click();
	}
	
	public void clickOnDoctorWisePrescribedvsSoldReport()
	{
		doctorWisePrescribedvsSoldReport.click();
	}
	
	public void clickOnControlledDrugSalesReport()
	{
		controlledDrugSalesReport.click();
	}
	
	public void clickOnSaleItemsVATReport()
	{
		saleItemsVATReport.click();
	}
	
	public void clickOnPrescriptionLeadTimeBuilder()
	{
		prescriptionLeadTimeBuilder.click();
	}
	
	public void clickOnMarkupRatesReport()
	{
		markupRatesReport.click();
	}
	
	public void clickOnStockConsumptionReportBuilder()
	{
		stockConsumptionReportBuilder.click();
	}
	
	public void clickOnStockIssuesBuilder()
	{
		stockIssuesBuilder.click();
	}
	
	public void clickOnSales_IssuesABCAnalysisReportBuilder()
	{
		sales_IssuesABCAnalysisReportBuilder.click();
	}
	
	public void clickOnPatientIndentItemsBuilder()
	{
		patientIndentItemsBuilder.click();
	}
	
	public void clickOnKarnatakaSalesTaxReport()
	{
		karnatakaSalesTaxReport.click();
	}

}
