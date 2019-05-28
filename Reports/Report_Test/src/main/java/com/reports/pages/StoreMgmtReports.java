package com.reports.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class StoreMgmtReports 
{
	@FindBy(xpath = "//span[text()=\"Procurement Reports\"]")
	WebElement procurementReportsDropdown;
	
	@FindBy(linkText = "Stores Report Favourites")
	WebElement storesReportFavourites;
	
	@FindBy(linkText = "Item Master Builder")
	WebElement itemMasterBuilder;
	
	@FindBy(linkText = "Detailed Stock Builder")
	WebElement detailedStockBuilder;
	
	@FindBy(linkText = "Item-Wise Stock Builder")
	WebElement item_WiseStockBuilder;
	
	@FindBy(linkText = "Indent Flow Builder")
	WebElement indentFlowBuilder;
	
	@FindBy(linkText = "Indent Items Detail Builder")
	WebElement indentItemsDetailBuilder;
	
	@FindBy(linkText = "Stock Transfers Builder")
	WebElement stockTransfersBuilder;
	
	@FindBy(linkText = "Stock Adjustment Builder")
	WebElement stockAdjustmentBuilder;
	
	@FindBy(linkText = "Stock Movement Report")
	WebElement stockMovementReport;
	
	@FindBy(linkText = "Item wise Stock Quantity Checkpoint")
	WebElement itemWiseStockQuantityCheckpoint;
	
	@FindBy(linkText = "Item Category wise Stock Value Checkpoint")
	WebElement itemCategoryWiseStockValueCheckpoint;
	
	@FindBy(linkText = "Surplus Stock Report")
	WebElement surplusStockReport;
	
	@FindBy(linkText = "Stock Ledger")
	WebElement stockLedger;
	
	@FindBy(linkText = "Checkpoint Difference")
	WebElement checkpointDifference;
	
	@FindBy(linkText = "TN Tax Report")
	WebElement tNTaxReport;
	
	@FindBy(linkText = "Reagent/Consumable Report Builder")
	WebElement reagent_ConsumableReportBuilder;

	public StoreMgmtReports(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnProcurementReportsDropdown()
	{
		procurementReportsDropdown.click();
	}
	
	public void clickOnStoresReportFavourites()
	{
		storesReportFavourites.click();
	}
	
	public void clickOnItemMasterBuilder()
	{
		itemMasterBuilder.click();
	}
	
	public void clickOnDetailedStockBuilder()
	{
		detailedStockBuilder.click();
	}
	
	public void clickOnItem_WiseStockBuilder()
	{
		item_WiseStockBuilder.click();
	}
	
	public void clickOnIndentFlowBuilder()
	{
		indentFlowBuilder.click();
	}
	
	public void clickOnIndentItemsDetailBuilder()
	{
		indentItemsDetailBuilder.click();
	}
	
	public void clickOnStockTransfersBuilder()
	{
		stockTransfersBuilder.click();
	}
	
	public void clickOnStockAdjustmentBuilder()
	{
		stockAdjustmentBuilder.click();
	}
	
	public void clickOnStockMovementReport()
	{
		 stockMovementReport.click();
	}
	
	public void clickOnItemWiseStockQuantityCheckpoint()
	{
		itemWiseStockQuantityCheckpoint.click();
	}
	
	public void clickOnItemCategoryWiseStockValueCheckpoint()
	{
		itemCategoryWiseStockValueCheckpoint.click();
	}
	
	public void clickOnSurplusStockReport()
	{
		surplusStockReport.click();
	}
	
	public void clickOnStockLedger()
	{
		stockLedger.click();
	}
	
	public void clickOnTNTaxReport()
	{
		tNTaxReport.click();
	}
	public void clickOnreagent_ConsumableReportBuilder()
	{
		reagent_ConsumableReportBuilder.click();
	}
	
}
