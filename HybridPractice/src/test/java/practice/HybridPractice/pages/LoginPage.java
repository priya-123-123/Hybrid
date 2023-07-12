package practice.HybridPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	
	public LoginPage(WebDriver ldriver) {
		this.driver=ldriver;
		PageFactory.initElements(driver,LoginPage.class);
	}
	
	@FindBy(id="username") WebElement username;
	@FindBy(name="pw") WebElement password;
	@FindBy(xpath="//input[@id='Login']") WebElement loginbtn;
	
	public void loginToApplication(String uname,String pw) {
		username.sendKeys(uname);
		password.sendKeys(pw);
		loginbtn.click();
		
	}

}
