package practice.HybridPractice.tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import practice.HybridPractice.pages.BaseClass;
import practice.HybridPractice.pages.DemoCommerceRegisterPage;
import practice.HybridPractice.pages.DemoNopCommerceHomePage;

public class DemoNopCommerceRegisterTest extends BaseClass{
	
	@Test(priority = 1, dataProvider = "DataForRegister" , dataProviderClass = TestDataProviderClass.class)
	public void RegisterrTest(String fname, String lname, String day, String month, String Year,String email, String pass, String confPassword) {
		DemoNopCommerceHomePage dh=new DemoNopCommerceHomePage(driver);
		dh.clickonRegisterlink();
		DemoCommerceRegisterPage dr=new DemoCommerceRegisterPage(driver);
		Assert.assertTrue(dr.selectGenderasFemale());
		
		/*
		 * dr.enterFirstName("Amal"); dr.enterlastName("paul"); dr.selectBirthday("15");
		 * dr.selectBirthmonth("July"); dr.selectBirthYear("1996");
		 * dr.enterEmail("s8@gmail.com");
		 * 
		 * Assert.assertFalse(dr.deselectnewslettercheckbox());
		 * 
		 * dr.enterPassword("Pass@123"); dr.enterconfirmPassword("Pass@123");
		 * dr.clickonRegister();
		 */
		
		dr.enterFirstName(fname);
		dr.enterlastName(lname);
		dr.selectBirthday(day);
		dr.selectBirthmonth(month);
		dr.selectBirthYear(Year);
		dr.enterEmail(email);
		
		Assert.assertFalse(dr.deselectnewslettercheckbox());
		
		dr.enterPassword(pass);
		dr.enterconfirmPassword(confPassword);
		dr.clickonRegister();
		
		Assert.assertEquals(dr.getSuccessMessage(), "Your registration completed");
		
		
		
	}

}
