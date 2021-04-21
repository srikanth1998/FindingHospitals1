package com.team.findinghospital.qa.testcases;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.team.findinghospital.base.TestBase;
import com.team.findinghospital.pages.CorporateWellnessPage;
import com.team.findinghospital.pages.DiagnosticPage;
import com.team.findinghospital.pages.LandingPage;
import com.team.findinghospital.pages.SearchFilters;
import com.team.findinghospital.util.CaptureScreen;
import com.team.findinghospital.util.ExcelData;

public class CorporateWellnessPageTest extends TestBase{
	
	CorporateWellnessPage corporateWellnessPage;
	DiagnosticPage diagnosticPage;
	SearchFilters searchFilters;
	
	String  name,organisation,Email, number ;

	public CorporateWellnessPageTest() {
		super();
	}
	
	    
	
	@BeforeMethod
	public void setup() {
		initialization();
		corporateWellnessPage = new CorporateWellnessPage();
		diagnosticPage = new DiagnosticPage();
		searchFilters = new SearchFilters();
		ExcelData excelData = new ExcelData();
		FormDetails  = ExcelData.readExcel();	
	}
	
	
	@Test
	public void scheduleDem1() throws InterruptedException {		
		diagnosticPage.CorparateWellness();
		corporateWellnessPage.scheduleDemo(FormDetails[2],FormDetails[3],FormDetails[4],FormDetails[5] );		
	}
	
	@Test
	public void scheduleDemo2() throws InterruptedException {		
		diagnosticPage.CorparateWellness();
		corporateWellnessPage.scheduleDemo(FormDetails[6],FormDetails[7],FormDetails[8],FormDetails[9] );		
	}
	
	@Test
	public void scheduleDemo3() throws InterruptedException {		
		diagnosticPage.CorparateWellness();
		corporateWellnessPage.scheduleDemo(FormDetails[10],FormDetails[11],FormDetails[12],FormDetails[13] );		
	}
	
	@Test
	public void scheduleDemo4() throws InterruptedException {		
		diagnosticPage.CorparateWellness();
		corporateWellnessPage.scheduleDemo(FormDetails[14],FormDetails[15],FormDetails[16],FormDetails[17] );		
	}
	
	@AfterMethod
	public void close() {
		CaptureScreen.screenShot();
		driver.quit();
		}	

	
	
	 	
}
