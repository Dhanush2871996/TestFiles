/**
 * In this class we are running all the test cases for the builder for custom reports builder.
 * 
 * */

package com.reports.testcases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.reports.generics.BaseTest;
import com.reports.pages.BuiderElements;
import com.reports.pages.CustomReports;
import com.reports.pages.CustomReportsRunByUser;
import com.reports.pages.CustomTestBuilder;
import com.reports.pages.EditCustomReportRights;

public class TestCustomReportBuilders extends BaseTest
{	
	CustomReports customReports;
	TestLoginPage testLoginPage;
	EditCustomReportRights editCustomReportRights;
	BuiderElements builderElements = new BuiderElements(driver);
	CustomTestBuilder customTestBuilder;
	TestBuilders testBuilders;
	CustomReportsRunByUser customReportsRunByUser;
	
	@BeforeClass
	public void setUp() throws InterruptedException
	{
		testLoginPage = new TestLoginPage(USERNAME2, PASSWORD2, "Y");
		customReports = new CustomReports(driver);
		editCustomReportRights = new EditCustomReportRights(driver);
		customTestBuilder= new CustomTestBuilder(driver);
		
		customReports.clickOnCustomReportsDropdown();
		customReports.clickOnReportListLink();
		
		customTestBuilder.provideAccess(); //give access to all the custom report for an particular user
		
		testBuilders = new TestBuilders(USERNAME4,PASSWORD4,"Y");//login as that user to whom the access rights are given.
		//customReports =	new CustomReports(driver);	
		
		customTestBuilder.navigateToCustomDashboard();
		
		customReportsRunByUser = new CustomReportsRunByUser(driver);
	}
	
//	@Test(priority = 1)
//	public void test1() throws InterruptedException
//	{
//		customTestBuilder.navigateToCustomDashboard();
//		customTestBuilder.runCustomReportFor1Month();
//	}
	
	//For all the negative cases i am calling all the methods from "TestBuilders" class
	@Test(priority = 1)
	public void testingAllTheNagativeCases()
	{
		System.out.println("test start 1");
		customReportsRunByUser.clickOnDepartmentWiseAllocationReport();
		
		System.out.println("test start 1.1");
		boolean a= testBuilders.testDateFieldsBlank_pdf();
		Assert.assertEquals(a,true,"Blank date for generating pdf report got failed");
		
		System.out.println("test start 2");
		boolean b = testBuilders.testDateFieldsBlank_csv();
		Assert.assertEquals(b,true,"Blank date for generating csv report got failed");
		
		System.out.println("test start 3");
		boolean c = testBuilders.testDateFieldsBlank_text();
		Assert.assertEquals(c,true,"Blank date for generating text report got failed");
		
		System.out.println("test ends.");
	}
}
