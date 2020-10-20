package util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {
	
	WebDriver driver;
	
	public ElementUtil(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getTitle() {
		return driver.getTitle();
	}
	
	public void enterText(By locator,String value) {
		WebElement element=driver.findElement(locator);
		element.sendKeys(value);
	}
	
	public void clickButton(By locator) {
		WebElement element=driver.findElement(locator);
		element.click();
	}

}
