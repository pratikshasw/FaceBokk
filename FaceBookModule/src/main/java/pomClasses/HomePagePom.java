package pomClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePagePom {
	
	private WebDriver driver;
	private Actions act;
	private WebDriverWait wait;
	
	@FindBy(xpath="//input[@type='search']")
	private WebElement search;
		
	@FindBy(xpath="//a[@aria-label='Friends']")
	private WebElement Friends;
	
	@FindBy(xpath="(//div[@aria-label='Messenger'])[1]")
	private WebElement massanger;
	
	@FindBy(xpath="//div[@aria-label='Account']")
	private WebElement account;
	
	@FindBy (xpath = "//span[text()='Log Out']")
	private WebElement logout;
	
	@FindBy (xpath = "//a[@aria-label='Notifications, 4 unread']")
	private WebElement notification;
	@FindBy (xpath = "//a[@aria-label='Marketplace']")
	private WebElement market;
	
	
	public HomePagePom(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		act = new Actions(driver);
		wait = new WebDriverWait(driver,20);
		}
	
	
	public void ClickOnsearch() {
		search.click();
	}
	
	public void ClickOnFriends() {
		wait.until(ExpectedConditions.visibilityOf(Friends));
		Friends.click();
		String text = Friends.getText();
		System.out.println(text);
		
	}
	
	public void ClickOnmassanger() {
		massanger.click();
	}
	
	public void clickONotification() {
		wait.until(ExpectedConditions.visibilityOf(notification));
		notification.click();
		notification.getText();
	}
	public void ClickOnMarket() {
		market.click();
	}
	public void clickOnaccount() {
		wait.until(ExpectedConditions.visibilityOf(account));
		account.click();
	}
	
	public void clickOnlogout() {
		// Actions act = new Actions(driver);
		wait.until(ExpectedConditions.visibilityOf(logout));
		act.moveToElement(logout).click().build().perform();
	}

}
