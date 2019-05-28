package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProcurementReports 
{
	@FindBy(xpath = "//span[text()=\"Procurement Reports\"]")
	WebElement procurementReportsDropdown;
	
	@FindBy(linkText = "Procurement Report Favourites")
	WebElement procurementReportFavourites;
	
	@FindBy(linkText = "Purchase Invoices Builder")
	WebElement purchaseInvoicesBuilder;
	
	@FindBy(linkText = "Purchase Items Builder")
	WebElement purchaseItemsBuilder;
	
	@FindBy(linkText = "Purchase Invoice Tax Report")
	WebElement purchaseInvoiceTaxReport;
	
	@FindBy(linkText = "Purchase Items Tax Report")
	WebElement purchaseItemsTaxReport;
	
	@FindBy(linkText = "Purchase Tax Report-Abated MRP")
	WebElement purchaseTaxReport_AbatedMRP;
	
	@FindBy(linkText = "Supplier Returns Builder")
	WebElement supplierReturnsBuilder;
	
	@FindBy(linkText = "Pending Replacement")
	WebElement pendingReplacement;
	
	@FindBy(linkText = "Supplier Payments Report")
	WebElement supplierPaymentsReport;
	
	@FindBy(linkText = "Bonus Items Report")
	WebElement bonusItemsReport;
	
	@FindBy(linkText = "PO - Items Builder")
	WebElement PO_ItemsBuilder;
	
	@FindBy(linkText = "PO-Pending Items Builder")
	WebElement PO_PendingItemsBuilder;
	
	@FindBy(linkText = "Purchase Order Builder")
	WebElement purchaseOrderBuilder;
	
	@FindBy(linkText = "Purchase Summary Report")
	WebElement purchaseSummaryReport;
	
	@FindBy(linkText = "Purchase Details Report")
	WebElement purchaseDetailsReport;
	
	
	public ProcurementReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProcurementReportsDropdown()
	{
		procurementReportsDropdown.click();
	}
	
	public void clickOnProcurementReportFavourites()
	{
		procurementReportFavourites.click();
	}
	
	public void clickOnPurchaseInvoicesBuilder()
	{
		purchaseInvoicesBuilder.click();
	}
	
	public void clickOnPurchaseItemsBuilder()
	{
		purchaseItemsBuilder.click();
	}
	
	public void clickOnPurchaseInvoiceTaxReport()
	{
		purchaseInvoiceTaxReport.click();
	}
	
	public void clickOnPurchaseItemsTaxReport()
	{
		purchaseItemsTaxReport.click();
	}
	
	public void clickOnPurchaseTaxReport_AbatedMRP()
	{
		purchaseTaxReport_AbatedMRP.click();
	}
	
	public void clickOnSupplierReturnsBuilder()
	{
		supplierReturnsBuilder.click();
	}
	
	public void clickOnPendingReplacement()
	{
		pendingReplacement.click();
	}
	
	public void clickOnSupplierPaymentsReport()
	{
		supplierPaymentsReport.click();
	}
	
	public void clickOnBonusItemsReport()
	{
		bonusItemsReport.click();
	}
	
	public void clickOnPO_ItemsBuilder()
	{
		PO_ItemsBuilder.click();
	}
	
	public void clickOnPO_PendingItemsBuilder()
	{
		PO_PendingItemsBuilder.click();
	}
	
	public void clickOnPurchaseOrderBuilder()
	{
		purchaseOrderBuilder.click();
	}
	
	public void clickOnPurchaseSummaryReport()
	{
		purchaseSummaryReport.click();
	}
	
	public void clickOnpurchaseDetailsReport()
	{
		purchaseDetailsReport.click();
	}
}
