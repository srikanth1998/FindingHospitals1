package com.team.findinghospital.qa.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.team.findinghospital.base.TestBase;
import com.team.findinghospital.pages.LandingPage;
import com.team.findinghospital.util.CaptureScreen;
import com.team.findinghospital.util.ExcelData;
import com.team.findinghospital.util.WriteToExcel;

public class URLTest extends TestBase {
	
	public URLTest() {
		super();
	}
	
	@BeforeMethod
	public void setup() {
		initialization();
		ExcelData excelData = new ExcelData();
		LandinPageData = ExcelData.readExcel();
		
	}
	
	@Test
	public void validURLTest() throws InterruptedException, IOException {
		super.URLNavigation(LandinPageData[18]);
		
	}
	
	@Test
	public void invalidURLTest() throws InterruptedException, IOException {
		super.URLNavigation(LandinPageData[19]);
		
	}
	@AfterMethod
	public void close() {
		CaptureScreen.screenShot();
		driver.quit();
		}	
	
}
