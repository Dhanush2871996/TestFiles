package com.reports.pages;

//import java.awt.AWTException;
//import java.awt.Robot;

//import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FavouriteReports
{
	WebDriver driver;

	@FindBy(linkText = "Clear")
	WebElement clearLink;
	
	@FindBy(xpath = "//a[@id= \"aMore\"]")
	WebElement moreOption;
	
	@FindBy(xpath = "//input[@name= \"report_title\"]")
	WebElement favReportName;
	
	@FindBy(xpath = "//input[@id= \"Search\"]")
	WebElement searchBTN;
	
	@FindBy(xpath = "//input[@id = \"_Total Advances Collected\"]")
	WebElement checkBox;
	
	@FindBy(xpath = "//input[@name= \"delete_button\"]")
	WebElement deleteFav;
	
	@FindBy(xpath = "//input[@name= \"freq_button\"]")
	WebElement toggelFrequrentlyViewed;
	
	//@FindBy(xpath = "//table[@id= \"dragTable\"]")
	//WebElement table;
	
	@FindBy(xpath = "//tr[@id= \"toolbarRow0\"]")
	WebElement tableRowZero;
	
	@FindBy(id = "toolbarAction_defaultRunReport")
	WebElement runLink;
	
	
	public FavouriteReports(WebDriver driver) 
	{
		PageFactory.initElements(driver, this);
		
	}
	public void clickOnClearLink()
	{
		clearLink.click();
	}
	
	public void clickOnMoreOption()
	{
		moreOption.click();
	}
	
	public void enterReportName(String favName)
	{
		favReportName.sendKeys(favName);
	}
	
	public void clickOnSearchBTN()
	{
		searchBTN.click();
	}
	
//	public void favReportSearch()//pending to extract data(then pass the row to runReportLink method for left click

	public void runReport()
	{
		Actions action = new Actions(driver);
		action.moveToElement(tableRowZero).click().build().perform();
		action.click(runLink).build().perform();;
		=driver.getWindowHandles();
	}
}
