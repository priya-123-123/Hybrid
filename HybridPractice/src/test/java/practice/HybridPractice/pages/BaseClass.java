package practice.HybridPractice.pages;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import practice.HybridPractice.utility.BrowserFactory;
import practice.HybridPractice.utility.ConfigReader;
import practice.HybridPractice.utility.Helper;

public class BaseClass {
	public WebDriver driver;
	public ConfigReader cf;
	
	@BeforeSuite
	public void InitiateObjects() {
		cf=new ConfigReader();
		
	}
	@BeforeClass
	public void setup() {
		driver=BrowserFactory.startApplication(driver, cf.getBrowser(), cf.getUrl());
	}
	
	@AfterClass
	public void teardown() {
		driver.quit();
	}
	
	@AfterMethod
	
	public void teardownMethod(ITestResult result) {
		//take screen shot on failure
		if(result.getStatus()==ITestResult.FAILURE) {
		Helper.captureScreenShot(driver);
		}else if(result.getStatus()==ITestResult.SUCCESS) {
			Helper.captureScreenShot(driver);
		}
	}

}
