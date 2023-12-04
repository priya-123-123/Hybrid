package practice.HybridPractice.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoNopCommerceHomePage {
	
	WebDriver driver;
public DemoNopCommerceHomePage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

@FindBy(xpath="//a[contains(text(),'Register')]") WebElement register;
public void clickonRegisterlink() {
	register.click();
}


}
