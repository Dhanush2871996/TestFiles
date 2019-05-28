/*
 *1. USing this class method we are giving the custom Builder access  for the particular user
 * 	by login as the InstaAdmin user.
 * 
 * 2.Also storing all the common methods for running the reports which are not present in fav builder page
 * 
		**/
package com.reports.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import com.reports.pages.CustomReports;
import com.reports.pages.EditCustomReportRights;
import com.reports.testcases.TestBuilders;

public class CustomTestBuilder extends CustomReports
{
	int reportDate;
	String userName;
	EditCustomReportRights editCustReportRights;
	
	CustomReports customReports;
	BuiderElements builderElements;
	CustomReportsRunByUser customReportsRunByUser;
	TestBuilders testBuilders;
	
	public CustomTestBuilder(WebDriver driver)
	{
		super(driver);
		editCustReportRights = new EditCustomReportRights(driver);
		builderElements = new BuiderElements(driver);
		testBuilders = new TestBuilders();
	}
	
	public void rightsConfig(String allowedReportDuration) throws InterruptedException
	{
		//Code For Switch Window
		String parent1 =driver.getWindowHandle();
		builderElements.switchTabs(parent1);
		
		editCustReportRights.selectAllowedReportDuration(allowedReportDuration);
		
		System.out.println(editCustReportRights.checkForSelectedUser("manishDoc"));
		if(editCustReportRights.checkForSelectedUser("manishDoc"))
		{
		editCustReportRights.selectAvailableUser("manishDoc");
		editCustReportRights.clickOnAddAvailUserBTN();
		}
		
		editCustReportRights.clickOnSaveBTN();
		driver.close();
		
		driver.switchTo().window(parent1);
		//control to main window
	}
	
	public void provideAccess() throws InterruptedException
	{
		clickOnDepartmentWiseAllocationReport(driver);
		rightsConfig("1");
		
		clickOnDoctorWisePatientCountReport(driver);
		rightsConfig("2");
	
		clickOnBillAdjustmentEntriesList(driver);
		rightsConfig("3");
		/*
		clickOnDoctorRevenueDetailedReport(driver);
		rightsConfig("4");
	
		clickOnBillAdjustmentEntriesList(driver);
		rightsConfig("5");
		
		clickOnDoctorRevenueDetailedReport(driver);
		rightsConfig("6");
		
		clickOnRadiologyTATReport(driver);
		rightsConfig("7");
		
		clickOnDepartmentwisePatientCount(driver);
		rightsConfig("8");
		
		clickOnConsumableItemsPriceReport(driver);
		rightsConfig("9");
		
		clickOnVisitStatusReportforHealthAuthority(driver);
		rightsConfig("10");
		
		clickOnSubmissionRejectionRateReporty(driver);
		rightsConfig("11");
		
		clickOnSponsorWiseClaimSubmissionList(driver);
		rightsConfig("12");
		
		clickOnMedicalCheckupReport(driver);
		rightsConfig("1");
		
		clickOnRepeatingDiagnosisReport(driver);
		rightsConfig("2");
		
		clickOnAirmileReport(driver);
		rightsConfig("3");
		
		clickOnRevenueProgressReport(driver);
		rightsConfig("4");
		
		clickOnDetailedStockReport(driver);
		rightsConfig("5");
		
		clickOnPatientReferralReport(driver);
		rightsConfig("6");
		
		clickOnCashCreditSplitReport(driver);
		rightsConfig("7");
		
		clickOnInsuranceClaimBatchReport(driver);
		rightsConfig("8");
		
		clickOnStockRejectionReport(driver);
		rightsConfig("9");
		
		clickOnBifurcationReport(driver);
		rightsConfig("10");
		
		clickOnReconciliationReport(driver);
		rightsConfig("11");
	
		clickOnBillStatusReport(driver);
		rightsConfig("12");
	
		clickOnLaboratoryTATReport(driver);
		rightsConfig("1");
		
		clickOnlaboratoryTATReport(driver);
		rightsConfig("2");
		
		clickOnListofPlansReport(driver);
		rightsConfig("3");
		
		clickOnDenialAcceptanceReport( driver);
		rightsConfig("4");
		
		clickOnNationWiseRevenueReport(driver);
		rightsConfig("5");
		
		clickOnNationWiseRevenueReportDepartmentWise(driver);
		rightsConfig("6");
		
		clickOnBedOccupancyReport(driver);
		rightsConfig("7");
		
		clickOnDRGVarianceReport(driver);
		rightsConfig("8");
		
		clickOnDoctorPerformanceReport(driver);
		rightsConfig("9");
		
		clickOnTherapistReport(driver);
		rightsConfig("10");
		
		clickOnCustomerDueReport(driver);
		rightsConfig("12");
		
		clickOnRemittanceAdviceReport(driver);
		rightsConfig("1");
		
		clickOnPACSOrderStatisticsReport(driver);
		rightsConfig("2");
		
		clickOnResubmissionReport(driver);
		rightsConfig("3");
	
		clickOnTotalSalesReport(driver);
		rightsConfig("4");
		
		clickOnDischargeStatusReport(driver);
		rightsConfig("5");
		
		clickOnStockStatusReport(driver);
		rightsConfig("6");
		
		clickonPowerscribeReport(driver);
		rightsConfig("7");
		
		clickonAdvanceAndRefundReceipts(driver);
		rightsConfig("8");
		
		clickonDepositAndRefundReceipt(driver);
		rightsConfig("9");
		
		clickonPatientDueReport(driver);
		rightsConfig("10");
		
		clickonAppointmentTATReport(driver);
		rightsConfig("11");
		
		clickonPriorAuthReport(driver);
		rightsConfig("12");
		
		clickonRadiologyAlertCategoryReport(driver);
		rightsConfig("1");
		
		clickonLabTatReport_fields(driver);
		rightsConfig("2");
		
		clickonModifiedRevenueProgressReport(driver);
		rightsConfig("3");
	
		clickonCollectionLogReportFinal(driver);
		rightsConfig("5");
		*/
	}
	
