package practice.HybridPractice.pages;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoNopCommerceLoginPage {
	WebDriver driver;
	
	public DemoNopCommerceLoginPage(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="Email") WebElement username;
	@FindBy(name="Password") WebElement password;
	@FindBy(xpath="//button[contains(text(),'Log in')]") WebElement loginbtn;
	@FindBy(xpath="//a") List<WebElement> links;
 	
	public void loginToApplication(String uname,String pw) {
		username.sendKeys(uname);
		password.sendKeys(pw);
		loginbtn.click();
		
	}
	
	public void findBrokenLinks() {
	
		String currenturl;
		int responsecode;
		for (WebElement ele : links) {
			currenturl=ele.getAttribute("href");
			if(currenturl==null || currenturl.isEmpty()) {
				System.out.println("url is either not configured for the anchir tag or is empty");
			}else {
			try {
				HttpURLConnection hp=(HttpURLConnection) (new URL(currenturl).openConnection());
				hp.setRequestMethod("HEAD");
				hp.connect();
				responsecode=hp.getResponseCode();
				if(responsecode>=400) {
					System.out.println(currenturl+"  is broken link");
				}else {
					System.out.println(currenturl+" is not broken link");
				}
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			}
		}
	}

}
