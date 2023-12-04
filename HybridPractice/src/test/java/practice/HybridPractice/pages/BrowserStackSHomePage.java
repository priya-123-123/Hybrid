package practice.HybridPractice.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserStackSHomePage {
	WebDriver driver;
	public BrowserStackSHomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1") WebElement heading;
	@FindBy(xpath="//a[@id='signupModalProductButton']") WebElement getstartedbutton;
	public void veryHeader() {
		String getheadertext = heading.getText();
		//assertEquals("App & Browser Testing Made Easy", getheadertext);
		}
		public void clickOnGetStarted() {
			getstartedbutton.click();
		}

}
