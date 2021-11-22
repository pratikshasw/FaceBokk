package testClasses;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import baseClass.BaseClass;
import pomClasses.HomePagePom;
import pomClasses.LoginPom;

public class VerifyHomaPage extends BaseClass{

	
	WebDriver driver;
	LoginPom login;
	HomePagePom homepage;
	
	 @BeforeTest
	  @Parameters("browser")
	  public void launchBrowser(String browser) {
		  
		  if(browser.equalsIgnoreCase("Chrome"))
		  {
			  driver = openChromeBrowser();
		  }
		  else
		  {
			  driver = openFireFoxBrowser();
		  }
		 
		  driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
		  driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	      driver.navigate().to("https://en-gb.facebook.com/");
	    } 
	 @BeforeClass
	  public void createPOM() {
		  
		 login = new LoginPom(driver);
		 homepage =new HomePagePom(driver);
			
	   }
	  @BeforeMethod
	  public void loginToApp() throws InterruptedException {
		  login.sendUsername();
		  login.sendPassword();
		  login.clickOnLogin();
		  Thread.sleep(2000);
	  }
		@Test
		public void verifyFriend() {
			
			homepage.ClickOnFriends();
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.navigate().back();
		}
		@Test(enabled = false)
		public void verifyNotification() {
			
			homepage.clickONotification();
			String text = driver.getTitle();
			System.out.println(text);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			
		}
		@Test
		public void verifyMarket() {
			
			homepage.ClickOnMarket();
			String text = driver.getTitle();
			System.out.println(text);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			driver.navigate().back();
			
		}
		@AfterMethod
		public void logoutPage() {
			
			homepage.clickOnaccount();
			homepage.clickOnlogout();
		}
		@AfterClass
		  public void clearPomObject() {
			 login = null;
			 homepage = null;
			  
		  }
		@AfterTest
		public void closeTheBrowser() {
			driver.close();
			driver = null ;
			System.gc();
		}
	  
	 
}
