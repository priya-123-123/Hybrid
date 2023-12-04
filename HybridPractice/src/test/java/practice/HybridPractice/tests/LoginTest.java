package practice.HybridPractice.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import practice.HybridPractice.pages.BaseClass;
import practice.HybridPractice.pages.DemoNopCommerceLoginPage;
import practice.HybridPractice.utility.BrowserFactory;

public class LoginTest extends BaseClass {
	

	
	
	@Test(enabled=true)
	
	public void loginApplication() {
		
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		DemoNopCommerceLoginPage lp=PageFactory.initElements(driver,DemoNopCommerceLoginPage.class);
		lp.loginToApplication("supriya", "pass@123");
		
		
	}
	
	@Test(enabled = false)
	
	public void brokenlinks() {
		DemoNopCommerceLoginPage lp=PageFactory.initElements(driver,DemoNopCommerceLoginPage.class);
		lp.findBrokenLinks();
	}
	
	
	

}
