package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import util.ElementUtil;

public class LoginPage {
	
	WebDriver driver;
	ElementUtil util;
	
	By txtemail=By.name("email");
	By txtpassword=By.name("password");
	By btnLogin=By.xpath("//div[text()='Login']");
	
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		util=new ElementUtil(driver);
	}

	public void enterEmail(String email) {
		util.enterText(txtemail, email);
	}
	
	public void enterPassword(String pwd) {
		util.enterText(txtpassword, pwd);
	}
	
	public void clickLoginButton() {
		util.clickButton(btnLogin);
	}
	
	public String getPageTitle() {
		return util.getTitle();
	}
	
	public String getHomePageTitle() {
		return util.getTitle();
	}
}
