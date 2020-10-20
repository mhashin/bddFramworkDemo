package stepDefinition;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import pageObjects.LoginPage;


public class LoginStepDefinition {
	
	WebDriver driver;
	LoginPage lp;
	
	@Given("^user is already on LoginPage$")
	public void user_is_already_on_LoginPage() {
	    
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://ui.cogmento.com/");
		driver.manage().window().maximize();
		lp=new LoginPage(driver);
	}
	
	@When("^title of login page is clear trip$")
	public void title_of_login_page_is_clear_trip()  {
	    String title=lp.getPageTitle();
	    System.out.println(title);
	    Assert.assertEquals("Cogmento CRM", title);
	}
	
	@Then("^user enter password and password$")
	public void user_enter_password_and_password(){
		lp.enterEmail("muhammedhashin16@gmail.com");
		lp.enterPassword("Selenium@2020");
	}
	
	@Then("^user clicks on login button$")
	public void user_clicks_on_login_button() {
		lp.clickLoginButton();
	}
	
	@Then("^user is on homepage$")
	public void user_is_on_homepage() {
		String title=lp.getHomePageTitle();
		System.out.println(title);
	}
}
