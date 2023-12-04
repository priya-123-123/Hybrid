package practice.HybridPractice.pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class DemoCommerceRegisterPage {
	
	WebDriver driver;
public DemoCommerceRegisterPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//input[@id='gender-female']") WebElement femalegender;
	@FindBy(id="FirstName") WebElement firstname;
	@FindBy(id="LastName") WebElement lastname;
	@FindBy(name="DateOfBirthDay") WebElement birthdate;
	@FindBy(name = "DateOfBirthMonth") WebElement birthMonth;
	@FindBy(name = "DateOfBirthYear") WebElement birthyear;
	@FindBy(id = "Email") WebElement email;
	@FindBy(xpath = "//input[@id='Newsletter']") WebElement newslettercheckbox;
	@FindBy(id = "Password") WebElement password;
	@FindBy(id = "ConfirmPassword") WebElement confirmPassword;
	@FindBy(id = "register-button") WebElement RegisterButton;
	
	public boolean selectGenderasFemale() {
		femalegender.click();
		boolean isselected= femalegender.isSelected();
		return isselected;
	}
	
	public void enterFirstName(String fname) {
		firstname.sendKeys(fname);
	}
	
	public void enterlastName(String lname) {
		lastname.sendKeys(lname);
	}
	

	public void selectBirthday(String day) {
		Select sel=new Select(birthdate);
		sel.selectByValue(day);
	}
	

	public void selectBirthmonth(String month) {
		Select sel=new Select(birthMonth);
		sel.selectByVisibleText(month);
	}
	
	public void selectBirthYear(String year) {
		Select sel=new Select(birthyear);
		sel.selectByVisibleText(year);
	}
	
	public void enterEmail(String mail) {
		email.sendKeys(mail);
	}
	
	public boolean deselectnewslettercheckbox() {
		newslettercheckbox.click();
		boolean isselected= newslettercheckbox.isSelected();
		return isselected;
	}
	
	public void enterPassword(String pass) {
		password.sendKeys(pass);
	}
	
	public void enterconfirmPassword(String cpass) {
		confirmPassword.sendKeys(cpass);
	}
	
	public void clickonRegister() {
		RegisterButton.click();
	}
	
	
	

}
