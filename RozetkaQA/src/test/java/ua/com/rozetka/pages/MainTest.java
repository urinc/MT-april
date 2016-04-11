package ua.com.rozetka.pages;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainTest {
	static WebDriver driver;
	PhonesMp3GpsPage phonesMp3Gps;
	AllSmartphonesPage	modelPriceFromTopDevices;
	
	
		@ BeforeClass
	public static void initDriver(){
	driver= new FirefoxDriver();
	}
	
		@Test
	public void test1() {
		open("http://rozetka.com.ua");            // - зайти на сайт rozetka.com.ua
		goToPhonesMp3Gps();                       //- перейти у розділ "Телефони, MP3, GPS"
		goToSmartphones();					      //	- перейти у розділ "Смартфони"
		goToAllSmartphones();					  // - перейти у розділ "Всі смартфони"
		selectModelPriceFromTopDevices(3);		  //- вибрати з перших трьох сторінок пошукової видачі назви і ціни всіх девайсів позначених як "Топ продажів"
		sendModelAndPriceInformationToDB();       // -- записати отримані результати у БД
	}
		
	private void open(String url) {
			driver.manage().window().maximize();
			driver.get(url);
	}	
		
		
	public void goToPhonesMp3Gps() {
		    phonesMp3Gps = new PhonesMp3GpsPage(driver);
			phonesMp3Gps.phonesMp3Gps();
	}	
	
	public void goToSmartphones() {
		SmartphonesPage	smartphones = new SmartphonesPage(driver);
		smartphones.smartphones();
	}
	
	public void goToAllSmartphones() {
		AllSmartphonesPage	smartphones = new AllSmartphonesPage(driver);
		smartphones.allSmartphones();
	}
	
	public void selectModelPriceFromTopDevices(int quantityOfPages) {
		modelPriceFromTopDevices = new AllSmartphonesPage(driver);
		modelPriceFromTopDevices.quantityOfPages(quantityOfPages);
	}
	
	public void	sendModelAndPriceInformationToDB()   {
		modelPriceFromTopDevices.getModelPriceFromTopSales();
	}
			
		@AfterClass
		public static void TearDown() {
		driver.quit(); 
	}
}