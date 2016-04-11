package ua.com.rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
	static WebDriver driver;
	
	public WebElement locatorWaitsWebelement(By locator){
		
return	(new WebDriverWait(driver, 10)).until(ExpectedConditions.presenceOfElementLocated(locator));
	
		}
}
