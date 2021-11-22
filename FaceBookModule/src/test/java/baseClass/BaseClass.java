package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class BaseClass {

	public static WebDriver openChromeBrowser() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\chromedriver.exe");
		 ChromeOptions option = new ChromeOptions();
			option.addArguments("--disable-notifications");
			 
		WebDriver driver = new ChromeDriver(option);
		
	       return driver;
	}
	
	public static WebDriver openFireFoxBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Pratiksha\\Desktop\\VELOCITY\\Selenium_software\\geckodriver.exe");
		FirefoxOptions option = new FirefoxOptions();
		option.addArguments("--disable-notifications");
		
		WebDriver driver = new FirefoxDriver(option);
	       return driver;
	}
}
