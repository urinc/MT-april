package ua.com.rozetka.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PhonesMp3GpsPage extends BasePage{

	By phonesMp3GpsButton = By.xpath("//*[@id='m-main']/li[2]/a");

	public PhonesMp3GpsPage(WebDriver driver) {
		this.driver = driver;
		}

	public void phonesMp3Gps(){

		locatorWaitsWebelement(phonesMp3GpsButton).click();
}
	}
	