	//test1
	public void navigateToCustomDashboard()
	{
		customReports = new CustomReports(driver);//Initializing the page elements
		
		((JavascriptExecutor)driver).executeScript("scroll(50,500)");
		customReports.clickOnCustomReportsDropdown();
		customReports.clickOnReportListLink();
		
		customReportsRunByUser = new CustomReportsRunByUser(driver);
		builderElements = new BuiderElements(driver);
		
	}
	//test1
	public void runCustomReportFor1Month() throws InterruptedException
	{
		customReportsRunByUser.clickOnDepartmentWiseAllocationReport();
		
		String parent2 =driver.getWindowHandle();//address of cutomDasboard page tab
		builderElements.switchTabs(parent2);
		System.out.println("stage 2");
		
		builderElements.selectDateRangeOPtion("Today");
		System.out.println("stage 1");
		builderElements.clickOnPdfButton();
		
		String parent3 =driver.getWindowHandle();//address of CustomBuilder page tab
 		builderElements.switchTabs(parent3);
 		
 		//Note before closing the window extract the date range from pdf and the close
		driver.close();//closing the pdf page tab
		driver.switchTo().window(parent3);
		
	}
	
	//test3
	public boolean runCustomReportFor2Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 2 Months Duration and generate the Report."); 		
		
	}
	
	//test4
	public boolean runCustomReportsFor4Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 4 Months Duration and generate the Report."); 		
		
	}
	
	//test5
	public boolean runCustomReportsFo5Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 5 Months Duration and generate the Report."); 		
		
	}
	
	//test6
	public boolean runCustomReportsFor6Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 6 Months Duration and generate the Report."); 		
		
	}
	
	//test7
	public boolean runCustomReportsFor7Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 7 Months Duration and generate the Report."); 		
		
	}
	
	//test8
	public boolean runCustomReportsFor8Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 8 Months Duration and generate the Report."); 		
		
	}
	//test9
	public boolean runCustomReportsFor9Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 9 Months Duration and generate the Report."); 		
		
	}
	//test10
	public boolean runCustomReportsFor10Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 10 Months Duration and generate the Report."); 		
		
	}
	
	//test11
	public boolean runCustomReportsFor11Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 11 Months Duration and generate the Report."); 		
		
	}
	
	//test12
	public boolean runCustomReportsFor12Month(String fromDateEnter, String toDateEnter)
	{
		builderElements.enterFromAndToDate(fromDateEnter, toDateEnter);
		builderElements.clickOnPdfButton();
		
		return builderElements.verifyDateRangeAlertMsg("Please Select 12 Months Duration and generate the Report."); 		
		
	}
	
	//test13
	
	//test14
	
	//test15
	
	//test16
	
	
	//test17
	
	//test18
	
	//test19
	
	
	//test20
	
}
