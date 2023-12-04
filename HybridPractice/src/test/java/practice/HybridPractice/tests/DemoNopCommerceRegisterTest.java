package practice.HybridPractice.tests;

import org.testng.annotations.Test;

import practice.HybridPractice.pages.BaseClass;
import practice.HybridPractice.pages.DemoCommerceRegisterPage;
import practice.HybridPractice.pages.DemoNopCommerceHomePage;

public class DemoNopCommerceRegisterTest extends BaseClass{
	
	@Test(priority = 1)
	public void RegisterrTest() {
		DemoNopCommerceHomePage dh=new DemoNopCommerceHomePage(driver);
		dh.clickonRegisterlink();
		DemoCommerceRegisterPage dr=new DemoCommerceRegisterPage(driver);
		dr.selectGenderasFemale();
		dr.enterFirstName("Amal");
		dr.enterlastName("paul");
		dr.selectBirthday("15");
		dr.selectBirthmonth("July");
		dr.selectBirthYear("1996");
		dr.enterEmail("sb@gmail.com");
		dr.deselectnewslettercheckbox();
		dr.enterPassword("Pass@123");
		dr.enterconfirmPassword("Pass@123");
		dr.clickonRegister();
		
	}

}
