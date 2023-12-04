package practice.HybridPractice.pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BrowserstackSignUpPage {
	WebDriver driver;
	public BrowserstackSignUpPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//h1[contains(text(),'Create a FREE Account')]") WebElement header;
	@FindBy(id="user_full_name") WebElement fullname;
	@FindBy(id="user_email_login") WebElement email;
	@FindBy(id="user_password") WebElement password;
	@FindBy(id="tnc_checkbox") WebElement IAgreeCheckBox;
	@FindBy(id="user_submit") WebElement signmeupBtn;
	
	
	public void verifyheading(String headertest) {
		String heading=header.getText();
		assertEquals(headertest, heading);
	}
	
	public void enterFullname(String name) {
		fullname.sendKeys(name);
	}
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	
	public void enterpassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void clickOniAGreeCheckBox() {
		IAgreeCheckBox.click();
	}
	public void clickSignUpButton() {
		signmeupBtn.click();
	}
	
	

	

}
