package practice.HybridPractice.tests;

import org.testng.annotations.Test;

import practice.HybridPractice.pages.BaseClass;
import practice.HybridPractice.pages.BrowserStackSHomePage;
import practice.HybridPractice.pages.BrowserstackSignUpPage;

public class BrowserStackTest extends BaseClass {
	
	@Test(priority = 1)
	public void verifyHomepageHeadingAndClickOnGetStarted() {
		BrowserStackSHomePage bh=new BrowserStackSHomePage(driver);
		bh.veryHeader();
		bh.clickOnGetStarted();
	}
	
	@Test(priority = 2)
	public void enter_userDetails() {
	BrowserstackSignUpPage bs = new BrowserstackSignUpPage(driver);
	bs.verifyheading("Create a FREE Account");
	bs.enterFullname("TestUser");
	bs.enterEmail("TestUser@gmail.com");
	bs.enterpassword("TestUserPassword");
	}

}
