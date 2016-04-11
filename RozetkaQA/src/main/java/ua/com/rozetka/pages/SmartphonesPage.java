package ua.com.rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SmartphonesPage extends BasePage{
	
	By smartphonesButton = By.xpath(".//*[@id='menu_categories_left']//li[1]/a	");
		
	public SmartphonesPage (WebDriver driver) {
		this.driver = driver;
		}
	
	public void smartphones(){

		locatorWaitsWebelement(smartphonesButton).click();
	}	}
