package practice.HybridPractice.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.HybridPractice.pages.BaseClass;
import practice.HybridPractice.pages.LoginPage;
import practice.HybridPractice.utility.BrowserFactory;

public class LoginTest extends BaseClass {
	

	
	
	@Test(enabled=false)
	
	public void loginApplication() {
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		lp.loginToApplication("supriya", "pass@123");
		
		
	}
	
	@Test(priority = 2)
	
	public void brokenlinks() {
		LoginPage lp=PageFactory.initElements(driver,LoginPage.class);
		lp.findBrokenLinks();
	}
	
	
	

}
